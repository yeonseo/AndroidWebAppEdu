#include <stdio.h>
#include <graphics.h>
#include <conio.h>
#include <stdlib.h>
void main()
{
int gd=0,gm;
int i,x,y,c;
randomize();
initgraph(&gd,&gm,"");
for (i=0;i<30000;i++)
  {
  x=random(640);
  y=random(400);
  c=random(16);
  putpixel(x,y,c);
  }
getch();
closegraph();
}
