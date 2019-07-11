#include <string.h>
#include <conio.h>
#include <dos.h>
void main(void)
{
   char  buffer[80];
   clrscr();
   strcpy(buffer,"output test string$");
   bdosptr(0x09,buffer,0);
}
