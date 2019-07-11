#include <mem.h>
#include <alloc.h>
#include <stdio.h>
#include <string.h>
void main()
{
  char *source = "Korean girl is pretty";
  char *destination;
  int length;
  length = strlen(source);
  destination = (char *) malloc(length + 1);
  movmem(source, destination, length);
  printf("%s\n", destination);
}
