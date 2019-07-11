#include <stdio.h>
#include <dos.h>
int main(void)
{
   char curdrv;
   curdrv=bdos(0x19,0,0);
   printf("The current drive is %c:\n", curdrv+'A');
   return 0;
}
