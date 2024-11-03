public class Employee {
    private String id ;
    private String name;
    private double salary;

    Employee(String id, String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

public  double getAnnualSalary (){
        return getSalary()*12;
}

public void raisedSalary ( int percent){
      double  bonus= this.getSalary()*percent/100;
        this.salary= getSalary()+ bonus;
}


    public String toString() {
        return "Employee{" +
                "id=" + getId()  +
                " name=" + getName() +
                " salary=" + getSalary() +
                '}';
    }
}
