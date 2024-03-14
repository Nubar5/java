
package encapsulation;

public class Book {
  private int id;
  private String name;
  private double cost;
 public void setName(){
     this.name=name;
 } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
 
 public void setId(int id){
     if(id>0){
      this.id=id;   
     }
  
 } 
 public int getId(){
     return id;
 }
 public Book(int id,String name, double cost){
  this.cost=cost;
  this.id=id;
  this.name=name;
 }
 public Book(){
     
 }
  @Override
 public String toString(){
    return "book-"+this.id+" "+this.name+" "+this.cost+"";
 }
  
  
    
    
    
    
}
