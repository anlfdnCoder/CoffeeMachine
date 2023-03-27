package CoffeeMachine;

    public class Cappucino extends TypeOfCoffee {
        public Cappucino(String kahveTuru, String size,String sugar, double price) {
            super(kahveTuru, size,sugar, price);
        }

        @Override
        public void caffeSizePreisList() {
            System.out.println("you Selected Cappucino"+
                    "\n\t1.Small : 1.50 Euro"+
                    "\n\t2.Middle: 2.00 Euro"+
                    "\n\t3.Big   : 2.50 Euro");
        }

        @Override
        public  String coffeeSizeString(int number,double leftOverMoney) {
            String error = "your coin is not enough";
            if (leftOverMoney<1.50){
                return error;
            }else {
                String size="";
                if (number == 1 ){
                    if (leftOverMoney>=1.50){
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
                    if (leftOverMoney>=2.50){
                        size ="Big";
                    }else {
                        size="your coin is not enough";

                    }
                }

                return size;
            }

        }

        @Override
        public double coffeeSizePrice(int number) {
            double arrayNumber;
            double [] arrayCappucino = {1.50,2.00,2.50};

            return arrayNumber = arrayCappucino[number-1];
        }

        @Override
        public boolean sugar(int sugarType) {
            return super.sugar(sugarType);
        }

        @Override
        public String sugarType(int sugarType) {
            return super.sugarType(sugarType);
        }
    }

