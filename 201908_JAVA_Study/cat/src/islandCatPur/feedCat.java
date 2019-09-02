package islandCatPur;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class feedCat {
	private static File file = new File("C:\\Users\\yulga\\OneDrive\\바탕 화면\\한빛 1호기 제4주기 1차\\Ready\\islandCat_Horizen\\Config.CatIsland");

	static String hunger;
	static String feed;
	static String hungerLimit;
	static String feedItem;
	private static boolean isFeed;
	//클릭할 때 마다 사료를 주기
		//Music을 참고해서 실행한다.
		//아이콘은
		/* 1. 사료
		 *  x 누르면 배고픔을 +한다.
		 *   - 처음 시간을 저장하고, 시간이 지나면 배고파한다
		 * 2. 종료하기
		 *  - exit
		 * 3. 사료구매하기
		 *  - add 주는 횟수
		 * 4. 메뉴로 돌아가기
		 *  - 궁극적으로 하고 싶은 메뉴
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
