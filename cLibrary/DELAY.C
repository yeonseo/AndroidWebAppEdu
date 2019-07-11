#include <stdio.h>
#include <dos.h>
void main(void)
{
int i;
for (i=0;i<100;i++)
   {
   sound(500);
   delay(30);
   sound(700);
   delay(30);
   }
nosound();
}
