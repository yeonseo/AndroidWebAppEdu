#include <conio.h>
#include <stdio.h>
void main(void)
{
   int i, j;
   clrscr();
   for (i=0; i<15; i++)
   {
       for (j=0; j<50; j++)
	  cprintf("S");
       printf("\n");
       textcolor(i+1);
       textbackground(i);
   }

}
