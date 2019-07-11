#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
initgraph(&gd,&gm,"");
for (i=20000;i>2000;i-=1000)
    {
    setaspectratio(i,10000);
    circle(300,200,100);
    }
getch();
closegraph();
}
