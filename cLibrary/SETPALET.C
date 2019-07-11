#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
struct palettetype pal;
initgraph(&gd,&gm,"");
setfillstyle(1,1);
bar(0,0,getmaxx(),getmaxy());
setfillstyle(1,14);
fillellipse(300,200,100,100);
for (i=0;i<64;i++)
{
getch();
setpalette(14,i);
}
getch();
closegraph();
}
