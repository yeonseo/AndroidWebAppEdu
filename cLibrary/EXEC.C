#include <process.h>
#include <stdio.h>
void main(void)
{
   int result;
   printf("Now execute GREP.COM\n");
   result=execlp("grep.come","grep.com"," ?");
   if (result==-1)
    printf("cannot execute child program\n");
}
