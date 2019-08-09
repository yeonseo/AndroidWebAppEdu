// 1. 난수 1-55까지 표시, 배열크기는 5 비교는 세가지 표시(0,1,-1)
/*
#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <windows.h>
void random(int array[], int size, int max, int min);
void array_print(int array[], int size);
int compare(int a[], int b[], int size);
void compare_array_printf(int a);
int main()
{
	int a[5]={0,},b[5]={0,}; 
	int i=0, flag=0;
	const int SIZE = sizeof(a)/sizeof(a[0]);

	random(a, SIZE, 55, 1);
	Sleep(1000);
	random(b, SIZE, 55, 1);

	array_print(a,SIZE);
	array_print(b,SIZE);

	flag=compare(a, b, SIZE);

	printf("**********************\n");
	compare_array_printf(flag);

return 0; 
}

void random(int array[], int size, int max, int min)
{	
	int i=0;
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
	for(i=0;i<size;i++)	printf("%4d",array[i]); 
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
void compare_array_printf(int a)
{
switch(a)
	{
	case  0: puts("두 배열이 같습니다.");   break;
	case  1: puts("첫 번째 배열이 큽니다.");  break;
	case  -1: puts("두 번째 배열이 큽니다.");     break;
	default: puts("다시확인바랍니다.");       break;
	}
}
*/

//2. 복사하는 함수
/*
#include <stdio.h>

int numInputMulti(int *arr, int size, int numMin, int numMax);
void array_print(int array[], int size);
void copy_array(int a[], int b[], int size);

int main()
{
	int a[5]={0,},b[5]={0,}; 
	int i=0, flag=0;
	const int SIZE = sizeof(a)/sizeof(a[0]);

	numInputMulti(a,SIZE, 0, 100);

	copy_array(a, b, SIZE);
	printf("**********************\n");
	array_print(a,SIZE);
	array_print(b,SIZE);

return 0; 
}


void array_print(int array[], int size)
{
	int i=0;
	for(i=0;i<size;i++)	printf("%4d",array[i]); 
	printf("\n");
	return;
}
void copy_array(int a[], int b[], int size)
{
	int i=0;
	for(i=0 ; i<size ; i++)
	{
		b[i]=a[i];
	}
}
int numInputMulti(int *arr,int size, int numMin, int numMax)
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
*/

/*
//3.
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

int main()
{
	int a[100]={0,}; 
	int i=0, flag=0,randMax=9,randMin=0;
	const int SIZE = sizeof(a)/sizeof(a[0]);


	srand((unsigned)time(NULL));

	for(i=0 ; i<SIZE; i++)
	{
		a[rand()%(randMax-0+randMin)+randMin]++;
	}
	
	for(i=0 ; i<randMax; i++)
	{
		printf("%d : %d번\n" ,i, a[i]);
	}
	printf("**********************\n");
	
return 0; 
}
*/