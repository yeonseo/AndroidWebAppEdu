#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
setfillstyle(6,2);
setcolor(15);
pieslice(200,200,10,200,100);
getch();
closegraph();
}
