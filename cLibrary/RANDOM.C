#include <stdio.h>
#include <stdlib.h>
#include <graphics.h>
void main()
{
int gd=0,gm;
int i;
initgraph(&gd,&gm,"");
for (i=0;i<20000;i++)
putpixel(random(640),random(479),random(16));
getch();
closegraph();
}
