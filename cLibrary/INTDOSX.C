#include <dos.h>
#include <process.h>
#include <stdio.h>
#include <conio.h>
void main(void)
{
char far *str;
char string[]="test string$";
clrscr();
str=string;
union REGS reg;
struct SREGS sreg;
reg.h.ah=0x09;
sreg.ds=FP_SEG(str);
reg.x.dx=FP_OFF(str);
intdosx(&reg,&reg,&sreg);
}
