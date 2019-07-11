#include <dos.h>
#include <conio.h>
#include <stdio.h>
void main()
{
union REGS reg;
clrscr();
reg.h.ah=0x02;
reg.h.dl='S';
intdos(&reg,&reg);
}
