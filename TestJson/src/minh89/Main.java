package minh89;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;




public class Main {

	public static void main(String[] args) {
		String data = "";
		try {
			URL url = new URL("http://localhost:3000/users");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 
			conn.setRequestMethod("GET");
			conn.connect();
			Scanner sc = new Scanner(url.openStream());
			while(sc.hasNext())
			{
				data+=sc.nextLine();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		JSONArray jsonArray = new JSONArray(data);
		System.out.println("danh sach key");
	    for (int i = 0; i < jsonArray.length(); i++) {
	    	JSONObject jsonObject =  (JSONObject) jsonArray.get(i);
			Service.showkeys(jsonObject,0);
			
		}
	   
	    
	    for (Key key : Service.listKey) {
			for (int i = 0; i < key.getParent(); i++) {
				System.out.print("\t");
			}
			System.out.println(key.getKey());
		}
	    
	    System.out.println("vui long nhap key: ");
	    Scanner scanner = new Scanner(System.in);
	    String keyUser = scanner.nextLine();
	    Service.getData(keyUser,jsonArray);
	   
	}

}
