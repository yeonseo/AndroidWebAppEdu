/**************************
Exercise01-02.c
남연서
연습문제 01-02
입력:없음(void)
출력:return값(0)
**************************/
/* //point!!
#include <stdio.h>
#include <string.h>
unsigned const int arrXMax=1, arrYMax=3;						//배열 크기 정해주기
int numInputMulti(int *arr , int numMin, int numMax);
int main()
{
	int arr[arrYMax][arrXMax]={0,},result=0, i=0, j=0, flag=0;	//배열정의
	
	while(1)
	{
		for(i=0; i<arrXMax ; i++)
		{
			for(j=0 ; j<arrYMax; j++)
			{
				//1개의 배열값에 입력값을 받기 위해서 주소값으로 준다.
				//1차원값을 대입해서 반환값을 받고 싶으니까!!!
				numInputMulti(&arr[j][i],0, 10000);
				if(arr[0][0]==0)
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
				result = result + arr[j][i];
				printf("%d회전 결과 : %d \n",j,result);
			}
			printf("결과 : 평균 %d, 총점 %d \n",result/arrYMax,result);
			printf("\n");
		}
	}
	return 0;
}
int numInputMulti(int *arr, int numMin, int numMax) //함수에서 받을 값을 *로 받는다
{
	do
	{
		printf("수를 입력하시오 : ");
		scanf("%d",arr);							//포인터로 받았기 때문에 주소
	}while(*arr<numMin||*arr>numMax);				//*arr=arr[]를 의미하는 것이고, 포인터를 의미하는 것.
	//printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;
}
//*/

/*
#include <stdio.h>
int add(int *a)
{
	int i=0;
	for(i=0; i<5 ; i++)
	{
		printf("add : a[%d] = %d \n",i,a[i]);
	}
	return 0;
}
int main()
{
	int a[4]={10,20,30,40};
	int i=0;
	for(i=0; i<5 ; i++)
	{
		printf("main : a[%d] = %d \n",i,a[i]);
	}
	add(a);
	return 0;
}
//*/

/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);

int main()
{
	unsigned const int arrXMax=1, arrYMax=10;		//배열 크기 정해주기
	int *multiNum[arrYMax][arrXMax], arr[arrYMax][arrXMax]={0,};	//여러 값을 받기 위해서 포인터배열 사용하기
	int result=0, i=0, j=0, flag=0;
	
	while(1)
	{
		for(i=0; i<arrXMax ; i++)
		{
			for(j=0 ; j<arrYMax; j++)			//포인터 배열에 결과값 받기 사용
			{
				multiNum[j][i]=&arr[j][i];
				numInputMulti(multiNum[j][i],0, 10000);
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
				result = result + arr[j][i];
				printf("%d회전 결과 : %d \n",j,result);
			}
			printf("결과 : 평균 %d, 총점 %d \n",result/arrYMax,result);
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