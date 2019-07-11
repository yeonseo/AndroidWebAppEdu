#include <graphics.h>
#include <stdio.h>
#include <stdlib.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
setlinestyle(4,0xf0f0,3);
rectangle(100,100,300,200);
setlinestyle(4,0xaaaa,1);
rectangle(110,110,290,190);
setlinestyle(4,0x8080,1);
rectangle(120,120,280,180);
setlinestyle(4,0xcccc,1);
rectangle(130,130,270,170);
setlinestyle(4,0xf0f0,1);
rectangle(140,140,260,160);
setlinestyle(4,0xc3c3,1);
rectangle(150,150,250,150);
getch();
closegraph();
}
