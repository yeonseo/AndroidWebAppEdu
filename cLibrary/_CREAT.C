#include <stdio.h>
#include <io.h>
#include <stdlib.h>
#include <string.h>
void main()
{
char buf[]="i love kek1224 very much\r\n\
she love me too.\r\n\
she is very pretty and womanful girl.\r\n";
int handle;
handle=_creat("creat.dat",0);
if (handle==-1)
  {
  printf("file creation eror\n");
  exit(1);
  }
write(handle,buf,strlen(buf));
close(handle);
}
