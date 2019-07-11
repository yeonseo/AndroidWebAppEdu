#include <stdio.h>
#include <graphics.h>
#include <conio.h>
int data[]={100,200,200,27,0,1,1,0,25,-1,1,-27,0,-1,-1,0,-25,
	    100,07,00,0,8,1,1,13,0,1,-1,0,-8,100,-2,1,-4,0,0,
	    6,4,0,0,-6,100,6,10,0,12,-23,0,0,-12,23,0,101};
void main()
{
int gd=0,gm,i=0;
initgraph(&gd,&gm,"");
setcolor(1);
for (;;){
  if (data[i]==101) break;   // 1010이면 끝낸다.
  if (data[i]==100){      // 100이면 위치만 이동시킨다.
	     moverel(data[i+1],data[i+2]);
	     i+=3;
	     }
	else {                // 그외의 경우면 선을 긋는다.
	     linerel(data[i],data[i+1]);
	     i+=2;
	     }
      }
getch();
closegraph();
}
