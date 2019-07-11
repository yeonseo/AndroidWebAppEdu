#include <stdio.h>
#include <string.h>
void main()
{
  char *buf1 = "cat";
  char *buf2 = "dog";
  char *buf3 = "ape";
  int stat;
  stat = memcmp(buf2, buf1, strlen(buf2));
  if (stat > 0)
     printf("buffer 2 is greater than buffer 1\n");
  else
     printf("buffer 2 is less than buffer 1\n");

  stat = memcmp(buf2, buf3, strlen(buf2));
  if (stat > 0)
     printf("buffer 2 is greater than buffer 3\n");
  else
     printf("buffer 2 is less than buffer 3\n");

  stat = memcmp(buf1, buf3, strlen(buf2));
  if (stat > 0)
     printf("buffer 1 is greater than buffer 3\n");
  else
     printf("buffer 1 is less than buffer 3\n");
}
