#include <alloc.h>
#include <stdio.h>
#include <stdlib.h>
void main()
{
int i;
int *ar;
ar=(int *)calloc(10,sizeof(int));  // 동적 메모리 할당
if (ar==NULL)
  {
  printf("out of memory\n");
  exit(0);
  }
for (i=0;i<9;i++)
  {
  ar[i]=random(255);
  printf("%d\n",ar[i]);
  }
free(ar);
}
