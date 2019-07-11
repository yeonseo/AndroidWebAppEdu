#include <graphics.h>
#include <dos.h>
#include <stdlib.h>
#include <conio.h>
void main()
{
struct REGPACK reg;
int gd=0,gm;
initgraph(&gd,&gm,"");
reg.r_ax=0;
intr(0x33,&reg);
  if (reg.r_ax==0) exit(0);
reg.r_ax=1;
intr(0x33,&reg);
getch();
closegraph();
}
