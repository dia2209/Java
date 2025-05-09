public class Employee {
    int id;
    String name;
    String designation;
    int salary;
    
    public void info(int w, String x, String y, int z){
        this.id=w;
        this.name=x;
        this.designation=y;
        this.salary=z;
        System.out.println("Id:"+ this.id);
        System.out.println("Name:"+ this.name);
        System.out.println("Designation:"+this.designation);
        System.out.println("Salary:"+this.salary);
    }
    public void calcSalary(){
       int annu=this.salary *12;
    System.out.println("Annual Salary is " + annu);
    }
}

