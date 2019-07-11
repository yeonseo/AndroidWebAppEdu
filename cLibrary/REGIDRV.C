#include <gra[hics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
registerbgidriver(Herc_driver);
registerbgidriver(EGAVGA_driver);
registerbgifont(triflex_font);
initfgraph(&gd,&gm,"");
settextstyle(1,0,8);
outtextxy(100,100,"test BGI ling");
getch();
closegraph();
}
