#include <graphics.h>
#include <math.h>
#include <conio.h>
#include <dos.h>
void main()
{
int gd=0,gm;
int rad,x,y,angle;
int cx=300,cy=200;
rad=100;
initgraph(&gd,&gm,"");
for (angle=0;angle<360;angle++)
   {
   x=cos(angle*M_PI/180)*rad;
   y=-sin(angle*M_PI/180)*rad;
   putpixel(cx+x,cy+y,15);
   delay(10);
   }
getch();
closegraph();
}
