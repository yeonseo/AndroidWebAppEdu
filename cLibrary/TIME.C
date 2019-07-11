#include <time.h>
#include <stdio.h>
#include <dos.h>
void main(void)
{
   time_t t;
   time(&t);
   printf("now GMT is %ld\n",t);
}
