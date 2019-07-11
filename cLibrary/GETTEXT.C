#include <stdio.h>
#include <conio.h>
void main()
{
char buf[9*7*2];
clrscr();
gotoxy(10,10);
printf("Kyung Hee University");
gotoxy(10,12);
printf("Computer Science Association");
gotoxy(10,14);
printf("COM.COM");
gotoxy(10,16);
printf("19988.5.16");
gettext(12,10,20,16,buf);
getch();
clrscr();
getch();
puttext(12,10,20,16,buf);
}
