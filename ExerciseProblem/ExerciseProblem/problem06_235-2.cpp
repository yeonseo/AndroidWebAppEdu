/**************************
Problem6-235_2.c
������
�������� 6-235_2��
�Է�:����(void)
���:return��(0)
**************************/
/* //swiitch
#include <stdio.h>
int main()
{
	int num1=0,num2=0;

	do
	{
		printf("ù ��° ���� �Է��Ͻÿ� : ");
		scanf("%d",&num1);
		printf("ù ��° ���� �Է��Ͻÿ� : ");
		scanf("%d",&num2);
	}while(num1<0||num1>100||num2<0||num2>num1);

	switch(num1%num2)
	{
		case 0:
			printf("%d / %d : ����Դϴ�. \n",num1,num2);
			break;
		default :
			printf("%d / %d : ����� �ƴմϴ�. \n",num1,num2);
			break;
	}
	return 0;
}//*/