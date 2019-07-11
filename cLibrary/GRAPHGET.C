#include <graphics.h>       
#include <stdlib.h>
#include <stdio.h>
#include <conio.h>
#include <alloc.h>
void main(void)
{
int gd=0,gm;
initgraph(&gd,&gm,"");
circle(100,100,100);
getch();
closegraph();
}
void far * far _graphgetmem(unsigned size)
{
printf("now in _graphgetmem\n");
getch();
return farmalloc(size);
}

void far _graphfreemem(void far *ptr, unsigned size)
{
printf("now in _graphfreemem\n");
getch();
farfree(ptr);
}
