#include <stdio.h>
#include <dir.h>
#include <io.h>
void main(void)
{
   int stat;
   stat = ioctl(0, 8, 0, 0);
   if (!stat)
      printf("Drive %c is removable.\n", getdisk() + 'A');
   else
      printf("Drive %c is not removable.\n", getdisk() + 'A');
}
