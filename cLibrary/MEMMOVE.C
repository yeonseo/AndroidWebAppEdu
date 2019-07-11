#include <string.h>
#include <stdio.h>

 int main(void)
 {
   char *src = "last christmas gave you my heart";
   char *dest = src+5;
   printf("before memmove: %s\n", src);
   memmove(dest, src, 10);
   printf("after  memmove: %s\n", src);
   return 0;
 }
