#include <stdio.h>
#include <math.h>
void main()
{
double y;
for (y=0.0;y<20.0;y++)
  printf("pow(2,%.0f) = %.0f\n",y,pow(2,y));
} 
