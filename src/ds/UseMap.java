package ds;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Map<Integer,User> user = new HashMap<Integer,User>();
        user.put(1, new User("Kabir","abc123","10-12-1980"));
        user.put(2, new User("Jose","ghs789","11-16-1990"));
        user.put(3, new User("Valerie","nms342","09-18-1990"));

        for(Map.Entry<Integer, User> profile:user.entrySet()){
            System.out.println(profile.getKey()+ " "+profile.getValue().getUserName()+ " "
                    +profile.getValue().getPassword()+ " "+profile.getValue().getDob());
        }

    }
}
