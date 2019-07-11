#include <stdio.h>
#include <time.h>
void main(void)
{
   time_t t;
   time(&t);
   printf("Today's date and time: %s\n", ctime(&t));
}
