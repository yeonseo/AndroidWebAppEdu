#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <dos.h>
#include <graphics.h>
void main()
{
int gd=0,gm;
int i;
char string[10];
initgraph(&gd,&gm,"");
settextjustify(CENTER_TEXT,CENTER_TEXT);
setfillstyle(1,1);
settextstyle(1,0,4);
bar(0,0,getmaxx(),getmaxy());
setcolor(15);
for (i=0;i<=100;i++)
  {
  itoa(i,string,10);
  bar(300,180,340,220);
  outtextxy(320,200,string);
  delay(100);
  }
getch();
closegraph();
}
