#include <stdio.h>
#include <setjmp.h>
#include <stdlib.h>
void subroutine(jmp_buf);
void main(void)
{
  int value;
  jmp_buf jumper;
  value = setjmp(jumper);
  if (value != 0)
  {
    printf("Longjmp with value %d\n", value);
    exit(value);
  }
  printf("call subroutine\n");
  subroutine(jumper);
}
void subroutine(jmp_buf jumper)
{
  longjmp(jumper,1);
}
