#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
struct palettetype pal=
    {16,0,33,1,49,17,41,9,25,57,11,43,15,};
initgraph(&gd,&gm,"");
for (i=0;i<16;i++)
   {
   setfillstyle(1,i);
   bar(i*40,0,i*40+40,400);
   }
getch();
setallpalette(&pal);
getch();
closegraph();
}
