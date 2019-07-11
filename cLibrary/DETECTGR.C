#include <graphics.h>
#include <conio.h>
void main()
{
int gd,gm;
detectgraph(&gd,&gm);
if (gd!=9) {
    clrscr();
    printf("\a\nThis program need VGA\n");
    printf("Can't run...\n");
    exit(0);
    }
initgraph(&gd,&gm,"");
circle(100,100,100);
getch();
closegraph();
}
