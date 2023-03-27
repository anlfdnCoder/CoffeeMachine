package CoffeeMachine;

    public class CaffeLatte extends TypeOfCoffee{
        public CaffeLatte(String kahveTuru, String size, String sugar, double fiyat) {
            super(kahveTuru, size,sugar, fiyat);
        }

        @Override
        public void caffeSizePreisList() {
            System.out.println("you Selected Latte" +
                    "\n\t1.Small : 3.00 Euro" +
                    "\n\t2.Middle: 4.50 Euro" +
                    "\n\t3.Big   : 5.50 Euro" );
        }

        @Override
        public double coffeeSizePrice(int number) {
            double arrayNumber;
            double [] arrayCappucino = {3.00,4.50,5.50};

            return arrayNumber = arrayCappucino[number-1];
        }

        @Override
        public String coffeeSizeString(int number,double leftOverMoney) {
            String error = "your coin is not enough";
            if (leftOverMoney<3.00) {
                return error;
            }else {
//            return super.coffeeSizeString(number,leftOverMoney);
                String size="";
                if (number == 1 ){
                    if (leftOverMoney>=3.00){
                        size = "Small";
                    }else {
                        size="your coin is not enough";
                    }

                } else if (number == 2) {
                    if (leftOverMoney>=4.50){
                        size = "Middle";
                    }else {
                        size="your coin is not enough";
                    }
                } else if (number == 3) {
                    if (leftOverMoney>=5.50){
                        size ="Big";
                    }else {
                        size="your coin is not enough";

                    }
                }

                return size;
            }
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

