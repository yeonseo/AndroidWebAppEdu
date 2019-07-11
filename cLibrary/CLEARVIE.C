#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
rectangle(100,100,200,200);
setviewport(100,100,200,200,0);
circle(20,20,50);
getch();
clearviewport();
getch();
closegraph();
}
