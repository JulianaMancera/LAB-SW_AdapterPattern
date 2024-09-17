public class Main {

    public static void main(String[] args) {
        
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        SchoolManagementApp attendance = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp grades = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp library = new LibrarySystemAdapter(librarySystem);

        attendance.integrateSystem();
        grades.integrateSystem();
        library.integrateSystem();
    }
}