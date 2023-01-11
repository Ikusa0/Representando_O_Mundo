public class User {
    private String name;
    private String email;
    private String password;
    private Subject[] enrolled_subjects = new Subject[5];
    private int subjects_quantity = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void enroll(Subject subject) {
        this.enrolled_subjects[subjects_quantity] = subject;
        this.subjects_quantity++;
    }

    public Subject[] getEnrollments() {
        return this.enrolled_subjects;
    }
}
