/**************************
Exercise09-7.c
남연서
연습문제 9-7
입력:없음(void)
출력:return값(0)
**************************/
/* //문자의 순서확인하기
#include <stdio.h>
#include <string.h>

int numInput(int a, int b);
char numInputMulti(char *arr);
void alpabet(char a);
int main()
{
	unsigned const int arrMax=1;		//배열 크기 정해주기
	int result=0, i=0;
	char *multiNum[arrMax];				//여러 값을 받기 위해서 포인터배열 사용하기
	char arr[arrMax];

	for(i=0 ; i<arrMax; i++)			//포인터 배열에 결과값 받기 사용
	{
		multiNum[i]=&arr[i];
		numInputMulti(multiNum[i]);
	}

	alpabet(*multiNum[0]);
	return 0;
}
int numInput(int a, int b)		// 리턴값 변수에 저장
{
	int result;
	do
	{
		printf("수를 입력하시오 : ");
		scanf("%d",&result);
	}while(result<a||result>b);
	printf("값이 %d로 입력되었습니다.\n",result);
	return result;
}
char numInputMulti(char *arr) // 리턴값 포인터 배열에 저장
{
	printf("문자를 입력하시오 : ");
	scanf("%c",arr);
	while( getchar() != '\n' );					//scanf char형엔 꼭!!!! 버퍼에 남은 데이터 없애기
	printf("값이 %c로 입력되었습니다.\n",*arr);
	return 0;
}
void alpabet(char a)
{
	if(a>96) a=a-32;							//소문자로 입력할 시 대문자로 변환하도록 하기
	printf("입력하신 %c는 %d번째 문자입니다.\n",a,a-64);
}
//*/