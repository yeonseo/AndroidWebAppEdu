#include <stdio.h>
#include <dir.h>
void main()
{
int result;
result=chdir("c:\\dos");   // 디렉토리를 바꾼다.
if (result==-1)
  printf("path not found\n");
else
  printf("path change successful\n");
}
