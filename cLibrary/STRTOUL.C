#include <stdio.h>
#include <stdlib.h>
void main()
{
unsigned long num;
char *str;
char **ptr;
str="53456";
num=strtoul(str,ptr,0);
printf("read number is %ld\n",num);
}
