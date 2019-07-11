#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
line(100,100,300,200);
getch();
closegraph();
}
