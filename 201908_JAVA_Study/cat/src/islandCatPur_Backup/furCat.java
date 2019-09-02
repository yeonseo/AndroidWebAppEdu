package islandCatPur_Backup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class furCat {
	private static File file = new File("C:\\Users\\yulga\\OneDrive\\바탕 화면\\한울영수증\\workspace\\islandCat_Horizen\\Config.CatIsland");
	
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
			fur = prop.getProperty("fur");
			System.out.println("****************************");
			System.out.println("Now fur : " + fur);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		/*Get fur*/
		
		try {
			do {
				int fu = Integer.parseInt(fur);
				
				fu += 1;
				System.out.println("get fur. Now fur is " + fu);
				fur = String.valueOf(fu);
				isFur = false;
			} while (isFur);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		/*Value Output*/
		try {
			output = new FileOutputStream("Config.CatIsland");
		
			System.out.println("Fur save : " + fur);
			System.out.println("****************************");
			prop.setProperty("fur", fur);
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
