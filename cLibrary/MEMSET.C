#include <conio.h>
#include <stdio.h>
#include <string.h>
#include <dos.h>
int main(void)
{
  void *vmem;
  printf("press any key to clear screen\n");
  getch();
  vmem=MK_FP(0xb800,0x0000);
  memset(vmem,'S',80*25*2);
  getch();
}
