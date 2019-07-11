#include <graphics.h>
#include <conio.h>
#include <stdlib.h>
void main()
{
int gd=0,gm;
int i;
int x,y,st,end,r;
randomize();
initgraph(&gd,&gm,"");
for (i=0;i<120;i++)
  {
  setcolor(random(16));
  r=i+10;
  st=0;
  end=i*3;
  arc(320,200,st,end,r);  // 원호를 그린다.
  }
getch();
closegraph();
}
