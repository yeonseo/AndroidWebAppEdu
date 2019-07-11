#include <stdio.h>
#include <dos.h>
void main()
{
int shift;
shift=peekb(0x0040,0x0017);
if ((shift&0x40)==0x40)
   printf("CAPS lock key is pressed\n");
else
   printf("CAPS lock key is not pressed\n");
}
