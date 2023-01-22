package simplelearningmanagementsystem.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import simplelearningmanagementsystem.model.Courses;
import simplelearningmanagementsystem.model.ScrFiles;
import simplelearningmanagementsystem.model.Students;

public class Control {

    List<Students> student;
    ScrFiles tf = new ScrFiles();
    ScrFiles xf = new ScrFiles();
    ArrayList<Students> students;
    ArrayList<Courses> courses;

    public Control() {
        System.out.println("ـــــــــ" + "\n Students Data List : \n" + "ـــــــــ  ");
        try {
            this.courses = xf.readxFile("\\simplelearningmanagementsystem\\scr\\coursedata.xml");
            this.students = tf.readtfile("\\simplelearningmanagementsystem\\scr\\student-data.txt");
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
        tf.savetxt(students, "\\simplelearningmanagementsystem\\scr\\student-data.csv");
        xf.savexml(courses, "\\simplelearningmanagementsystem\\scr\\coursedata.csv");
//        System.out.println("save!");
    }

    public String selectstudent() {
        System.out.println("Please select the id of the required studend: ");
        Scanner id = new Scanner(System.in);

        String sdata = "";

        return sdata;
    }

    public void menu() {

        System.out.println("Please select the required action:"
                + "a- Enroll in a course\n"
                + "d - Unenrollfrom an existing course\n"
                + "r - Replacing an existing course\n"
                + "b - Back to the main page ");
        Scanner input = new Scanner(System.in);
        String action =  input.next();
        switch (action) {
            case "a":
                System.out.println("");
                break;
            case "d":
                System.out.println("");
                break;
            case "r":
                System.out.println("");
                break;
            case "b":
                System.out.println("");
                break;
            default: System.out.println("Please select the required action:"
                + "a- Enroll in a course\n"
                + "d - Unenrollfrom an existing course\n"
                + "r - Replacing an existing course\n"
                + "b - Back to the main page ");    
            }
            
    }
}
