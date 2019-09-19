package chapter18.url;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {

	public static void main(String[] args) throws IOException {
		
		/*Html print*/
//		URL url = new URL("http://www.naver.com:80/index.html");
//		URL url = new URL("http://www.nate.com:80/index.html");
		URL url = new URL("https://www.pinterest.co.kr/fb.html");
		
		URLConnection urlCon = url.openConnection();
		InputStream is = urlCon.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String data = null;
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		if(br != null) { br.close(); }
		
		
		/*File*/
		URL urlImage = new URL("https://coleandmarmalade.com/wp-content/uploads/2019/06/cat-4262034_1280-e1561555501321.jpg");
		
		URLConnection urlConImage = urlImage.openConnection();
		InputStream isImage = urlConImage.getInputStream();
		BufferedInputStream brImage = new BufferedInputStream(isImage);
		
		File file = new File("dog.jpg");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
		byte[] buffer = new byte[1024];
		int size=0;
		while((size=brImage.read(buffer))!=-1) {
			//System.out.println(data);
			bos.write(buffer, 0, size);
		}
		if(brImage != null) { brImage.close(); }
		if(bos != null) { bos.close(); }
		System.out.println("Done");
		
	}
//	public static void main(String[] args) throws IOException {
////		URL url = new URL("http://www.naver.com:80/index.html");
//		URL url = new URL("http://www.nate.com:80/index.html");
//		
//		URLConnection urlCon = url.openConnection();
//		InputStream is = urlCon.getInputStream();
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
//		String data = null;
//		while((data=br.readLine())!=null) {
//			System.out.println(data);
//		}
//		if(br != null) { br.close(); }
//	}

}
