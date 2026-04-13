class CourseEnrollment {
    private String studentname;
    private String courseName ;
    private String enrollmentDate;
    private int courseDuration; //weeks
    private double courseFee ; 

    //student name
    public void setStudentName(String studentName){
        this.studentname=studentName;
    }
    public String getStudentName(){
        return studentname;
    }

    //course name
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public String getCourseName(){
        return courseName;
    }

    //enrollment date
    public void setEnrollmentDate(String enrollmentDate){
        this.enrollmentDate=enrollmentDate;
    }
    public String getEnrollmentDate(){
        return enrollmentDate;
    }

    //course duration
    public void setCourseDuration(int courseDuration){
        if(courseDuration<0){
            System.out.println("Error:Course Duration cannot be negative");
        }else{
            this.courseDuration=courseDuration;
        }
    }
    public int getCourseDuration(){
        return courseDuration;
    }

    //course fee
    public void setCourseFee(double courseFee){
        if(courseFee<0){
            System.out.println("Error:Course Fee cannot be negative");
        }else{
            this.courseFee=courseFee;
        }
    }
    public double getCourseFee(){
        return courseFee;
    }

    //displaying info
    public void displayEnrollmentInfo(){
        System.out.println("Course Enrollment Details:");
        System.out.println("Student Name    : "+studentname);
        System.out.println("Course Name     : "+courseName);
        System.out.println("Enrollment Date : "+enrollmentDate);
        System.out.println("Course Duration : "+courseDuration+" weeks");
        System.out.println("Course Fee      : "+courseFee+ "Rupees");
        System.out.println("----------------------------------");
    }
}

public class CourseEnrollmentTest{
    public static void main(String[] args) {
        CourseEnrollment c1=new CourseEnrollment();
        c1.setStudentName("Harsh");
        c1.setCourseName("Mathematics");
        c1.setEnrollmentDate("25-01-2026");
        c1.setCourseDuration(12);
        c1.setCourseFee(12000);

        CourseEnrollment c2=new CourseEnrollment();
        c2.setStudentName("Varshitha");
        c2.setCourseName("Physics");
        c2.setEnrollmentDate("25-01-2026");
        c2.setCourseDuration(14);
        c2.setCourseFee(20000);

        CourseEnrollment c3=new CourseEnrollment();
        c3.setStudentName("Sreedha");
        c3.setCourseName("Chemistry");
        c3.setEnrollmentDate("25-01-2026");
        c3.setCourseDuration(10);
        c3.setCourseFee(15000);

        c1.displayEnrollmentInfo();
        c2.displayEnrollmentInfo();
        c3.displayEnrollmentInfo();
    }
}