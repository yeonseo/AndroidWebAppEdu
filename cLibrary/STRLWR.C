#include <stdio.h>
#include <string.h>
void main()
{
char string[20];
strcpy(string,"Made in Korea");
strlwr(string);
printf("noncapital string is %s\n",string);
}
