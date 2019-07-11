#include <graphics.h>
#include <stdlib.h>
#include <conio.h>
void main()
{
int x1,y1,w,h,color;
int gd=0,gm;
int i;
initgraph(&gd,&gm,"");
for (i=0;i<1000;i++)
  {
  color=random(16);
  x1=random(640);
  y1=random(480);
  w=random(80)+20;
  h=random(80)+20;
  setfillstyle(1,color);
  bar(x1,y1,x1+w,y1+h);
  }
getch();
closegraph();
}
