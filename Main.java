import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Employee employee1= new Employee("1234","bayan",10000.0);
Employee employee2= new Employee("1235", "Ahmed",20000.0);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

employee2.setName("Ahmed Mohammed");
employee2.setSalary(25000);
        System.out.println(employee2.toString());

        System.out.println(" th annual Salary :");
        System.out.println("annual Salary for " + employee1.getName()
           +" " +employee1.getAnnualSalary() );
        System.out.println("annual Salary for " + employee2.getName()
                +" " +employee2.getAnnualSalary() );
        System.out.println();
        employee1.raisedSalary(5);
        employee2.raisedSalary(2);
        System.out.println( "Salary after 5% increase= " +employee1.getSalary());
        System.out.println( "Salary after 2% increase= " +employee2.getSalary());
        System.out.println();
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");

//Account 
        Account account1= new Account("0001","bayan");
        Account account2 = new Account("0002" ,"Ahmed", 10000);

        System.out.println(account1.toString());
        System.out.println(account2.toString());
//try to debit empty balance
        account1.debit(1000);
        System.out.println("the balance in "+ account1.getName()+ " account after debit " +account1.getBalance());
// now add 1000 to the bayan account
        account1.credit(2000);
        System.out.println("the balance in "+ account1.getName()+ " account after credit " +account1.getBalance());
        // now I will try debit
        account1.debit(1000);
        System.out.println("the balance in "+ account1.getName()+ " account after debit " +account1.getBalance());

// transfer from account Ahmed to account bayan
        account2.transferTo(account1, 500);
        System.out.println( "the balance in "+ account1.getName()+ " account after the transfer from "+
                account2.getName() + " " +account1.getBalance());

        //the accounts after
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
