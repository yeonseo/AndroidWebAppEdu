#include <stdio.h>
#include <dos.h>
#include <conio.h>
#include <dos.h>
int ctrl_break(void)
{
   printf("Control-Break pressed.\n");
   printf("Do you want to abort? (y/n)\n");
   if (getch()=='y') return (0);
   else return (1);
}
void main(void)
{
   ctrlbrk(ctrl_break);
   for(;;)
   {
      printf("Now in main press CTRL-BREAK:\n");
      delay(100);
   }
}
