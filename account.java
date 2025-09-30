import java.util.Scanner;

public class Account { //宣告一個類別
     private String name; 
     //設定變數只能在此類別內部存取(只能透過setName getName存取)
     // 變數private，外部不能隨便更改、除錯可以只setName裡
    public void setName(String name){ //設定帳戶
        this.name = name; //this物件 參數name的值存到物件屬性
    }
    public String getName(){
            return name; //回傳物件中的name
    }

    public static void main (String []args ){
        Scanner input = new Scanner(System.in);

        account myAccount = new account();
        System.out.printf("Initial name is: %s%n%n" ,myAccount.getName());

        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount is :%n%s%n", myAccount.getName());
        input.close();
    }

}
