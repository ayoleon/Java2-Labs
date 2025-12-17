import java.util.*;
import java.text.DecimalFormat;

public class StudentRecords {
    Scanner input = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    HashMap<String, Double> grades = new HashMap<>();
    DecimalFormat df = new DecimalFormat("#0.00");

    StudentRecords(){
        enterData();
        gradeBook();
        averageGrades();
        search();
        delete();

    }

    void enterData(){
        for(int i = 1; i <= 5; i++){
            System.out.print("Enter student #" + i + "'s name: ");
            String name = input.nextLine();
            System.out.print("Enter student grade: ");
            double grade = input.nextDouble();
            input.nextLine();// consumer newline

            names.add(name);
            grades.put(name, grade);
        }
    }

    void gradeBook(){
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            String name = itr.next();
            double grade = grades.get(name);
            System.out.println(name + "'s grade : " + df.format(grade));
        }
    }

    void averageGrades(){
        double total = 0;
        for (double grade : grades.values()){ //.values getting second value. first value is the KEY
            total += grade;
        }
        double average = total / grades.size();
        System.out.println("Class Average grade: " + df.format(average));
    }

    void search(){
        System.out.print("Enter the name to search: ");
        String searchName = input.nextLine();
        if (grades.containsKey(searchName)) { //containsKey searches hashmap for name
            System.out.println(searchName + "'s grade: " + grades.get(searchName)); //.get(searchName) returns grade int
        } else {
            System.out.println("student not found.");
        }
    }

    void delete(){
        System.out.print("Enter the name to delete: ");
        String searchName = input.nextLine();
        if (grades.containsKey(searchName)) { //containsKey searches hashmap for name
            names.remove(searchName);
            grades.remove(searchName);
        } else {
            System.out.println("student not found.");
        }
        gradeBook();
        averageGrades();
    }




    public static void main(String[] args) {
        new StudentRecords();

    }
}