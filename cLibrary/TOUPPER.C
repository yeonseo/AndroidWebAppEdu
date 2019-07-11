#include <stdio.h>
#include <ctype.h>
#include <conio.h>
void main()
{
int i,j=1;
clrscr();
for (;;){
gotoxy(30,10);
printf("your number is %4d",j);
i=getch();
switch(toupper(i)){
   case 'A':j++;
	    break;
   case 'D':j--;
	    break;
   case 'E':exit(0);
   }
}
}
