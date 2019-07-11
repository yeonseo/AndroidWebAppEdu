#include <time.h>
#include <stddef.h>
#include <dos.h>
#include <stdio.h>
void main(void)
{
  time_t t;
  struct time d_time;
  struct date d_date;
  struct tm *local;
  getdate(&d_date);
  gettime(&d_time);
  t = dostounix(&d_date, &d_time);
  local = localtime(&t);
  printf("Time and Date: %s\n", asctime(local));
}
