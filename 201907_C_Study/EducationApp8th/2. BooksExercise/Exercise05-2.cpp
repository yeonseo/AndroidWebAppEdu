/**************************
Exercise05-2.c
������
�������� 5-2
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>
int main() {
	int num1=0, num2=0;
	char result[100];

	printf("�Է�");
	scanf("%d %d",&num1, &num2);
	
	if(num1==num2)
	{
		//result="sam";
		strcpy(result,"sam");
	}else if(num1>num2)
	{
		sprintf(result,"���� ���� %d",num2);

	}else{
		sprintf(result,"���� ���� %d",num1);
	}	
		printf("%d �� %d �� �� : %s\n",num1, num2, result);
	
	//else
	//{
	//	conv=(num1>num2)?num2:num1;
	//	sprintf(result,"%d",conv);
	//	strcat(result,"���� ����");
	//}
	//	printf("%d �� %d �� �� : %c",num1, num2, conv);
	//	printf("%s",result);

	return 0;
}
*/

/*
#include <stdio.h>
int main()
{
	int num1=0,num2=0;
	scanf("%d %d", &num1, &num2);
	(num1>num2)?printf("���� ���� %d�Դϴ�.\n",num2):((num1<num2)?printf("���� ���� %d�Դϴ�.\n",num1):(printf("����\n")));
	return 0;

}
*/