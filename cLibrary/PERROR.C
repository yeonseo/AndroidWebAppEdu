#include <stdio.h>
#include <io.h>
#include <fcntl.h>
int main(void)
{
   int handle;
   handle=open("neverext.$$$",O_TEXT);
   if (handle==-1)
      perror("Merong merong");
   return 0;
}
