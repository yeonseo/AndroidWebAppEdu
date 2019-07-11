#include <stdio.h>
#include <dos.h>
#include <stdlib.h>
void main()
{
int i;
printf("argument count is %d\n",_argc);
if (_argc==1) exit(0);
for (i=0;i<_argc;i++)
  printf("arg%d = %s\n",i+1,_argv[i]);
}
