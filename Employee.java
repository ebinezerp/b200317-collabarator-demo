public class Employee {
   
   private String name;
   private Integer id;
   private Integer age;
   
   
   
   public Employee(){
   
   
   }
   
   /* please chage the order to id,name,age */
   public Employee(String name, Integer id, Integer age){
   
   this.name= name;
   this.id=id;
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