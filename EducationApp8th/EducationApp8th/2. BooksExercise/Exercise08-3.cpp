/**************************
Exercise08-3.c
������
�������� 8-3
�Է�:����(void)
���:return��(0)
**************************/
/* // ���� if
#include <stdio.h>
int main()
{
	int num=0,i=0;
	do
	{
		do
		{
			printf("���� �Է��Ͻÿ� : ");
			scanf("%d",&num);
		}while(num<0||num>=100);

		if(num<=100&&num>=90)
			printf("%d : A�Դϴ�. \n",num);
		else if(num<90&&num>=80)
			printf("%d : B�Դϴ�. \n",num);
		else if (num<80) printf("%d : F�Դϴ�. \n",num);
	}while(num!=0);
	return 0;
}//*/

/* //swiitch
#include <stdio.h>
int main()
{
	int num=0,i=0;
	do
	{
		do
		{
			printf("���� �Է��Ͻÿ� : ");
			scanf("%d",&num);
		}while(num<0||num>100);

		switch(num/10)
		{
			case 10:
			case 9:
				printf("%d : A�Դϴ�. \n",num);
				break;
			case 8:
				printf("%d : B�Դϴ�. \n",num);
				break;
			default :
				printf("%d : F�Դϴ�. \n",num);
				break;
		}
	}while(num!=0);
	return 0;
}//*/