#include <graphics.h>
#include <conio.h>
void main()
{
struct arccoordstype arcinfo;
int gd=0,gm;
initgraph(&gd,&gm,"");
arc(320,200,0,150,100);
getarccoords(&arcinfo);
line(arcinfo.xstart,arcinfo.ystart,arcinfo.xend,arcinfo.yend);
setfillstyle(9,9);
floodfill(340,160,15);
getch();
closegraph();
}
