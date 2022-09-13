public class Course {

    private String courseID;
    private String courseName;
    private double credit;
    private String introduction;


    Course(){
        this.courseID = "C02002";
        this.courseName = "Java程序设计基础";
        this.credit = 4.0;
        this.introduction = "本课程是计算机科学与技术专业的一门专业基础课,...";
    }

    public Course(String courseID, String courseName, double credit, String introduction){
        this.courseID = courseID;
        this.courseName = courseName;
        this.credit = credit;
        this.introduction = introduction;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void Print(){
        System.out.println("课程代码:"+ courseID+"\n"
                +"课程名称:"+ courseName+"\n"
                +"课程学分:"+credit+"\n"
                +"课程简介:"+introduction+"\n");
    }

}
