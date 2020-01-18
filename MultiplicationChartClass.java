public class MultiplicationChartClass implements MultiplicationChartInterface {

    private int num;

    public MultiplicationChartClass(int n) {
        num = n;
    }

    @Override
    public void displayChart() {


        // First Row
        System.out.format("%3s","" );
        System.out.format("%2s","X" + " ");
        System.out.format("%2s","|" + " ");
        for (int x = 1; x < num + 1; x++) {
            System.out.format("%3s",x );
            System.out.format("%3s","" );
        }
        System.out.println(" ");

        // Second Row
        System.out.format("%3s","" );

        System.out.format("%1s", "-");
        System.out.format("%1.85s", "-");
        System.out.format("%1s","|");
        for (int x = 1; x < num + (num*4.9); x++) {
            System.out.format("%1s", "-");
        }
        System.out.println(" ");
        int k = 1;

        int rowCounter = 0;

        // ALl Rows After Second
        while(rowCounter < num){


            if(rowCounter < 9){
                System.out.format("%3s","" );
            }

            else{
                System.out.format("%2s","" );
            }

            System.out.print(num - (num - k) + " ");
            System.out.format("%2s", "|" + " ");

            int incrementer = 0;
                for(int i =0; i < num; i++){
                    System.out.format("%3s", num - (num - k) +incrementer );
                    System.out.format("%3s","" );
                    incrementer = incrementer +num - (num - k);
                }


            rowCounter++;
            k++;
            System.out.println(" ");
        }

    }
}




