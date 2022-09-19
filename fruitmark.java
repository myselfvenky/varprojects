import java.util.Scanner;

public class fruitmark {

    product[] product;
    int applecount = 0;
    int bananacount = 0;
    int kiwicount = 0;
    int sum = 0;

    fruitmark(String[] names, int price[]) {
        this.product = new product[names.length];
        for (int i = 0; i < names.length; i++) {
            product[i] = new product(names[i], price[i]);
        }
    }
    public void getProducts(Scanner sc) {
        int a;
        do {
            System.out.println("Here are the list of products available in fruitmark :");
            for (int i = 0; i < this.product.length; i++) {
                System.out.println(i + 1 + ") " + this.product[i].getDetails());
            }
            System.out.println("4) Quit");
            System.out.print("Enter the number of fruit to add to cart : ");
            a =  sc.nextInt();
switch(a){
    case 1:
        applecount += 1;
        System.out.println("Apples in basket : " + this.applecount);
        break;
    case 2:
        bananacount += 1;
        System.out.println("Bananas in basket : " + this.bananacount);
        break;
    case 3:
        kiwicount += 1;
        System.out.println("Kiwis in basket : " + this.kiwicount);
        break;
    default:
        System.out.println("Choose Correct option...");
}
        } while (a!=4);
    }

    public void createBill() {
        System.out.println("------------The Bill------------");
        if (applecount > 0)
           System.out.println("Apples : " + this.applecount);
       if (bananacount > 0)
           System.out.println("Bananas : " + this.bananacount);
       if (kiwicount > 0)
           System.out.println("Kiwis : " + this.kiwicount);
       System.out.println("------------Total------------");
        System.out.println(applecount *10 +  bananacount  *20 + kiwicount * 30);
  
    }


    public void getBill() {
        this.createBill();

    }

    public static void main(String[] args) {
        String names[] = { "Apple", "Banana", "Kiwi" };
        int price[] = { 10, 20, 30 };
        System.out.println("Welcome to FruitMark");
        fruitmark fm = new fruitmark(names, price);
       
        Scanner sc = new Scanner(System.in);
        int ans;
        do {
            System.out.println("Choose an option: ");
            System.out.println("1) Starting shopping");
            System.out.println("2) Show the bill");
            System.out.println("3) Leave the shop");
            ans = sc.nextInt();
            switch (ans) {
                case 1:
                fm.getProducts(sc);
                    break;
                case 2:
                    fm.getBill();
                    ans = 3;
                    break;
                default:
                    System.out.println("Choose Correct option");
            }
        } while (ans!= 3);

    }
}

class product {
    String name;
    int price;

    product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int getprice() {
        return this.price;
    }

    public String getDetails() {
        return " Name of Fruit : " + this.name +" | price :  " +  this.price;
    }

}