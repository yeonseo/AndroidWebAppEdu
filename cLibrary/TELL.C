#include <stdio.h>
#include <io.h>
#include <fcntl.h>
#include <stdlib.h>
void main()
{
int handle;
long length;
handle=open("c:\\command.com",O_RDONLY | O_BINARY);
if (handle==-1)
  {
  printf("file open error");
  exit(1);
  }
lseek(handle,0,SEEK_END);
length=tell(handle);
printf("file size is %ld bytes\n",length);
close(handle);
}
