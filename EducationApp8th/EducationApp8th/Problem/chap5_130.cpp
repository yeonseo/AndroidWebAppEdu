/*
#include <stdio.h>
int main()
{
	int num1,num2,num3,max1,max2;

	printf("첫번째 수를 입력하세요 :");
	fflush(stdout);
	fflush(stdin);
	scanf("%d", &num1);

	printf("두번째 수를 입력하세요 :");
	fflush(stdout);
	fflush(stdin);
	scanf("%d", &num2);

	printf("세번째 수를 입력하세요 :");
	fflush(stdout);
	fflush(stdin);
	scanf("%d", &num3);

	//(num1>num2)?(max1=num1):(max1=num2);
	//(max1>num3)?(max2=max1):(max2=num3);
	
	max1=(num1>num2)?(num1):(num2);
	max2=(max1>num3)?(max1):(num3);

	printf("가장 큰 수는 %d입니다. \n",max2);

	return 0;
}
//*/