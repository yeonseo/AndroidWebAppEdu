#include <stdio.h>
#include <dir.h>
#include <alloc.h>
void main(void)
{
  char *buf;
  buf=getcwd(NULL,80);
  printf("Current working directory is %s.\n",buf);
  free(buf);
}
