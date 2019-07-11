#include <graphics.h>
#include <conio.h>
#include <stdio.h>
void main()
{
int gd=0,gm;
int x1,y1,x2,y2,i;
int ar[6]={80,76,45,99,77,83};
initgraph(&gd,&gm,"");
line(100,80,100,300);
line(100,300,500,300);
for (i=0;i<6;i++)
  {
  x1=i*50+120;
  y1=ar[i]*2;
  x2=x1+20;
  y2=300;
  setfillstyle(1,i+1);
  bar3d(x1,y1,x2,y2,10,1);
  }
getch();
closegraph();
}
