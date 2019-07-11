#include <stdio.h>
#include <graphics.h>
#include <conio.h>
#include <stdlib.h>
void main()
{
int gd=0,gm;
unsigned long num=123456789;
char numstr[20];
initgraph(&gd,&gm,"");
ultoa(num,numstr,10);
outtextxy(100,100,numstr);
getch();
closegraph();
}
