#include <stdio.h>
#include <stdlib.h>
void main()
{
int ndig,sign;
char *str;
double d=2.1234567;
str=fcvt(d,6,&ndig,&sign);
printf("str=%s\n",str);
printf("ndig=%d\n",ndig);
printf("sign=%d\n",sign);
}
