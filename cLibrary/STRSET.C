#include <stdio.h>
#include <string.h>
void main()
{
char str[20]="abcdefghijkl";
printf("before ---> %s\n",str);
strset(str,'=');
printf("after  ---> %s\n",str);
}
