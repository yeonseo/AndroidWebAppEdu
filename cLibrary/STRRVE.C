#include <stdio.h>
#include <string.h>
void main()
{
char string[20];
strcpy(string,"I'm fine thank you!");
strrev(string);
printf("reverse string is %s\n",string);
}
