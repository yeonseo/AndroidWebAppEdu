#include <string.h>
#include <stdio.h>
#include <io.h>
void main(void)
{
   int handle;
   char path[128];
   strcpy(path, "\\");
   handle = creattemp(path, 0);
   printf("created temp file is %s\n", path);
   close(handle);
}
