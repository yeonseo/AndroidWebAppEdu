/**************************
Problem10_421_08.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void random_array(double array[], int size, int max, int min);
void print_array(double array[], int size);
double average_array(double a[], int size);
double stan_dev_array(double a[],int average, int size);
int main()
{
	double a[10]={0,},averageValue=0,stanDevValue=0; 
	int i=0, flag=0;
	const int SIZE = sizeof(a)/sizeof(a[0]);
	
	random_array(a, SIZE, 10000, 0);
	print_array(a,SIZE);

	averageValue = average_array(a, SIZE);
	printf("평균값 : %lf  ",averageValue);

	stanDevValue = stan_dev_array(a,averageValue, SIZE);
	printf("표준편차값 : %lf\n",stanDevValue);
return 0; 
}
void random_array(double array[], int size, int max, int min)
{	
	int i=0;
	srand(time(NULL));
	for(i=0;i<size;i++)
	{
		array[i]=((rand()%(max-min+1)+min)/(double)max); 
	}
	return;
}
double average_array(double a[], int size)
{
	int i=0;
	double averageValue=0;
	for(i=0 ; i<size ; i++)
	{
		averageValue=averageValue+a[i];
	}
	return averageValue/size;
}
double stan_dev_array(double a[],int average, int size)
{
	int i=0;
	double stanDevValue=0;
	for(i=0 ; i<size ; i++)
	{
		stanDevValue=stanDevValue+(a[i]-average)*(a[i]-average);
	}
	return stanDevValue/size;
}
void print_array(double array[], int size)
{
	int i=0;
	for(i=0;i<size;i++)	printf("%.3lf   ",array[i]); 
	printf("\n");
	return;
}
//*/