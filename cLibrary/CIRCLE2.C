#include <stdio.h>
#include <conio.h>
#include <graphics.h>
void main()
{
int gd=0,gm;
int i,j;
initgraph(&gd,&gm,"");
for (i=50;i<400;i+=10)
  for (j=50;j<150;j+=10)
    circle(i,j,10);
getch();
closegraph();
}

