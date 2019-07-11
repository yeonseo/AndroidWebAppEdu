#include <stdio.h>
#include <stdlib.h>
#include <alloc.h>
#include <string.h>
#include <dos.h>
void main()
{
  char *path, *ptr;
  int i = 0;
  ptr = getenv("PATH");
  path = (char *) malloc(strlen(ptr)+15);
  strcpy(path,"PATH=");
  strcat(path,ptr);
  strcat(path,";c:\\GIF");
  putenv(path);
}
