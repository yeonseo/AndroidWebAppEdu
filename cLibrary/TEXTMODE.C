#include <conio.h>
void main(void)
{
   textmode(BW40);
   cprintf("BW40");
   getch();

   textmode(C40);
   cprintf("C40");
   getch();

   textmode(C4350);
   cprintf("C4350");
   getch();

   textmode(C80);
   cprintf("C80");
   getch();
}
