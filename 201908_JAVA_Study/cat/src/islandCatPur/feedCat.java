package islandCatPur;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class feedCat {
	private static File file = new File("C:\\Users\\yulga\\OneDrive\\���� ȭ��\\�Ѻ� 1ȣ�� ��4�ֱ� 1��\\Ready\\islandCat_Horizen\\Config.CatIsland");

	static String hunger;
	static String feed;
	static String hungerLimit;
	static String feedItem;
	private static boolean isFeed;
	//Ŭ���� �� ���� ��Ḧ �ֱ�
		//Music�� �����ؼ� �����Ѵ�.
		//��������
		/* 1. ���
		 *  x ������ ������� +�Ѵ�.
		 *   - ó�� �ð��� �����ϰ�, �ð��� ������ ������Ѵ�
		 * 2. �����ϱ�
		 *  - exit
		 * 3. ��ᱸ���ϱ�
		 *  - add �ִ� Ƚ��
		 * 4. �޴��� ���ư���
		 *  - �ñ������� �ϰ� ���� �޴�
		 *  */
	public static void propCat() {
		Properties prop = new Properties();
		InputStream input = null;
		OutputStream output = null;

		/*Value Input*/
		try {
			input = new FileInputStream(file);
			prop.load(input);
			hunger = prop.getProperty("hunger");
			feed = prop.getProperty("feed");
			hungerLimit = prop.getProperty("hungerLimit");
			feedItem = prop.getProperty("feedItem");
			System.out.println("****************************");
			
			System.out.println("hunger before : " + hunger);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		/*feeding*/
		try {
			do {
				/*String -> Integer*/
				int hu = Integer.parseInt(hunger);
				int fe = Integer.parseInt(feed);
				int hl = Integer.parseInt(hungerLimit);
				int fi = Integer.parseInt(feedItem);
				/*if feeding*/
				
				if ((hu+fe) <= hl) {
					if (fi == 0) {
						System.out.println("You don't have anything?? huh???" +"\n"+ "Cat was sadful");
						isFeed = false;
					} else if (fi >0  ) {
					hu = hu + fe;
					fi-=1;
					System.out.println("Cat Yam yam!"+ "\n" + "Now hunger : " +hu);
					System.out.println("feedItem : " + fi);
					isFeed = false;
					}
				}  else if ((hu+fe) >= hl) {
					System.out.println("Cat is full.");
					isFeed = false;
				}
				
				/*Integer -> String*/
				hunger = String.valueOf(hu);
				feedItem = String.valueOf(fi);
				
			} while (isFeed);
		} catch (Exception e) {	
			System.out.println(e.getMessage());
		}

		/*Value Output*/
		try {
			output = new FileOutputStream("Config.CatIsland");
			
			System.out.println("hunger save : " + hunger);
			System.out.println("feedItem : " + feedItem);
			System.out.println("****************************");
			prop.setProperty("hunger",hunger);
			prop.setProperty("feedItem",feedItem);
			prop.setProperty("time","");
			
			/* 
			prop.setProperty("feed",feed);
			prop.setProperty("hungerLimit",hungerLimit);
			*/
			prop.store(output, null);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (Exception ee) {
					ee.printStackTrace();
				}
			}
		}
	}
}
