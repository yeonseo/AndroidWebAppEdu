#include <graphics.h>
#include <math.h>
#include <conio.h>
void main()
{
int gd=0,gm;
double i;
initgraph(&gd,&gm,"");
setcolor(1);
line(0,0,0,400);
line(0,200,639,200);
for (i=0;i<639;i+=0.1)
  putpixel(i,cos(i*M_PI/180*5)*100+200,15);
getch();
closegraph();
}
