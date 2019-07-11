#include <stdio.h>
#include <string.h>
void main()
{
char str1[50]="pretty girl";
char str2[50]="girl";
if (strstr(str1,str2)==NULL)
  puts("not found");
else
  puts("found");
}
