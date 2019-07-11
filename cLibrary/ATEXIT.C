#include <conio.h>
#include <stdio.h>
#include <stdlib.h>
void nowexit(void)
{
   printf("here is out of main function\n");
   getch();
}
void main(void)
{
   atexit(nowexit);
   clrscr();
   printf("Now I am in main function\n");
   printf("I am about to exit...\n");
   printf("Press any key to exit\n\n");
   getch();
   exit(0);
}
