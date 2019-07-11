#include <time.h>
#include <stdio.h>
#include <dos.h>
#include <conio.h>
void main(void)
{
   time_t first, second;
   clrscr();
   printf("press any key after some wait\n");
   first = time(NULL);
     getch();
   second = time(NULL);
   printf("wait time is: %f seconds\n", difftime (second, 
first));
   getch();
}
