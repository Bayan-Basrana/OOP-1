public class Account {
    private String id;
    private String name;
    private int balance ;


    Account (String id , String name ){
        this.id=id;
        this.name=name;
    }


    Account (String id , String name , int balance){
        this.id=id;
        this.name=name;
        this.balance= balance;
    }


    public void setId(String id) {
        this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void debit (int amount){
        if(getBalance()==0)
            System.out.println(" your balance is zero ");
        else if (getBalance()< amount) {
            System.out.println(" your balance is less than " + amount);
        }
        else
        {
            this.balance= getBalance()-amount;
        }
    }

    public void credit (int amount){
        if (amount<=0){
            System.out.println(" invalided ");}
        else {
            this.balance= getBalance()+amount;
        }
    }

    public void transferTo (Account another , int amount){
        if (getBalance()< amount){
            System.out.println(" the balance is less than the amount");}
        else
            another.debit(amount);
    }

    public String toString() {
        return "Account{" +
                "id= " + getId()  +
                " name= " + getName()  +
                " balance= " + getBalance() +
                '}';
    }
}
