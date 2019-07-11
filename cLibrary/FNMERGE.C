#include <string.h>
#include <stdio.h>
#include <dir.h>
void main(void)
{
  char path[MAXPATH];
  char drive[MAXDRIVE];
  char dir[MAXDIR];
  char file[MAXFILE];
  char ext[MAXEXT];
  strcpy(path,"c:\\bc\\exam\\file.ext");
  printf("file path is %s\n",path);
  fnsplit(path,drive,dir,file,ext);
  strcpy(file,"cppbible");
  strcpy(ext,".doc");
  fnmerge(path,drive,dir,file,ext);
  printf("file path is %s\n",path);
}
