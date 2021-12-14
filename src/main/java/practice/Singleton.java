package practice;

public class Singleton {
	// In OOP, a singleton class is a class that can have only one object (instance of a class) at a time.
	// How to design a singleton class:?
	//1. make constructor as private
	//2.write a public static method (getInstance that has return type of object of this singleton class .its also known -
	//- as (lazy initialization)
	
	//difference btn normal class and singleton class:
	//for normal class we use constructor  whereas for singleton --
	//--class we use getinstance() method for instantiation
	
	private static Singleton singleton_instance=null;
	public String str;
	
	//1. make constructor as private
	
	private Singleton()
	{
		str= " Hey I am using singleton class pattern";
	}
	
	// 2.write a public static method that has return type of object of this class
	
	public static Singleton getInstance() {
		
		if (singleton_instance == null)
		
			singleton_instance = new Singleton();
			return singleton_instance;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//no to test, call the method and store in more than one object reference
		 Singleton x=  Singleton.getInstance();
		 Singleton y=  Singleton.getInstance();
		 Singleton z=  Singleton.getInstance();
		 
		  x.str=(x.str).toUpperCase();
		  
		  System.out.println(x.str);
		  // now try to call with y and z
		  System.out.println(y.str);
		  System.out.println(z.str);
		  
		  //now again try to conver to lower case with z
		  
		   z.str= (z.str).toLowerCase();
		   System.out.println(x.str);
		   System.out.println(y.str);
		   System.out.println(z.str);
	}

}
