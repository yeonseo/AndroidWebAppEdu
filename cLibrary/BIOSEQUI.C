#include <bios.h>
#include <stdio.h>
int main(void)
{
   int equip;
   equip = biosequip();
   if (equip & 0x02)
     printf("A math coprocessor installed. \n");
   else
      printf("No math coprocessor installed.\n");
   return 0;
}
