#include <graphics.h>
#include <conio.h>
void main()
{
int i,j;
int gd=0,gm;
initgraph(&gd,&gm,"");       // 그래픽 초기화
setactivepage(1);            // 1번 page에 그림을 그림
   for (i=0;i<640;i+=10)
    line(i/5,0,i,399);
setactivepage(0);            // 0번 page에 그림을 그림
   for (i=30;i<600;i+=20)
    for (j=30;j<350;j+=20)
     circle(i,j,20);
for (i=0;i<10;i++){
    setvisualpage(i%2);   // 0,1번 page를 교대로 보여준다.
    getch();
    }
closegraph();
}
