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
const char* saladName[5] = { " ","기본(필수)","토마토","올리브","비트" };
int saladPrice[5] = { 0,1500,500,500,500 };
int saladStore[5] = { 0,10,10,10,10 };  //상품명 선택 번호와 배열 번호를 맞춰주기 위해서 [0]칸의 값을 NULL인것으로 하나 만든다.
int saladUser[5] = { 0, };

const char* sourceName[5] = { " ","발사믹&올리브","올리브오일","허니머스타드","칠리" };
int sourcePrice[5] = { 0,1000,500,500,500 };
int sourceStore[5] = { 0,10,10,10,10 };  //상품명 선택 번호와 배열 번호를 맞춰주기 위해서 [0]칸의 값을 NULL인것으로 하나 만든다.
int sourceUser[5] = { 0, };

const char* toppingName[5] = { " ","계란","훈제닭가슴살","무염닭가슴살","훈제오리" };
int toppingPrice[5] = { 0,1000,500,500,500 };
int toppingStore[5] = { 0,10,10,10,10 };  //상품명 선택 번호와 배열 번호를 맞춰주기 위해서 [0]칸의 값을 NULL인것으로 하나 만든다.
int toppingUser[5] = { 0, };

//카드와 코인
int payCard = 150000;
int payCoin = 0;
int payValue = 0;

//입력받기
int selectMenu = ' ';
int input_char();
int input_int();

//커서 좌표설정하기
void gotoxy(int x, int y);

//메뉴 화면 선택
void select_menu_print(void);

//상품페이지
void salad_menu_print(void);
void topping_menu_print(void);
void source_menu_print(void);
void user_collection(void);

