#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
setfillstyle(9,1);
setcolor(14);
fillellipse(200,200,100,80);
getch();
closegraph();
}
