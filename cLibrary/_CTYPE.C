#include <stdio.h>
#include <ctype.h>
void main()
{
int i;
for (i=0;i<256;i++)
  printf("%d = %x\n",i,_ctype[i+1]);
}
