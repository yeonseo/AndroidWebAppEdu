#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
initgraph(&gd,&gm,"");
settextjustify(CENTER_TEXT,BOTTOM_TEXT);
settextstyle(1,0,0);
outtextxy(320,80,"KYUNG HEE");
outtextxy(320,120,"UNIVERSITY");
outtextxy(320,160,"Computer Science Association");
outtextxy(320,200,"COM.COM");
outtextxy(320,240,"Since 1988.5.16");
getch();
closegraph();
}
