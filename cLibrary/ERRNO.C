#include <stdio.h>
#include <errno.h>
#include <stdlib.h>
void main()
{
int i;
for (i=0;i<23;i++)
  printf("sys_errlist[%d] = %s\n",i,sys_errlist[i]);
}
