#include <string.h>
#include <stdio.h>
void main(void)
{
  char *buf1 = "KOREA";
  char *buf2 = "korea";
  int result;
  result=strcmp(buf2, buf1);
  if (result!=0)
     printf("buf1 and buf2 are not same by strcmp\n");
  else
     printf("buf1 and buf2 are same by strcmp\n");
  result=stricmp(buf2, buf1);
  if (result!=0)
     printf("buf1 and buf2 are not same by stricmp\n");
  else
     printf("buf1 and buf2 are same by stricmp\n");
}
