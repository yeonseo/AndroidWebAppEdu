#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
void main()
{
double j;
j=sqrt(4);
printf("first sqrt is %f\n",j);
j=sqrt(-4);
printf("second sqrt is %f\n",j);
}
int matherr(struct exception *excep)
{
if (excep->type==DOMAIN && (strcmp(excep->name,"sqrt")==0))
   {
   excep->retval=sqrt(-(excep->arg1));
   return(1);
   }
return(0);
}
