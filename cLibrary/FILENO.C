#include <stdio.h>
#include <io.h>
#include <fcntl.h>
#include <alloc.h>
#include <stdlib.h>
void main()
{
int handle;
FILE *stream;
int offset=0;
int length;
void *buf;
buf=malloc(60000);
if (buf==NULL)
  {
  printf("out of memory");
  exit(1);
  }
stream=fopen("c:\\autoexec.bat","rt");
if (stream==NULL)
  {
  printf("open failed");
  exit(1);
  }
handle=fileno(stream);
length=read(handle,buf,60000);            // 읽어 들임
if (length==-1)
  {
  printf("reading error");
  exit(1);
  }
for (offset=0;offset<length;offset++)     // 출력
  putchar(((char *)buf)[offset]);
close(handle);
fclose(stream);
free(buf);
}
