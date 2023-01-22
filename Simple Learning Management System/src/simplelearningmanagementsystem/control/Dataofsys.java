
package simplelearningmanagementsystem.control;

import simplelearningmanagementsystem.model.ScrFiles;

public class Dataofsys extends ScrFiles {
    String  coursesdata;
    String studentdata ;
    ScrFiles file1;
    file1=file1.readtfile();
    file1.readtfile("C:\\Users\\AMAL\\Documents\\NetBeansProjects\\Simple Learning Management System\\src\\simple\\learning\\management\\system\\scr\\student-data.txt");
    public String getStudentdata() {
        return studentdata;
    }

    public void setStudentdata(String studentdata) {
        this.studentdata.getBytes();
    }

    public String getCoursesdata() {
        return coursesdata;
    }

    public void setCoursesdata(String coursesdata) {
        this.coursesdata = coursesdata;
    }
  
    
    
}
