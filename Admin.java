import java.util.ArrayList;

public class Admin {

     private String username="1";
     private String password="1";
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
        this.students = new ArrayList<>();
    }

     ArrayList<Student> students= new ArrayList<>();


     public void addStudent(Student student){
        students.add(student);
        System.out.println("Added ");
      
     }
    public Admin() {
    }
    
   
     
}