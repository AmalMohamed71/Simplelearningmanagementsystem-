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
    ArrayList <Students> allstudents ;

    public Control() {
        System.out.println("ـــــــــ" + "\n Students Data List : \n" + "ـــــــــ  ");
        try {
            this.courses = xf.readxFile("C:\\Users\\AMAL\\Documents\\NetBeansProjects\\Simple Learning Management System\\src\\simplelearningmanagementsystem\\scr\\coursedata.xml");
//            this.students = tf.readtfile("C:\\Users\\AMAL\\Documents\\NetBeansProjects\\Simple Learning Management System\\src\\simplelearningmanagementsystem\\scr\\student-data.txt");
            this.allstudents = tf.readtfile("C:\\Users\\AMAL\\Documents\\NetBeansProjects\\Simple Learning Management System\\src\\simplelearningmanagementsystem\\scr\\student-data.txt");
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

    public void selectstudent() {
        System.out.println("Please select the id of the required studend: ");
        Scanner id = new Scanner(System.in);
        int sid = id.nextInt();
         this.students.get(sid);
        
    }

    public void menu() {

        System.out.println("Please select the required action:");
        System.out.println("a- Enroll in a course\n");
        System.out.println("d - Unenrollfrom an existing course\n");
        System.out.println("r - Replacing an existing course\n");
        System.out.println("b - Back to the main page ");
        Scanner input = new Scanner(System.in);
        String action =  input.next();
        switch (action) {
            case "a":
                System.out.println("a");
                break;
            case "d":
                System.out.println("d");
                break;
            case "r":
                System.out.println("r");
                break;
            case "b":
                System.out.println("b");
                break;
            default: System.out.println("Please select the required action:");
                    System.out.println("a- Enroll in a course\n");
                    System.out.println("d - Unenrollfrom an existing course\n");
                    System.out.println("r - Replacing an existing course\n");
                    System.out.println("b - Back to the main page "); 
            }
            
    }
}
