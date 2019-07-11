#include <graphics.h>
#include <conio.h>
#include <stdlib.h>
void main()
{
int gd=0,gm;
int i,j;
randomize();
initgraph(&gd,&gm,"");
for (i=0;i<50;i++)
circle(random(640),random(400),random(50)+50);
for (i=0;i<640;i++)
  for (j=0;j<480;j++)
    putpixel(i,j,~getpixel(i,j));
getch();
closegraph();
}
