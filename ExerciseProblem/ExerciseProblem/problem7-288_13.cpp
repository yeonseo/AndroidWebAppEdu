/**************************
Problem7-288_13.c
������
�������� 7-288_13��
�Է�:����(void)
���:return��(0)
**************************/
//for
/*
#include <stdio.h>
int main()
{
	int result=1, n=0,r=0,i=0,flag=0;
	while(n!=-1||r!=-1)
	{
		do
		{
			printf("���� ������ �����ϼ���(����:-1) : ");
			scanf("%d",&n);
			printf("���� ���� ������ �����ϼ���(����:-1) : ");
			scanf("%d",&r);
			if(n==-1||r==-1)
			{
				flag = 1;
				break;
			}
		}while(n<0||n>100||r<0||r>n);
		if(flag==1) break;
		for(i=n;i>=(n-r+1);i--)
		{
			result=result*i;
			//printf("%d %d\n",i,result);
		}
		printf("%d���� %d������ �������� %d�Դϴ�.\n\n",r,n,result);
	}
	return 0;
}
//*/

/*
#include <stdio.h>
int main()
{
	int  n=0,r=0,i=0,result=1;

	do
	{
		printf("1-100 ������ ���ڸ� �Է��ϼ��� : ");
		scanf("%d",&n);
		printf("1-100 ������ ���ڸ� �Է��ϼ��� : ");
		scanf("%d",&r);
	}while(n<1||n>100||r<1||r>n);

	for(i=n; i>=n-r+1 ; i--)
	{
		result=result*i;
	}
	printf("������� %d�Դϴ�.\n",result);
	
	return 0;
}
//*/