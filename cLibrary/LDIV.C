#include <stdio.h>
#include <stdlib.h>
void main()
{
ldiv_t nanugi;
nanugi=ldiv(10000,6);
printf("10000 ldiv 6 = %d mok %d namuji\n", 
  nanugi.quot,nanugi.rem);
}
