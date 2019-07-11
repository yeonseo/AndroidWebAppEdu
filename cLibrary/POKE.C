#include <stdio.h>
#include <dos.h>
#include <conio.h>
void main()
{
clrscr();
poke(0xb800,0x100,0x0753);
}
