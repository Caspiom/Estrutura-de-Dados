package stringBox;

import java.util.Random;

public class StringBOx {
	
	private String[] names;
	private String[] registration;
	private int size;
	private int capacity;
	Random ran = new Random();
	int x;
	
	public StringBOx() {
		size = 0;
		capacity = 5;
		names = new String[capacity];
		registration = new String[capacity];
	}
	
	public StringBOx(int capacity) {
		size = 0;
		this.capacity = capacity;
		names = new String[capacity];
		registration = new String[capacity];
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	private void IncreaseIfNecessary() {
		if (size==capacity) {
			 String[] newElementsName = new String[capacity*=2];
			 for(int i = 0; i<size;i++)
				 newElementsName[i]=names[i];
			 names=newElementsName;
			 
			 String[] newElementsRes = new String[capacity*=2];
			 for(int i = 0; i<size;i++)
				 newElementsRes[i]=registration[i];
			 registration=newElementsRes;
		}
	}
	
	public void setThisNameAndRes(String names, String registration) {
		IncreaseIfNecessary();
		this.names[size]=names;
		this.registration[size]=registration;
		size++;	
	}
	

	public String getAName() {
		x = ran.nextInt(size);
		return names[x];	
	}
	
	public String getARes() {
		return registration[x];	
	}
	
	public String [] getANameAndRes() {
		x = ran.nextInt(size);
		String [] NameRes = new String[2];
		NameRes[0] = names[x];
		NameRes[1] = registration[x];
		return NameRes;
	}
	

}
