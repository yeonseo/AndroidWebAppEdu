#include <stdio.h>
#include <errno.h>
void main()
{
int i;
for (i=0;i<23;i++)
  {
  errno=i;
  perror("message ");
  }
}
