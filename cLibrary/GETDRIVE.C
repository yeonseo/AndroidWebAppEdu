#include <graphics.h>
#include <conio.h>
void main(void)
{
   int gd=DETECT,gm;
   char *drivername;
   initgraph(&gd,&gm,"");
   drivername=getdrivername();
   outtextxy(100,100,drivername);
   getch();
   closegraph();
}
