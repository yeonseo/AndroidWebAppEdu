#include <stdio.h>
#include <math.h>
#include <graphics.h>
#include <conio.h>
void rectcir(int x1,int y1,int x2,int y2);
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
rectcir(100,100,150,150);
rectcir(300,250,350,225);
getch();
closegraph();
}
void rectcir(int x1,int y1,int x2,int y2)
{
int rad;
rad=hypot(x2-x1,y2-y1);    // 반지름을 계산한다.
circle(x1,y1,rad);
}
