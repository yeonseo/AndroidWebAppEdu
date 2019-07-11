#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm,i;
char d[3];
initgraph(&gd,&gm,"");
settextstyle(1,0,1);
for (i=0;i<16;i++){
itoa(i,d,10);
setfillstyle(1,i);
bar(i*35+10,10,i*35+40,300);
setcolor(15);
rectangle(i*35+10,10,i*35+40,300);
outtextxy(i*35+20,320,d);
}
getch();
closegraph();
}
