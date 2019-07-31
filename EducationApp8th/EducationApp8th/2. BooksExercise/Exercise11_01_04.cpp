/**************************
Exercise11-04.c
남연서
연습문제 11-04
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *arr, int numMin, int numMax);

int main()
{
	unsigned const int arrXMax=1, arrYMax=1;		//배열 크기 정해주기
	int arr[arrYMax][arrXMax]={0,},result=0, i=0, j=0, z=0, flag=0;	//배열정의
	int timeTables[9]={1,2,3,4,5,6,7,8,9};
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
					

		for(i=0 ; i<9 ; i++)
		{
			printf("%2d * %2d : %2d \n",arr[0][0],timeTables[i],arr[0][0]*timeTables[i]);
		}
		printf("\n");

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