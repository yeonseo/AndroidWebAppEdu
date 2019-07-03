/**************************
Problem2-108_5.c
남연서
연습문제 2-108 5번
입력:없음(void)
출력:return값(0)
**************************/
/**/
#include <stdio.h>
int main()
{
	double dXvalue,dResult;

	char *star="******************";
	char *line="--------";
	char *str="o★o";

	printf("%s\n*    %s    *\n%s\n",star,"계산기",star);
	printf("%s\n%s %s %s\n%s\n",star,str,"다항식",str,star);
	printf("실수를 입력하시오 : ");
	scanf("%lf",&dXvalue);

	dResult=3*dXvalue*dXvalue+7*dXvalue+11;
	printf("다항식의 계산 결과값은 %lf 입니다.",dResult);
	return 0;
}
