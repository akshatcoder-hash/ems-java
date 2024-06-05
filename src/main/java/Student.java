public class Student {
    private int id;
    private String name;
    private int attendance;
    private boolean isEligibleForExam;

    public Student(int id, String name, int attendance) {
        this.id = id;
        this.name = name;
        this.attendance = attendance;
        this.isEligibleForExam = false;
    }

    // Setters and Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAttendance() { return attendance; }
    public void setAttendance(int attendance) { this.attendance = attendance; }
    public boolean isEligibleForExam() { return isEligibleForExam; }
    public void setEligibleForExam(boolean eligible) { this.isEligibleForExam = eligible; }
}
