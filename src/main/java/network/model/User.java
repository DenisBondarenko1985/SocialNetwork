package network.model;

public class User {

    private String email;
    private String password;
    private int age;
    private int friends;

    public User(String email, String password, int age, int friends) {
        this.email = email;
        this.password = password;
        this.age = age;
        this.friends = friends;
    }


    public User() {
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFriends(int friends) {
        this.friends = friends;
    }

    public int getAge() {
        return age;
    }

    public int getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                '}';
    }
}
