/**************************
Exercise06-6.c
������
�������� 6-6
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#define PI 3.14
int	main(void)
{
	int radian=0, velopCar=0;
	double trackLength=0.0;

	printf("�������� �Է��ϼ��� :");
	scanf("%d",&radian);
	printf("�ڵ����� �ӷ��� �Է��ϼ��� :");
	scanf("%d",&velopCar);

	for(;radian*velopCar<=0 || velopCar>300 || radian>300;)
	{
		printf("1���� 300���� �Է��Ͻÿ�\n");
		printf("�������� �Է��ϼ��� :");
		scanf("%d",&radian);
		printf("�ڵ����� �ӷ��� �Է��ϼ��� :");
		scanf("%d",&velopCar);
	}

	trackLength = radian*2*PI;

	printf("%.3lf km�� Ʈ���� ���µ� �ɸ��� �ð��� %.3lfhour�Դϴ�.\n",trackLength,trackLength/velopCar);
	return 0;
}//*/