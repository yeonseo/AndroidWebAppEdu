#include <graphics.h>
#include <stdlib.h>
#include <stdio.h>
#include <conio.h>
void main(void)
{
int gd=100,gm;
int err;
initgraph(&gd,&gm,"");
err=graphresult();
if (err!=grOk)
  {
  printf("error : %s\n",grapherrormsg(err));
  getch();
  exit(1);
  }
circle(100,100,100);
getch();
closegraph();
}
