public class Main {
    static User[] users = new User[3];
    public static void main(String[] args) throws CloneNotSupportedException {
        //task1
//        User user1 = new User("Alex", "5555", "123");
//        User user2 = new User("Alex", "5555", "123");
//
//        System.out.println(user1.equals(user2));


        //task2
        users[0] = new User("Harry", "123", "10");
        users[1] = new User("Henry", "123", "5");
        users[2] = new User("Ron", "123", "3");


        Check check = new Check("5", 1);
        for (int i = 0; i < users.length; i++) {
            if((users[i].id.equals(check.id)) && (check.type == 1)){
                System.out.println("Deep clone " + users[i].deepClone());
                break;
            } else if ((users[i].id.equals(check.id)) && (check.type != 1)) {
                System.out.println("Shallow clone " + users[i].clone());
            }
        }



    }
}
