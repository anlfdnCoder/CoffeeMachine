package CoffeeMachine;

import java.util.ArrayList;
import java.util.List;

public abstract class TypeOfCoffee {
    public String typeOfCoffee;

    public String size;

    public String sugar;
    public double price;

    public List<TypeOfCoffee> outLine;

    public TypeOfCoffee(String kahveTuru, String size, String sugar, double fiyat) {
        typeOfCoffee = kahveTuru;
        this.size = size;
        this.sugar = sugar;
        this.price = fiyat;
        outLine = new ArrayList<>();
    }


    public abstract void caffeSizePreisList();

    public String coffeeSizeString(int number,double leftOverMoney){
        String size="";
        if (number == 1 ){
            if (leftOverMoney>=1.00){
                size = "Small";
            }else {
                size="your coin is not enough";
            }

        } else if (number == 2) {
            if (leftOverMoney>=2.00){
                size = "Middle";
            }else {
                size="your coin is not enough";
            }
        } else if (number == 3) {
            if (leftOverMoney>=2.00){
                size ="Big";
            }else {
                size="your coin is not enough";

            }
        }

        return size;
    }
    public boolean sugar(int sugarType){
        if (sugarType==0){
            return false;
        }else {
            return true;
        }
    }
    public String sugarType(int sugarType){
        String selectType = "";
        if (!sugar(sugarType)){
            selectType="no-sugar";
        } else {
            if (sugarType==1){
                selectType="less-sugar";
            } else if (sugarType == 2) {
                selectType="middle-sugar";
            } else if (sugarType == 3) {
                selectType="more-sugar";
            }
        }
        return selectType;
    }


    public  abstract double coffeeSizePrice(int number);

}
