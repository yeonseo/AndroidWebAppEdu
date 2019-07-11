#include <graphics.h>
#include <stdlib.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
randomize();
initgraph(&gd,&gm,"");
for (i=0;i<300;i++)
     {
     setfillstyle(random(10),random(16));
     setcolor(random(16));
     sector(random(640),random(400),random(180),random(180)+180
	   ,random(30)+5,random(30)+5);
     }
getch();
closegraph();
}
