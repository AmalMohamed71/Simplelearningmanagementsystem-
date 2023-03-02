package simplelearningmanagementsystem.control;

import simplelearningmanagementsystem.model.Students;
import simplelearningmanagementsystem.model.Courses;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.api.scripting.JSObject;

public class view {
    static String[] headers={"id"," name","Grade","email","address","region","country"};
        static String[] headers2 ={"id","CourseName","Instructor","Courseduration","Coursetime","Location"} ;

    public static void prints (List<Students> students)
    {
        String fmt = "%1$2d %2$1s %3$2d %4$40s %5$40s %6$20s %7$20s%n";
        String fmt1 = "%1$2s %2$1s %3$2s %4$40s %5$40s %6$20s %7$20s%n";
        System.out.format(fmt1, headers[0],headers[1],headers[2],headers[3],headers[4],headers[5],headers[6]);
        
        for (int i=0 ; i< students.size();i++)
        {
            System.out.format(fmt,students.get(i).getId(),students.get(i).getName(),students.get(i).getGrade(),
                    students.get(i).getEmail(),students.get(i).getAddress(),students.get(i).getRegion(),students.get(i).getCountry());
        }
//        ArrayList<JSObject> jobject1= new ArrayList<>();
//        jobject1.add((JSObject) students);
//        jobject1.toString();
    }
    public static void printall (List<Students> allstudents)
    {
        String fmt = "%1$2d %2$1s%t% %3$2d %4$40s%t% %5$40s%t% %6$20s%t% %7$20s%n";
        String fmt1 = "%1$2s %2$1s%t% %3$2s %4$40s%t% %5$40s%t% %6$20s%t% %7$20s%n";
        System.out.format(fmt1, headers[0]," ",headers[1],"/t",headers[2]," ",headers[3],"                    ",headers[4],"                 ",headers[5],"                ",headers[6]);
        
        for (int i=0 ; i< allstudents.size();i++)
        {
            System.out.format(fmt,allstudents.get(i).getId(),allstudents.get(i).getName(),allstudents.get(i).getGrade(),
                    allstudents.get(i).getEmail(),allstudents.get(i).getAddress(),allstudents.get(i).getRegion(),allstudents.get(i).getCountry());
        }
    }
        public static void print (List<Courses> courses)
        {
            String fmt = "%1$2d %2$1s %3$2d %4$40s %5$40s %6$20s %7$20s%n";
        String fmt1 = "%1$2s %2$1s %3$2s %4$40s %5$40s %6$20s %7$20s%n";
        System.out.format(fmt1, headers2[0],headers2[1],headers2[2],headers2[3],headers2[4],headers2[5]);
        
        for (int i=0 ; i< courses.size();i++)
        {
            System.out.format(fmt,courses.get(i).getId(),courses.get(i).getCourseName(),courses.get(i).getInstructor(),
                    courses.get(i).getCourseDuration(),courses.get(i).getCourseTime(),courses.get(i).getLocation());
        }
        
//            ArrayList<JSObject> jobject2= new ArrayList<>();
//            jobject2.add((JSObject) courses);
//            jobject2.toString();
        }

}
