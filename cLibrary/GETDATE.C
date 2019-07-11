#include <stdio.h>
#include <dos.h>
#include <conio.h>
void main()
{
struct date today;
clrscr();
getdate(&today);
printf("Today is %d year %d month %d day\n"
       ,today.da_year,today.da_mon,today.da_day);
}
