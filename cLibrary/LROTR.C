#include <stdio.h>
#include <stdlib.h>
void main()
{
int i;
long l;
l=0x1234;
for (i=0;i<10;i++)
  {
  l=_lrotr(l,1);
  printf("l = %lu\n",l);
  }
}
