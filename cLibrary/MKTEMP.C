#include <dir.h>
#include <stdio.h>
void main(void)
{
   char fname[]="TPXXXXXX";
   char *ptr;
   ptr=mktemp(fname);
   printf("temp file is %s\n",ptr);
}
