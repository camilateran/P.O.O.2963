
package singleton.controller;


public class Singleton {
    private String name;
    private static Singleton singleton ;
    private Singleton(String name){
        this.name = name;
        System.out.println("My name is: "+this.name);
    }

        public void staticInstance(){
        
        }
        public void singletonOperation(){
            
        }
        public static Singleton getSingletonData(String name){
            if(singleton == null){
                singleton = new Singleton(name);
            }
            else{
                System.out.println("Object " +name+ " all ready exist");
            }
            return singleton;
        }

    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Singleton getSingleton() {
        return singleton;
    }

    public static void setSingleton(Singleton singleton) {
        Singleton.singleton = singleton;
    }
        
        
        
    
}
