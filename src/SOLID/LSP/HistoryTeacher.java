package SOLID.LSP;

public class HistoryTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("Teaching history");
    }

}
