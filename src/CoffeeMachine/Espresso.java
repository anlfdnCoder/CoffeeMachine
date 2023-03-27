package CoffeeMachine;

    public class Espresso extends TypeOfCoffee {
        public Espresso(String kahveTuru, String size,String sugar, double price) {
            super(kahveTuru, size,sugar, price);
        }

        @Override
        public void caffeSizePreisList() {
            System.out.println("you Selected Espresso" +
                    "\n\t1.Small : 0.50 Euro" +
                    "\n\t2.Middle: 1.00 Euro" +
                    "\n\t3.Big   : 1.50 Euro" );
        }

        @Override
        public  String coffeeSizeString(int number,double leftOverMoney) {
            return super.coffeeSizeString(number,leftOverMoney);
        }


        @Override
        public double coffeeSizePrice(int number) {
            double arrayNumber;
            double [] arrayEspresso = {1.50,2.00,2.50};

            return arrayNumber = arrayEspresso[number-1];
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

