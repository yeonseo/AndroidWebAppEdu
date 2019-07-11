#include <stdio.h>
#include <time.h>
void main(void)
{
time_t t;
t = time(NULL);
printf("Current date is %s", ctime(&t));
t -= 6L*60L*60L;
stime(&t);
printf("\nNew date is %s", ctime(&t));
}
