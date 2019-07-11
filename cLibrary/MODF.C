#include <stdio.h>
#include <stdlib.h>
#include <math.h>
void main()
{
double ipart;
double real;
real=modf((double)3.1415,&ipart);
printf ("integer number is %f,real number is %f\n",ipart,real);
}
