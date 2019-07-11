#include <graphics.h>
#include <conio.h>
void main()
{
int gd=EGA,gm=EGAHI;
int xasp,yasp;
initgraph(&gd,&gm,"");
getaspectratio(&xasp,&yasp);
closegraph();
printf("xasp=%d yasp=%d\n",xasp,yasp);
getch();
}
