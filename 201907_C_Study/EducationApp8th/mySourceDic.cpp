/*
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

//입력받기
const int SIZE = sizeof(a)/sizeof(a[0]);
int user_input_array(int *arr,int size, int numMin, int numMax)
{
	int i=0;
	for(i=0 ; i<size ; i++)
	{
		do
		{
			printf("%d번째 : ",i);
			scanf("%d",&arr[i]);
		}while(arr[i]<numMin||arr[i]>numMax);
	}
	printf("입력완료\n\n");
	return 0;
}
double userInputMulti(double *arr,int size, int numMin, int numMax)
{
	int i=0;
	for(i=0 ; i<size ; i++)
	{
		do
		{
			printf("%d번째 : ",i);
			scanf("%lf",&arr[i]);
		}while(arr[i]<numMin||arr[i]>numMax);
	}
	printf("입력완료\n\n");
	return 0;
}
void random_array(int array[], int size, int max, int min)
{	
	int i=0;
	srand(time(NULL));
	for(i=0;i<size;i++)
	{
		array[i]=rand()%(max-min+1)+min; 
	}
	return;
}

//Sleep(1000);이용해서 차이주기
srand((unsigned)time(NULL));
int randNumbering()
{
	int result=0;
	result=rand()%100;
	return result;
}

//출력하기
void print_array(int array[], int size)
{
	int i=0;
	for(i=0;i<size;i++)	printf("%.3lf   ",array[i]); 
	printf("\n");
	return;
}


//비교하기
void equal_array(int *arr1,int *arr2,int size)
{
	int i=0,result=0;
	for(i=0; i<size ; i++)
	{
		result=(*(arr1+i)==*(arr2+i))?(1):(0);
		printf("%d번째 배열 비교  %d : %d 결과 : %d \n",i,*(arr1+i),*(arr2+i),result);
	}
}

int compare_array_flag(int a[], int b[], int size)
{
	int i=0, flag=0;
	for(i=0;i<size;i++)
	{
		if( a[i]-b[i] >0)
		{
			flag =1;
			break;
		}
		else if(a[i]-b[i] <0)
		{
			flag =-1;
			break;
		}
	}
	return flag;
}


*/


/* //누적된 값
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define ARRAY_LENGTH 100
#define RANDMAX 9
#define RANDMIN 0

int main()
{
	int i=0;
	int arr[ARRAY_LENGTH]={0,};	//배열정의

	const int SIZE = sizeof(arr)/sizeof(arr[0]);
	srand((unsigned)time(NULL));				//난수 발생기의 시작점을 초기화한다
	
	for(i=0;i<RANDMAX;i++) arr[rand()%(RANDMAX-RANDMIN+1)+RANDMIN]++;
	for(i=0;i<RANDMAX;i++) printf("%d의 갯수 : %d\n",i,arr[i]);
	
	return 0;
}
//*/