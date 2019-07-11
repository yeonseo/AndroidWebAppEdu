#include <stdio.h>
#include <graphics.h>
#include <conio.h>
#include <dos.h>
void main()
{
int gd=0,gm;
int i;
initgraph(&gd,&gm,"");
for (i=50;i<600;i+=10)
  {
  circle(i,200,50);
  delay(100);
  cleardevice();
  }
getch();
closegraph();
}
