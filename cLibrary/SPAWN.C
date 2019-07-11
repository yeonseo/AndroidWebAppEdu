#include <process.h>
#include <stdio.h>
#include <stdlib.h>
void main(void)
{
   int result;
   printf("Now execute GREP.COM\n");
   result=spawnlp(P_WAIT,"grep.come","grep.com"," ?");
   if (result==-1)
     {
     printf("cannot execute child program\n");
     exit(0);
     }
   printf("\n\nGERP.COM is executed successful\n");
}
