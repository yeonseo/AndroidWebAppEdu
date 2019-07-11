#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
setcolor(WHITE);
circle(300,100,80);
circle(250,180,80);
circle(350,180,80);
setfillstyle(1,YELLOW);
floodfill(300,100,15);
setfillstyle(1,RED);
floodfill(250,180,15);
setfillstyle(1,BLUE);
floodfill(350,180,15);
setfillstyle(1,LIGHTRED);
floodfill(280,120,15);
setfillstyle(1,GREEN);
floodfill(320,120,15);
setfillstyle(1,MAGENTA);
floodfill(300,200,15);
getch();
closegraph();
}
