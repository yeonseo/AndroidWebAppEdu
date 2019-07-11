#include <conio.h>
#include <stdio.h>
void main(void)
{
  int x,y;
  clrscr();
  gotoxy(10,10);
  x=wherex();
  y=wherey();
  printf("X: %d  Y: %d\r\n", x,y);
}
