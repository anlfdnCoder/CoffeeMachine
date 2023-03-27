package CoffeeMachine;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<TypeOfCoffee> liste = new ArrayList<>();

        CoffeeMachine coffeeMachine = new CoffeeMachine("Team113 Caffe-House");

        TypeOfCoffee americano1 = new Americano("Americano-Muster","small-Muster","no",1.50);
        TypeOfCoffee cappucino1 = new Cappucino("Cappicino-Muster","middle-Muster","no",2.00);
        TypeOfCoffee coffeeLatte1 = new CaffeLatte("cafeLatte-Muster","middle-Muster","no",2.00);


        System.out.println("Welcome to team 113 cafe-House");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please slot coin to machine");
        double leftoverMoney = scanner.nextDouble();
        scanner.nextLine();
        boolean flag = true;
        String coffeeName ="";
        int selectSizePrice;
        String coffeeStringSize="";
        double coffeePrice;
        int sugarType;
        String selectedSugar="";


        while (flag){
            ListOfCoffee.coffeList();
            int selectCoffee = scanner.nextInt();
            scanner.nextLine();
            switch (selectCoffee){
                case 1:
                    coffeeName = "Americano";
                    americano1.caffeSizePreisList();
                    selectSizePrice = scanner.nextInt();
                    scanner.nextLine();
                    coffeeStringSize = americano1.coffeeSizeString(selectSizePrice,leftoverMoney);
                    coffeePrice = americano1.coffeeSizePrice(selectSizePrice);
                    if (coffeeStringSize.equals("your coin is not enough")){
                        System.out.println("your coin is not enough for "+coffeeName);


                    }else {
                        SugarList.listOfSugar();
                        System.out.println("select your sugar type please");
                        sugarType = scanner.nextInt();
                        selectedSugar = americano1.sugarType(sugarType);
                        TypeOfCoffee americano = new Americano(coffeeName,coffeeStringSize,selectedSugar,coffeePrice);//constructor
                        coffeeMachine.addKahve(americano);
                        leftoverMoney-=coffeePrice;
                    }
//                    leftoverMoney-=coffeePrice;

                    break;
                case 2:
                    coffeeName = "Cappucino";
                    cappucino1.caffeSizePreisList();
                    selectSizePrice = scanner.nextInt();
                    scanner.nextLine();
                    coffeeStringSize = cappucino1.coffeeSizeString(selectSizePrice,leftoverMoney);
                    coffeePrice = cappucino1.coffeeSizePrice(selectSizePrice);
                    if (coffeeStringSize.equals("your coin is not enough")){
                        System.out.println("your coin is not enough for "+coffeeName);

                    }else {
                        SugarList.listOfSugar();
                        System.out.println("select your sugar type please");
                        sugarType = scanner.nextInt();
                        selectedSugar = cappucino1.sugarType(sugarType);
                        TypeOfCoffee cappucino = new Cappucino(coffeeName,coffeeStringSize,selectedSugar,coffeePrice);;//constructor
                        coffeeMachine.addKahve(cappucino);
                        leftoverMoney-=coffeePrice;

                    }
//                    leftoverMoney-=coffeePrice;
                    break;

                case 3:
                    coffeeName ="CafeLatte";
                    coffeeLatte1.caffeSizePreisList();
                    selectSizePrice = scanner.nextInt();
                    scanner.nextLine();
                    coffeeStringSize = coffeeLatte1.coffeeSizeString(selectSizePrice,leftoverMoney);
                    coffeePrice = coffeeLatte1.coffeeSizePrice(selectSizePrice);
                    if ((coffeeStringSize.equals("your coin is not enough"))){
                        System.out.println("your coin is not enough for "+coffeeName);

                    }else {
                        SugarList.listOfSugar();
                        System.out.println("select your sugar type please");
                        sugarType = scanner.nextInt();
                        selectedSugar = coffeeLatte1.sugarType(sugarType);
                        TypeOfCoffee coffeeLatte = new CaffeLatte(coffeeName,coffeeStringSize,selectedSugar,coffeePrice);//constructor
                        coffeeMachine.addKahve(coffeeLatte);
                        leftoverMoney-=coffeePrice;

                    }
//                    leftoverMoney-=coffeePrice;
                    break;

                default:
                    System.out.println("you selected amy coffee,which is not in the coffe-List");
            }
//            System.out.println("your leftover money: "+leftoverMoney+" euro ");
            if (leftoverMoney>=1.00 && (!coffeeStringSize.equalsIgnoreCase("your coin is not enough"))){
                System.out.println(coffeeStringSize);
                System.out.println("your leftover money: "+leftoverMoney+" euro ");
                Duration d = Duration.ofSeconds(5);
                System.out.println("they are being prepared in "+d.getSeconds()+" second");
                System.out.println("your coffee is ready");
                System.out.println("Do you wanna order more?"+
                        "\ny or n");
                String cikis = scanner.next();
                if (cikis.equalsIgnoreCase("n")){
                    flag = false;
                }

            } else if (coffeeStringSize.equals("your coin is not enough")) {
                System.out.println("\"please try it again\"");
            } else if (leftoverMoney < 1.00 && leftoverMoney>=0) {
                System.out.println("your coins "+leftoverMoney+" euro is not enough " +
                        "\nplease charge the coins"+
                        "\ny or n?");
                String cikis = scanner.next();
                if (cikis.equalsIgnoreCase("n")){
                    flag=false;
                }else {
                    System.out.println("please slot coin to machine");
                    leftoverMoney += scanner.nextDouble();
                    scanner.nextLine();
                }
            }
        }
        coffeeMachine.orderList();
        System.out.println();
        if (leftoverMoney>0){
            System.out.println("your leftover Money : "+leftoverMoney+" euro"+
                    "\nplease take your leftover money");
        }else {
            System.out.println("you don't have coins");
        }

    }
}
