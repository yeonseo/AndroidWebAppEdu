#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int sort_function( const void *a, const void *b);
char list[5][4] = { "KIM", "LEE", "PAK", "JUN", "SIN" };
void main(void)
{
  int  x;
  qsort((void *)list, 5, sizeof(list[0]), sort_function);
  for (x = 0; x < 5; x++)
    printf("%s\n", list[x]);
}

int sort_function( const void *a, const void *b)
{
  return( strcmp((char *)a,(char *)b) );
}
