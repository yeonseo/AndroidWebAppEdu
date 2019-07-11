#include <stdio.h>
#include <dos.h>
void main(void)
{
   unsigned char result;
   int port = 0;           /* serial port 1 */

   result = inportb(port);
   printf("Byte read from port %d = 0x%X\n"
     , port, result);
}
