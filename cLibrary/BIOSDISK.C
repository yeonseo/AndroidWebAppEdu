#include <bios.h>
#include <stdio.h>
void main(void)
{
   int result;
   char buffer[512];
   printf("Testing to see if drive a: is ready\n");
   result = biosdisk(4,0,0,0,0,1,buffer);
   result &= 0x02;
   if (result) printf("drive A: Ready\n");
     else printf("drive A: Not Ready\n");
}
