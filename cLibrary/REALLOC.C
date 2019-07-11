#include <stdio.h>
#include <alloc.h>
#include <conio.h>
#include <stdlib.h>
void main()
{
int *pi;
int i;
clrscr();
pi=(int *)malloc(10*sizeof(int));      /* memory 할당 */
if (pi==NULL) exit(0);
pi=(int *)realloc(pi,20*sizeof(int)); /*확장 할당한다.*/
if (pi==NULL) exit(0);
for (i=0;i<20;i++)
  pi[i]=i;
for (i=0;i<20;i++)
  printf("%d\n",pi[i]);
free(pi);             /* 할당 해제 */
}
