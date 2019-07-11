#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;
int i;
initgraph(&gd,&gm,"");
for (i=50;i<100;i+=5)  // 반지름을 변화시켜 가며 
  circle(200,200,i);   // 동심원을 그린다.
getch();
closegraph();
}
