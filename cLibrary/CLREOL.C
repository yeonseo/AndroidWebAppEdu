#include <conio.h>
#include <stdio.h>
void main(void)
{
   clrscr();
   printf("This line will be deleted \n");
   gotoxy(10, 1);
   getch();
   clreol();
}
