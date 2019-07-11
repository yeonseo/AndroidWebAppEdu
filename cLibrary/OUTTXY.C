#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
outtextxy(100,100,"test string");
getch();
closegraph();
}
