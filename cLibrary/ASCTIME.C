#include <stdio.h>
#include <string.h>
#include <time.h>
void main(void)
{
   struct tm t;
   t.tm_sec    = 9;  /* 초 */
   t.tm_min    = 10; /* 분 */
   t.tm_hour   = 31; /* 시간 */
   t.tm_mday   = 18; /* 날짜 */
   t.tm_mon    = 6;  /* 달 */
   t.tm_year   = 94; /* 년 */
   t.tm_wday   = 4;  /* 요일 */
   t.tm_yday   = 0;  /* 출력되지 않음 */
   t.tm_isdst  = 0;  /* 출력되지 않음 */
   printf("%s",asctime(&t));
}
