#include <dos.h>
#include <stdio.h>
int main(void)
{
int i;
clrscr();
for (i=1;i<10;i++)
   {
   printf("Program is sleeping for %d seconds\n",i);
   sleep(i);
   }
return 0;
}
