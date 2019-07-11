#include <stdio.h>
#include <math.h>
void main()
{
double y;
for (y=0.0;y<10.0;y++)
  printf("pow(10,%.0f) = %.0f\n",y,pow(10,y));
} 
