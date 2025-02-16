import java.util.Date;

public class People {
    // fields
    private String fullName;
    private String gender;
    private String phone;
    private String email;
    private int Id;
    private int age;

    public People(String fullName, String gender, String phone, String email, int Id, int age) {
        this.fullName = fullName;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.Id = Id;
        this.age = age;
    }

    public People(String fullName, int Id, int age, String email) {
        this.fullName = fullName;
        this.email = email;
        this.Id = Id;
        this.age = age;
    }

    // getter methods
    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return Id;
    }

    // setter methods
    public void setFullName(String newFullName) {
        fullName = newFullName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Full Name: ").append(fullName).append("\n")
                .append("Age: ").append(age).append("\n")
                .append("Gender: ").append(gender).append("\n")
                .append("Phone number: ").append(phone).append("\n")
                .append("Email: ").append(email).append("\n")
                .append("Id: ").append(Id).append("\n");
        return sb.toString();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}