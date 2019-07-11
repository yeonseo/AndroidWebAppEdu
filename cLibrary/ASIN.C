#include <stdio.h>
#include <math.h>
void main()
{
double x;
printf("   x      asin(x)      \
acos(x)      atan(x)\n");
for (x=-1;x<1;x+=0.1)
  printf("%5.1f %12f %12f %12f\n"
	 ,x,asin(x),acos(x),atan(x));
}
