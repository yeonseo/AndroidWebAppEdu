#include <dos.h>
#include <stdio.h>
void main()
{
void far *ptr;
unsigned seg,off;
ptr=MK_FP(0x1234,0x5678);
seg=FP_SEG(ptr);
off=FP_OFF(ptr);
printf("segment is %x\n",seg);
printf("offset is %x\n",off);
}
