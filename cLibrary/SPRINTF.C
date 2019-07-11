#include <stdio.h>
#include <conio.h>
void main()
{
char str[128];
float f;
f=3.141592;
sprintf(str,"pie is %f",f);
printf("str=%s\n",str);
}
