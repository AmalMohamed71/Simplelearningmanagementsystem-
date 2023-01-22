package simplelearningmanagementsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import simplelearningmanagementsystem.model.Courses;
import simplelearningmanagementsystem.model.ScrFiles;

public class test {
      public static void main(String[] args) throws IOException {
          try {
              String m="";
              readxFile("C:\\Users\\AMAL\\Documents\\NetBeansProjects\\Simple Learning Management System\\src\\simplelearningmanagementsystem\\scr\\coursedata.xml");
          } catch (ParserConfigurationException ex) {
              Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SAXException ex) {
              Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
          }

           
      }


      public static ArrayList<Courses> readxFile( String filePath ) throws ParserConfigurationException, SAXException, IOException {
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
                System.out.println("\nNode Name :" + node.getNodeName());  
                NodeList chldNodeList = node.getChildNodes();
//                Courses row = new Courses();
//     
//                for (int counter2 = 0; counter2 < chldNodeList.getLength(); counter2++) {
//                    Node childNode = chldNodeList.item(counter2);
//
//                    if (childNode.getNodeType() == Node.TEXT_NODE) {
//                        continue;
//                    }
//                    if ("id".equals(childNode.getNodeName())) {
//
//                        row.setId(Integer.parseInt(childNode.getTextContent()));
//                    }
//                    if ("CourseName".equals(childNode.getNodeName())) {
//                        row.setCourseName(childNode.getTextContent());
//                    }
//                    if ("Instructor".equals(childNode.getNodeName())) {
//                        row.setInstructor(childNode.getTextContent());
//                    }
//                    if ("CourseDuration".equals(childNode.getNodeName())) {
//                        row.setCourseDuration(childNode.getTextContent());
//                    }
//                    if ("CourseTime".equals(childNode.getNodeName())) {
//                        row.setCourseTime(childNode.getTextContent());
//                    }
//                    if ("Location".equals(childNode.getNodeName())) {
//                        row.setLocation(childNode.getTextContent());
//                    }
//                }
//                rows.add(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(ScrFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rows;
        }
}
