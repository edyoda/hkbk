package oops.concept;

public class Singleton
{
    public static void main(String args[])
    {
     	
    	SingletonClass st = SingletonClass.getInstanceUsingDoubleLocking();
    	System.out.println(st.str);
    
    }
}

class SingletonClass {
	
	static String str= "xyz";

    private static SingletonClass instance;
    
    private SingletonClass(){
    	
    }
    /*public static SingletonClass getInstance()
    {
    if(instance == null)
    	instance = new SingletonClass();
    	return instance;
    	
    }*/
    
    
    
    public static SingletonClass getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (SingletonClass.class) {
                if(instance == null){
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }
    
}


    
