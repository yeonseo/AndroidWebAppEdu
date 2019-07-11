#include <stdio.h>
#include <conio.h>
#include <dos.h>
void main()
{
char buf[9*7*2];
int i;
clrscr();
gotoxy(10,2);
printf("Kyung Hee University");
gotoxy(10,4);
printf("Computer Science Association");
gotoxy(10,6);
printf("COM.COM");
gotoxy(10,8);
printf("19988.5.16");
for (i=0;i<12;i++)
  {
  movetext(12,1+i,20,8+i,12,1+i+1);
  delay(200);
  }
}
