/**************************
Exercise05-8.c
남연서
연습문제 5-8
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <time.h>
struct inputT							//구조체 구조 선언
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
	time_t currentTime=time(NULL);		//시스템의 현재시간 받기
	struct tm *currentT;				//현재시간 구조체로 변환
	struct inputT i;					//사용자의 입력을 받을 구조체 선언

	currentT = localtime(&currentTime);	//시스템에서 가져온 시간 : 초 단위의 시간을 분리하여 구조체에 넣기
	
	scanf("%lf",&i.year);				//입력받기
	scanf("%lf",&i.mounth);
	scanf("%lf",&i.day);
	scanf("%lf",&i.hour);
	scanf("%lf",&i.min);
	scanf("%lf",&i.sec);

	printf("현재 시간 : %d : %d : %d\n",currentT->tm_hour,currentT->tm_min,currentT->tm_sec);	// -> 사용 ??왜지??
	printf("입력 시간 : %.0lf : %.0lf : %.0lf\n", i.hour, i.min, i.sec);						// . 사용  ??왜지??

	printf("경과 초 : %lf\n",(((i.hour*60*60)+(i.min*60)+(i.sec)))-((currentT->tm_hour)*60*60+(currentT->tm_min)*60+(currentT->tm_sec)));
	//printf("(현재-입력) 시간 : %d : %d : %d\n",(currentT->tm_hour)-(inputT.input_hour),(currentT->tm_min)-(inputT.input_min),(currentT->tm_sec)-(inputT.input_sec));
}//*/




/******************** 이전의 시도들**************************
// 배열로 받기
void main(void)
{
	time_t currentTime=time(NULL);
	//time_t inputTime;
	struct tm *currentT;
	//struct tm *inputT;
	double input[6]={};

	//printf("년도를 적어주세요 :");
	//scanf("%lf",&input[0]);

	//printf("월 적어주세요 :");
	//scanf("%lf",&input[1]);

	//printf("일 적어주세요 :");
	//scanf("%lf",&input[2]);

	printf("시를 적어주세요 :");
	scanf("%lf",&input[3]);

	printf("분을 적어주세요 :");
	scanf("%lf",&input[4]);

	printf("초를 적어주세요 :");
	scanf("%lf",&input[5]);

	currentT = localtime(&currentTime);// 초 단위의 시간을 분리하여 구조체에 넣기

	printf("현재 시간 : %d : %d : %d\n",currentT->tm_hour,currentT->tm_min,currentT->tm_sec);
	printf("입력 시간 : %.0lf : %.0lf : %.0lf\n",input[3],input[4],input[5]);

	printf("(현재-입력) 시간 : %.0lf : %.0lf : %.0lf\n",currentT->tm_hour-input[3],currentT->tm_min-input[4],currentT->tm_sec-input[5]);
	return;
}


//인터넷에서 참고한 자료
int main()
{
   time_t     tm_st;
   time_t     tm_nd;
   int        tm_day, tm_hour, tm_min, tm_sec;
   double     d_diff;
   struct tm  user_stime;

   user_stime.tm_year   = 2007   -1900;   // 주의 :년도는 1900년부터 시작
   user_stime.tm_mon    = 7      -1;      // 주의 :월은 0부터 시작
   user_stime.tm_mday   = 1;
   user_stime.tm_hour   = 10;
   user_stime.tm_min    = 12;
   user_stime.tm_sec    = 55;
   user_stime.tm_isdst  = 0;              // 썸머 타임 사용 안함

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

   printf("2007년 7월 1일부터 지금까지는 %d일 %d시 %d분 %d초 지났음n", tm_day, tm_hour, tm_min, tm_sec);
   

   return 0;
}
//*/