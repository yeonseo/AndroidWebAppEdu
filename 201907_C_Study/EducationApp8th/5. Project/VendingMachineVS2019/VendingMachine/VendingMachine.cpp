/*
#include <stdio.h>
#include <windows.h>
#include<conio.h>

#define _CRT_SECURE_NO_WARNINGS
#define PAGE_SIZE 30
#define GOTO_X 0
#define GOTO_Y 7
void text_color(char color);
void redrow();
//salade
const char* saladName[5] = { " ","�⺻(�ʼ�)","�丶��","�ø���","��Ʈ" };
int saladPrice[5] = { 0,1500,500,500,500 };
int saladStore[5] = { 0,10,10,10,10 };  //��ǰ�� ���� ��ȣ�� �迭 ��ȣ�� �����ֱ� ���ؼ� [0]ĭ�� ���� NULL�ΰ����� �ϳ� �����.
int saladUser[5] = { 0, };

const char* sourceName[5] = { " ","�߻��&�ø���","�ø������","��ϸӽ�Ÿ��","ĥ��" };
int sourcePrice[5] = { 0,1000,500,500,500 };
int sourceStore[5] = { 0,10,10,10,10 };  //��ǰ�� ���� ��ȣ�� �迭 ��ȣ�� �����ֱ� ���ؼ� [0]ĭ�� ���� NULL�ΰ����� �ϳ� �����.
int sourceUser[5] = { 0, };

const char* toppingName[5] = { " ","���","�����߰�����","�����߰�����","��������" };
int toppingPrice[5] = { 0,1000,500,500,500 };
int toppingStore[5] = { 0,10,10,10,10 };  //��ǰ�� ���� ��ȣ�� �迭 ��ȣ�� �����ֱ� ���ؼ� [0]ĭ�� ���� NULL�ΰ����� �ϳ� �����.
int toppingUser[5] = { 0, };

//ī��� ����
int payCard = 150000;
int payCoin = 0;
int payValue = 0;

//�Է¹ޱ�
int selectMenu = ' ';
int input_char();
int input_int();

//Ŀ�� ��ǥ�����ϱ�
void gotoxy(int x, int y);

//�޴� ȭ�� ����
void select_menu_print(void);

//��ǰ������
void salad_menu_print(void);
void topping_menu_print(void);
void source_menu_print(void);
void user_collection(void);

//������� ����
void pay_menu_print(void);
void pay_coin(void);
void pay_card(void);
void salad_out(void);
void user_default(void);
int main(void)
{
	for (;;)
	{
		gotoxy(0, 0);
		printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		printf("��  .   *      .*      *.      .'      *       +      ��\n");
		printf("��   +         +*    *������ ������*       .          ��\n");
		printf("�� .  ���ϴ� ���� ������ �����带 ����� �Ծ��     ��\n");
		printf("��        .      *.       .+    .   '    .'   +*      ��\n");
		printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		Sleep(1000);
		select_menu_print();
		pay_menu_print();
		user_default();
	}
	return 0;
}
void text_color(char color)
{
	int colorNum = 7;
	switch (color)
	{
	case 'R':colorNum = 4; break;
	case 'G':colorNum = 2; break;
	case 'Y':colorNum = 6; break;
	default: colorNum = 7; break;
	}
	SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), colorNum);
}
void gotoxy(int x, int y)
{
	COORD Pos = { x , y};
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), Pos);
}
void redrow()
{
	int i = 0;
	gotoxy(GOTO_X, GOTO_Y);
	for (i = 0; i < PAGE_SIZE; i++)
	{
		printf("                                                                             \n");
	}
}
//�Է¹ޱ�
int input_char(void)
{
	selectMenu = 0;
	while (getchar() != '\n');
	scanf("%c", &selectMenu);
	return selectMenu;
}
int input_int(void)
{
	selectMenu = 0;
	scanf("%d", &selectMenu);
	return selectMenu;
}
//�޴� ȭ�� ����
void select_menu_print(void)
{
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf("\n");
	printf("  ���� ���������� ��ٱ��Ͽ� ���� �޴��� ������ �ּ���.\n");
	printf("  ��� ������ ���� �Ŀ�, E.��������(���)�� �����մϴ�.\n");
	printf("                                                       \n");
	printf("     A.ä��, B.����, C.�ҽ� �Է�  E.��������(���)   \n");
	printf("  ������ ���� : ");

	for (;;)
	{
		scanf("%c", &selectMenu);
		switch (selectMenu)
		{
		case 65: case 97: redrow(); salad_menu_print(); break;
		case 66: case 98: redrow(); topping_menu_print(); break;
		case 67: case 99: redrow(); source_menu_print(); break;
		default: printf(" 'A', 'B', 'C', 'E' �߿� �Է����ּ���.");
		}
		if (selectMenu == 69 || selectMenu == 101) break;
	}
}
//��ǰ ������
void salad_menu_print(void)
{
	int i = 0;
	gotoxy(GOTO_X+32, GOTO_Y+15);
	printf("���հ� : %5d��\n", payValue);
	gotoxy(GOTO_X, GOTO_Y);
	printf("********************************************************\n");
	text_color('G');
	printf("     *ä��*");
	text_color('W');
	printf("             *����*            *�ҽ�*    \n");
	printf("********************************************************\n");

	for (i = 1; i < 5; i++) printf("%d. %14s  : %5d�� (�������� : %2d) \n", i, saladName[i], saladPrice[i], saladStore[i] - saladUser[i]);
	printf("1-4 �� �޴� �߿��� �޴��� ����ּ���.( 0 : ���� ȭ��)\n");
	printf("\n*���� ��ٱ���*\n");
	for (i = 0; i < 5; i++)
	{
		if (saladUser[i] != 0) printf("%14s : %2d�� %5d��\n", saladName[i], saladUser[i], saladUser[i] * saladPrice[i]);
	}


	selectMenu = input_int();
	if (selectMenu != 0)
	{
		switch (saladStore[selectMenu] - saladUser[selectMenu])
		{
		case 0: printf("\a"); break;
		default:
			saladUser[selectMenu]++;
			payValue = payValue + saladPrice[selectMenu];
			break;
		}
		salad_menu_print();
	}
	if (selectMenu == 0) select_menu_print();
}
void topping_menu_print(void)
{
	int i = 0;
	gotoxy(GOTO_X + 32, GOTO_Y + 15);
	printf("���հ� : %5d��\n", payValue);
	gotoxy(GOTO_X, GOTO_Y);
	printf("*******************************************************\n");
	printf("     *ä��*             ");
	text_color('Y');
	printf("*����*");
	text_color('W');
	printf("            *�ҽ�*    \n");
	printf("*******************************************************\n");

	for (i = 1; i < 5; i++) printf("%d. %14s  : %5d�� (�������� : %2d) \n", i, toppingName[i], toppingPrice[i], toppingStore[i] - toppingUser[i]);
	printf("1-4 �� �޴� �߿��� �޴��� ����ּ���.( 0 : ���� ȭ��)\n");
	printf("\n*���� ��ٱ���*\n");
	for (i = 0; i < 5; i++)
	{
		if (toppingUser[i] != 0) printf("%14s : %2d��\n", toppingName[i], toppingUser[i]);
	}

	selectMenu = input_int();
	if (selectMenu != 0)
	{
		switch (toppingStore[selectMenu] - toppingUser[selectMenu])
		{
		case 0: printf("\a"); break;
		default:
			toppingUser[selectMenu]++;
			payValue = payValue + toppingPrice[selectMenu];
			break;
		}
		topping_menu_print();
	}
	if (selectMenu == 0) select_menu_print();
}
void source_menu_print(void)
{
	int i = 0;
	gotoxy(GOTO_X + 32, GOTO_Y + 15);
	printf("���հ� : %5d��\n", payValue);
	gotoxy(GOTO_X, GOTO_Y);
	printf("*******************************************************\n");
	printf("     *ä��*             *����*            ");
	text_color('R');
	printf("*�ҽ�*    \n");
	text_color('W');
	printf("*******************************************************\n");


	for (i = 1; i < 5; i++) printf("%d. %14s  : %5d�� (�������� : %2d) \n", i, sourceName[i], sourcePrice[i], sourceStore[i] - sourceUser[i]);
	printf("1-4 �� �޴� �߿��� �޴��� ����ּ���.( 0 : ���� ȭ��)\n");
	printf("\n*���� ��ٱ���*\n");
	for (i = 0; i < 5; i++)
	{
		if (sourceUser[i] != 0) printf("%14s : %2d��\n", sourceName[i], sourceUser[i]);
	}

	selectMenu = input_int();
	if (selectMenu != 0)
	{
		switch (sourceStore[selectMenu] - sourceUser[selectMenu])
		{
		case 0: printf("\a"); break;
		default:
			sourceUser[selectMenu]++;
			payValue = payValue + sourcePrice[selectMenu];
			break;
		}
		source_menu_print();
	}
	if (selectMenu == 0) select_menu_print();
}

void user_collection(void)
{
	int i = 0;
	printf("                     ***  ä��  ***                     \n");
	for (i = 1; i < 5; i++)
	{
		if (saladUser[i] != 0) printf("%14s : %2d��\n", saladName[i], saladUser[i]);
	}
	printf("                     ***  ����  ***                     \n");
	for (i = 1; i < 5; i++)
	{
		if (toppingUser[i] != 0) printf("%14s : %2d��\n", toppingName[i], toppingUser[i]);
	}
	printf("                     ***  �ҽ�  ***                     \n");
	for (i = 1; i < 5; i++)
	{
		if (sourceUser[i] != 0) printf("%14s : %2d��\n", sourceName[i], sourceUser[i]);
	}
}
//������� ����
void pay_menu_print(void)
{
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	user_collection();
	for (;;)
	{
		int flag = 0;
		printf("*******************************************************\n");
		printf("                     ***  ����  ***                    \n");
		printf("  *�� �����ݾ� : %6d��  *�� ���Ա޾� : %6d��\n", payValue, payCoin);

		printf("��������� ������ �ּ���. 1.���� 2.ī��   : ");
		selectMenu = input_int();
		switch (selectMenu)
		{
		case 1: printf("�������� �����մϴ� ~���䨬~\n"); pay_coin(); if (payCoin >= payValue) flag = 1; break;
		case 2: printf("ī������ �����մϴ� ~���䨬~\n"); pay_card(); if (payCard >= payValue) flag = 1; break;
		case 123456789: break;//�����ڸ��
		}
		if (flag == 1)
		{
			salad_out(); break;
		}
		printf("�����ݾ��� ���ڸ��ϴ�. ���縦 �ٽ� �����Ͻý��ϱ�?\n(1:�������� 2:����) : ");
		selectMenu = input_int();
		if (selectMenu == 1) continue;
		else break;
	}//end of for
}
void pay_coin(void)
{
	for (; ; )
	{
		int inputMoney = 0;
		printf("���� ���Աݾ� : %6d\n", payCoin);
		printf("���� ���� ȭ�� (100,500,1000,5000,10000) : ");

		inputMoney = input_int();
		switch (inputMoney)
		{
		case 100: case 500: case 1000: case 5000: case 10000:
			payCoin = payCoin + inputMoney; break;
		default: printf("\a�Է��Ͻ� �ݾ��� Ȯ�����ּ���:-0\n��� �Է��Ͻ� %d�� ��ȿ�Դϴ�!\n", inputMoney); break;
		}
		printf("�ݾ��� �� �Է��Ͻðڽ��ϱ�? (Y/N)");
		selectMenu = input_char();
		//printf("%d %c", selectMenu, selectMenu);
		if (selectMenu == 89 || selectMenu == 121) continue;
		else break;
	}
}
void pay_card(void)
{
	for (; ; )
	{
		int inputMoney = 0, payCardNumber = 0, payCardPassword = 0, flag = 0;
		printf("\n���� ���Աݾ� : %5d\n", inputMoney);
		printf("ī�� ��ȣ�� �Է����ּ���.(16�ڸ�)\n");
		payCardNumber = input_int();
		printf("��й�ȣ�� �Է����ּ���.(4�ڸ�)\n");
		payCardPassword = input_int();

		switch (payCardNumber)
		{
		case 1234123412341234: if (payCardPassword == 1234) flag = 1; break;
		case 1111222233334444: if (payCardPassword == 1234) flag = 1; break;
		default: printf("\n\n\aī�������� �ٽ� Ȯ�����ּ���:-0\n��� �Է��Ͻ� ī��� ��ȿ���� �ʽ��ϴ� :-0\n"); break;
		}
		if (flag == 1) break;
	}
}
void salad_out(void)
{
	if (payCoin > 0)
	{
		printf("     ���ܵ� �غ� �ߡ�  ");
		Sleep(1000);
		printf("�� �� �� ");
		Sleep(1000);
		printf("%d���� ��ȯ�մϴ�.\n", payCoin - payValue);
		Sleep(1000);
	}
	if (payCoin == 0)
	{
		printf("�١�ī����οϷ�ڡ�\n");

		payCard = payCard - payValue;
	}
	Sleep(2000);
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf("*******************************************************\n");
	printf("                  ������ ��ǰ �غ� ��                  \n");
	Sleep(2000);
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf(" *  .   �١ڽż��ѻ����尡 �غ�Ǿ����ϴ١ڡ�   *    . \n");
	printf("         *                                  .      .   \n");
	printf("      +    ������ ���� ���ϳ��� ��ʽÿ� :-)     +.    \n");
	printf("               .    *    .                 *.          \n");
	Sleep(2000);

	user_collection();
	printf("               (\n");
	printf("                )\n");
	printf("           __..---..__\n");
	printf("       ,-='0 /. |  o .`=-.\n");
	printf("      :--..___________..--;\n");
	printf("       \.,_____________,./\n");

	Sleep(3000);
	printf("           *********************************  \n");
	printf("           �١ڰ����� ��ǰ�� ���Խ��ϴ�!�ڡ�  \n");
	printf("           *********************************  \n");
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf("\n\n");
	printf("           *********************************  \n");
	printf("           �١��̿��� �ּż� �����մϴ�!�ڡ�  \n");
	printf("           *********************************  \n");
	printf("\n\n");
	Sleep(5000);
}
void user_default(void)
{
	int i = 0;
	for (i = 1; i < 5; i++)
	{
		saladStore[i] = saladStore[i] - saladUser[i];
		saladUser[i] = 0;
		toppingStore[i] = toppingStore[i] - toppingUser[i];
		toppingUser[i] = 0;
		sourceStore[i] = sourceStore[i] - sourceUser[i];
		sourceUser[i] = 0;
	}
	payCoin = 0;
	payValue = 0;
}
//*/
/*
#include <stdio.h>
#include <windows.h>
#include<conio.h>

#define _CRT_SECURE_NO_WARNINGS
#define PAGE_SIZE 30
#define GOTO_X 0
#define GOTO_Y 7
void text_color(char color);
void redrow();
//salade
const char* saladName[5] = { " ","�⺻(�ʼ�)","�丶��","�ø���","��Ʈ" };
int saladPrice[5] = { 0,1500,500,500,500 };
int saladStore[5] = { 0,10,10,10,10 };  //��ǰ�� ���� ��ȣ�� �迭 ��ȣ�� �����ֱ� ���ؼ� [0]ĭ�� ���� NULL�ΰ����� �ϳ� �����.
int saladUser[5] = { 0, };

const char* sourceName[5] = { " ","�߻��&�ø���","�ø������","��ϸӽ�Ÿ��","ĥ��" };
int sourcePrice[5] = { 0,1000,500,500,500 };
int sourceStore[5] = { 0,10,10,10,10 };  //��ǰ�� ���� ��ȣ�� �迭 ��ȣ�� �����ֱ� ���ؼ� [0]ĭ�� ���� NULL�ΰ����� �ϳ� �����.
int sourceUser[5] = { 0, };

const char* toppingName[5] = { " ","���","�����߰�����","�����߰�����","��������" };
int toppingPrice[5] = { 0,1000,500,500,500 };
int toppingStore[5] = { 0,10,10,10,10 };  //��ǰ�� ���� ��ȣ�� �迭 ��ȣ�� �����ֱ� ���ؼ� [0]ĭ�� ���� NULL�ΰ����� �ϳ� �����.
int toppingUser[5] = { 0, };

//ī��� ����
int payCard = 150000;
int payCoin = 0;
int payValue = 0;

//�Է¹ޱ�
int selectMenu = ' ';
int input_char();
int input_int();

//Ŀ�� ��ǥ�����ϱ�
void gotoxy(int x, int y);

//�޴� ȭ�� ����
void select_menu_print(void);

//��ǰ������
void salad_menu_print(void);
void topping_menu_print(void);
void source_menu_print(void);
void user_collection(void);

//������� ����
void pay_menu_print(void);
void pay_coin(void);
void pay_card(void);
void salad_out(void);
void user_default(void);
int main(void)
{
	for (;;)
	{
		gotoxy(0, 0);
		printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		printf("��  .   *      .*      *.      .'      *       +      ��\n");
		printf("��   +         +*    *������ ������*       .          ��\n");
		printf("�� .  ���ϴ� ���� ������ �����带 ����� �Ծ��     ��\n");
		printf("��        .      *.       .+    .   '    .'   +*      ��\n");
		printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		Sleep(1000);
		select_menu_print();
		pay_menu_print();
		user_default();
	}
	return 0;
}
void text_color(char color)
{
	int colorNum = 7;
	switch (color)
	{
	case 'R':colorNum = 4; break;
	case 'G':colorNum = 2; break;
	case 'Y':colorNum = 6; break;
	default: colorNum = 7; break;
	}
	SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), colorNum);
}
void gotoxy(int x, int y)
{
	COORD Pos = { x , y };
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), Pos);
}
void redrow()
{
	int i = 0;
	gotoxy(GOTO_X, GOTO_Y);
	for (i = 0; i < PAGE_SIZE; i++)
	{
		printf("                                                                             \n");
	}
}
//�Է¹ޱ�
int input_char(void)
{
	selectMenu = 0;
	while (getchar() != '\n');
	scanf("%c", &selectMenu);
	return selectMenu;
}
int input_int(void)
{
	selectMenu = 0;
	scanf("%d", &selectMenu);
	return selectMenu;
}
//�޴� ȭ�� ����
void select_menu_print(void)
{
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf("\n");
	printf("  ���� ���������� ��ٱ��Ͽ� ���� �޴��� ������ �ּ���.\n");
	printf("  ��� ������ ���� �Ŀ�, E.��������(���)�� �����մϴ�.\n");
	printf("                                                       \n");
	printf("     A.ä��, B.����, C.�ҽ� �Է�  E.��������(���)   \n");
	printf("  ������ ���� : ");

	for (;;)
	{
		scanf("%c", &selectMenu);
		switch (selectMenu)
		{
		case 65: case 97: redrow(); salad_menu_print(); break;
		case 66: case 98: redrow(); topping_menu_print(); break;
		case 67: case 99: redrow(); source_menu_print(); break;
		default: printf(" 'A', 'B', 'C', 'E' �߿� �Է����ּ���.");
		}
		if (selectMenu == 69 || selectMenu == 101) break;
	}
}
//��ǰ ������
void salad_menu_print(void)
{
	int i = 0;
	gotoxy(GOTO_X + 32, GOTO_Y + 15);
	printf("���հ� : %5d��\n", payValue);
	gotoxy(GOTO_X, GOTO_Y);
	printf("********************************************************\n");
	text_color('G');
	printf("     *ä��*");
	text_color('W');
	printf("             *����*            *�ҽ�*    \n");
	printf("********************************************************\n");

	for (i = 1; i < 5; i++) printf("%d. %14s  : %5d�� (�������� : %2d) \n", i, saladName[i], saladPrice[i], saladStore[i] - saladUser[i]);
	printf("1-4 �� �޴� �߿��� �޴��� ����ּ���.( 0 : ���� ȭ��)\n");
	printf("\n*���� ��ٱ���*\n");
	for (i = 0; i < 5; i++)
	{
		if (saladUser[i] != 0) printf("%14s : %2d�� %5d��\n", saladName[i], saladUser[i], saladUser[i] * saladPrice[i]);
	}


	selectMenu = input_int();
	if (selectMenu != 0)
	{
		switch (saladStore[selectMenu] - saladUser[selectMenu])
		{
		case 0: printf("\a"); break;
		default:
			saladUser[selectMenu]++;
			payValue = payValue + saladPrice[selectMenu];
			break;
		}
		salad_menu_print();
	}
	if (selectMenu == 0) select_menu_print();
}
void topping_menu_print(void)
{
	int i = 0;
	gotoxy(GOTO_X + 32, GOTO_Y + 15);
	printf("���հ� : %5d��\n", payValue);
	gotoxy(GOTO_X, GOTO_Y);
	printf("*******************************************************\n");
	printf("     *ä��*             ");
	text_color('Y');
	printf("*����*");
	text_color('W');
	printf("            *�ҽ�*    \n");
	printf("*******************************************************\n");

	for (i = 1; i < 5; i++) printf("%d. %14s  : %5d�� (�������� : %2d) \n", i, toppingName[i], toppingPrice[i], toppingStore[i] - toppingUser[i]);
	printf("1-4 �� �޴� �߿��� �޴��� ����ּ���.( 0 : ���� ȭ��)\n");
	printf("\n*���� ��ٱ���*\n");
	for (i = 0; i < 5; i++)
	{
		if (toppingUser[i] != 0) printf("%14s : %2d��\n", toppingName[i], toppingUser[i]);
	}

	selectMenu = input_int();
	if (selectMenu != 0)
	{
		switch (toppingStore[selectMenu] - toppingUser[selectMenu])
		{
		case 0: printf("\a"); break;
		default:
			toppingUser[selectMenu]++;
			payValue = payValue + toppingPrice[selectMenu];
			break;
		}
		topping_menu_print();
	}
	if (selectMenu == 0) select_menu_print();
}
void source_menu_print(void)
{
	int i = 0;
	gotoxy(GOTO_X + 32, GOTO_Y + 15);
	printf("���հ� : %5d��\n", payValue);
	gotoxy(GOTO_X, GOTO_Y);
	printf("*******************************************************\n");
	printf("     *ä��*             *����*            ");
	text_color('R');
	printf("*�ҽ�*    \n");
	text_color('W');
	printf("*******************************************************\n");


	for (i = 1; i < 5; i++) printf("%d. %14s  : %5d�� (�������� : %2d) \n", i, sourceName[i], sourcePrice[i], sourceStore[i] - sourceUser[i]);
	printf("1-4 �� �޴� �߿��� �޴��� ����ּ���.( 0 : ���� ȭ��)\n");
	printf("\n*���� ��ٱ���*\n");
	for (i = 0; i < 5; i++)
	{
		if (sourceUser[i] != 0) printf("%14s : %2d��\n", sourceName[i], sourceUser[i]);
	}

	selectMenu = input_int();
	if (selectMenu != 0)
	{
		switch (sourceStore[selectMenu] - sourceUser[selectMenu])
		{
		case 0: printf("\a"); break;
		default:
			sourceUser[selectMenu]++;
			payValue = payValue + sourcePrice[selectMenu];
			break;
		}
		source_menu_print();
	}
	if (selectMenu == 0) select_menu_print();
}

void user_collection(void)
{
	int i = 0;
	printf("                     ***  ä��  ***                     \n");
	for (i = 1; i < 5; i++)
	{
		if (saladUser[i] != 0) printf("%14s : %2d��\n", saladName[i], saladUser[i]);
	}
	printf("                     ***  ����  ***                     \n");
	for (i = 1; i < 5; i++)
	{
		if (toppingUser[i] != 0) printf("%14s : %2d��\n", toppingName[i], toppingUser[i]);
	}
	printf("                     ***  �ҽ�  ***                     \n");
	for (i = 1; i < 5; i++)
	{
		if (sourceUser[i] != 0) printf("%14s : %2d��\n", sourceName[i], sourceUser[i]);
	}
}
//������� ����
void pay_menu_print(void)
{
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	user_collection();
	for (;;)
	{
		int flag = 0;
		printf("*******************************************************\n");
		printf("                     ***  ����  ***                    \n");
		printf("  *�� �����ݾ� : %6d��  *�� ���Ա޾� : %6d��\n", payValue, payCoin);

		printf("��������� ������ �ּ���. 1.���� 2.ī��   : ");
		selectMenu = input_int();
		switch (selectMenu)
		{
		case 1: printf("�������� �����մϴ� ~���䨬~\n"); pay_coin(); if (payCoin >= payValue) flag = 1; break;
		case 2: printf("ī������ �����մϴ� ~���䨬~\n"); pay_card(); if (payCard >= payValue) flag = 1; break;
		case 123456789: break;//�����ڸ��
		}
		if (flag == 1)
		{
			salad_out(); break;
		}
		printf("�����ݾ��� ���ڸ��ϴ�. ���縦 �ٽ� �����Ͻý��ϱ�?\n(1:�������� 2:����) : ");
		selectMenu = input_int();
		if (selectMenu == 1) continue;
		else break;
	}//end of for
}
void pay_coin(void)
{
	for (; ; )
	{
		int inputMoney = 0;
		printf("���� ���Աݾ� : %6d\n", payCoin);
		printf("���� ���� ȭ�� (100,500,1000,5000,10000) : ");

		inputMoney = input_int();
		switch (inputMoney)
		{
		case 100: case 500: case 1000: case 5000: case 10000:
			payCoin = payCoin + inputMoney; break;
		default: printf("\a�Է��Ͻ� �ݾ��� Ȯ�����ּ���:-0\n��� �Է��Ͻ� %d�� ��ȿ�Դϴ�!\n", inputMoney); break;
		}
		printf("�ݾ��� �� �Է��Ͻðڽ��ϱ�? (Y/N)");
		selectMenu = input_char();
		//printf("%d %c", selectMenu, selectMenu);
		if (selectMenu == 89 || selectMenu == 121) continue;
		else break;
	}
}
void pay_card(void)
{
	for (; ; )
	{
		int inputMoney = 0, payCardNumber = 0, payCardPassword = 0, flag = 0;
		printf("\n���� ���Աݾ� : %5d\n", inputMoney);
		printf("ī�� ��ȣ�� �Է����ּ���.(16�ڸ�)\n");
		payCardNumber = input_int();
		printf("��й�ȣ�� �Է����ּ���.(4�ڸ�)\n");
		payCardPassword = input_int();

		switch (payCardNumber)
		{
		case 1234123412341234: if (payCardPassword == 1234) flag = 1; break;
		case 1111222233334444: if (payCardPassword == 1234) flag = 1; break;
		default: printf("\n\n\aī�������� �ٽ� Ȯ�����ּ���:-0\n��� �Է��Ͻ� ī��� ��ȿ���� �ʽ��ϴ� :-0\n"); break;
		}
		if (flag == 1) break;
	}
}
void salad_out(void)
{
	if (payCoin > 0)
	{
		printf("     ���ܵ� �غ� �ߡ�  ");
		Sleep(1000);
		printf("�� �� �� ");
		Sleep(1000);
		printf("%d���� ��ȯ�մϴ�.\n", payCoin - payValue);
		Sleep(1000);
	}
	if (payCoin == 0)
	{
		printf("�١�ī����οϷ�ڡ�\n");

		payCard = payCard - payValue;
	}
	Sleep(2000);
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf("*******************************************************\n");
	printf("                  ������ ��ǰ �غ� ��                  \n");
	Sleep(2000);
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf(" *  .   �١ڽż��ѻ����尡 �غ�Ǿ����ϴ١ڡ�   *    . \n");
	printf("         *                                  .      .   \n");
	printf("      +    ������ ���� ���ϳ��� ��ʽÿ� :-)     +.    \n");
	printf("               .    *    .                 *.          \n");
	Sleep(2000);

	user_collection();
	printf("               (\n");
	printf("                )\n");
	printf("           __..---..__\n");
	printf("       ,-='0 /. |  o .`=-.\n");
	printf("      :--..___________..--;\n");
	printf("       \.,_____________,./\n");

	Sleep(3000);
	printf("           *********************************  \n");
	printf("           �١ڰ����� ��ǰ�� ���Խ��ϴ�!�ڡ�  \n");
	printf("           *********************************  \n");
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf("\n\n");
	printf("           *********************************  \n");
	printf("           �١��̿��� �ּż� �����մϴ�!�ڡ�  \n");
	printf("           *********************************  \n");
	printf("\n\n");
	Sleep(5000);
}
void user_default(void)
{
	int i = 0;
	for (i = 1; i < 5; i++)
	{
		saladStore[i] = saladStore[i] - saladUser[i];
		saladUser[i] = 0;
		toppingStore[i] = toppingStore[i] - toppingUser[i];
		toppingUser[i] = 0;
		sourceStore[i] = sourceStore[i] - sourceUser[i];
		sourceUser[i] = 0;
	}
	payCoin = 0;
	payValue = 0;
}
//*/
