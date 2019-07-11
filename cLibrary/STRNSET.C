#include <stdio.h>
#include <string.h>
void main()
{
char str[20]="abcdefghijkl";
printf("before ---> %s\n",str);
strnset(str,'=',5);
printf("after  ---> %s\n",str);
}
