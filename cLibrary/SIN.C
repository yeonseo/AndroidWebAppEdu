#include <stdio.h>
#include <math.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
double i;
initgraph(&gd,&gm,"");
line(0,0,0,400);
line(0,200,639,200);
for (i=0;i<640;i+=0.1)
  putpixel(i,sin(i*M_PI/180*5)*100+200,15);
getch();
closegraph();
}
