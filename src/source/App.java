package source;

public class App {
    public static void main(String args[]){
        User user=new User("rxk","123456");
        System.out.println(user.getName()+","+user.getPwd());
    }
}
