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
sprintf(str,"now in graphic mode %d",gmode);
outtextxy(100,100,str);
sprintf(str,"Press any key to go to text mode");
outtextxy(100,120,str);
getch();
restorecrtmode();
printf("now in text mode\n");
printf("press any key to return to graphic mode");
getch();
setgraphmode(gmode);
sprintf(str,"now in graphic mode again");
outtextxy(100,140,str);
getch();
closegraph();
}
