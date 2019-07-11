#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
putpixel(getmaxx()/2,getmaxy()/2,15);
getch();
closegraph();
}
