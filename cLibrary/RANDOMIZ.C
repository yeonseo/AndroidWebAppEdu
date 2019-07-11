#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void main()
{
int i;
randomize();
for (i=0;i<10;i++)
printf("%d\n",random(11));
}
