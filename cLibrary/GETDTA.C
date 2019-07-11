#include <dos.h>
#include <stdio.h>
void main(void)
{
   char far *dta;
   dta = getdta();
   printf("disk transfer address is: %Fp\n", dta);
}
