#include <stdio.h>
#include <math.h>
void main()
{
double coeffs[]={2,3,4};
double i,num;
for (i=1;i<=9;i++)
  {
  num=poly(i,2,coeffs);
  printf ("i=%.0f => %.0f\n",i,num);
  }
}
