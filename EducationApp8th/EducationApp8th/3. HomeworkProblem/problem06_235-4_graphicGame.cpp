/**************************
Problem6-235_4.c
강윤해&남연서
연습문제 6-235_4번
입력:없음(void)
출력:return값(0)
**************************/
/* //가위바위보 (문자열 return, 난수발생(rand), )
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

int computerNumbering(void);
int userNumbering(void);
void printInfo(int a);
void printResult(int a, int b);
void printGraphic(int a);
void printVS(void);
void percentage(int a, int b);

int userWin,userLose,userDraw,compWin,compLose,compDraw;
int userScissor=0,userRock=0,userPaper=0,compScissor=0,compRock=0,compPaper=0,gameRun=10;

int	main(void)
{
	int i=0, userNum=0,comNum=0,gameCount=0,gameRun=0,selectNo=0;
	for(i=0;i<100;i++)
	{
		printInfo(gameCount);
		printf("\n메뉴를 선택하세요 :");
		scanf("%d",&selectNo);
		switch(selectNo)
		{
		case 1:
			srand((unsigned)time(NULL));				//난수 발생기의 시작점을 초기화한다
			for(i=0 ; i<gameRun ; i++)
			{
				userNum=userNumbering();
				comNum=computerNumbering();
				percentage(userNum,comNum);
				if(userNum==0) break;					//사용자가 0을 입력할 시 프로그램 종료
				printResult(userNum,comNum);
			}
			gameCount++;
			break;
		case 2:
			printf("사용자 전적 : %d전 %d승 %d패 %d무\n가위 : %.2lf 바위 : %.2lf 보 : %.2lf \n",gameRun,userWin,userLose,userDraw,userScissor/gameRun*100.0,userRock/gameRun*100.0,userPaper/gameRun*100.0);
			printf("컴퓨터 전적 : %d전 %d승 %d패 %d무\n가위 : %.2lf 바위 : %.2lf 보 : %.2lf \n",gameRun,compWin,compLose,compDraw,compScissor/gameRun*100.0,compRock/gameRun*100.0,compPaper/gameRun*100.0);
			break;
		case 3:
			gameCount=0,userWin=0,userLose=0,userDraw=0;
			continue;
		case 4:
			printf("안녀어어어어어어어어엉엉!!!!!!!!\n");
			break;
		default:printf("정신차려!!!!!!!!!!!!!\n");
		}
	}
	return 0;
}
void printInfo(int a)
{
	printf("\n\ni*************************i\n");
	printf("|       ☆  MENU  ☆      |\n");
	printf("| 1. 게임시작             |\n");
	printf("| 2. 게임결과             |\n");
	printf("| 3. 게임재시작           |\n");
	printf("| 4. 게임종료             |\n");
	printf("| 게임횟수 : %2d 번        |\n",a);
	printf("i*************************i\n");
}
int computerNumbering()
{
	int result=0;
	result=rand()%(3-1+1)+1;
	return result;
}
int userNumbering()
{
	int result=0;
	do										//사용자의 입력을 받기
	{
		printf("선택하시오 (1:가위 2:바위 3:보) :");
		scanf("%d",&result);
	}while(result<0||result>3);
	return result;
}
void printResult(int a, int b)				//문자열을 출력받기 위해서 *포인터 이용
{
	static int userCount=0;
	userCount++;
	if(userCount>gameRun) userCount=1;
	printf("\n\ni************************i\n");
	printf("|       ☆  YOU  ☆      |\n");
	printf("i************************i\n");
	printGraphic(a);

	printVS();
	printf("\n\ni************************i\n");
	printf("|       ☆  COM  ☆      |\n");
	printf("i************************i\n");
	printGraphic(b);
	printf("횟수 : %d  입력값 %d : 컴퓨터 %d , ",userCount, a, b);

	switch(a-b)					//판단 시작
	{
		case 0 :
			printf("[ 비김 ] \n");
			userDraw++;
			compDraw++;
			//strcpy(result,"비김");
			break;
		case 1 : case -2 :
			printf("[ 승 ] \n");
			userWin++;
			compLose++;
			//strcpy(result,"승");
			break;
		case -1 : case 2 :
			printf("[ 패 ] \n");
			userLose++;
			compWin++;
			//strcpy(result,"패");
			break;
	}
}
void percentage(int a, int b)
{
	switch(a)					//판단 시작=0,=0,compPaper=0;
	{
		case 1 :
			userScissor++;
			break;
		case 2 :
			userRock++;
			break;
		case 3 :
			userPaper++;
			break;
	}
	switch(b)					//판단 시작=0,=0,compPaper=0;
	{
		case 1 :
			compScissor++;
			break;
		case 2 :
			compRock++;
			break;
		case 3 :
			compPaper++;
			break;
	}
}
void printGraphic(int a)
{
	switch(a)					//판단 시작
	{
		case 1 :
			printf("\n");
			printf("     .---.          .---.\n");
			printf("     |    |        /    |\n");
			printf("      |    |      /    /\n");
			printf("       |    |    /    /\n");
			printf("        |     |_/    /\n");
			printf("     -----.   ---- --.\n");
			printf("   /   ...|  /   /   /\n");
			printf("   |  ＼--  |   |   ||\n");
			printf("    |    |  |__|__ | |\n");
			printf("    |     |   |      |\n");
			printf("     |               |\n");
			printf("     |               /\n");
			printf("      |_____________|\n");
			break;
		case 2 :
			printf("\n");
			printf("       /````＼----.-----.\n");
			printf("    __/__`_   ＼  ＼  ＼ ＼\n");
			printf("  /         '   |   |   |  |\n");
			printf("  |         |   /   /  /  /\n");
			printf("  |  ＼____|/__/___/__/--\n");
			printf("   |        ＼      /    ＼\n");
			printf("    |                     |\n");
			printf("    ＼                    |\n");
			printf("      ＼                 /\n");
			printf("         ---------------\n");
			break;
		case 3 :
			printf("           .--.\n");
			printf("       .--.|  |.--.\n");
			printf("      |   |   |   |.-.    \n");
			printf("      |   |   |   |  |      \n");
			printf("      |   |   |   |  |\n");
			printf("   .--.   |   |   |  |\n");
			printf("   |  |   |   |   |  | \n");
			printf("   |  |   |   |   |  |\n");
			printf("   |   |````＼--.--.- `\n");
			printf("   |   -＼            |\n");
			printf("   |     ＼     -----_|\n");
			printf("   ＼      --         |\n");
			printf("    ＼                / \n");
			printf("     |                |\n");
			printf("      |               /     \n");
			printf("       |-------------|\n");

			break;
	}
}
void printVS(void)
{
	printf("\n");
	printf(".-----.         .-----.      _.--------------.\n");
	printf("＼    ＼       /     /     /    _____________/\n");
	printf(" ＼    ＼     /     /     /    /\n");
	printf("  ＼    ＼   /     /     /    /_____________.\n");
	printf("   ＼    ＼ /     /      ._____________      |\n");
	printf("    ＼           /                    /     /\n");
	printf("     ＼         /       .------------'     /\n");
	printf("      ＼_______/       /_________________ /\n");
}
//*/


