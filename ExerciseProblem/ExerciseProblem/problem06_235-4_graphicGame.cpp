/**************************
Problem6-235_4.c
������&������
�������� 6-235_4��
�Է�:����(void)
���:return��(0)
**************************/
/* //���������� (���ڿ� return, �����߻�(rand), )
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
		printf("\n�޴��� �����ϼ��� :");
		scanf("%d",&selectNo);
		switch(selectNo)
		{
		case 1:
			srand((unsigned)time(NULL));				//���� �߻����� �������� �ʱ�ȭ�Ѵ�
			for(i=0 ; i<gameRun ; i++)
			{
				userNum=userNumbering();
				comNum=computerNumbering();
				percentage(userNum,comNum);
				if(userNum==0) break;					//����ڰ� 0�� �Է��� �� ���α׷� ����
				printResult(userNum,comNum);
			}
			gameCount++;
			break;
		case 2:
			printf("����� ���� : %d�� %d�� %d�� %d��\n���� : %.2lf ���� : %.2lf �� : %.2lf \n",gameRun,userWin,userLose,userDraw,userScissor/gameRun*100.0,userRock/gameRun*100.0,userPaper/gameRun*100.0);
			printf("��ǻ�� ���� : %d�� %d�� %d�� %d��\n���� : %.2lf ���� : %.2lf �� : %.2lf \n",gameRun,compWin,compLose,compDraw,compScissor/gameRun*100.0,compRock/gameRun*100.0,compPaper/gameRun*100.0);
			break;
		case 3:
			gameCount=0,userWin=0,userLose=0,userDraw=0;
			continue;
		case 4:
			printf("�ȳ������������!!!!!!!!\n");
			break;
		default:printf("��������!!!!!!!!!!!!!\n");
		}
	}
	return 0;
}
void printInfo(int a)
{
	printf("\n\ni*************************i\n");
	printf("|       ��  MENU  ��      |\n");
	printf("| 1. ���ӽ���             |\n");
	printf("| 2. ���Ӱ��             |\n");
	printf("| 3. ���������           |\n");
	printf("| 4. ��������             |\n");
	printf("| ����Ƚ�� : %2d ��        |\n",a);
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
	do										//������� �Է��� �ޱ�
	{
		printf("�����Ͻÿ� (1:���� 2:���� 3:��) :");
		scanf("%d",&result);
	}while(result<0||result>3);
	return result;
}
void printResult(int a, int b)				//���ڿ��� ��¹ޱ� ���ؼ� *������ �̿�
{
	static int userCount=0;
	userCount++;
	if(userCount>gameRun) userCount=1;
	printf("\n\ni************************i\n");
	printf("|       ��  YOU  ��      |\n");
	printf("i************************i\n");
	printGraphic(a);

	printVS();
	printf("\n\ni************************i\n");
	printf("|       ��  COM  ��      |\n");
	printf("i************************i\n");
	printGraphic(b);
	printf("Ƚ�� : %d  �Է°� %d : ��ǻ�� %d , ",userCount, a, b);

	switch(a-b)					//�Ǵ� ����
	{
		case 0 :
			printf("[ ��� ] \n");
			userDraw++;
			compDraw++;
			//strcpy(result,"���");
			break;
		case 1 : case -2 :
			printf("[ �� ] \n");
			userWin++;
			compLose++;
			//strcpy(result,"��");
			break;
		case -1 : case 2 :
			printf("[ �� ] \n");
			userLose++;
			compWin++;
			//strcpy(result,"��");
			break;
	}
}
void percentage(int a, int b)
{
	switch(a)					//�Ǵ� ����=0,=0,compPaper=0;
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
	switch(b)					//�Ǵ� ����=0,=0,compPaper=0;
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
	switch(a)					//�Ǵ� ����
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
			printf("   |  ��--  |   |   ||\n");
			printf("    |    |  |__|__ | |\n");
			printf("    |     |   |      |\n");
			printf("     |               |\n");
			printf("     |               /\n");
			printf("      |_____________|\n");
			break;
		case 2 :
			printf("\n");
			printf("       /````��----.-----.\n");
			printf("    __/__`_   ��  ��  �� ��\n");
			printf("  /         '   |   |   |  |\n");
			printf("  |         |   /   /  /  /\n");
			printf("  |  ��____|/__/___/__/--\n");
			printf("   |        ��      /    ��\n");
			printf("    |                     |\n");
			printf("    ��                    |\n");
			printf("      ��                 /\n");
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
			printf("   |   |````��--.--.- `\n");
			printf("   |   -��            |\n");
			printf("   |     ��     -----_|\n");
			printf("   ��      --         |\n");
			printf("    ��                / \n");
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
	printf("��    ��       /     /     /    _____________/\n");
	printf(" ��    ��     /     /     /    /\n");
	printf("  ��    ��   /     /     /    /_____________.\n");
	printf("   ��    �� /     /      ._____________      |\n");
	printf("    ��           /                    /     /\n");
	printf("     ��         /       .------------'     /\n");
	printf("      ��_______/       /_________________ /\n");
}
//*/


