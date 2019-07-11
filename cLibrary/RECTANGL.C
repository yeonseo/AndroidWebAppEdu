#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
rectangle(100,100,200,200);
rectangle(120,120,180,180);
getch();
closegraph();
}
