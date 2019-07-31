/**************************
Exercise11_02_02.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/* //point!!
#include <stdio.h>
#include <string.h>
unsigned const int arrXMax=3, arrYMax=3;						//배열 크기 정해주기
int numInputMulti(int *arr ,int i,int j, int numMin, int numMax);

int main()
{
	int arr[arrYMax][arrXMax]={0,},result=0, i=0, j=0, flag=0;	//배열정의
	
	while(1)
	{
		for(i=0; i<arrXMax ; i++)
		{
			for(j=0 ; j<arrYMax; j++)
			{
				numInputMulti(&arr[i][j],i,j,0, 10);
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
				result = result + arr[i][j];
				//printf("%d층 %d호 누적 가족은 : %d\n",i+1,j+1,result);
			}
		}
		printf("총 주민수 %d \n",result);
		printf("\n");
	}
	return 0;
}
int numInputMulti(int *arr,int i,int j, int numMin, int numMax) //함수에서 받을 값을 *로 받는다
{
	do
	{
		printf("%d층 %d호 가족은 몇명입니까 : ",i+1,j+1);
		scanf("%d",arr);							//포인터로 받았기 때문에 주소
	}while(*arr<numMin||*arr>numMax);				//*arr=arr[]를 의미하는 것이고, 포인터를 의미하는 것.
	//printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;
}
//*/