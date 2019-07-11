#include <stdio.h>
#include <conio.h>
void main()
{
char buf[20];
buf[0]=10;        // 최대 입력 문자를 입력한다.
cgets(buf);       // 입력 받음
printf("\n");       
cputs(buf+2);     // 입력 받은 문자열을 다시 출력한다.
}
