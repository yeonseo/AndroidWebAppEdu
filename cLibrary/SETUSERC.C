#include <graphics.h>
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
settextstyle(1,0,0);
setusercharsize(3,2,10,1);
outtextxy(100,50,"Programmer Pride");
getch();
closegraph();
}
