#include <stdio.h>
#include <dos.h>
void main()
{
int i;
for (i=0;i<5;i++)
  printf("environ[%d] = %s\n",i,environ[i]);
}
