import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ExaminationManagementSystem system = new ExaminationManagementSystem(75); // Assume 75% as the eligibility threshold

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    updateAttendance();
                    break;
                case 4:
                    checkEligibility();
                    break;
                case 5:
                    printAllStudents();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please enter a number between 1 and 6.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nWelcome to the Examination Management System");
        System.out.println("1. Add a Student");
        System.out.println("2. Delete a Student");
        System.out.println("3. Update Student Attendance");
        System.out.println("4. Check and Update Eligibility for All Students");
        System.out.println("5. Print All Student Records");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Attendance: ");
        int attendance = scanner.nextInt();
        system.addStudent(new Student(id, name, attendance));
        System.out.println("Student added successfully!");
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        system.deleteStudent(id);
        System.out.println("Student deleted successfully!");
    }

    private static void updateAttendance() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter new Attendance: ");
        int attendance = scanner.nextInt();
        system.updateAttendance(id, attendance);
        System.out.println("Attendance updated successfully!");
    }

    private static void checkEligibility() {
        system.checkEligibility();
        System.out.println("Eligibility updated for all students.");
    }

    private static void printAllStudents() {
        system.printAllStudents();
    }
}
