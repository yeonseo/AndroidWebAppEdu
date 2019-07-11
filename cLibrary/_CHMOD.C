#include <stdio.h>
#include <io.h>
#include <dos.h>
#include <stdlib.h>
void main()
{
int attr;
attr=_chmod("c:\\config.sys",0);
if (attr==-1)
  {
  printf("config.sys is not found");
  exit(1);
  }
if (attr & FA_RDONLY)
  printf("config.sys is Read only\n");
else printf("config.sys is Writable\n");
if (attr & FA_HIDDEN)
  printf("config.sys is Hidden file\n");
else printf("config.sys is Visible file\n");
}
