#include <graphics.h>
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
void main()
{
int gd=0,gm;
char pattern[8]={0x00,0x02,0x04,0x48,0x28,0x10,0x10,0x00};
initgraph(&gd,&gm,"");
setfillpattern(pattern,14);
fillellipse(200,200,100,100);
getch();
closegraph();
}
