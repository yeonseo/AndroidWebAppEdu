#include <stdio.h>
#include <conio.h>
void main()
{
clrscr();
textattr(0x23);
cputs("text attribute\r\n");
textattr(RED | BLUE << 4);
cputs("text attribute\r\n");
}
