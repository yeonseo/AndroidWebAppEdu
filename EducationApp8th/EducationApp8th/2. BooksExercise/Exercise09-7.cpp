/**************************
Exercise09-7.c
������
�������� 9-7
�Է�:����(void)
���:return��(0)
**************************/
/* //������ ����Ȯ���ϱ�
#include <stdio.h>
#include <string.h>

int numInput(int a, int b);
char numInputMulti(char *arr);
void alpabet(char a);
int main()
{
	unsigned const int arrMax=1;		//�迭 ũ�� �����ֱ�
	int result=0, i=0;
	char *multiNum[arrMax];				//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	char arr[arrMax];

	for(i=0 ; i<arrMax; i++)			//������ �迭�� ����� �ޱ� ���
	{
		multiNum[i]=&arr[i];
		numInputMulti(multiNum[i]);
	}

	alpabet(*multiNum[0]);
	return 0;
}
int numInput(int a, int b)		// ���ϰ� ������ ����
{
	int result;
	do
	{
		printf("���� �Է��Ͻÿ� : ");
		scanf("%d",&result);
	}while(result<a||result>b);
	printf("���� %d�� �ԷµǾ����ϴ�.\n",result);
	return result;
}
char numInputMulti(char *arr) // ���ϰ� ������ �迭�� ����
{
	printf("���ڸ� �Է��Ͻÿ� : ");
	scanf("%c",arr);
	while( getchar() != '\n' );					//scanf char���� ��!!!! ���ۿ� ���� ������ ���ֱ�
	printf("���� %c�� �ԷµǾ����ϴ�.\n",*arr);
	return 0;
}
void alpabet(char a)
{
	if(a>96) a=a-32;							//�ҹ��ڷ� �Է��� �� �빮�ڷ� ��ȯ�ϵ��� �ϱ�
	printf("�Է��Ͻ� %c�� %d��° �����Դϴ�.\n",a,a-64);
}
//*/