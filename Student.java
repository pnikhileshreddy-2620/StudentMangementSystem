public class Student {
    private Integer studentId=1;
    private String studentName="1";
    private Integer age;
    private String email;
    private String grade;
    private Integer attendance;

    
    public Student(Integer studentId, String studentName, Integer age, String email, String grade, Integer attendance) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.email = email;
        this.grade = grade;
        this.attendance = attendance;
    }
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public Integer getAttendance() {
        return attendance;
    }
    public void setAttendance(Integer attendance) {
        this.attendance = attendance;
    }
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", email=" + email
                + ", grade=" + grade + ", attendance=" + attendance + "]";
    }
    public Student() {
    }

}
