#include <stdlib.h>
#include <stdio.h>
#include <conio.h>

int main(void)
{
   char *string;
   double value;
   int dec, sign;
   int ndig = 10;

   clrscr();
   value = 9.876;
   string = ecvt(value, ndig, &dec, &sign);
   printf("string = %s      dec = %d sign = %d\n", string, dec, 
sign);

   value = -123.45;
   ndig= 15;
   string = ecvt(value,ndig,&dec,&sign);
   printf("string = %s dec = %d sign = %d\n", string, dec, 
sign);

   value = 0.6789e5; /* scientific notation */
   ndig = 5;
   string = ecvt(value,ndig,&dec,&sign);
   printf("string = %s         dec = %d sign = %d\n", string, 
dec, sign);

   return 0;
}