/* //���������� (���ڿ� return, �����߻�(rand)) //������ �迭 ����
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
	srand((unsigned)time(NULL));				//���� �߻����� �������� �ʱ�ȭ�Ѵ�
	
	do
	{
		comNum=computerNumbering();
		userNum=userNumbering();
		if(userNum==0) break;					//����ڰ� 0�� �Է��� �� ���α׷� ����
		
		printf("\n\ni************************i\n");
		printf("|       ��  YOU  ��      |\n");
		printf("i************************i\n");
		printGraphic(userNum);

		printVS();
		printf("\n\ni************************i\n");
		printf("|       ��  COM  ��      |\n");
		printf("i************************i\n");
		printGraphic(comNum);
		result=printResult(userNum, comNum);
		printf("��ǻ�� %d : �Է°�: %d , [ %s ]�Դϴ�. \n", comNum,userNum,result);
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
	do										//������� �Է��� �ޱ�
	{
		printf("�����Ͻÿ� (1:���� 2:���� 3:��) :");
		scanf("%d",&result);
	}while(result<0||result>3);
	return result;
}
char *printResult(int a, int b)				//���ڿ��� ��¹ޱ� ���ؼ� *������ �̿�
{
	char *result = new char[100];
	switch(a-b)					//�Ǵ� ����
	{
		case 0 :
			strcpy(result,"���");
			break;
		case 1 : case -2 :
			strcpy(result,"��");
			break;
		case -1 : case 2 :
			strcpy(result,"��");
			break;
	}
	return result;							//�������� ����ϴ� ���:1) ����ü 2)�����ͷ� �� ��ȯ
}
void printGraphic(int a)
{
	switch(a)					//�Ǵ� ����
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
			printf("   |  ��--  |   |   ||\n");
			printf("    |    |  |__|__ | |\n");
			printf("    |     |   |      |\n");
			printf("     |               |\n");
			printf("     |               /\n");
			printf("      |_____________|\n");
			break;
		case 2 :
			printf("\n");
			printf("       /````��----.-----.\n");
			printf("    __/__`_   ��  ��  �� ��\n");
			printf("  /         '   |   |   |  |\n");
			printf("  |         |   /   /  /  /\n");
			printf("  |  ��____|/__/___/__/--\n");
			printf("   |        ��      /    ��\n");
			printf("    |                     |\n");
			printf("    ��                    |\n");
			printf("      ��                 /\n");
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
			printf("   |   |````��--.--.- `\n");
			printf("   |   -��            |\n");
			printf("   |     ��     -----_|\n");
			printf("   ��      --         |\n");
			printf("    ��                / \n");
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
	printf("��    ��       /     /     /    _____________/\n");
	printf(" ��    ��     /     /     /    /\n");
	printf("  ��    ��   /     /     /    /_____________.\n");
	printf("   ��    �� /     /      ._____________      |\n");
	printf("    ��           /                    /     /\n");
	printf("     ��         /       .------------'     /\n");
	printf("      ��_______/       /_________________ /\n");
}
//*/

/***1.��ǻ�Ϳ� ���������� �����ϴ� ���α׷� ����
	2.��ǻ�ʹ� ����ڿ��� �˸��� �ʰ�, ������������ ���Ƿ� �����Ѵ�.
		-> ����ó����������� �����Ѵ�.
	3.����ڴ� ���α׷� �Է� �ȳ� �޼����� ����3�� �߿��� �Ѱ��� �����Ѵ�.
		-> �ȳ��޽��� : printf()
		->3�� �߿� ���� : scanf()
	4.������� ������ ������ ���� ������ �����Ͽ���, ���� �̰����, ������ �˷��ش�.
		->����
	5. �����Ͻÿ� (1:���� 2:���� 3:��) :
***/
/* //���� ��
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

int	main(void)
{
	int i=0, userNum=0, comNum=0, flag=0;
	srand((unsigned)time(NULL));				//���� �߻����� �������� �ʱ�ȭ�Ѵ�
	char result[100]={};
	do
	{
		do										//��ǻ���� �Է��� �ޱ�
		{
			comNum=rand()%10;
			//comNum=rand()%(3-1+1)+1;			//a~b ������ ���� ���ϱ� :rand()%(b-a+1)+a�ϱ�
		}while(comNum<1||comNum>3);
		printf("Ȯ���� ��ǻ�� : %d\n",comNum);

		//for(i=0 ; i<10 ; i++)
		//{
		//	comNum=rand()%(21154-2145+1)+2145;
		//	printf("Ȯ���� ��ǻ�� : %d\n",comNum);
		//}
		do										//������� �Է��� �ޱ�
		{
			printf("�����Ͻÿ� (1:���� 2:���� 3:��) :");
			scanf("%d",&userNum);
		}while(userNum<0||userNum>3);
		
		if(userNum==0)							//����ڰ� 0�� �Է��� �� ���α׷� ����
		{
			flag=1;
			break;
		}

		switch(userNum-comNum)					//�Ǵ� ����
		{
			case 0 :
				//printf("���");
				strcpy(result,"���");
				break;
			case 1 : case -2 :
				//printf("��");
				strcpy(result,"��");
				break;
			case -1 : case 2 :
				//printf("��");
				strcpy(result,"��");
				break;
		}
		printf("��ǻ�� %d : �Է°�: %d , [%s]�Դϴ�. \n", comNum,userNum,result );
	}while(userNum!=0);
	return 0;
}//*/