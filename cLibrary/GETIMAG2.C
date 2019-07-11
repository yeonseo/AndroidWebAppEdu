#include <graphics.h>
#include <alloc.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
unsigned size;
void *imagebuf;
initgraph(&gd,&gm,"");
for (i=0;i<400;i+=10)                // 배경 화면을 그림
   line(0,200,639,i);
getch();
size=imagesize(400,150,500,250);
imagebuf=malloc(size);
getimage(400,150,500,250,imagebuf);// 화면의 일정 영역을 
                                   // 이미지로 보관한다.
setfillstyle(1,0);
bar3d(400,150,500,250,0,1);  // 영역의 일부를 지운다.
for (i=150;i<250;i+=5) //지운 일부를 다른 목적에 사용한다.
  line(400,200,500,i);
getch();
putimage(400,150,imagebuf,COPY_PUT); // 복구시킨다.
getch();
free(imagebuf);
closegraph();
}
