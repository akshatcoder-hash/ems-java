import java.util.ArrayList;
import java.util.List;

public class ExaminationManagementSystem {
    private List<Student> students = new ArrayList<>();
    private int eligibilityCriteria;

    public ExaminationManagementSystem(int eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(int studentId) {
        students.removeIf(student -> student.getId() == studentId);
    }

    public void updateAttendance(int studentId, int newAttendance) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                student.setAttendance(newAttendance);
                break;
            }
        }
    }

    public void checkEligibility() {
        for (Student student : students) {
            if (student.getAttendance() >= eligibilityCriteria) {
                student.setEligibleForExam(true);
            } else {
                student.setEligibleForExam(false);
            }
        }
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
