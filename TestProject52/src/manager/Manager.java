package manager;

public class Manager {
public int id;
public String name;
int age;
{ // non static block
    System.out.println("manager created");   
}   
 Manager(){
  
 }   
 Manager(int id){
    this.id=id;
 }   
  Manager(int id,String name){
    this.id=id;
    this.name=name;
 }    
}
