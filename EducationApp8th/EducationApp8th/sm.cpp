#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define COUNT 3
int print_menu();
int user_select(void);
void game_outpur(int userValue, int comValue);
void com_percentage(int comValue);

int userWin=0, userLose=0, userDraw=0;
int comScissor=0, comRock=0, comPaper=0;
int main()
{
	int selectNo=0, comValue=0, userValue=0, resultValue=0, i=0;
	for(;;)
	{
		selectNo=print_menu();

		switch(selectNo)
		{
			case 1:
				userWin=0;userLose=0;userDraw=0;
				comScissor=0, comRock=0, comPaper=0;
				
				srand(time(NULL));
				for(i=0;i<= COUNT;i++)
				{
					comValue=rand()%(3-1+1)+1;
					com_percentage(comValue);
					userValue=user_select();
					game_outpur(userValue, comValue);
				} break;

			case 2:
				printf("%d전 %d승 %d무 %d패 \n",  COUNT, userWin, userDraw, userLose);
				printf("컴퓨터확률: 가위: %.2lf%% 바위: %.2lf%% 보: %.2lf%% \n", (double)comScissor/COUNT*100, (double)comRock/COUNT*100, (double)comPaper/COUNT*100);
				break;

			case 3:
				continue;
				break;

			case 4:
				printf("즐거웠다. 다신 보지말자\n");
				_exit(1);
				break;

			deafault:
				printf("이상한 값 입력\n");
				break;
		}
	}
	return 0;
}
int print_menu(void)
{
	static int menuCount=1;
	int selectNo=0;


		printf("\n\ni***********************i\n");
		printf("| 1. 게임시작		|\n");
		printf("| 2. 게임결과		|\n");
		printf("| 3. 게임재시작		|\n");
		printf("| 4. 게임종료		|\n");
		printf("| 5. 게임횟수: %d번	|\n", menuCount++);
		printf("i***********************i\n");
		for(;;)
		{
			printf("선택번호:  ");
			scanf("%d",&selectNo);
			if(selectNo>=1&&selectNo<=4) break;
			else
				printf("숫자 다시 입력 요망\n\n");
		}
		
		return selectNo;
}
int user_select(void)
{
	static int userCount=0;
	int userValue=0;
	for(;;)
	{
		printf("Count 횟수 : %d번\n사용자 입력 요망: 가위(1), 바위(2), 보(3)\n", ++userCount);
		scanf("%d",&userValue);
		if(userValue>=1 && userValue<=3) 
		{
			if(userCount==3)
			{
				userCount=0;
			}
			break;
		}
		
		else
		{
			userCount--;
			printf("잘못 입력함 다시 입력 요망:\n");
		}
	}
	
	return userValue;
}
void game_outpur(int userValue, int comValue)
{
	int resultValue=0;
	resultValue=userValue-comValue;
	if(resultValue==1 || resultValue==-2)
	{
		printf("사용자 승\n"); 
		userWin++;
	}
	else if(resultValue==-1 || resultValue==2)
	{
		printf("사용자 패\n"); 
		userLose++;
	}
	else
	{
		printf("무승부\n");
		userDraw++;
	}
	return;
}
void com_percentage(int comValue)
{
	switch(comValue)
		{
		case 1: comScissor++;
		break;

		case 2: comRock++;
		break;

		case 3: comPaper++;
		break;
		default: printf("컴퓨터 오류\n"); break;

	}
	return;
}