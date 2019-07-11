#include <stdio.h>
#include <io.h>
#include <fcntl.h>
#include <alloc.h>
#include <stdlib.h>
void main(int argc,char *argv[])
{
int handle;
int offset=0;
int length;
void *buf;
if (argc<2)
  {
  printf("I need parameter");
  exit(1);
  }
buf=malloc(60000);     // 버퍼를 직접 마련해 준다.
if (buf==NULL)
  {
  printf("out of memory");
  exit(1);
  }
handle=open(argv[1],O_TEXT | O_RDONLY);   // 파일 오픈
if (handle==-1)
  {
  printf("open failed");
  exit(1);
  }
length=read(handle,buf,60000);            // 읽어 들임
if (length==-1)
  {
  printf("reading error");
  exit(1);
  }
for (offset=0;offset<length;offset++)     // 출력
  putchar(((char *)buf)[offset]);
close(handle);
free(buf);
}
