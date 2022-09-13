public class CourseDemo {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.Print();

        Course c2 = new Course("CC2007","数据库基础",4.0, "本课程是计算机类专业的一门专业基础课,...");
        c2.Print();
    }
}
