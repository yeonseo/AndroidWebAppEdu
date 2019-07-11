#include <stdio.h>
void main()
{
printf("rename file....\n");
if (rename("test.txt","notest.txt")==0)
  printf("rename success\n");
else
  printf("rename fail\n");
}
