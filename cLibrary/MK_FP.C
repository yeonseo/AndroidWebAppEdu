#include <stdio.h>
#include <dos.h>
void main()
{
char far *vram;
int i;
vram=(char *)MK_FP(0xb800,500);
for (i=0;i<100;i+=2)
  {
  *(vram+i)='S';
  *(vram+i+1)=07;
  }
}
