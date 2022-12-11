import java.util.Objects;

public class User implements Cloneable {

    private int id;
    private String username;
    private int age;
    static private int countOfUsers = 1;

    public User(String username, int age) {
        this.id = countOfUsers;
        countOfUsers++;
        this.username = username;
        this.age = age;
    }

    public boolean equals(User user) {
        return this.id == user.id;
    }

    @Override
    public String toString() {
        return "User id: " + this.id + ", username: " + this.username + ", age: " + this.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
