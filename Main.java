import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create Admin and Student objects
        Admin admin = new Admin("admin", "pass");
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        while (true) {  // Wrap the entire process in a loop to keep the program running
            System.out.println("Welcome to student login ");
            System.out.println("Press the below option");
            System.out.println("1. Admin login ");
            System.out.println("2. Student login");
            System.out.println("3. Exit");

            int input = sc.nextInt();
            switch (input) {
                case 1:
                    // Admin login section
                    System.out.println("Enter Admin Username and password");
                    System.out.println("Enter Admin userName");
                    String adminUsername = sc.next();
                    System.out.println("Enter Admin password ");
                    String password = sc.next();

                    if (admin.getUsername().equals(adminUsername) && admin.getPassword().equals(password)) {
                        System.out.println("Welcome to Admin");

                        boolean adminMenu = true;
                        while (adminMenu) {
                            System.out.println("Choose an option:");
                            System.out.println("1. Add Student");
                            System.out.println("2. View All Students");
                            System.out.println("3.deleted the student");
                            System.out.println("4. Exit Admin Menu");
                            int option = sc.nextInt();

                            switch (option) {
                                case 1:
                                    // Add Student option
                                    System.out.println("Enter Student ID :");
                                    Integer id = sc.nextInt();
                                    System.out.println("Enter student Name ");
                                    String name = sc.next();
                                    System.out.println("Enter Age ");
                                    Integer age = sc.nextInt();
                                    System.out.println("Enter Email ");
                                    String email = sc.next();
                                    System.out.println("Enter Grade ");
                                    String grade = sc.next();
                                    System.out.println("Enter Attendance ");
                                    Integer attendance = sc.nextInt();

                                    admin.addStudent(new Student(id, name, age, email, grade, attendance));
                                    System.out.println("Student Added");

                                    break;

                                case 2:
                                    // View all students
                                    System.out.println("All Students:");
                                    for (Student student2 : admin.students) {
                                        System.out.println(student2);
                                    }
                                    break;
                                case 3:
                                System.out.println("Delete the student ");
                                Integer deletedId = sc.nextInt();
                                boolean studentDeleted = false;
                                
                                // Iterate through the list of students to find the student by ID
                                for (Student dStudent : admin.students) {
                                    if (dStudent.getStudentId().equals(deletedId)) {
                                        admin.students.remove(dStudent);  // Remove the student from the list
                                        System.out.println("Student with ID " + deletedId + " has been deleted.");
                                        studentDeleted = true;
                                        break;
                                    }
                                }
                                case 4:
                                    adminMenu = false;  // Exit Admin Menu
                                    break;

                                default:
                                    System.out.println("Invalid option.");
                            }
                        }
                    } else {
                        System.out.println("Admin not found");
                    }
                    break;

                    case 2:
                    // Student login section
                    System.out.println("Student Login");
                    System.out.println("Enter Student ID:");
                    Integer studentId = sc.nextInt();
                    System.out.println("Enter Student Name:");
                    String studentName = sc.next();
                
                    // Check if the student exists
                    boolean studentFound = false;
                    for (Student student2 : admin.students) {
                        if (student2.getStudentId().equals(studentId) && student2.getStudentName().equals(studentName)) {
                            System.out.println("Welcome, " + student2.getStudentName());
                
                            // Show options after successful student login
                            boolean studentMenu = true;
                            while (studentMenu) {
                                System.out.println("Choose an option:");
                                System.out.println("1. View Student Details");
                                System.out.println("2. Exit");
                
                                int studentOption = sc.nextInt();
                
                                switch (studentOption) {
                                    case 1:
                                        // Display student details
                                        System.out.println(student2);
                                        break;
                
                                    case 2:
                                        studentMenu = false;  // Exit student menu
                                        break;
                
                                    default:
                                        System.out.println("Invalid option.");
                                }
                            }
                            studentFound = true;
                            break;
                        }
                    }
                
                    if (!studentFound) {
                        System.out.println("Student not found");
                    }
                    break;
                }}}}                