/**************************
Exercise05-8.c
������
�������� 5-8
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <time.h>
struct inputT							//����ü ���� ����
	{
		double year;
		double mounth;
		double day;
		double hour;
		double min;
		double sec;
	};

int	main(void)
{
	time_t currentTime=time(NULL);		//�ý����� ����ð� �ޱ�
	struct tm *currentT;				//����ð� ����ü�� ��ȯ
	struct inputT i;					//������� �Է��� ���� ����ü ����

	currentT = localtime(&currentTime);	//�ý��ۿ��� ������ �ð� : �� ������ �ð��� �и��Ͽ� ����ü�� �ֱ�
	
	scanf("%lf",&i.year);				//�Է¹ޱ�
	scanf("%lf",&i.mounth);
	scanf("%lf",&i.day);
	scanf("%lf",&i.hour);
	scanf("%lf",&i.min);
	scanf("%lf",&i.sec);

	printf("���� �ð� : %d : %d : %d\n",currentT->tm_hour,currentT->tm_min,currentT->tm_sec);	// -> ��� ??����??
	printf("�Է� �ð� : %.0lf : %.0lf : %.0lf\n", i.hour, i.min, i.sec);						// . ���  ??����??

	printf("��� �� : %lf\n",(((i.hour*60*60)+(i.min*60)+(i.sec)))-((currentT->tm_hour)*60*60+(currentT->tm_min)*60+(currentT->tm_sec)));
	//printf("(����-�Է�) �ð� : %d : %d : %d\n",(currentT->tm_hour)-(inputT.input_hour),(currentT->tm_min)-(inputT.input_min),(currentT->tm_sec)-(inputT.input_sec));
}//*/




/******************** ������ �õ���**************************
// �迭�� �ޱ�
void main(void)
{
	time_t currentTime=time(NULL);
	//time_t inputTime;
	struct tm *currentT;
	//struct tm *inputT;
	double input[6]={};

	//printf("�⵵�� �����ּ��� :");
	//scanf("%lf",&input[0]);

	//printf("�� �����ּ��� :");
	//scanf("%lf",&input[1]);

	//printf("�� �����ּ��� :");
	//scanf("%lf",&input[2]);

	printf("�ø� �����ּ��� :");
	scanf("%lf",&input[3]);

	printf("���� �����ּ��� :");
	scanf("%lf",&input[4]);

	printf("�ʸ� �����ּ��� :");
	scanf("%lf",&input[5]);

	currentT = localtime(&currentTime);// �� ������ �ð��� �и��Ͽ� ����ü�� �ֱ�

	printf("���� �ð� : %d : %d : %d\n",currentT->tm_hour,currentT->tm_min,currentT->tm_sec);
	printf("�Է� �ð� : %.0lf : %.0lf : %.0lf\n",input[3],input[4],input[5]);

	printf("(����-�Է�) �ð� : %.0lf : %.0lf : %.0lf\n",currentT->tm_hour-input[3],currentT->tm_min-input[4],currentT->tm_sec-input[5]);
	return;
}


//���ͳݿ��� ������ �ڷ�
int main()
{
   time_t     tm_st;
   time_t     tm_nd;
   int        tm_day, tm_hour, tm_min, tm_sec;
   double     d_diff;
   struct tm  user_stime;

   user_stime.tm_year   = 2007   -1900;   // ���� :�⵵�� 1900����� ����
   user_stime.tm_mon    = 7      -1;      // ���� :���� 0���� ����
   user_stime.tm_mday   = 1;
   user_stime.tm_hour   = 10;
   user_stime.tm_min    = 12;
   user_stime.tm_sec    = 55;
   user_stime.tm_isdst  = 0;              // ��� Ÿ�� ��� ����

   tm_st = mktime(&user_stime);
   time(&tm_nd);

   d_diff   = difftime(tm_nd, tm_st);

   tm_day   = d_diff / (60 *60 * 24);
   d_diff   = d_diff - (tm_day *60 *60 *24);

   tm_hour  = d_diff / (60 *60);
   d_diff   = d_diff - (tm_hour *60 *60);

   tm_min   = d_diff / 60;
   d_diff   = d_diff - (tm_min *60);

   tm_sec   = d_diff;

   printf("2007�� 7�� 1�Ϻ��� ���ݱ����� %d�� %d�� %d�� %d�� ������n", tm_day, tm_hour, tm_min, tm_sec);
   

   return 0;
}
//*/