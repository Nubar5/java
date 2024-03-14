package main;
public class Main {
    
    
public static void main(String[] args) {
   Person.companyName="Hellos";
   Person p =new Person(5);//
   Person p1=new Person();
   p.age=23;  
   p.printId();
   p1.printId();
   System.out.println(p.companyName);
   p.companyName="changedName"; 
   System.out.println(Person.companyName);     
    System.out.println();    
    System.out.println();    
    }
    
}
