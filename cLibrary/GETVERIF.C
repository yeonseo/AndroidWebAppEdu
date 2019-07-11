#include <stdio.h>
#include <conio.h>
#include <dos.h>
void main(void)
{
   if (getverify())
      printf("verify flag is on\n");
   else
      printf("verify flag is off\n");
}
