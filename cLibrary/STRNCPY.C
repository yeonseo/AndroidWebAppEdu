#include <stdio.h>
#include <string.h>
void main()
{
char str1[50];
char str2[50]="bunga bunga?";
strncpy(str1,str2,5);
str1[5]=0;
printf(str1);
}
