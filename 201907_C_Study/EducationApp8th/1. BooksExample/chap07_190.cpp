/**************************
chap7_190.c
������
���� 7-13
�Է�:����(void)
���:return��(0)
**************************/

///*//���丮��
/*#include <stdio.h>
int	main(void)
{
	int i=0, num=0, sum=0;
	for(;1;)
	{							//���� �ݺ��� ����
		printf("1~10 ���丮�� ���� �Է� ���");	
		scanf("%d", &num);
		if(num>=1 && num <=10) break;
	}

	printf("����� �Է��� ���� %d\n",&num);

	for(i=1; i<=num; num++)
	{
		sum=sum*i;
	}
	printf("%d",sum);
	return 0;
//*/




/*//�׽�Ʈ
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
