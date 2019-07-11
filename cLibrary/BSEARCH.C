#include <stdlib.h>
#include <stdio.h>
typedef int (*fptr)(const void*, const void*);
#define NELEMS(arr) (sizeof(arr) / sizeof(arr[0]))
int numarray[] = {890, 629, 927, 234, 768, 588};
int numeric (const int *p1, const int *p2)
{
   return(*p1 - *p2);
}
int lookup(int key)
{
  int  *itemptr;
  itemptr = (int *) bsearch (&key, numarray, NELEMS(numarray),
    sizeof(int), (fptr)numeric);
  return (itemptr != NULL);
}
void main(void)
{
  if (lookup(588))
    printf("588 is in the table.\n");
  else
    printf("588 isn't in the table.\n");
}
