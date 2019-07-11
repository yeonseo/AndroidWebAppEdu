#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
initgraph(&gd,&gm,"");
for (i=0;i<400;i+=5)
  line(0,0,639,i);
getch();
closegraph();
}
