#include <graphics.h>
int main(void)
{
int gd=0,gm;
initgraph(&gd,&gm,"");
rectangle(0,0,getmaxx(),getmaxy());
getch();
closegraph();
return 0;
}
