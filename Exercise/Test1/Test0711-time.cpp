/**************************
Test0711-if����.c
������
��������if ���� 3num ���ϱ�
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <time.h>

int main()
{
	time_t currentTimeInfo=0;			//time_t������ ���������� �Ѵ�
	struct tm* t;						//����ü tm�� �����´�

	currentTimeInfo=time(NULL);			//time_t������ ������� �帥 �ʸ� �ޱ�(1900��0��0�� �������� �������)
	t = localtime(&currentTimeInfo);	//

	printf("���� �ð��� %d : %d : %d �Դϴ�.\n",t->tm_hour,t->tm_min,t->tm_sec);

	return 0;
}//*/

/*
#include <stdio.h>
#include <time.h>

int main()
{
	time_t currentTime;
	struct tm* t;
	currentTime = time(NULL);
	t = localtime(&currentTime);

	printf("����ð��� %d : %d : %d �Դϴ�.\n",t->tm_hour,t->tm_min,t->tm_sec);
	return 0;
}//*/