#include <stdio.h>
#include <io.h>
#include <stdlib.h>
#include <string.h>
#include <dos.h>
void main()
{
char buf[]="long long ago Myung Hee traveled the\r\n\
continent of Africa. she met man eaters.\r\n\
Man eaters asked \"die or BungaBunga?\"\r\n";
int handle;
handle=creatnew("creatnew.dat",FA_HIDDEN);
if (handle==-1)
  {
  printf("file creation eror\n");
  exit(1);
  }
write(handle,buf,strlen(buf));
close(handle);
}
