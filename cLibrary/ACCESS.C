#include <stdio.h>
#include <io.h>
void main()
{
if (access("C:\\AUTOEXEC.BAT",0)==0)
  printf("AUTOEXEC.BAT is exist\n");
else
  printf("AUTOEXEC.BAT is not exist\n");
}
