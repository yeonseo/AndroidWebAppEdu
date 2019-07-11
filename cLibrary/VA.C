#include <stdio.h>
#include <stdarg.h>
void outsum(char *,...);
void main()
{
outsum("1+2 = %d\n",1,2,0); //맨끝의 0은 끝이라는 뜻이다.
outsum("1+2+3+4 = %d\n",1,2,3,4,0);
outsum("1~10 = %d\n",1,2,3,4,5,6,7,8,9,10,0);
}
void outsum(char *msg,...) {
int sum=0,arg;
va_list ap;
va_start(ap,msg);        /* 가변 인수를 읽기 위한 준비 */
while ((arg=va_arg(ap,int))!=0)  /* 인수를 하나씩 읽음 */
  sum+=arg;          
printf(msg,sum);     
va_end(ap);
}
