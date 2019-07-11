#include <stdio.h>
#include <stdlib.h>
void main()
{
char buffer[80];
FILE *stream;
stream=fopen("c:\\config.sys","rt");
if (stream==NULL)
  {
  printf("File open error\n");
  exit(1);
  }
while (!feof(stream))
  {
  if (fgets(buffer,80,stream)==NULL) break;
  printf("%s",buffer);
  }
fclose(stream);
}
