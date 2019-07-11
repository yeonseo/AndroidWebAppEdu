#include <string.h>
#include <stdio.h>
void main()
{
  char str[50];
  char *ptr;
  strcpy(str, "pneumooultramicroscopicsilicovolcanoconiosis");
  ptr = (char *) memchr(str, 'v', strlen(str));
  if (ptr)
    printf("The character 'v' is at position: %d\n", ptr - 
str);
  else
    printf("The character was not found\n");
}
