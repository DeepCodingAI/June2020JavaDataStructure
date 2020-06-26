package ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your limit: ");
        int limit = sc.nextInt();
        System.out.println("Please enter your number: ");
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<limit; i++) {
            list.add(sc.nextInt());
        }

        for(int j=0; j<list.size(); j++) {
            System.out.println(list.get(j));
        }

        List<User> userList = new ArrayList<User>();
        userList.add(new User("Noman","abc123","10-14-1990"));
        userList.add(new User("Halder","zyx456","12-17-1992"));
        for(User user:userList){
            System.out.println(user.getUserName()+ " "+user.getPassword()+" "+user.getDob());
        }
    }
}
