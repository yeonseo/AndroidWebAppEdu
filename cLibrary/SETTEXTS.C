#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
settextstyle(0,0,4);
outtextxy(100,100,"test string");
settextstyle(1,0,4);
outtextxy(100,140,"test string");
settextstyle(2,0,4);
outtextxy(100,180,"test string");
settextstyle(3,0,4);
outtextxy(100,220,"test string");
settextstyle(4,0,4);
outtextxy(100,260,"test string");
getch();
closegraph();
}
