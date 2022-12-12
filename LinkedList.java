public class LinkedList<E> {
    Node head;
    E data;

    public  Node newNode(E data){
        Node node=new Node(data,null);
        return node;

    }

    public static void printList(Node head){
        Node ptr=head;
        while(ptr!=null){
            System.out.println(ptr.data+ " ->");
            ptr=ptr.next;

        }
    }

    public Node add(Node head, E data){
     Node current=head;
     Node node=newNode(data);
     // If the Linked List is empty,
        // then make the new node as head

    if(current==null){
        head=node;}
    else{
        // locate the last node
        while(current.next!=null) {
            current=current.next;

        }
        // Insert the new_node at last node
        current.next=node;
    }
        // Return the list by head
    return head;}
      public static void print_linked_list(LinkedList list){
        Node current_Node=list.head;
        System.out.println("Linkedlist; ");
        while(current_Node!=null){
            System.out.println(current_Node.data+ " ");
            current_Node=current_Node.next;

        }}}

