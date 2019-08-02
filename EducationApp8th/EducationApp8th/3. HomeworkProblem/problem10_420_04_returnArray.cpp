/**************************
Problem10_420_04.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>  
#include <stdlib.h>
#include <time.h>
#include <string.h>

#define ARRAY_LENGTH 10
 
int numInputMulti(int *arr ,int i, int numMin, int numMax);
int randNumbering();
void array_equal(int *arr1,int *arr2,int size);
void return_array(int *arr1,int *arr2,int size);

int main()
{
	int i=0, j=0,flag=0;
	int arr1[ARRAY_LENGTH]={0,},arr2[ARRAY_LENGTH]={0,};	//배열정의

	while(1)
	{
		for(i=0 ; i<ARRAY_LENGTH; i++)			//포인터 배열에 결과값 받기 사용
		{
			numInputMulti(&arr1[i],i,0, 100);
			if(arr1[0]==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)break;

		return_array(arr1,arr2,ARRAY_LENGTH);

		for(i=0 ; i<ARRAY_LENGTH ; i++)
		{
			printf("배열값 : %d \n",*(arr2+i));
		}
	}

	return 0;
}

int numInputMulti(int *arr,int i, int numMin, int numMax) //함수에서 받을 값을 *로 받는다
{
	do
	{
		printf("%d번째 : ",i);
		scanf("%d",arr);							//포인터로 받았기 때문에 주소
	}while(*arr<numMin||*arr>numMax);				//*arr=arr[]를 의미하는 것이고, 포인터를 의미하는 것.
	//printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;
}
int randNumbering()
{
	int result=0;
	result=rand()%100;
	return result;
}
void array_equal(int *arr1,int *arr2,int size)
{
	int i=0,result=0;
	for(i=0; i<size ; i++)
	{
		result=(*(arr1+i)==*(arr2+i))?(1):(0);
		printf("%d번째 배열 비교  %d : %d 결과 : %d \n",i,*(arr1+i),*(arr2+i),result);
	}
}
void return_array(int *arr1,int *arr2,int size)
{
	int i=0,result=0;
	for(i=0; i<size ; i++)
	{
		*(arr2+i)=*(arr1+i);
	}
}
//*/

///*
/*
#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <windows.h>

#define ARRAY_SIZE 5

void random(int array[], int size, int max, int min);
void array_print(int array[], int size);
int compare(int a[], int b[], int size);

int main()
{
	int a[ARRAY_SIZE]={0,}, b[ARRAY_SIZE]={0,};
	int i=0, flag=0;
	const int SIZE = sizeof(a)/sizeof(a[0]);

	random(a, SIZE, 1, 10);
	Sleep(1000);
	random(b, SIZE, 1, 10);

	array_print(a, SIZE);
	array_print(b, SIZE);

	flag = compare(a, b, SIZE);
	switch(flag)
	{
	case 0:puts("두 배열이 같습니다. :-)"); break;
	case -1:puts("두 번째 배열이 큽니다. :-)"); break;
	case 1:puts("첫 번째 배열이 큽니다. :-)"); break;
	default :puts("다시 입력하세요 :-|"); break;
	}

	return 0;
}

void random(int array[], int size, int max, int min)
{
	int i=0;
	for(i=0; i<size ; i++)
	{
		array[i] = rand()%(max-min+1)+min;
	}
}
void array_print(int array[], int size)
{
	int i=0;
	for(i=0;i<size;i++)	printf("%5d",array[i]); 
	printf("\n");
	return;
}
int compare(int a[], int b[], int size)
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
//*/


/*
#include <stdio.h>
#include <time.h>
#include <stdlib.h>
void random(int array[], int size, int max, int min);
void array_print(int array[], int size);
int compare(int a[], int b[], int size);
void printf_array(int array[], int size);
void array_copy(int arraya1[], int array2[], int size);

int main()
{
	int a[5]={0,},b[5]={0,}; 
	int i=0, flag=0;
	const int SIZE = sizeof(a)/sizeof(a[0]);

	random(a, SIZE,100,50);
	printf_array(a, SIZE);
	array_copy(a, b, SIZE);
	printf_array(b, SIZE);
return 0; 
}

void random(int array[], int size, int max, int min)
{	int i=0;
	srand(time(NULL));
	for(i=0;i<size;i++)
	{
		array[i]=rand()%(max-min+1)+min; 
	}
	return;
}

void array_print(int array[], int size)
{
	int i=0;
	for(i=0;i<size;i++)	printf("%5d",array[i]); 
	printf("\n");
	return;
}
int compare(int a[], int b[], int size)
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
void printf_array(int array[], int size)
{
	int i=0;
	for(i=0;i<size;i++) printf("%5d",array[i]); printf("\n");
}
void array_copy(int array1[], int array2[], int size)
{
	int i=0;
	for(i=0;i<size;i++)
	{
		array2[i]=array1[i];
	}
}
//*/
