#include <stdio.h>
#include <dos.h>
void main(void)
{
  struct  time t;
  gettime(&t);
  printf("The current minute is: %d\n", t.ti_min);
  printf("The current hour is: %d\n", t.ti_hour);
  printf("The current hundredth of a second is: %d\n", 
t.ti_hund);
  printf("The current second is: %d\n", t.ti_sec);
  t.ti_min++;
  settime(&t);
}
