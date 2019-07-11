#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int gmode;
char *modename;
char str[100];
initgraph(&gd,&gm,"");
gmode=getgraphmode();
modename=getmodename(gmode);
sprintf(str,"current mode is %d",gmode);
outtextxy(100,100,str);
sprintf(str,"current mode name is %s",modename);
outtextxy(100,120,str);
getch();
closegraph();
}
