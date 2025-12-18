import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class FileData {
    DecimalFormat df = new DecimalFormat("##0.00");

    FileData() throws FileNotFoundException {

        String fileName = "C:\\Users\\lamva\\numbers.txt";
        ArrayList<Integer> monthly = new ArrayList<>();

        File file = new File(fileName);
        Scanner input = new Scanner(file);

        while (input.hasNextInt()) {
            int num = input.nextInt();

            monthly.add(num);
        }

        input.close();

        System.out.println("All numbers in ArrayList:");
        System.out.println(monthly);

        System.out.print("Monthly Total: ");
        System.out.println(Sum(monthly));

        System.out.print("Monthly Average: ");
        System.out.println(df.format(Avg(monthly)));

        MinMaxVal(monthly);
        //Collections.sort(monthly); //easy way to sort array-list without loop


    }

    int Sum(ArrayList<Integer> monthly){
        int total = 0;
        for(int i : monthly){
            total += i;
        }
        return total;
    }

    double Avg(ArrayList<Integer> monthly){
        double average = (double) Sum(monthly) / monthly.size();
        return average;
    }

    void MinMaxVal(ArrayList<Integer> monthly){
        Collections.sort(monthly);
        System.out.println("Minimum Value : " + monthly.get(0));
        System.out.println("Maximum Value : " + monthly.get((monthly.size()) - 1));
    }



    public static void main(String[] args) throws FileNotFoundException {
        new FileData();
    }
}