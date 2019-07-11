#include <stdio.h>
#include <bios.h>
#include <time.h>
void main()
{
long ti,cho;
ti=biostime(0,0L);
printf("biostime(0,0)=%ld\n",ti);
cho=ti/CLK_TCK;
printf("cho= %ld\n",cho);
printf("now time is %2ld:%2ld:%2ld\n"
  ,(cho/3600) % 12,(cho/60) % 60
  ,cho % 60);
}
