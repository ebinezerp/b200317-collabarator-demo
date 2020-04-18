public class Employee {
   
   private String name;
   private Integer id;
   private Integer age;
   
   
   
   public Employee(){
   
   
   }
   
   
   /* changes done*/
   public Employee( Integer id,String name,  Integer age){
  
  this.id=id;
   this.name= name;
   this.age=age;
   
   }
   public void setName(String name){
   this.name=name;
   
   }
   public void setId(Integer id){
   this.id=id;
   
   }
   
   public void setName(Integer age){
   this.age=age;
   
   }
   public String getName(){
   return name;
   
   }
    public Integer getId(){
   return id;
   
   }
    public Integer getAge(){
   return age;
   
   }
   
   
   

}