#include <stdio.h>
#include <dir.h>
void main(void)
{
  char buf[80];
  getcwd(buf,80);
  printf("Current working directory is %s.\n",buf);
}
