/**************************
chap8_210.c
������
���� 8-7
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
int main()
{
	int num=0,i=0;
	do
	{
		printf("���� �Է��Ͻÿ� : ");
		scanf("%d",&num);
	}while(num<0||num>100);

	if(num<=100&&num>=90)
		printf("%d : A�Դϴ�. \n",num);
	if(num<90&&num>=80)
		printf("%d : B�Դϴ�. \n",num);
	if(num<80&&num>=70)
		printf("%d : C�Դϴ�. \n",num);
	if(num<70&&num>=60)
		printf("%d : D�Դϴ�. \n",num);
	if (num<=60) printf("�����Դϴ�. \n");
	return 0;
}//*/

/*
#include <stdio.h>
int main()
{
	int num=0,i=0;
	do
	{
		printf("���� �Է��Ͻÿ� : ");
		scanf("%d",&num);
	}while(num<0||num>100);

	if(num<=100&&num>=90)
		printf("%d : A�Դϴ�. \n",num);
	else if(num<90&&num>=80)
		printf("%d : B�Դϴ�. \n",num);
	else if(num<80&&num>=70)
		printf("%d : C�Դϴ�. \n",num);
	else if(num<70&&num>=60)
		printf("%d : D�Դϴ�. \n",num);
	else
		printf("�����Դϴ�. \n");
	return 0;
}//*/