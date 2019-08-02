/**************************
Problem10_421_09.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define TEST_NUM 7

void random_array(int array[][TEST_NUM], int size1, int size2, int max, int min);
void print_array(int array[][TEST_NUM], int size1, int size2);

int main()
{
	int i=0, flag=0, maxValue=0,minValue=0;
	int studentTest[4][TEST_NUM]={0,};
	
	
	const int TEST_SIZE = sizeof(studentTest)/sizeof(studentTest[0]);
	const int STUDENT_SIZE = sizeof(studentTest)/sizeof(studentTest[0]);
	random_array(studentTest, STUDENT_SIZE, TEST_SIZE, 100, 0);

	print_array(studentTest, STUDENT_SIZE, TEST_SIZE);

return 0; 
}
void random_array(int array[][TEST_NUM], int size1, int size2, int max, int min)
{	
	int i=0,j=0;
	srand(time(NULL));
	for(i=0;i<size1;i++)
	{
		for(j=0;j<size2-2;j++)
		{
			if(j>0) array[i][j]=rand()%(max-min+1)+min;
			if(j==0) array[i][j]=i+1;

			//최댓값 최소값 정해주기
			if(j==1)
			{
				array[i][size2-2]=array[i][j];
				array[i][size2-1]=array[i][j];
			}
			array[i][size2-2]=(array[i][size2-2]>array[i][j])?(array[i][size2-2]):(array[i][j]);
			array[i][size2-1]=(array[i][size2-1]<array[i][j])?(array[i][size2-1]):(array[i][j]);
		}
	}
	return;
}
void print_array(int array[][TEST_NUM], int size1, int size2)
{
	int i=0,j=0;
	for(i=0;i<size1;i++)
	{
		for(j=0;j<size2;j++)
		{
			//printf("%d %d : %-4d",i,j, array[i][j]);
			printf("%d,%d  %4d  ",i,j,array[i][j]);
			
		}
		printf("\n");
	}
}
*/