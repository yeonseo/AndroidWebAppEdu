#include <graphics.h>
#include <stdio.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int lo,hi;
char str[100];
initgraph(&gd,&gm,"");
getmoderange(gd,&lo,&hi);
sprintf(str,"low mode is %d, high mode is %d",lo,hi);
outtextxy(100,100,str);
getch();
closegraph();
}
