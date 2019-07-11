#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
initgraph(&gd,&gm,"");
for (i=0;i<16;i++)
  {
  rectangle(i*40,0,i*40+35,380);
  setfillstyle(i,15);
  floodfill(i*40+1,1,15);
  }
getch();
closegraph();
}
