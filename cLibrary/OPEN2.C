#include <stdio.h>
#include <stdlib.h>
#include <io.h>
#include <sys\stat.h>
#include <fcntl.h>
#include <alloc.h>
void main(int argc,char *argv[])
{
int handles,handled,readnum;
void *buf;
if (argc<=2)
  {
  printf("I need two parameter\n");
  exit(1);
  }
handles=open(argv[1],O_RDONLY | O_BINARY);
if (handles==-1)
  {
  printf("Open File Error\n");
  exit(1);
  }
handled=open(argv[2],O_CREAT | O_BINARY,S_IWRITE);
if (handled==-1)
  {
  printf("Open File Error\n");
  exit(1);
  }
if((buf=malloc(60000))==NULL)
  {
  printf("Out of memory\n");
  exit(1);
  }
while ((readnum = read(handles, buf, 60000)) != 0 && 
readnum !=-1)
   write(handled,buf,readnum);
close(handles);
close(handled);
free(buf);
}
