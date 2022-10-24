public class LanguageCourse {
    private int courseIndex;
    private String courseName;
    private String lessonFormat;
    public LanguageCourse(){
        courseIndex=0;
        courseName="-";
        lessonFormat="-";
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
}
