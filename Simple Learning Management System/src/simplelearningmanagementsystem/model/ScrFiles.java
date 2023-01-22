package simplelearningmanagementsystem.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import jdk.nashorn.api.scripting.JSObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ScrFiles {

//Read student-data.txt file and separate signs to can convert it into file.csv
    public ArrayList<Students> readtfile(String filePath) {
        ArrayList<Students> students = new ArrayList<Students>();
        try {
            File txt = new File(filePath);
            Scanner f1 = new Scanner(txt);

            while (f1.hasNext()) {
                String value = f1.nextLine().replace("#", ",");
                value = value.replace("$", "\n");
                String[] lines = value.split("\n");
                 for (int i = 0; i < lines.length; i++) {
                    if (i == 0) {
                       System.out.println( " " + lines[i]);
                    } else {
                       System.out.println(( " " + lines[i]));
                    }
                for (int counter = 0; counter < lines.length; counter++) {
                    if (counter == 0) {
                        continue;
                    }
                    Students student = new Students();
                    String[] columns = lines[counter].split(",");
                    student.setId(Integer.parseInt(columns[0]));
                    student.setName(columns[1]);
                    student.setGrade(columns[2]);
                    student.setEmail(columns[3]);
                    student.setAddress(columns[4]);
                    student.setRegion(columns[5]);
                    student.setCountry(columns[6]);
                    students.add(student);
                }
                 }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return students;
        
    }
    //convert student-data.txt into student-data.csv and save it  

    public void savetxt(ArrayList<Students> students, String filePath) {
        try {
            File file = new File(filePath);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("id,name,Grade,email,address,region,country");
            bw.newLine();
            for (Students student : students) {
                String csvtxt = student.getId() + ","
                        + student.getName() + ","
                        + student.getGrade() + ","
                        + student.getEmail() + ","
                        + student.getAddress() + ","
                        + student.getRegion() + ","
                        + student.getCountry();
                bw.write(csvtxt);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ScrFiles.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//Read courses-data.txt file and separate signs to can convert it into file.csv
//    private String filePath;
    public ArrayList<Courses> readxFile( String filePath ) throws ParserConfigurationException, SAXException, IOException {
        ArrayList<Courses> rows = new ArrayList<Courses>();
        try {
            File file = new File(filePath);
            //an instance of factory that gives a document builder  
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            //an instance of builder to parse the specified xml file  
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            Document doc = documentBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("row");
            for (int counter = 0; counter < nodeList.getLength(); counter++) {
                Node node = nodeList.item(counter);
                NodeList chldNodeList = node.getChildNodes();
                Courses row = new Courses();
     
                for (int counter2 = 0; counter2 < chldNodeList.getLength(); counter2++) {
                    Node childNode = chldNodeList.item(counter2);

                    if (childNode.getNodeType() == Node.TEXT_NODE) {
                        continue;
                    }
                    if ("id".equals(childNode.getNodeName())) {

                        row.setId(Integer.parseInt(childNode.getTextContent()));
                    }
                    if ("CourseName".equals(childNode.getNodeName())) {
                        row.setCourseName(childNode.getTextContent());
                    }
                    if ("Instructor".equals(childNode.getNodeName())) {
                        row.setInstructor(childNode.getTextContent());
                    }
                    if ("CourseDuration".equals(childNode.getNodeName())) {
                        row.setCourseDuration(childNode.getTextContent());
                    }
                    if ("CourseTime".equals(childNode.getNodeName())) {
                        row.setCourseTime(childNode.getTextContent());
                    }
                    if ("Location".equals(childNode.getNodeName())) {
                        row.setLocation(childNode.getTextContent());
                    }
                }
                rows.add(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(ScrFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rows;
    }
//convert student-data.txt into student-data.csv and save it
    public void savexml(ArrayList<Courses> rows, String filePath) {
        try {
            File file = new File(filePath);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("id,CourseName,Instructor,CourseDuration,CourseTime,Location");
            bw.newLine();
            for (Courses row : rows) {
                String csvRow = row.getId() + ","
                        + row.getCourseName() + ","
                        + row.getInstructor().replace(",", " ") + ","
                        + row.getCourseDuration() + ","
                        + row.getCourseTime() + ","
                        + row.getLocation();
                bw.write(csvRow);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ScrFiles.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void jsonfile() {
        Students s =new Students();
        s.getId();
        Courses c = new Courses();
        c.getId();
        ArrayList<JSObject> jobject1= new ArrayList<>();
        jobject1.add((JSObject)s);
        jobject1.add((JSObject) c);        
        
    }

 
}
