#include <stdio.h>
#include <process.h>
#include <dos.h>
void main()
{
  struct date today;
  today.da_year = 1994;
  today.da_day = 29;
  today.da_mon = 6;
  setdate(&today);
}
