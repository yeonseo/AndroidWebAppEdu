#include <stdio.h>
#include <math.h>
void main()
{
double f;
for (f=-5;f<5;f++)
  printf("exp(%f)=%f\n",f,exp(f));
}
