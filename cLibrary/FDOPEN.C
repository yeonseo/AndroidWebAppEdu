#include <stdio.h>
#include <stdlib.h>
#include <io.h>
#include <fcntl.h>
void main()
{
char buffer[80];
FILE *stream;
int handle;
handle=open("c:\\autoexec.bat",O_TEXT);
if (handle==-1)
  {
  printf("File open error\n");
  exit(1);
  }
stream=fdopen(handle,"rt");
while (!feof(stream)){
  if (fgets(buffer,80,stream)==NULL) break;
  printf("%s",buffer);
  }
fclose(stream);
}
