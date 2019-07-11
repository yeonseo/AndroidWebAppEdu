#include <stdio.h>
#include <string.h>
void main()
{
  char *buf1 = "ABCDE123";
  char *buf2 = "abcde456";
  int stat1,stat2;
  stat1 = memicmp(buf1,buf2,5);
  stat2 = memcmp(buf1,buf2,5);
  printf("memicmp stat = %d\n",stat1);
  printf("memcmp stat = %d\n",stat2);
}