/* //가위바위보 (문자열 return, 난수발생(rand)) //포인터 배열 오류
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

int computerNumbering(void);
int userNumbering(void);
char* printResult(int a, int b);
void printGraphic(int a);
void printVS(void);
int	main(void)
{
	int i=0, userNum=0, comNum=0;
	char *result;
	srand((unsigned)time(NULL));				//난수 발생기의 시작점을 초기화한다
	
	do
	{
		comNum=computerNumbering();
		userNum=userNumbering();
		if(userNum==0) break;					//사용자가 0을 입력할 시 프로그램 종료
		
		printf("\n\ni************************i\n");
		printf("|       ☆  YOU  ☆      |\n");
		printf("i************************i\n");
		printGraphic(userNum);

		printVS();
		printf("\n\ni************************i\n");
		printf("|       ☆  COM  ☆      |\n");
		printf("i************************i\n");
		printGraphic(comNum);
		result=printResult(userNum, comNum);
		printf("컴퓨터 %d : 입력값: %d , [ %s ]입니다. \n", comNum,userNum,result);
	}while(userNum!=0);
	return 0;
}
int computerNumbering()
{
	int result=0;
	result=rand()%(3-1+1)+1;
	return result;
}
int userNumbering()
{
	int result=0;
	do										//사용자의 입력을 받기
	{
		printf("선택하시오 (1:가위 2:바위 3:보) :");
		scanf("%d",&result);
	}while(result<0||result>3);
	return result;
}
char *printResult(int a, int b)				//문자열을 출력받기 위해서 *포인터 이용
{
	char *result = new char[100];
	switch(a-b)					//판단 시작
	{
		case 0 :
			strcpy(result,"비김");
			break;
		case 1 : case -2 :
			strcpy(result,"승");
			break;
		case -1 : case 2 :
			strcpy(result,"패");
			break;
	}
	return result;							//여러값을 출력하는 방법:1) 구조체 2)포인터로 값 반환
}
void printGraphic(int a)
{
	switch(a)					//판단 시작
	{
		case 1 :
			printf("\n");
			printf("     .---.          .---.\n");
			printf("     |    |        /    |\n");
			printf("      |    |      /    /\n");
			printf("       |    |    /    /\n");
			printf("        |     |_/    /\n");
			printf("     -----.   ---- --.\n");
			printf("   /   ...|  /   /   /\n");
			printf("   |  ＼--  |   |   ||\n");
			printf("    |    |  |__|__ | |\n");
			printf("    |     |   |      |\n");
			printf("     |               |\n");
			printf("     |               /\n");
			printf("      |_____________|\n");
			break;
		case 2 :
			printf("\n");
			printf("       /````＼----.-----.\n");
			printf("    __/__`_   ＼  ＼  ＼ ＼\n");
			printf("  /         '   |   |   |  |\n");
			printf("  |         |   /   /  /  /\n");
			printf("  |  ＼____|/__/___/__/--\n");
			printf("   |        ＼      /    ＼\n");
			printf("    |                     |\n");
			printf("    ＼                    |\n");
			printf("      ＼                 /\n");
			printf("         ---------------\n");
			break;
		case 3 :
			printf("           .--.\n");
			printf("       .--.|  |.--.\n");
			printf("      |   |   |   |.-.    \n");
			printf("      |   |   |   |  |      \n");
			printf("      |   |   |   |  |\n");
			printf("   .--.   |   |   |  |\n");
			printf("   |  |   |   |   |  | \n");
			printf("   |  |   |   |   |  |\n");
			printf("   |   |````＼--.--.- `\n");
			printf("   |   -＼            |\n");
			printf("   |     ＼     -----_|\n");
			printf("   ＼      --         |\n");
			printf("    ＼                / \n");
			printf("     |                |\n");
			printf("      |               /     \n");
			printf("       |-------------|\n");

			break;
	}
}
void printVS(void)
{
	printf("\n");
	printf(".-----.         .-----.      _.--------------.\n");
	printf("＼    ＼       /     /     /    _____________/\n");
	printf(" ＼    ＼     /     /     /    /\n");
	printf("  ＼    ＼   /     /     /    /_____________.\n");
	printf("   ＼    ＼ /     /      ._____________      |\n");
	printf("    ＼           /                    /     /\n");
	printf("     ＼         /       .------------'     /\n");
	printf("      ＼_______/       /_________________ /\n");
}
//*/

