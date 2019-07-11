#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <fcntl.h>
#include <io.h>
void main(void)
{
  int handle;
  long length;
  handle = open("c:\\command.com", O_RDONLY | O_BINARY);
  if (handle==-1)
    {
    printf("command.com is not found");
    exit(1);
    }
  length=filelength(handle);
  printf("file length in bytes: %ld\n",length);
  close(handle);
}
