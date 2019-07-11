#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
struct palettetype far *pal;
initgraph(&gd,&gm,"");
pal=getdefaultpalette();
closegraph();
for (i=0;i<pal->size;i++)
 printf("palette%3d actual color is %d\n"
    ,i,pal->colors[i]);
getch();
}
