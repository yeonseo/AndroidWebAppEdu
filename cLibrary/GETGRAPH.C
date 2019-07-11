#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int gmode;
char str[100];
initgraph(&gd,&gm,"");
gmode=getgraphmode();
sprintf(str,"current mode is %d",gmode);
outtextxy(100,100,str);
getch();
closegraph();
}
