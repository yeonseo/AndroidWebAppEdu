/**************************
chap7_193.c
������
���� 7-16
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
int	main(void)
{
	int i=0;

	do
	{
		printf("1~10���� ���ڸ� �����Ͻÿ� :");
		scanf("%d",&i);
	}while(i<1||i>10);

	printf("�Է��Ͻ� ���ڴ� %d �Դϴ�.\n",i);

	i=0;

	for(;i<1||i>10;)
	{
		printf("1~10���� ���ڸ� �����Ͻÿ� :");
		scanf("%d",&i);
	}
	printf("�Է��Ͻ� ���ڴ� %d �Դϴ�.",i);

	return 0;
}//*/

/*
#include <stdio.h>
int	main(void)
{
	//1. 1~10���� ���ڸ� �Է¹޴� ����� �����ϰڴ�.
	int i=0;
	
	do
	{
		printf("1~10���� ���� �� �Է��ϼ��� :");
		scanf("%d",&i);
	}while (i<1||i>10);

	return 0;
}//*/

/*
#include <stdio.h>
int main()
{
   //1~10���� ���ڸ� �Է¹޴� ���

   int num=0;

   do
   {
      printf("���� �Է�(1~10): ");
      scanf("%d",&num);
   }while(num<1 || num>10);

   printf("�Էµ� ��: %d",num);
return 0;
}//*/