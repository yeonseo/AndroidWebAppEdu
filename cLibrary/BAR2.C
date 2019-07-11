#include <graphics.h>
#include <stdlib.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
initgraph(&gd,&gm,"");
settextstyle(1,0,4);
outtextxy(100,100,"press any key");
getch();
setfillstyle(1,0);
bar(100,100,320,150);
outtextxy(100,100,"New string");
getch();
closegraph();
}
