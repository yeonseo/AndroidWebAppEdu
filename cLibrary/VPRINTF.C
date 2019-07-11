#include <stdio.h>
#include <stdarg.h>
void vpf(char *fmt, ...)
{
   va_list ap;
   va_start(ap, fmt);    // 가변인수의 시작 번지 구함
   vprintf(fmt, ap); // 가변인수의 시작 번지를 넘겨 준다.
   va_end(ap);           // 가변인수 사용 끝
}
void main(void)
{
vpf("%d %f %s\n",1,3.14,"string");
}
