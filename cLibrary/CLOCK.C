#include <time.h>
#include <stdio.h>
#include <dos.h>
#include <conio.h>
void main(void)
{
   int i,j=0;
   clock_t start, end;
   start = clock();
   for (i=0;i<300;i++) clrscr();
   end = clock();
   printf("elapsed time is: %f\n", (end - start) / CLK_TCK);
}
