package ss10_dsa_list.excercise.simulation_linked_list;

public class MyLinkedTest {
    public static void main(String[] args) {

        MyLinkedList newLinkedList = new MyLinkedList();

        newLinkedList.addFirst("a");
        newLinkedList.add(1,"b");
        newLinkedList.addLast("c");

        newLinkedList.remove(1);
        newLinkedList.remove("a");

          System.out.println("Array in MyLinkedList is :" + newLinkedList.get(0));
          System.out.println("Test Method is :" + newLinkedList.contains("a"));

        for (int i = 0; i < newLinkedList.size(); i++) {
            System.out.println(newLinkedList.get(i));
        }



    }
}
