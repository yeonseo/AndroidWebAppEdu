#include <stdio.h>
#include <stdlib.h>
void main()
{
char buffer[80];
FILE *stream;
stream=fopen("c:\\config.sys","w");
if (stream==NULL)
  {
  printf("File open error\n");
  exit(1);
  }
fgets(buffer,80,stream);
if (ferror(stream))
  {
  printf("file I/O error is occured\n");
  printf("operation failed\n");
  }
else printf("%s",buffer);
fclose(stream);
}
