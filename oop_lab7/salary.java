class Employee{
float salary=5000; 
float calculateSalary(){
return salary;}

}
class Manager extends Employee{
float calculateSalary(){
return salary+5000;}


}
class Worker extends Employee{
float calculateSalary(){
return salary+1000;}


}
class salary{
public static void main(String []args){
Employee p1= new Employee(); 
Manager p2= new Manager();
Worker p3= new Worker();
System.out.println("Employee salary :"+p1.calculateSalary());
System.out.println("Manager salary :"+p2.calculateSalary());
System.out.println("Worker salary :"+p3.calculateSalary());
}

}