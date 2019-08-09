/*
#include <stdio.h>
#include <windows.h>


//salad
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
int selectMenu = 0;
int selectMenuCount = 0;
char selectMenuChar = ' ';

int main(void)
{
	for (;;) ///메뉴선택
	{
		printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		printf("★  .   *      .*      *.      .'      *       +      ★\n");
		printf("★   +         +*    *나만의 샐러드*       .          ★\n");
		printf("★ .  원하는 재료로 나만의 샐러드를 만들어 먹어요     ★\n");
		printf("★        .      *.       .+    .   '    .'   +*      ★\n");
		printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		Sleep(1000);


		int i = 0, flag=0;

		printf("\n");
		printf("  각각 페이지에서 장바구니에 담을 메뉴를 선택해 주세요.\n");
		printf("  모든 선택이 끝난 후에, E.선택종료(계산)을 선택합니다.\n");
		printf("                                                       \n");
		printf("      1.채소  2.토핑  3.소스 입력  4.선택종료(계산)  \n");
		printf(" 메뉴 선택을 하시겠습니까? ( 선택 : 숫자   종료 : 0 ) :");

		scanf("%d", &selectMenuCount);

		if (selectMenuCount ==0) continue;
	
		if (selectMenuCount == 1)
		{
			printf("********************************************************\n");
			printf("                         *채소*   \n");
			printf("********************************************************\n");

			for (;; )
			{
				for (i = 1; i < 5; i++) printf("%d. %14s  : %5d원 (남은수량 : %2d) \n", i, saladName[i], saladPrice[i], saladStore[i] - saladUser[i]);
				printf("총합계 : %5d원\n", payValue);
				printf("1-4 번 메뉴 중에서 메뉴를 골라주세요.( 0 : 이전 화면)\n");


				scanf("%d", &selectMenu);
				switch (selectMenu)
				{
				case 0: break;
				case 1: case 2: case 3: case 4:
					switch (saladStore[selectMenu] - saladUser[selectMenu])
					{
					case 0: printf("\a"); break;
					default:
						saladUser[selectMenu]++;
						payValue = payValue + saladPrice[selectMenu];
						printf("\n*현재 장바구니에 아래의 상품을 추가합니다*\n");
						for (i = 0; i < 5; i++)
						{
							if (saladUser[i] != 0) printf("%14s : %2d개 %5d원\n", saladName[i], saladUser[i], saladUser[i] * saladPrice[i]);
						}
						printf("\n");
						break;
					}
				default: break;
				}
				if (selectMenu == 0) break;
			}
		}///end of if 1.채소
		
		if (selectMenuCount == 2)
		{
			printf("********************************************************\n");
			printf("                         *토핑*   \n");
			printf("********************************************************\n");

			for (;; )
			{
				for (i = 1; i < 5; i++) printf("%d. %14s  : %5d원 (남은수량 : %2d) \n", i, toppingName[i], toppingPrice[i], toppingStore[i] - toppingUser[i]);
				printf("총합계 : %5d원\n", payValue);
				printf("1-4 번 메뉴 중에서 메뉴를 골라주세요.( 0 : 이전 화면)\n");


				scanf("%d", &selectMenu);
				switch (selectMenu)
				{
				case 0: break;
				case 1: case 2: case 3: case 4:
					switch (toppingStore[selectMenu] - toppingUser[selectMenu])
					{
					case 0: printf("\a"); break;
					default:
						toppingUser[selectMenu]++;
						payValue = payValue + toppingPrice[selectMenu];
						printf("\n*현재 장바구니에 아래의 상품을 추가합니다*\n");
						for (i = 0; i < 5; i++)
						{
							if (toppingUser[i] != 0) printf("%14s : %2d개 %5d원\n", toppingName[i], toppingUser[i], toppingUser[i] * toppingPrice[i]);
						}
						printf("\n");
						break;
					}
				default: break;
				}
				if (selectMenu == 0) break;
			}
		}///end of if 2.채소

		if (selectMenuCount == 3)
		{
			printf("********************************************************\n");
			printf("                         *소스*   \n");
			printf("********************************************************\n");

			for (;; )
			{
				for (i = 1; i < 5; i++) printf("%d. %14s  : %5d원 (남은수량 : %2d) \n", i, sourceName[i], sourcePrice[i], sourceStore[i] - sourceUser[i]);
				printf("총합계 : %5d원\n", payValue);
				printf("1-4 번 메뉴 중에서 메뉴를 골라주세요.( 0 : 이전 화면)\n");


				scanf("%d", &selectMenu);
				switch (selectMenu)
				{
				case 0: break;
				case 1: case 2: case 3: case 4:
					switch (sourceStore[selectMenu] - sourceUser[selectMenu])
					{
					case 0: printf("\a"); break;
					default:
						sourceUser[selectMenu]++;
						payValue = payValue + sourcePrice[selectMenu];
						printf("\n*현재 장바구니에 아래의 상품을 추가합니다*\n");
						for (i = 0; i < 5; i++)
						{
							if (sourceUser[i] != 0) printf("%14s : %2d개 %5d원\n", sourceName[i], sourceUser[i], sourceUser[i] * sourcePrice[i]);
						}
						printf("\n");
						break;
					}
				default: break;
				}
				if (selectMenu == 0) break;
			}
		}///end of if 3.소스

		if(selectMenuCount == 4)
		{
			for (;;)
			{
				printf("********************************************************\n");
				printf("                         *결제*   \n");
				printf("********************************************************\n");

				printf("  *총 결제금액 : %6d원  *총 투입급액 : %6d원\n", payValue, payCoin);

				printf("결제방법을 선택해 주세요. 1.현금 2.카드   : ");

				int payFlag = 0;
				scanf("%d", &selectMenu);
				switch (selectMenu)
				{
				case 1: printf("현금으로 결제합니다 ~º▽º~\n"); payFlag = 1; break;
				case 2: printf("카드으로 결제합니다 ~º▽º~\n"); payFlag = 2; if (payCard >= payValue) flag = 1; break;
				case 123456789: break;//관리자모드
				}

				if (payFlag == 1)
				{
					for (; ; )
					{
						int inputMoney = 0;
						printf("현재 투입금액 : %6d\n", payCoin);
						printf("투입 가능 화폐 (100,500,1000,5000,10000) : ");

						scanf("%d", &inputMoney);
						switch (inputMoney)
						{
						case 100: case 500: case 1000: case 5000: case 10000:
							payCoin = payCoin + inputMoney; break;
						default: printf("\a입력하신 금액을 확인해주세요:-0\n방금 입력하신 %d원 무효입니다!\n", inputMoney); break;
						}
						printf("금액을 더 입력하시겠습니까? (계속 : 1  취소 : 0)");
						scanf("%d", &selectMenu);
						//printf("%d %c", selectMenu, selectMenu);
						if (selectMenu == 1) continue;
						if (payCoin >= payValue)
						{
							flag = 1;
							printf("     ☆잔돈 준비 중☆  ");
							Sleep(1000);
							printf("→ → → ");
							Sleep(1000);
							printf("%d원을 반환합니다.\n", payCoin - payValue);
							Sleep(1000);
							break;
						}
						else break;
					}
				}///end of payFlag == 1

				if (payFlag == 2)
				{
					for (; ; )
					{
						int inputMoney = 0, payCardNumber = 0, payCardPassword = 0;
						printf("\n현재 투입금액 : %5d\n", inputMoney);
						printf("카드 번호를 입력해주세요.(16자리)\n");
						scanf("%d", &payCardNumber);
						printf("비밀번호를 입력해주세요.(4자리)\n");
						scanf("%d", &payCardPassword);
						flag = 0;
						switch (payCardNumber)
						{
						case 1234123412341234: if (payCardPassword == 1234) flag = 1; break;
						case 1111222233334444: if (payCardPassword == 1111) flag = 1; break;
						default: 
							printf("\n\a카드정보를 다시 확인해주세요:-0\n");
							printf("방금 입력하신 카드는 유효하지 않습니다 :-0\n");
							printf(""); break;
						}
						printf("결제를 다시 선택하시겠습니까? (계속 : 1  취소 : 0)");
						scanf("%d", &selectMenu);
						//printf("%d %c", selectMenu, selectMenu);
						if (selectMenu == 1) continue;
						if (payCard >= payValue)
						{
							flag = 1;
							printf("☆★카드승인완료★☆\n");
							payCard = payCard - payValue;
							Sleep(1000);
							break;
						}
						else break;
					}
				}///end of payFlag == 2

				if (flag == 1)
				{
					printf("*******************************************************\n");
					printf("                  구입한 상품 준비 중                  \n");
					Sleep(2000);
					printf(" *  .   ☆★신선한샐러드가 준비되었습니다★☆   *    . \n");
					printf("         *                                  .      .   \n");
					printf("      +    구입후 빠른 시일내에 드십시오 :-)     +.    \n");
					printf("               .    *    .                 *.          \n");
					Sleep(2000);

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
					Sleep(2000);
					printf("               (\n");
					printf("                )\n");
					printf("           __..---..__\n");
					printf("       ,-='0 /. |  o .`=-.\n");
					printf("      :--..___________..--;\n");
					printf("       \.,_____________,./\n");


					//재고값 정리
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


					break;
				}///end of flag==1 결제완료

				printf("결제금액이 모자릅니다. 결재를 다시 선택하시습니까?\n(1:결제선택 2:종료) : ");
				scanf("%d", &selectMenu);
				if (selectMenu == 1) continue;
				else break;
			}///end of for	
		}///end of selectMenuCount == 4
		continue;
	}
	return 0;
}
//*/