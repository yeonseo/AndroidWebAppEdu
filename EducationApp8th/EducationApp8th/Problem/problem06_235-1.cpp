/**************************
Problem6-2235_1.c
������
�������� 6-235_1��
�Է�:����(void)
���:return��(0)
**************************/
/* //swiitch
#include <stdio.h>
int main()
{
	char num=0;
	do
	{
		printf("���ڸ� �Է��Ͻÿ� : ");
		scanf("%c",&num);
		while( getchar() != '\n' );
		if(num>96) num=num-32;
	}while(num<0||num>127);

	switch(num)
	{
		case 'E':
		case 'Y':
		case 'U':
		case 'I':
		case 'O':
		case 'A':
			printf("%c : �����Դϴ�. \n",num);
			break;
		default :
			printf("%c : �����Դϴ�. \n",num);
			break;
	}
	return 0;
}//*/