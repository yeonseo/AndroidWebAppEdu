/**************************
Problem2-108_5.c
������
�������� 2-108 5��
�Է�:����(void)
���:return��(0)
**************************/
/**/
#include <stdio.h>
int main()
{
	double dXvalue,dResult;

	char *star="******************";
	char *line="--------";
	char *str="o��o";

	printf("%s\n*    %s    *\n%s\n",star,"����",star);
	printf("%s\n%s %s %s\n%s\n",star,str,"���׽�",str,star);
	printf("�Ǽ��� �Է��Ͻÿ� : ");
	scanf("%lf",&dXvalue);

	dResult=3*dXvalue*dXvalue+7*dXvalue+11;
	printf("���׽��� ��� ������� %lf �Դϴ�.",dResult);
	return 0;
}
