/**************************
Exercise07-5.c
������
�������� 7-5
�Է�:����(void)
���:return��(0)
**************************/
/*//���丮��
#include <stdio.h>
int main()
{
	int i=1, num=0, sum=1;

	for(;1;)
	{
		for(;num<=0||num>10;)
		{
			printf("���丮���� �Է��Ͻÿ� (1~10): ");
			scanf("%d",&num);
		}
		if(num>0||num<=10) break;
	}

	printf("����� �Է��� ���� %d �Դϴ�.\n",num);
		for (i=1;i<=num;i++)
	{
		sum=sum*i;
	}
	printf("���� ���丮�� ���� %d�Դϴ�\n", sum);
	return 0;
}//*/