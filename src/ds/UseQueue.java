package ds;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<String>();
        line.add("Noman");
        line.add("Ullah");
        line.add("Popy");
        line.add("Kabir");

        for(String name:line){
            System.out.println(name);
        }
    }
}
