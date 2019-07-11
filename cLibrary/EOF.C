#include <sys\stat.h>
#include <string.h>
#include <stdio.h>
#include <fcntl.h>
#include <io.h>
void main()
{
  int handle;
  char ch;
  handle = open("c:\\autoexec.bat",O_RDONLY);
  lseek(handle, 0L, SEEK_SET);
  do
  {
     read(handle, &ch, 1);
     printf("%c", ch);
  } while (!eof(handle));
  close(handle);
}
