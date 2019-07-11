#include <stdio.h>
#include <stdlib.h>
void main()
{
div_t nanugi;
nanugi=div(100,6);
printf("100 div 6=mok %d,namuji %d\n", nanugi.quot, 
nanugi.rem);
}
