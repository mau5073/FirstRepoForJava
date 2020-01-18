import java.util.Scanner;





public class Main{



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer number (0 < n < 13):");
        int num = sc.nextInt();

        MultiplicationChartClass mcc = new MultiplicationChartClass(num);
        Main m = new Main();
        m.display(mcc);
    }

    // Notice the polymorphism here.
    public void display(MultiplicationChartInterface mci) {
        mci.displayChart();
    }



}
