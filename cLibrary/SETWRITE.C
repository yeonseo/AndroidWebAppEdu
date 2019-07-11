#include <graphics.h>
#include <conio.h>
#include <dos.h>
void main()
{
int gd=0,gm;
int i;
initgraph(&gd,&gm,"");
for (i=10;i<200;i+=5)
  circle(getmaxx()/2,getmaxy()/2,i);
setwritemode(XOR_PUT);
for (i=0;i<640;i+=5)
  {
  line(i,0,i,getmaxx());
  delay(50);
  line(i,0,i,getmaxx());
  }
getch();
closegraph();
}
