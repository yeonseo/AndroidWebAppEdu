/**************************
Problem6-236_6.c
������
�������� 6-236_6��
�Է�:����(void)
���:return��(0)
**************************/
/* //swiitch
#include <stdio.h>
int numInput(int a, int b);
int main()
{
	int input=0,i=0;
	do
	{
		input=numInput(0, 12);
		switch(input)
		{
			case 12:
				printf("%d�� (Dec.)�Դϴ�. \n",input);
				break;
			case 11:
				printf("%d�� (Nov.)�Դϴ�. \n",input);
				break;
			case 10:
				printf("%d�� (Oct.)�Դϴ�. \n",input);
				break;
			case 9:
				printf("%d�� (Sep.)�Դϴ�. \n",input);
				break;
			case 8:
				printf("%d�� (Aug.)�Դϴ�. \n",input);
				break;
			case 7:
				printf("%d�� (Jul.)�Դϴ�. \n",input);
				break;
			case 6:
				printf("%d�� (Jun.)�Դϴ�. \n",input);
				break;
			case 5:
				printf("%d�� (May.)�Դϴ�. \n",input);
				break;
			case 4:
				printf("%d�� (Apr.)�Դϴ�. \n",input);
				break;
			case 3:
				printf("%d�� (Mar.)�Դϴ�. \n",input);
				break;
			case 2:
				printf("%d�� (Feb.)�Դϴ�. \n",input);
				break;
			case 1:
				printf("%d�� (Jan.)�Դϴ�. \n",input);
				break;
		}
	}while(input!=0);
	return 0;
}
int numInput(int a, int b)
{
	int result;
	do
	{
		printf("�� ������  �Է��Ͻÿ� (���� : 0) : ");
		scanf("%d",&result);
	}while(result<a||result>b);
	printf("���� %d�� �ԷµǾ����ϴ�.\n",result);
	return result;
}
//*/