#include <stdio.h>
#include <io.h>
#include <stdlib.h>
#include <string.h>
#include <sys\stat.h>
void main()
{
char buf[]="i love kkk very much\r\n\
she love me too.\r\n\
she is very pretty and womanful girl.\r\n";
int handle;
handle=creat("creat2.dat",S_IWRITE);
if (handle==-1)
  {
  printf("file creation eror\n");
  exit(1);
  }
write(handle,buf,strlen(buf));
close(handle);
}
