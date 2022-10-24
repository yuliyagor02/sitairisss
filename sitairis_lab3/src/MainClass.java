public class MainClass {
    public static void main(String[] args){
        LanguageCourse obj = new LanguageCourse();
        obj.setCourseIndex(2);
        obj.setCourseName("French for business");
        obj.countPay(obj.getCourseIndex());
        System.out.println("Index of the course is "+obj.getCourseIndex());
        System.out.println("Name of the course is "+obj.getCourseName());
        System.out.println("Format of the lesson is "+obj.getLessonFormat());
        System.out.println("Pay for the course is "+obj.getPay());
    }
}
