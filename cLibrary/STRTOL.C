#include <stdio.h>
#include <stdlib.h>
void main()
{
long num;
char *str;
char **ptr;
str="53456";
num=strtol(str,ptr,0);
printf("read number is %ld\n",num);
}
