#include <stdio.h>
#include <string.h>
#include <fcntl.h>
#include <io.h>
void main(void)
{
  int handle;
  char buf[46]="pneumonoultramicroscopicsilicovolcanoconiosis";
  printf("Making file...\n");
  handle = open("chsize.dat", O_CREAT);
  write(handle, buf, strlen(buf));
  chsize(handle, 10);
  printf("please type chsize.dat\n");
  close(handle);
}
