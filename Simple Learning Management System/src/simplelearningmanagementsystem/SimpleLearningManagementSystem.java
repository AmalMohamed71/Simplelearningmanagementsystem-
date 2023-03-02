package simplelearningmanagementsystem;

import static java.awt.SystemColor.control;
import simplelearningmanagementsystem.model.Students;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import simplelearningmanagementsystem.control.Control;
import simplelearningmanagementsystem.model.Courses;
import simplelearningmanagementsystem.model.ScrFiles;

public class SimpleLearningManagementSystem {

    public static void main(String[] args) throws IOException {
            System.out.println("Welcom to LMS \n" + "Created by 'Amal Mohamed'");
            Control c= new Control();
            c.selectstudent();
            c.menu();
    }

}
