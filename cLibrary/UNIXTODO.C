#include <stdio.h>
#include <dos.h>

char *month[] = {"","Jan","Feb","Mar","Apr","May","Jun",
		    "Jul","Aug","Sep","Oct","Nov","Dec"};

#define SECONDS_PER_DAY 86400L

struct date dt;
struct time tm;

void main(void)
{
   unsigned long val;

/* get today's date and time */
   getdate(&dt);
   gettime(&tm);
   printf("today is %d %s %d\n",
    dt.da_day, month[dt.da_mon], dt.da_year);

   val = dostounix(&dt, &tm);
/* subtract 42 days worth of seconds */
   val -= (SECONDS_PER_DAY * 42);

/* convert back to dos time and date */
   unixtodos(val, &dt, &tm);
   printf("42 days ago it was %d %s %d\n",
	  dt.da_day, month[dt.da_mon], dt.da_year);
}
