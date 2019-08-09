/**************************
chap1_283.c
남연서
예제 1-3
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);

int main()
{
	unsigned const int arrXMax=1, arrYMax=3;		//배열 크기 정해주기
	int *multiNum[arrXMax][arrYMax], arr[arrXMax][arrYMax]={0,};	//여러 값을 받기 위해서 포인터배열 사용하기
	int result=0, i=0, j=0, flag=0;
	
	while(1)
	{
		for(i=0; i<arrXMax ; i++)
		{
			for(j=0 ; j<arrYMax; j++)			//포인터 배열에 결과값 받기 사용
			{
				multiNum[i][j]=&arr[i][j];
				numInputMulti(multiNum[i][j],0, 10000);
				if(*multiNum[0][0]==0)
				{
					flag=1;
					break;
				}
			}
		}
		
		if(flag==1)	break;
					
		for(i=0;i<arrXMax;i++)
		{
			for(j=0;j<arrYMax;j++)
			{
				result = result + arr[i][j];
				printf("%d회전 결과 : %d \n",j,result);
			}
			printf("\n");
		}
	}
	return 0;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // 리턴값 포인터 배열에 저장
{
	do
	{
		printf("수를 입력하시오 : ");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	//printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;
}
//*/