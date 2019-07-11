#include <stdio.h>
#include <string.h>
void main()
{
char src[20];
char dest[20];
strcpy(src,"BABO");
strcpy(dest,"KIMUN ");
strcat(dest,src);
printf("destination string is %s\n",dest);
}
