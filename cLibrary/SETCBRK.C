#include <dos.h>
#include <conio.h>
#include <stdio.h>
void main(void)
{
  int break_flag;
  printf("Enter 0 to turn control break off\n");
  printf("Enter 1 to turn control break on\n");
  break_flag = getch()-'0';
  setcbrk(break_flag);
  if (getcbrk())
     printf("Cntrl-brk flag is on\n");
  else
     printf("Cntrl-brk flag is off\n");
}
