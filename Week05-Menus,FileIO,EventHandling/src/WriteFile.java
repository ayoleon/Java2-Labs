import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    WriteFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("CustomerData.txt",true));

        // Loop exactly 3 times (3 customers)
        for (int i = 1; i <= 3; i++) {
            String lastName = "";
            //USING WHILE LOOP IN CASE CUSTOMER DOESN'T ENTER DATA...
            while (lastName == null || lastName.isEmpty()) {
                lastName = JOptionPane.showInputDialog("Enter customer " + i + "'s Last name");
                // IF NOTHING ENTERED, PRINT ERROR MESSAGE AND RE-LOOP
                if (lastName == null || lastName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Last Name is required. Please try again.");
                }
            }

            String age = "";
            while (age == null || age.isEmpty()) {
                age = JOptionPane.showInputDialog("Enter customer " + i + "'s age");
                if (age == null || age.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Age is required. Please try again.");
                }
            }

            String movie = "";
            while (movie == null || movie.isEmpty()) {
                movie = JOptionPane.showInputDialog("Enter movie choice");
                if (movie == null || movie.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Movie choice is required. Please try again.");
                }
            }

            // Write each customer as one line---- "LastName, Age, Movie"
            bw.write(lastName + ", " + age + ", " + movie);
            bw.newLine();
        }
        bw.close();
    }


    //THIS METHOD BELOW WORKS, BUT DOESN't ALLOW USER TO RE-INPUT MISSING DATA IF THEY ENTERED NOTHING
    /*
        // Loop exactly 3 times (3 customers)
        for (int i = 0; i < 3; i++) {
            String lastName = JOptionPane.showInputDialog("Enter customer's Last name");
            if(lastName != null && !lastName.isEmpty()){ //if it's not null and not empty
                bw.write(lastName + ", "); //WRITE MESSAGE TO FILE
                //bw.newLine();  //forces us to go to the next line
            }
            else {
                JOptionPane.showMessageDialog(null, "No Last Name Entered");
            }
            /*
            //CHECKS IF INPUT IS EMPTY...
            if (lastName == null || lastName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No last name entered. Exiting.");
                //System.exit(0);
            }
            */
/*
            String age = JOptionPane.showInputDialog("Enter customer's age");
            if(age != null && !age.isEmpty()){ //if it's not null and not empty
                bw.write(age + ", "); //WRITE MESSAGE TO FILE
                //bw.newLine();  //forces us to go to the next line
            }
            else {
                JOptionPane.showMessageDialog(null, "No age Entered");
            }

 */
            /*
            if (age == null || age.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No age entered. Exiting.");
                //System.exit(0);
            }
             */

    /*
            String movie = JOptionPane.showInputDialog("Enter movie choice");
            if(movie != null && !movie.isEmpty()){ //if it's not null and not empty
                bw.write(movie); //WRITE MESSAGE TO FILE
                //bw.newLine();  //forces us to go to the next line
            }
            else {
                JOptionPane.showMessageDialog(null, "No Movie Entered");
            }
            /*
            if (movie == null || movie.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No movie entered. Exiting.");
                //System.exit(0);
            }


            // Write each customer as one line: "LastName, Age, Movie"
            //bw.write(lastName + ", " + age + ", " + movie);
            bw.newLine();
        }
        */

    }

