/*
#include <stdio.h>
#include <windows.h>


//salad
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
int selectMenu = 0;
int selectMenuCount = 0;
char selectMenuChar = ' ';

int main(void)
{
	for (;;) ///�޴�����
	{
		printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		printf("��  .   *      .*      *.      .'      *       +      ��\n");
		printf("��   +         +*    *������ ������*       .          ��\n");
		printf("�� .  ���ϴ� ���� ������ �����带 ����� �Ծ��     ��\n");
		printf("��        .      *.       .+    .   '    .'   +*      ��\n");
		printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		Sleep(1000);


		int i = 0, flag=0;

		printf("\n");
		printf("  ���� ���������� ��ٱ��Ͽ� ���� �޴��� ������ �ּ���.\n");
		printf("  ��� ������ ���� �Ŀ�, E.��������(���)�� �����մϴ�.\n");
		printf("                                                       \n");
		printf("      1.ä��  2.����  3.�ҽ� �Է�  4.��������(���)  \n");
		printf(" �޴� ������ �Ͻðڽ��ϱ�? ( ���� : ����   ���� : 0 ) :");

		scanf("%d", &selectMenuCount);

		if (selectMenuCount ==0) continue;
	
		if (selectMenuCount == 1)
		{
			printf("********************************************************\n");
			printf("                         *ä��*   \n");
			printf("********************************************************\n");

			for (;; )
			{
				for (i = 1; i < 5; i++) printf("%d. %14s  : %5d�� (�������� : %2d) \n", i, saladName[i], saladPrice[i], saladStore[i] - saladUser[i]);
				printf("���հ� : %5d��\n", payValue);
				printf("1-4 �� �޴� �߿��� �޴��� ����ּ���.( 0 : ���� ȭ��)\n");


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
						printf("\n*���� ��ٱ��Ͽ� �Ʒ��� ��ǰ�� �߰��մϴ�*\n");
						for (i = 0; i < 5; i++)
						{
							if (saladUser[i] != 0) printf("%14s : %2d�� %5d��\n", saladName[i], saladUser[i], saladUser[i] * saladPrice[i]);
						}
						printf("\n");
						break;
					}
				default: break;
				}
				if (selectMenu == 0) break;
			}
		}///end of if 1.ä��
		
		if (selectMenuCount == 2)
		{
			printf("********************************************************\n");
			printf("                         *����*   \n");
			printf("********************************************************\n");

			for (;; )
			{
				for (i = 1; i < 5; i++) printf("%d. %14s  : %5d�� (�������� : %2d) \n", i, toppingName[i], toppingPrice[i], toppingStore[i] - toppingUser[i]);
				printf("���հ� : %5d��\n", payValue);
				printf("1-4 �� �޴� �߿��� �޴��� ����ּ���.( 0 : ���� ȭ��)\n");


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
						printf("\n*���� ��ٱ��Ͽ� �Ʒ��� ��ǰ�� �߰��մϴ�*\n");
						for (i = 0; i < 5; i++)
						{
							if (toppingUser[i] != 0) printf("%14s : %2d�� %5d��\n", toppingName[i], toppingUser[i], toppingUser[i] * toppingPrice[i]);
						}
						printf("\n");
						break;
					}
				default: break;
				}
				if (selectMenu == 0) break;
			}
		}///end of if 2.ä��

		if (selectMenuCount == 3)
		{
			printf("********************************************************\n");
			printf("                         *�ҽ�*   \n");
			printf("********************************************************\n");

			for (;; )
			{
				for (i = 1; i < 5; i++) printf("%d. %14s  : %5d�� (�������� : %2d) \n", i, sourceName[i], sourcePrice[i], sourceStore[i] - sourceUser[i]);
				printf("���հ� : %5d��\n", payValue);
				printf("1-4 �� �޴� �߿��� �޴��� ����ּ���.( 0 : ���� ȭ��)\n");


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
						printf("\n*���� ��ٱ��Ͽ� �Ʒ��� ��ǰ�� �߰��մϴ�*\n");
						for (i = 0; i < 5; i++)
						{
							if (sourceUser[i] != 0) printf("%14s : %2d�� %5d��\n", sourceName[i], sourceUser[i], sourceUser[i] * sourcePrice[i]);
						}
						printf("\n");
						break;
					}
				default: break;
				}
				if (selectMenu == 0) break;
			}
		}///end of if 3.�ҽ�

		if(selectMenuCount == 4)
		{
			for (;;)
			{
				printf("********************************************************\n");
				printf("                         *����*   \n");
				printf("********************************************************\n");

				printf("  *�� �����ݾ� : %6d��  *�� ���Ա޾� : %6d��\n", payValue, payCoin);

				printf("��������� ������ �ּ���. 1.���� 2.ī��   : ");

				int payFlag = 0;
				scanf("%d", &selectMenu);
				switch (selectMenu)
				{
				case 1: printf("�������� �����մϴ� ~���䨬~\n"); payFlag = 1; break;
				case 2: printf("ī������ �����մϴ� ~���䨬~\n"); payFlag = 2; if (payCard >= payValue) flag = 1; break;
				case 123456789: break;//�����ڸ��
				}

				if (payFlag == 1)
				{
					for (; ; )
					{
						int inputMoney = 0;
						printf("���� ���Աݾ� : %6d\n", payCoin);
						printf("���� ���� ȭ�� (100,500,1000,5000,10000) : ");

						scanf("%d", &inputMoney);
						switch (inputMoney)
						{
						case 100: case 500: case 1000: case 5000: case 10000:
							payCoin = payCoin + inputMoney; break;
						default: printf("\a�Է��Ͻ� �ݾ��� Ȯ�����ּ���:-0\n��� �Է��Ͻ� %d�� ��ȿ�Դϴ�!\n", inputMoney); break;
						}
						printf("�ݾ��� �� �Է��Ͻðڽ��ϱ�? (��� : 1  ��� : 0)");
						scanf("%d", &selectMenu);
						//printf("%d %c", selectMenu, selectMenu);
						if (selectMenu == 1) continue;
						if (payCoin >= payValue)
						{
							flag = 1;
							printf("     ���ܵ� �غ� �ߡ�  ");
							Sleep(1000);
							printf("�� �� �� ");
							Sleep(1000);
							printf("%d���� ��ȯ�մϴ�.\n", payCoin - payValue);
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
						printf("\n���� ���Աݾ� : %5d\n", inputMoney);
						printf("ī�� ��ȣ�� �Է����ּ���.(16�ڸ�)\n");
						scanf("%d", &payCardNumber);
						printf("��й�ȣ�� �Է����ּ���.(4�ڸ�)\n");
						scanf("%d", &payCardPassword);
						flag = 0;
						switch (payCardNumber)
						{
						case 1234123412341234: if (payCardPassword == 1234) flag = 1; break;
						case 1111222233334444: if (payCardPassword == 1111) flag = 1; break;
						default: 
							printf("\n\aī�������� �ٽ� Ȯ�����ּ���:-0\n");
							printf("��� �Է��Ͻ� ī��� ��ȿ���� �ʽ��ϴ� :-0\n");
							printf(""); break;
						}
						printf("������ �ٽ� �����Ͻðڽ��ϱ�? (��� : 1  ��� : 0)");
						scanf("%d", &selectMenu);
						//printf("%d %c", selectMenu, selectMenu);
						if (selectMenu == 1) continue;
						if (payCard >= payValue)
						{
							flag = 1;
							printf("�١�ī����οϷ�ڡ�\n");
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
					printf("                  ������ ��ǰ �غ� ��                  \n");
					Sleep(2000);
					printf(" *  .   �١ڽż��ѻ����尡 �غ�Ǿ����ϴ١ڡ�   *    . \n");
					printf("         *                                  .      .   \n");
					printf("      +    ������ ���� ���ϳ��� ��ʽÿ� :-)     +.    \n");
					printf("               .    *    .                 *.          \n");
					Sleep(2000);

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
					Sleep(2000);
					printf("               (\n");
					printf("                )\n");
					printf("           __..---..__\n");
					printf("       ,-='0 /. |  o .`=-.\n");
					printf("      :--..___________..--;\n");
					printf("       \.,_____________,./\n");


					//��� ����
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
				}///end of flag==1 �����Ϸ�

				printf("�����ݾ��� ���ڸ��ϴ�. ���縦 �ٽ� �����Ͻý��ϱ�?\n(1:�������� 2:����) : ");
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