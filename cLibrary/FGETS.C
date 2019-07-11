#include <stdio.h>
#include <stdlib.h>
void main()
{
int i;
char buffer[80];
FILE *stream;
stream=fopen("c:\\autoexec.bat","rt");
if (stream==NULL)
  {
  printf("File open error\n");
  exit(1);
  }
for (i=0;i<5;i++)
  {
  if (fgets(buffer,80,stream)==NULL) break;
  printf("%d: %s",i,buffer);
  }
fclose(stream);
}
