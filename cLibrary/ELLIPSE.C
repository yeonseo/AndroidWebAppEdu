#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
initgraph(&gd,&gm,"");
for (i=20;i<150;i+=5)
ellipse(200,200,0,360,i,100);
getch();
closegraph();
}
