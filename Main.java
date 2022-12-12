class Main {
  public static void main(String[] args) {
    LinkedList list=new LinkedList();

        int[] keys = {1, 2, 3, 4};
        Node head = null;
        for (int key: keys) {
            head = list.add(head,key);
        }



        LinkedList.printList(head);
  }
}