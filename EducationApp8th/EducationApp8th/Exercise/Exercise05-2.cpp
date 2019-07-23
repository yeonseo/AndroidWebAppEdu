/**************************
Exercise05-2.c
남연서
연습문제 5-2
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>
int main() {
	int num1=0, num2=0;
	char result[100];

	printf("입력");
	scanf("%d %d",&num1, &num2);
	
	if(num1==num2)
	{
		//result="sam";
		strcpy(result,"sam");
	}else if(num1>num2)
	{
		sprintf(result,"작은 수는 %d",num2);

	}else{
		sprintf(result,"작은 수는 %d",num1);
	}	
		printf("%d 와 %d 의 비교 : %s\n",num1, num2, result);
	
	//else
	//{
	//	conv=(num1>num2)?num2:num1;
	//	sprintf(result,"%d",conv);
	//	strcat(result,"보다 작음");
	//}
	//	printf("%d 와 %d 의 비교 : %c",num1, num2, conv);
	//	printf("%s",result);

	return 0;
}
*/

/*
#include <stdio.h>
int main()
{
	int num1=0,num2=0;
	scanf("%d %d", &num1, &num2);
	(num1>num2)?printf("작은 값은 %d입니다.\n",num2):((num1<num2)?printf("작은 값은 %d입니다.\n",num1):(printf("같음\n")));
	return 0;

}
*/