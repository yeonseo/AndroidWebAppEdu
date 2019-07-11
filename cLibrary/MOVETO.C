#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
moveto(100,100);
lineto(300,200);
getch();
closegraph();
}
