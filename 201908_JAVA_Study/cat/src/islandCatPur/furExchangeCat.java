package islandCatPur;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class furExchangeCat{
	private static File file = new File("C:\\Users\\yulga\\OneDrive\\바탕 화면\\한빛 1호기 제4주기 1차\\Ready\\islandCat_Horizen\\Config.CatIsland");
	
	static String hunger;
	static String feed;
	static String hungerLimit;
	static String feedItem;
	static String fur;
	private static boolean isFur = true;

	
	public static void propCat() {
		Properties prop = new Properties();
		InputStream input = null;
		OutputStream output = null;
		
		
		/*Value Input*/
		try {
			input = new FileInputStream(file);
			prop.load(input);
			feedItem = prop.getProperty("feedItem");
			fur = prop.getProperty("fur");
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		
		
		/*Exchange fur to feed*/
		try {
			do {
				int fi = Integer.parseInt(feedItem);
				int fu = Integer.parseInt(fur);
				System.out.println("****************************");
				System.out.println("Ready Exchange fur. Now fur is " + fu);
				if (fu >= 9) {
					fu -= 10;
					fi += 1;
				System.out.println("Exchanged fur. Now fur is " + fu);
				System.out.println("Exchanged fur. Now FeedItem is " + fi);
				} else if (fu <= 9) {
					System.out.println("More Get Fur!");
				}
				
				/*Integer -> String*/
				fur = String.valueOf(fu);
				feedItem = String.valueOf(fi);
				isFur = false;
			} while (isFur);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		/*Value Output*/
		try {
			output = new FileOutputStream("Config.CatIsland");
		
			System.out.println("Fur, FeedItem save : " + fur +"," + feedItem);
			System.out.println("****************************");
			prop.setProperty("fur", fur);
			prop.setProperty("feedItem", feedItem);
			prop.store(output, null);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
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
