public class LanguageCourse implements Paid{
    private int courseIndex;
    private String courseName;
    private String lessonFormat;
    private int pay;
    public LanguageCourse(){
        courseIndex=0;
        courseName="-";
        lessonFormat="-";
        pay=7;
    }
    public void setCourseIndex(int courseIndex){
        this.courseIndex=courseIndex;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setLessonFormat(String lessonFormat) {
        this.lessonFormat = lessonFormat;
    }

    public int getCourseIndex() {
        return courseIndex;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getLessonFormat() {
        return lessonFormat;
    }

    public int getPay() {
        return pay;
    }
    @Override
    public int countPay(int courseIndex){
        this.pay=pay*courseIndex;
        return pay;
    }
}
