#include <string.h>
#include <stdio.h>
void main(void)
{
  char *buf1 = "made in korea";
  char *buf2 = "made in chosun";
  int result;
  result=strcmp(buf2, buf1);
  if (result!=0)
     printf("buf1 and buf2 are not same by strcmp\n");
  else
     printf("buf1 and buf2 are same by strcmp\n");
  result=strncmp(buf2, buf1,8);
  if (result!=0)
     printf("buf1 and buf2 are not same by stricmp\n");
  else
     printf("buf1 and buf2 are same by stricmp\n");
}
