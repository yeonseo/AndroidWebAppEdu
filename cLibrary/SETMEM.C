#include <stdio.h>
#include <alloc.h>
#include <mem.h>
void main()
{
  char *dest;
  dest = (char *) malloc(20);
  setmem(dest, 19, 'S');
  dest[19]=0;
  printf("%s\n", dest);
}
