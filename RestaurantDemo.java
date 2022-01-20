
import java.util.Scanner;

interface Food{
   void setType(String t);
   double calculatePrice();
}

class Pizza implements Food{
    String size;
    String type;
    double price;

    public void setType(String t){
        type = t;
    }

    public double calculatePrice(){

        if(size == "Small" && type == "Veg"){
            price = 80;
        }else if(size == "Small" && type == "Non-Veg"){
            price = 125;
        }else if(size == "Medium" && type == "Veg"){
           price = 175;
        }else if(size == "Medium" && type == "Non-Veg"){
            price = 225;
        }else if(size == "Large" && type == "Veg"){
            price = 250;
        }else if(size == "Large" && type == "Non-Veg"){
            price = 275;
        }
        return price;
    }

    public void setSize(String s){
        size = s;
    }
}

class Lasagne implements Food{
    String type;
    double price;

    public void setType(String t) {
        type = t;
    }

    public double calculatePrice() {
        if(type=="Veg"){
            price = 200;
        }else{
            price = 300;
        }
        return price;
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza p = new Pizza();
        Lasagne l = new Lasagne();

        System.out.println("What do you like to have today:" +
                "\n1.Pizza\n2.Lasagne\n");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("What type of pizza do you want: " +
                    "\n1.Veg\n2.Non-Veg\n");
            n=  sc.nextInt();
            if(n==1) {
                p.setType("Veg");
            }else if(n==2){
                p.setType("Non-Veg");
            }
            System.out.println("Select the Size of your pizza: " +
                    "\n1.Small\n2.Medium\n3.Large");
            n = sc.nextInt();
            if(n==1){
                p.setSize("Small");
            }else if(n==2){
                p.setSize("Medium");
            }else{
                p.setSize("Large");
            }
            System.out.println("Type of the Pizza is: "+p.type);
            System.out.println("Size of the Pizza is: "+p.size);
            System.out.println("The total price of your pizza is: Rs."+p.calculatePrice());
            System.out.println("Thank you!Please do visit again!");
        }else{
            System.out.println("What type of Lasagne do you want: " +
                    "\n1.Veg\n2.Non-Veg\n");
            n = sc.nextInt();
            if(n==1) {
                l.setType("Veg");
            }else if(n==2){
                l.setType("Non-Veg");
            }
            System.out.println("Type of your Lasagne is: "+l.type);
            System.out.println("The total price of your lasagne is: Rs."+l.calculatePrice());
            System.out.println("Thank you!Please do visit again!");
        }



    }
}
