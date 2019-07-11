#include <stdio.h>
#include <io.h>
#include <stdlib.h>
void main(int argc, char *argv[])
{
if (argc<2)
  {
  printf("input filename to delete\n");
  exit(1);
  }
printf("delete file...\n");
if (unlink(argv[1])==0)
  printf("delete success\n");
else
  printf("delete fail\n");
}
