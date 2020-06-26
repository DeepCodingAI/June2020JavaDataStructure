package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("NY");
        linkedList.add("NJ");
        linkedList.add("PA");

        Iterator it = linkedList.listIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
