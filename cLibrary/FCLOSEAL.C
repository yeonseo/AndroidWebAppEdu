#include <stdio.h>
#include <stdlib.h>
void main()
{
char buffer[80];
FILE *stream;            // FILE형 구조체 준비
FILE *stream2;
printf("\n===== AUTOEXEC.BAT =====\n\n");
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
printf("\n===== CONFIG.SYS =====\n\n");
stream2=fopen("c:\\config.sys","rt");
if (stream2==NULL)
  {
  printf("File open error\n");
  exit(1);
  }
while (!feof(stream2)){
  if (fgets(buffer,80,stream2)==NULL) break;
  printf("%s",buffer);
  }
fcloseall();
}
