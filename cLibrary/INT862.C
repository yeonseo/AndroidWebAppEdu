#include <graphics.h>
#include <dos.h>
#include <stdlib.h>
#include <conio.h>
void main()
{
union REGS reg;
int gd=0,gm;
initgraph(&gd,&gm,"");
reg.x.ax=0;
int86(0x33,&reg,&reg);
  if (reg.x.ax==0) exit(0);
reg.x.ax=1;
int86(0x33,&reg,&reg);
getch();
closegraph();
}
