/**************************
Exercise04-2.c
������
�������� 4-2
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <time.h>

#define BIRTH_YEAR 1990
#define BRO_BIRTH_YEAR 1992

int main()
{
	time_t timer;
	struct tm *t;

	int thisYear=0;
	timer = time(NULL); // ���� �ð��� �� ������ ���
	t = localtime(&timer); // �� ������ �ð��� �и��Ͽ� ����ü�� �ֱ�
	thisYear=t->tm_year + 1900;

	printf("���ش� %d�Դϴ�.\n�� ���̴� %d���Դϴ�.\n",thisYear,thisYear-BIRTH_YEAR);
	printf("���� %d�⿡ �¾ %d��° �ذ� �Ǿ����ϴ�.\n", BIRTH_YEAR,thisYear-BIRTH_YEAR);
	printf("�� ������ ���̴� %d���Դϴ�.\n",thisYear-BRO_BIRTH_YEAR);
	printf("�� ������ %d�⿡ �¾ %d��° �ذ� �Ǿ����ϴ�.\n",BRO_BIRTH_YEAR,thisYear-BRO_BIRTH_YEAR);
	return 0;
}
*/