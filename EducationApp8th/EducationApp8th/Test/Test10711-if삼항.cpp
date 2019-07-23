/**************************
Test0711-if삼항.c
남연서
로직문제if 삼항 3num 비교하기
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>

int main()
{
	int inputNum1=0,inputNum2=0,inputNum3=0,bufferNum=0,maxNum=0;

	printf("비교하고 싶은 세 개의 수를 입력하시오");
	scanf("%d %d %d",&inputNum1,&inputNum2,&inputNum3);

	//if(inputNum1>inputNum2)
	//	bufferNum=inputNum1;
	//else
	//	bufferNum=inputNum2; 
	bufferNum=(inputNum1>inputNum2)?inputNum1:inputNum2;

	//if(bufferNum>inputNum3)
	//	maxNum=bufferNum;
	//else
	//	maxNum=inputNum3;
	maxNum=(bufferNum>inputNum3)?bufferNum:inputNum3;

	printf("가장 큰 수는 %d 입니다.",maxNum);
	return 0;
}//*/