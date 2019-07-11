#include <string.h>
#include <alloc.h>
#include <stdio.h>
#include <stdlib.h>
void main()
{
char *str;
str=(char *)malloc(20);
if (str==NULL)
  {
  printf("out of memory\n");
  exit(0);
  }
strcpy(str,"dynamic memory");
printf("%s\n",str);
free(str);
}
