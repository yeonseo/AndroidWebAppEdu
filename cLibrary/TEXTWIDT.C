#include <graphics.h>
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int width,height;
initgraph(&gd,&gm,"");
settextstyle(1,0,8);
outtextxy(100,100,"KOREA");
width=textwidth("KOREA");
height=textheight("KOREA");
rectangle(100,100,100+width,100+height+10);
getch();
closegraph();
}
