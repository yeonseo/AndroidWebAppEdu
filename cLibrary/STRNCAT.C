#include <stdio.h>
#include <string.h>
void main()
{
char str1[50]="made in ";
char str2[50]="korea";
strncat(str1,str2,3);
printf("result is \"%s\"\n",str1);
}
