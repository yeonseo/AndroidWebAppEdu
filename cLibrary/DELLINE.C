#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <dos.h>
void main()
{
int i;
randomize();
clrscr();
for (i=0;i<100;i++)
  {
  gotoxy(random(80)+1,random(25)+1);
  putch('S');
  }
gotoxy(1,5);
for (i=0;i<20;i++)
  {
  delline();
  delay(50);
  }
}
