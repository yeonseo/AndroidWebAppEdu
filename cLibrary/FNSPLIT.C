#include <stdlib.h>
#include <stdio.h>
#include <dir.h>
int main(void)
{
  char *path;
  char drive[MAXDRIVE];
  char dir[MAXDIR];
  char file[MAXFILE];
  char ext[MAXEXT];
  int flags;

  path=getenv("COMSPEC"); /* get the comspec environment 
parameter */
  flags=fnsplit(path,drive,dir,file,ext);

  printf("Command processor info:\n");
  if(flags & DRIVE)
     printf("  drive: %s\n",drive);
  if(flags & DIRECTORY)
     printf("  directory: %s\n",dir);
  if(flags & FILENAME)
     printf("  file: %s\n",file);
  if(flags & EXTENSION)
     printf("  extension: %s\n",ext);
}
