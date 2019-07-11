#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <bios.h>
void main()
{
int key;
clrscr();
gotoxy(10,23);
printf("Press Ctrl-Break to quit");
_setcursortype(_NOCURSOR);
for (;;)
  {
  key=bioskey(2);
  if (bioskey(1)==-1)
    {
    _setcursortype(_NORMALCURSOR);
    exit(0);
    }
  if ((key & 0x01)==0x01)
    textattr(0x70);
  else textattr(0x07);
  gotoxy(10,10);
  cprintf("RShift");
  if ((key & 0x02)==0x02)
    textattr(0x70);
  else textattr(0x07);
  gotoxy(20,10);
  cprintf("LShift");
  if ((key & 0x04)==0x04)
    textattr(0x70);
  else textattr(0x07);
  gotoxy(30,10);
  cprintf("CTRL");
  if ((key & 0x08)==0x08)
    textattr(0x70);
  else textattr(0x07);
  gotoxy(40,10);
  cprintf("ALT");
  }
}
