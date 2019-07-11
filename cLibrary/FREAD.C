#include <stdio.h>
#include <alloc.h>
#include <io.h>
#include <stdlib.h>
void main()
{
void *buf;
FILE *src;
FILE *dest;
long length;
buf=malloc(1000);
if (buf==NULL)
  {
  printf("out of memory");
  exit(1);
  }
src=fopen("c:\\autoexec.bat","rt");
if (src==NULL)
  {
  printf("file not found");
  exit(1);
  }
dest=fopen("c:\\autoexec.txt","w+");
length=filelength(fileno(src));
fread(buf,1,length,src);
fwrite(buf,1,length,dest);
free(buf);
fclose(src);
fclose(dest);
printf("%d bytes copied\n",length);
}
