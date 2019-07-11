#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
setviewport(100,100,300,300,1);
rectangle(0,0,200,200);
circle(150,150,80);
getch();
closegraph();
}
