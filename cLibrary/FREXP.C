#include <math.h>
#include <stdio.h>
int main(void)
{
   double mantissa, number;
   int exponent;

   number = 8.0;
   mantissa = frexp(number, &exponent);

   printf("The number %lf is ", number);
   printf("%lf times two to the ", mantissa);
   printf("power of %d\n", exponent);

   return 0;
}
