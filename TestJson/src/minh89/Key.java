package minh89;

public class Key {

	private String key;
	
	
	
	private int parent;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public Key(String key, int parent) {
		super();
		this.key = key;
		this.parent = parent;
	}
	
	
}
