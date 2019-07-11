#include <stdio.h>
void main()
{
printf("delete file\n");
if (remove("test.txt")==0)
  printf("delete success\n");
else
  printf("delete fail\n");
}
