#include <stdio.h>
#include <stdlib.h>
void main(int argc,char *argv[])
{
if (argc<3)
  {
  printf("argument is needed\n");
  printf("program terminate\n");
  _exit(1);
  }
printf("first argument is %s\n",argv[0]);
printf("second argument is %s\n",argv[1]);
printf("third argument is %s\n",argv[2]);
}
