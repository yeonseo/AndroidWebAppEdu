#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
float f;
char str[128];
f=3.141592;
initgraph(&gd,&gm,"");
sprintf(str,"pie is %f",f);
settextstyle(1,0,4);
outtextxy(50,50,str);
getch();
closegraph();
}
