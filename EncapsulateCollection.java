//Avoid:
public class Person {

    private List<String> courses = new ArrayList<>();

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}

//Prefer:
public class Person {

    private final List<String> courses = new ArrayList<>();

    public List<String> getCourses() {
        return Collections.unmodifiableList(courses);
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    // the "newCourses" should not be modified by another thread during this operation
    public void replaceCourses(List<String> newCourses) {

        courses.clear();
        if (newCourses != null) {
            courses.addAll(newCourses);
        }
    }
}