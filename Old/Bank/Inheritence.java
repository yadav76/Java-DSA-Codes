import Bank.*;

class Shape{

    String color;

    public void area(String area){
        System.out.println(area);
    }

}

class Triangle extends Shape{    // class Triangle inherites the properties of Shape class

    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

    private String password;

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";            // Here color property is not defined in Triangle class but because Triangle is Iheriting the properties of Shape class we can use color property  

        // Bank.Account a1 = new Account();

        // a1.account();

        t1.setPassword("abcd");

        System.out.println(t1.getPassword());
    }
}
