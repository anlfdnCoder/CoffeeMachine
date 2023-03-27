package CoffeeMachine;

import java.util.ArrayList;
import java.util.List;



    public class CoffeeMachine {
        public  String name;

        List<TypeOfCoffee> kahveListe ;


        public CoffeeMachine(String name) {
            this.name = name;
            this.kahveListe = new ArrayList<>();
        }

        public void addKahve(TypeOfCoffee kahveTurleri){
            if (kahveTurleri.size.equals("your coin is not enough")){
                return;
            }else {
                kahveListe.add(kahveTurleri);
                System.out.println("it is being added in your coffee-List");
            }
        }
        public void orderList(){
            System.out.println("your order-list: ");
            int number=0;
            for (var each:this.kahveListe) {
                System.out.println(
                        ++number+" choice"+
                                "\n\tyour coffee-choice: "+each.typeOfCoffee +
                                "\n\tyour coffee-size-choice: "+each.size+
                                "\n\tyour coffee-sugar-choice: "+each.sugar+
                                "\n\tyour chosen coffee-price: "+each.price +" euro");

            }



        }




    }

