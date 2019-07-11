#include <stdio.h>
#include <conio.h>
#include <dos.h>
#define IGNORE  0
#define RETRY   1
#define ABORT   2
static char *err_msg[] = {
     "write protect",
     "unknown unit",
     "drive not ready",
     "unknown command",
     "data error (CRC)",
     "bad request",
     "seek error",
     "unknown media type",
     "sector not found",
     "printer out of paper",
     "write fault",
     "read fault",
     "general failure",
     "reserved",
     "reserved",
     "invalid disk change"
};
int buf[500];
int handler(int errval,int ax,int bp,int si)
{
static char msg[80];
int drive;
int key,retval;
int errorno;
drive = ax & 0x00FF;
errorno = _DI & 0x00FF;
sprintf(msg,"Error : %s on drive %c\r\nA)bort, R)etry, I)gnore: 
",
	err_msg[errorno], 'A' + drive);
cputs(msg);
do {
key=getch();
switch (key) {
  case 'a':
  case 'A':retval=ABORT;
	   break;
  case 'r':
  case 'R':retval=RETRY;
	   break;
  case 'i':
  case 'I':retval=IGNORE;
	   break;
  default:retval=10;
  }
} while(retval==10);
hardresume(retval);
return ABORT;
}
void main()
{
harderr(handler);
clrscr();
printf("Press any key with no disk in A drive\n");
getch();
printf("attempting access drive A:...\n");
fopen("a:neverexi.st","wb");
}