//결제방법 결정
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
		printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		printf("★  .   *      .*      *.      .'      *       +      ★\n");
		printf("★   +         +*    *나만의 샐러드*       .          ★\n");
		printf("★ .  원하는 재료로 나만의 샐러드를 만들어 먹어요     ★\n");
		printf("★        .      *.       .+    .   '    .'   +*      ★\n");
		printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
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
//입력받기
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
//메뉴 화면 선택
void select_menu_print(void)
{
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf("\n");
	printf("  각각 페이지에서 장바구니에 담을 메뉴를 선택해 주세요.\n");
	printf("  모든 선택이 끝난 후에, E.선택종료(계산)을 선택합니다.\n");
	printf("                                                       \n");
	printf("     A.채소, B.토핑, C.소스 입력  E.선택종료(계산)   \n");
	printf("  페이지 선택 : ");

	for (;;)
	{
		scanf("%c", &selectMenu);
		switch (selectMenu)
		{
		case 65: case 97: redrow(); salad_menu_print(); break;
		case 66: case 98: redrow(); topping_menu_print(); break;
		case 67: case 99: redrow(); source_menu_print(); break;
		default: printf(" 'A', 'B', 'C', 'E' 중에 입력해주세요.");
		}
		if (selectMenu == 69 || selectMenu == 101) break;
	}
}
//상품 페이지
void salad_menu_print(void)
{
	int i = 0;
	gotoxy(GOTO_X+32, GOTO_Y+15);
	printf("총합계 : %5d원\n", payValue);
	gotoxy(GOTO_X, GOTO_Y);
	printf("********************************************************\n");
	text_color('G');
	printf("     *채소*");
	text_color('W');
	printf("             *토핑*            *소스*    \n");
	printf("********************************************************\n");

	for (i = 1; i < 5; i++) printf("%d. %14s  : %5d원 (남은수량 : %2d) \n", i, saladName[i], saladPrice[i], saladStore[i] - saladUser[i]);
	printf("1-4 번 메뉴 중에서 메뉴를 골라주세요.( 0 : 이전 화면)\n");
	printf("\n*현재 장바구니*\n");
	for (i = 0; i < 5; i++)
	{
		if (saladUser[i] != 0) printf("%14s : %2d개 %5d원\n", saladName[i], saladUser[i], saladUser[i] * saladPrice[i]);
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
	printf("총합계 : %5d원\n", payValue);
	gotoxy(GOTO_X, GOTO_Y);
	printf("*******************************************************\n");
	printf("     *채소*             ");
	text_color('Y');
	printf("*토핑*");
	text_color('W');
	printf("            *소스*    \n");
	printf("*******************************************************\n");

	for (i = 1; i < 5; i++) printf("%d. %14s  : %5d원 (남은수량 : %2d) \n", i, toppingName[i], toppingPrice[i], toppingStore[i] - toppingUser[i]);
	printf("1-4 번 메뉴 중에서 메뉴를 골라주세요.( 0 : 이전 화면)\n");
	printf("\n*현재 장바구니*\n");
	for (i = 0; i < 5; i++)
	{
		if (toppingUser[i] != 0) printf("%14s : %2d개\n", toppingName[i], toppingUser[i]);
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
	printf("총합계 : %5d원\n", payValue);
	gotoxy(GOTO_X, GOTO_Y);
	printf("*******************************************************\n");
	printf("     *채소*             *토핑*            ");
	text_color('R');
	printf("*소스*    \n");
	text_color('W');
	printf("*******************************************************\n");


	for (i = 1; i < 5; i++) printf("%d. %14s  : %5d원 (남은수량 : %2d) \n", i, sourceName[i], sourcePrice[i], sourceStore[i] - sourceUser[i]);
	printf("1-4 번 메뉴 중에서 메뉴를 골라주세요.( 0 : 이전 화면)\n");
	printf("\n*현재 장바구니*\n");
	for (i = 0; i < 5; i++)
	{
		if (sourceUser[i] != 0) printf("%14s : %2d개\n", sourceName[i], sourceUser[i]);
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
	printf("                     ***  채소  ***                     \n");
	for (i = 1; i < 5; i++)
	{
		if (saladUser[i] != 0) printf("%14s : %2d개\n", saladName[i], saladUser[i]);
	}
	printf("                     ***  토핑  ***                     \n");
	for (i = 1; i < 5; i++)
	{
		if (toppingUser[i] != 0) printf("%14s : %2d개\n", toppingName[i], toppingUser[i]);
	}
	printf("                     ***  소스  ***                     \n");
	for (i = 1; i < 5; i++)
	{
		if (sourceUser[i] != 0) printf("%14s : %2d개\n", sourceName[i], sourceUser[i]);
	}
}
//결제방법 결정
void pay_menu_print(void)
{
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	user_collection();
	for (;;)
	{
		int flag = 0;
		printf("*******************************************************\n");
		printf("                     ***  결재  ***                    \n");
		printf("  *총 결제금액 : %6d원  *총 투입급액 : %6d원\n", payValue, payCoin);

		printf("결제방법을 선택해 주세요. 1.현금 2.카드   : ");
		selectMenu = input_int();
		switch (selectMenu)
		{
		case 1: printf("현금으로 결제합니다 ~º▽º~\n"); pay_coin(); if (payCoin >= payValue) flag = 1; break;
		case 2: printf("카드으로 결제합니다 ~º▽º~\n"); pay_card(); if (payCard >= payValue) flag = 1; break;
		case 123456789: break;//관리자모드
		}
		if (flag == 1)
		{
			salad_out(); break;
		}
		printf("결제금액이 모자릅니다. 결재를 다시 선택하시습니까?\n(1:결제선택 2:종료) : ");
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
		printf("현재 투입금액 : %6d\n", payCoin);
		printf("투입 가능 화폐 (100,500,1000,5000,10000) : ");

		inputMoney = input_int();
		switch (inputMoney)
		{
		case 100: case 500: case 1000: case 5000: case 10000:
			payCoin = payCoin + inputMoney; break;
		default: printf("\a입력하신 금액을 확인해주세요:-0\n방금 입력하신 %d원 무효입니다!\n", inputMoney); break;
		}
		printf("금액을 더 입력하시겠습니까? (Y/N)");
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
		printf("\n현재 투입금액 : %5d\n", inputMoney);
		printf("카드 번호를 입력해주세요.(16자리)\n");
		payCardNumber = input_int();
		printf("비밀번호를 입력해주세요.(4자리)\n");
		payCardPassword = input_int();

		switch (payCardNumber)
		{
		case 1234123412341234: if (payCardPassword == 1234) flag = 1; break;
		case 1111222233334444: if (payCardPassword == 1234) flag = 1; break;
		default: printf("\n\n\a카드정보를 다시 확인해주세요:-0\n방금 입력하신 카드는 유효하지 않습니다 :-0\n"); break;
		}
		if (flag == 1) break;
	}
}
void salad_out(void)
{
	if (payCoin > 0)
	{
		printf("     ☆잔돈 준비 중☆  ");
		Sleep(1000);
		printf("→ → → ");
		Sleep(1000);
		printf("%d원을 반환합니다.\n", payCoin - payValue);
		Sleep(1000);
	}
	if (payCoin == 0)
	{
		printf("☆★카드승인완료★☆\n");

		payCard = payCard - payValue;
	}
	Sleep(2000);
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf("*******************************************************\n");
	printf("                  구입한 상품 준비 중                  \n");
	Sleep(2000);
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf(" *  .   ☆★신선한샐러드가 준비되었습니다★☆   *    . \n");
	printf("         *                                  .      .   \n");
	printf("      +    구입후 빠른 시일내에 드십시오 :-)     +.    \n");
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
	printf("           ☆★결재한 물품이 나왔습니다!★☆  \n");
	printf("           *********************************  \n");
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf("\n\n");
	printf("           *********************************  \n");
	printf("           ☆★이용해 주셔서 감사합니다!★☆  \n");
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
const char* saladName[5] = { " ","기본(필수)","토마토","올리브","비트" };
int saladPrice[5] = { 0,1500,500,500,500 };
int saladStore[5] = { 0,10,10,10,10 };  //상품명 선택 번호와 배열 번호를 맞춰주기 위해서 [0]칸의 값을 NULL인것으로 하나 만든다.
int saladUser[5] = { 0, };

const char* sourceName[5] = { " ","발사믹&올리브","올리브오일","허니머스타드","칠리" };
int sourcePrice[5] = { 0,1000,500,500,500 };
int sourceStore[5] = { 0,10,10,10,10 };  //상품명 선택 번호와 배열 번호를 맞춰주기 위해서 [0]칸의 값을 NULL인것으로 하나 만든다.
int sourceUser[5] = { 0, };

const char* toppingName[5] = { " ","계란","훈제닭가슴살","무염닭가슴살","훈제오리" };
int toppingPrice[5] = { 0,1000,500,500,500 };
int toppingStore[5] = { 0,10,10,10,10 };  //상품명 선택 번호와 배열 번호를 맞춰주기 위해서 [0]칸의 값을 NULL인것으로 하나 만든다.
int toppingUser[5] = { 0, };

//카드와 코인
int payCard = 150000;
int payCoin = 0;
int payValue = 0;

//입력받기
int selectMenu = ' ';
int input_char();
int input_int();

//커서 좌표설정하기
void gotoxy(int x, int y);

//메뉴 화면 선택
void select_menu_print(void);

//상품페이지
void salad_menu_print(void);
void topping_menu_print(void);
void source_menu_print(void);
void user_collection(void);

//결제방법 결정
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
		printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		printf("★  .   *      .*      *.      .'      *       +      ★\n");
		printf("★   +         +*    *나만의 샐러드*       .          ★\n");
		printf("★ .  원하는 재료로 나만의 샐러드를 만들어 먹어요     ★\n");
		printf("★        .      *.       .+    .   '    .'   +*      ★\n");
		printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
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
//입력받기
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
//메뉴 화면 선택
void select_menu_print(void)
{
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf("\n");
	printf("  각각 페이지에서 장바구니에 담을 메뉴를 선택해 주세요.\n");
	printf("  모든 선택이 끝난 후에, E.선택종료(계산)을 선택합니다.\n");
	printf("                                                       \n");
	printf("     A.채소, B.토핑, C.소스 입력  E.선택종료(계산)   \n");
	printf("  페이지 선택 : ");

	for (;;)
	{
		scanf("%c", &selectMenu);
		switch (selectMenu)
		{
		case 65: case 97: redrow(); salad_menu_print(); break;
		case 66: case 98: redrow(); topping_menu_print(); break;
		case 67: case 99: redrow(); source_menu_print(); break;
		default: printf(" 'A', 'B', 'C', 'E' 중에 입력해주세요.");
		}
		if (selectMenu == 69 || selectMenu == 101) break;
	}
}
//상품 페이지
void salad_menu_print(void)
{
	int i = 0;
	gotoxy(GOTO_X + 32, GOTO_Y + 15);
	printf("총합계 : %5d원\n", payValue);
	gotoxy(GOTO_X, GOTO_Y);
	printf("********************************************************\n");
	text_color('G');
	printf("     *채소*");
	text_color('W');
	printf("             *토핑*            *소스*    \n");
	printf("********************************************************\n");

	for (i = 1; i < 5; i++) printf("%d. %14s  : %5d원 (남은수량 : %2d) \n", i, saladName[i], saladPrice[i], saladStore[i] - saladUser[i]);
	printf("1-4 번 메뉴 중에서 메뉴를 골라주세요.( 0 : 이전 화면)\n");
	printf("\n*현재 장바구니*\n");
	for (i = 0; i < 5; i++)
	{
		if (saladUser[i] != 0) printf("%14s : %2d개 %5d원\n", saladName[i], saladUser[i], saladUser[i] * saladPrice[i]);
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
	printf("총합계 : %5d원\n", payValue);
	gotoxy(GOTO_X, GOTO_Y);
	printf("*******************************************************\n");
	printf("     *채소*             ");
	text_color('Y');
	printf("*토핑*");
	text_color('W');
	printf("            *소스*    \n");
	printf("*******************************************************\n");

	for (i = 1; i < 5; i++) printf("%d. %14s  : %5d원 (남은수량 : %2d) \n", i, toppingName[i], toppingPrice[i], toppingStore[i] - toppingUser[i]);
	printf("1-4 번 메뉴 중에서 메뉴를 골라주세요.( 0 : 이전 화면)\n");
	printf("\n*현재 장바구니*\n");
	for (i = 0; i < 5; i++)
	{
		if (toppingUser[i] != 0) printf("%14s : %2d개\n", toppingName[i], toppingUser[i]);
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
	printf("총합계 : %5d원\n", payValue);
	gotoxy(GOTO_X, GOTO_Y);
	printf("*******************************************************\n");
	printf("     *채소*             *토핑*            ");
	text_color('R');
	printf("*소스*    \n");
	text_color('W');
	printf("*******************************************************\n");


	for (i = 1; i < 5; i++) printf("%d. %14s  : %5d원 (남은수량 : %2d) \n", i, sourceName[i], sourcePrice[i], sourceStore[i] - sourceUser[i]);
	printf("1-4 번 메뉴 중에서 메뉴를 골라주세요.( 0 : 이전 화면)\n");
	printf("\n*현재 장바구니*\n");
	for (i = 0; i < 5; i++)
	{
		if (sourceUser[i] != 0) printf("%14s : %2d개\n", sourceName[i], sourceUser[i]);
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
	printf("                     ***  채소  ***                     \n");
	for (i = 1; i < 5; i++)
	{
		if (saladUser[i] != 0) printf("%14s : %2d개\n", saladName[i], saladUser[i]);
	}
	printf("                     ***  토핑  ***                     \n");
	for (i = 1; i < 5; i++)
	{
		if (toppingUser[i] != 0) printf("%14s : %2d개\n", toppingName[i], toppingUser[i]);
	}
	printf("                     ***  소스  ***                     \n");
	for (i = 1; i < 5; i++)
	{
		if (sourceUser[i] != 0) printf("%14s : %2d개\n", sourceName[i], sourceUser[i]);
	}
}
//결제방법 결정
void pay_menu_print(void)
{
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	user_collection();
	for (;;)
	{
		int flag = 0;
		printf("*******************************************************\n");
		printf("                     ***  결재  ***                    \n");
		printf("  *총 결제금액 : %6d원  *총 투입급액 : %6d원\n", payValue, payCoin);

		printf("결제방법을 선택해 주세요. 1.현금 2.카드   : ");
		selectMenu = input_int();
		switch (selectMenu)
		{
		case 1: printf("현금으로 결제합니다 ~º▽º~\n"); pay_coin(); if (payCoin >= payValue) flag = 1; break;
		case 2: printf("카드으로 결제합니다 ~º▽º~\n"); pay_card(); if (payCard >= payValue) flag = 1; break;
		case 123456789: break;//관리자모드
		}
		if (flag == 1)
		{
			salad_out(); break;
		}
		printf("결제금액이 모자릅니다. 결재를 다시 선택하시습니까?\n(1:결제선택 2:종료) : ");
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
		printf("현재 투입금액 : %6d\n", payCoin);
		printf("투입 가능 화폐 (100,500,1000,5000,10000) : ");

		inputMoney = input_int();
		switch (inputMoney)
		{
		case 100: case 500: case 1000: case 5000: case 10000:
			payCoin = payCoin + inputMoney; break;
		default: printf("\a입력하신 금액을 확인해주세요:-0\n방금 입력하신 %d원 무효입니다!\n", inputMoney); break;
		}
		printf("금액을 더 입력하시겠습니까? (Y/N)");
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
		printf("\n현재 투입금액 : %5d\n", inputMoney);
		printf("카드 번호를 입력해주세요.(16자리)\n");
		payCardNumber = input_int();
		printf("비밀번호를 입력해주세요.(4자리)\n");
		payCardPassword = input_int();

		switch (payCardNumber)
		{
		case 1234123412341234: if (payCardPassword == 1234) flag = 1; break;
		case 1111222233334444: if (payCardPassword == 1234) flag = 1; break;
		default: printf("\n\n\a카드정보를 다시 확인해주세요:-0\n방금 입력하신 카드는 유효하지 않습니다 :-0\n"); break;
		}
		if (flag == 1) break;
	}
}
void salad_out(void)
{
	if (payCoin > 0)
	{
		printf("     ☆잔돈 준비 중☆  ");
		Sleep(1000);
		printf("→ → → ");
		Sleep(1000);
		printf("%d원을 반환합니다.\n", payCoin - payValue);
		Sleep(1000);
	}
	if (payCoin == 0)
	{
		printf("☆★카드승인완료★☆\n");

		payCard = payCard - payValue;
	}
	Sleep(2000);
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf("*******************************************************\n");
	printf("                  구입한 상품 준비 중                  \n");
	Sleep(2000);
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf(" *  .   ☆★신선한샐러드가 준비되었습니다★☆   *    . \n");
	printf("         *                                  .      .   \n");
	printf("      +    구입후 빠른 시일내에 드십시오 :-)     +.    \n");
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
	printf("           ☆★결재한 물품이 나왔습니다!★☆  \n");
	printf("           *********************************  \n");
	redrow();
	gotoxy(GOTO_X, GOTO_Y);
	printf("\n\n");
	printf("           *********************************  \n");
	printf("           ☆★이용해 주셔서 감사합니다!★☆  \n");
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
