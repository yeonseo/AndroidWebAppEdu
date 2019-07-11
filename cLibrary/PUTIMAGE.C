#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
char buf[]={7,0,7,0,
      0x18,0x24,0x42,0x99,0x99,0x42,0x24,0x18};
initgraph(&gd,&gm,"");
for (i=1;i<600;i+=12)
  putimage(i,200,buf,COPY_PUT);
getch();
closegraph();
}
