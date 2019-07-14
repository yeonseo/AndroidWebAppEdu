/**************************
Problem5-199_4.c
남연서
연습문제 5-199_4번
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>

int main()
{
	double length=0.0; //함수명 나눠지는 수 나누는 수로 바꿔보기
	const double cmInch=2.54;
	const double fitInch=12.0;
	printf("키를 입력하시오 : ");
	scanf("%lf", &length);
	
	//형변환.. 개고생고생
	printf("%d cm키는 %d피트 %lf인치입니다.",(int)length,(int)(length/(fitInch*cmInch)),(double)(length/cmInch));
	
	//형변환없이 자릿수 표시로 하기
	//printf("%d cm키는 %0.lf피트 %lf인치입니다.",(int)length,(length/(fitInch*cmInch)),(double)(length/cmInch));
	//->163 cm키는 5피트 64.173228인치입니다.
	return 0;
}
*/