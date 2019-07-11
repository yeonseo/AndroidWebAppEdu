#include <graphics.h>
#include <alloc.h>
#include <conio.h>
#include <stdlib.h>
void main()
{
int gd=0,gm;
void *buf;
int size,i;
initgraph(&gd,&gm,"");
rectangle(320-8,200-8,320+8,200+8);
circle(320,200,8);
size=imagesize(320-8,200-8,320+8,200+8);
buf=malloc(size);
  if (buf==NULL) exit(1);
getimage(320-8,200-8,320+8,200+8,buf);
for (i=1;i<600;i+=20)
  putimage(i,350,buf,COPY_PUT);
getch();
free(buf);
closegraph();
}
