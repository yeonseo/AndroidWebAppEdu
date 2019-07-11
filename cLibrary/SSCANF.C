#include <stdio.h>
#include <string.h>
void main()
{
int i;
char str[128];
strcpy(str,"3");
sscanf(str,"%d",&i);
printf("i is %d",i);
}
