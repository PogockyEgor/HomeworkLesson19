public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("Alex", 20);
        User user2 = (User) user1.clone();
        System.out.println(user1 + ", hashCode: " + user1.hashCode());
        System.out.println(user2 + ", hashCode: " + user2.hashCode());
        System.out.println(user1.equals(user2));
    }
}