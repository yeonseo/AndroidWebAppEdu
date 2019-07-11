#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
initgraph(&gd,&gm,"");
setcolor(1);
setfillstyle(1,1);
fillellipse(300,200,80,120);
setcolor(4);
setfillstyle(1,4);
fillellipse(400,100,120,80);
setcolor(2);
setfillstyle(1,2);
fillellipse(200,300,50,80);
for (i=0;i<5;i++)
  {
  getch();
  setbkcolor(1);
  getch();
  setbkcolor(4);
  getch();
  setbkcolor(2);
  }
getch();
closegraph();
}
