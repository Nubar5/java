package encapsulation;
public class Main {
    public static void main(String[] args) {
      
Book b=new Book();
b.setId(2);
b.setCost(30);
b.setName("Wolter");
Book b1=new Book(1, "Travel", 50);
System.out.println(b.toString());    
System.out.println(b1.toString());        
        
        
    }
    
}
