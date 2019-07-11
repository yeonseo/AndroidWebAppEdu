#include <stdio.h>
#include <dos.h>
void main()
{
if (getcbrk())
  printf("Ctrl-Break checking is on\n");
else
  printf("Ctrl-Break checking is off\n");
}
