#include <conio.h>
#include <dos.h>
void main(void)
{
   clrscr();
   gotoxy(20,10);
   _AH=9;
   _AL='S';
   _BH=0;
   _BL=7;
   _CX=1;
   geninterrupt(0x10);
}
