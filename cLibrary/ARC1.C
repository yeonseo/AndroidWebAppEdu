#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
arc(320,200,0,180,50);  // 원호를 그린다.
getch();
closegraph();
}
