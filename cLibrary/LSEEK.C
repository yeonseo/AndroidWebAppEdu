#include <sys\stat.h>
#include <string.h>
#include <stdio.h>
#include <fcntl.h>
#include <io.h>
void main()
{
  int handle;
  char msg[] = "test string";
  char ch;
  handle = open("lseek.dat",
     O_CREAT | O_RDWR, S_IREAD | S_IWRITE);
  write(handle, msg, strlen(msg));
  lseek(handle, 0L, SEEK_SET);
  do
  {
     read(handle, &ch, 1);
     printf("%c", ch);
  }  while (!eof(handle));
  close(handle);
}
