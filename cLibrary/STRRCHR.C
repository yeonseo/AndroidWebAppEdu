#include <string.h>
#include <stdio.h>
void main()
{
  char string[15];
  char *ptr1,*ptr2;
  strcpy(string, "mother and father");
  ptr1=strchr(string,'a');
  ptr2=strrchr(string,'a');
  if (ptr1)
     printf("found a position %d from head\n",ptr1-string);
  else
     printf("The a character was not found\n");
  if (ptr2)
     printf("found a position %d from tail\n",ptr2-string);
  else
     printf("The a character was not found\n");
}
