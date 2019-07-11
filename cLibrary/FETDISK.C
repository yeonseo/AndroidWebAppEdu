#include <stdio.h>
#include <dir.h>
void main(void)
{
  int drive;
  drive=getdisk()+'A';
  printf("current drive is: %c\n", drive);
}
