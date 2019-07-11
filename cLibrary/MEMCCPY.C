#include <string.h>
#include <stdio.h>
void main(void)
{
  char *src = "This is the source string";
  char dest[50];
  char *ptr;
  ptr = (char *) memccpy(dest, src, 'c', strlen(src));
  if (ptr)
  {
    printf("The character was found\n");
    *ptr = '\0';
    printf("dest is %s\n",dest);
  }
  else
  {
    printf("The character wasn't found\n");
    printf("dest is %s\n",dest);
  }
}
