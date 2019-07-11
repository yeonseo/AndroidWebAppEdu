#include <stdio.h>
#include <ctype.h>
#include <conio.h>
void main()
{
int i,j=1;
char k;
clrscr();
for (i=1;i<256;i++)
  {
  if (isalnum(i)) k='O'; else k='.';
  if (i%20==0) j+=6;
  gotoxy(j,i%20+2);
  putch(i);putch(' ');putch(k);
  }
}
