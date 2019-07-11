#include <graphics.h>
#include <conio.h>

int huge Detect()
  {
  return 1;
  }
void main()
{
int gd,gm;
gd=installuserdriver("MEGA256",Detect)+0x80;
gm=12;
initgraph(&gd,&gm,"");
circle(200,200,100);
getch();
closegraph();
}
