#include <stdio.h>
#include <bios.h>

void main(void)
{
   int ms;
   ms = biosmemory();
   printf("RAM size = %dK\n",ms);
}
