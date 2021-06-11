package minh89;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;


public class Service {

	public static List<Key> listKey = new ArrayList<Key>();
	
	
	
	public static void handleJson(JSONArray jsonArray) {
		
	}
	
	public static void showkeys(JSONObject jsonObject,int parent) {
		if(!jsonObject.isEmpty()) {
			parent++ ;
			Iterator<?> keys = jsonObject.keys();
			while( keys.hasNext() ) {
			    String key = (String) keys.next();
			    addKey(key, parent);
			    try {	
			    	
			    	showkeys(jsonObject.getJSONObject(key), parent);
			    	
			    	
				} catch (Exception e) {
					try {
						JSONArray array = new JSONArray(jsonObject.getJSONArray(key).toString());
						for (int i = 0; i < array.length(); i++) {
							showkeys( array.getJSONObject(i), parent);
						}
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
			
		} else {
			return ;
		}
	}
	public static void addKey(String keyNew,int parent) {
		for (Key key : listKey) {
			if(key.getKey().equals(keyNew) && key.getParent() == parent) {
				return ;
			}
		}
		listKey.add(new Key(keyNew, parent));
	}
	
	public static void getData(String key,JSONArray array) {
		for (int i = 0; i < array.length(); i++) {
			Service.getArray(array.getJSONObject(i), key);
		}
		
	}
	
	public static void getArray(JSONObject jsonObject,String keyUser) {
		if(!jsonObject.isEmpty()) {
			
			Iterator<?> keys = jsonObject.keys();
			while( keys.hasNext() ) {
			    String key = (String) keys.next();
			   
			    try {	
			    	 if(key.equals(keyUser)) {
				    		System.out.println(jsonObject.getJSONObject(key).toString());
			    	 }
			    	getArray(jsonObject.getJSONObject(key), keyUser);
			    	
			    	
				} catch (Exception e) {
					try {
						JSONArray array = new JSONArray(jsonObject.getJSONArray(key).toString());
						if(key.equals(keyUser)) {
				    		System.out.println(key + " " + array.toString());
						}
						for (int i = 0; i < array.length(); i++) {
							getArray( array.getJSONObject(i), keyUser);
						}
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
			
		} else {
			return ;
		}
	}
}
