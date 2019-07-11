#include <stdio.h>
#include <stdlib.h>
void main()
{
char buffer[80];
FILE *stream;            // FILE형 구조체 준비
stream=fopen("c:\\autoexec.bat","rt");
if (stream==NULL)
  {
  printf("File open error\n");
  exit(1);
  }
while (!feof(stream)){
  if (fgets(buffer,80,stream)==NULL) break;
  printf("%s",buffer);
  }
fclose(stream);
}
