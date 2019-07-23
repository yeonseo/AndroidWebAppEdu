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
				printf("%d�� %d�� %d�� %d�� \n",  COUNT, userWin, userDraw, userLose);
				printf("��ǻ��Ȯ��: ����: %.2lf%% ����: %.2lf%% ��: %.2lf%% \n", (double)comScissor/COUNT*100, (double)comRock/COUNT*100, (double)comPaper/COUNT*100);
				break;

			case 3:
				continue;
				break;

			case 4:
				printf("��ſ���. �ٽ� ��������\n");
				_exit(1);
				break;

			deafault:
				printf("�̻��� �� �Է�\n");
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
		printf("| 1. ���ӽ���		|\n");
		printf("| 2. ���Ӱ��		|\n");
		printf("| 3. ���������		|\n");
		printf("| 4. ��������		|\n");
		printf("| 5. ����Ƚ��: %d��	|\n", menuCount++);
		printf("i***********************i\n");
		for(;;)
		{
			printf("���ù�ȣ:  ");
			scanf("%d",&selectNo);
			if(selectNo>=1&&selectNo<=4) break;
			else
				printf("���� �ٽ� �Է� ���\n\n");
		}
		
		return selectNo;
}
int user_select(void)
{
	static int userCount=0;
	int userValue=0;
	for(;;)
	{
		printf("Count Ƚ�� : %d��\n����� �Է� ���: ����(1), ����(2), ��(3)\n", ++userCount);
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
			printf("�߸� �Է��� �ٽ� �Է� ���:\n");
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
		printf("����� ��\n"); 
		userWin++;
	}
	else if(resultValue==-1 || resultValue==2)
	{
		printf("����� ��\n"); 
		userLose++;
	}
	else
	{
		printf("���º�\n");
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
		default: printf("��ǻ�� ����\n"); break;

	}
	return;
}