/***1.컴퓨터와 가위바위보 게임하는 프로그램 제작
	2.컴퓨터는 사용자에게 알리지 않고, 가위바위보를 임의로 선택한다.
		-> 랜덤처리방법선택을 진행한다.
	3.사용자는 프로그램 입력 안내 메세지에 따라서3개 중에서 한개를 선택한다.
		-> 안내메시지 : printf()
		->3개 중에 선택 : scanf()
	4.사용자의 선택이 끝나면 누가 무엇을 선택하였고, 누가 이겼는지, 비겼는지 알려준다.
		->로직
	5. 선택하시오 (1:가위 2:바위 3:보) :
***/
/* //정리 전
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

int	main(void)
{
	int i=0, userNum=0, comNum=0, flag=0;
	srand((unsigned)time(NULL));				//난수 발생기의 시작점을 초기화한다
	char result[100]={};
	do
	{
		do										//컴퓨터의 입력을 받기
		{
			comNum=rand()%10;
			//comNum=rand()%(3-1+1)+1;			//a~b 사이의 숫자 구하기 :rand()%(b-a+1)+a하기
		}while(comNum<1||comNum>3);
		printf("확정된 컴퓨터 : %d\n",comNum);

		//for(i=0 ; i<10 ; i++)
		//{
		//	comNum=rand()%(21154-2145+1)+2145;
		//	printf("확정된 컴퓨터 : %d\n",comNum);
		//}
		do										//사용자의 입력을 받기
		{
			printf("선택하시오 (1:가위 2:바위 3:보) :");
			scanf("%d",&userNum);
		}while(userNum<0||userNum>3);
		
		if(userNum==0)							//사용자가 0을 입력할 시 프로그램 종료
		{
			flag=1;
			break;
		}

		switch(userNum-comNum)					//판단 시작
		{
			case 0 :
				//printf("비김");
				strcpy(result,"비김");
				break;
			case 1 : case -2 :
				//printf("승");
				strcpy(result,"승");
				break;
			case -1 : case 2 :
				//printf("패");
				strcpy(result,"패");
				break;
		}
		printf("컴퓨터 %d : 입력값: %d , [%s]입니다. \n", comNum,userNum,result );
	}while(userNum!=0);
	return 0;
}//*/