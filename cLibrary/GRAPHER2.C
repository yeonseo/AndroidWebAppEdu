#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
char buf[128];
initgraph(&gd,&gm,"");
for (i=0;i>-19;i--)
  {
  sprintf(buf,"error %d = %s",i,grapherrormsg(i));
  outtextxy(20,i*(-15),buf);
  }
getch();
closegraph();
}
