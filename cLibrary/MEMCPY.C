#include <stdio.h>
#include <string.h>

int main(void)
{
   char src[] = "Four score and seven years ";
   char dest[] = "abcdefghijlkmnopqrstuvwxyz0123456709";
   char *ptr;
   printf("before memcpy: %s\n", dest);
   ptr = (char *) memcpy(dest,src,strlen(src));
   printf("after memcpy: %s\n", dest);
   return 0;
}
