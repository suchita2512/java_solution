import java.util.*;
class DoubleList {  
  
      class Nodelist{  
        int info;  
        Nodelist prev;  
        Nodelist next;  
  
        public Nodelist(int data) {  
            info = data;  
        }  
    }  
  
    int size = 0;  
  
    Nodelist head, tail = null;  
  
  
    public void addNewNode(int data) {  
        Nodelist newNode = new Nodelist(data);  
          if(head == null) {  
            head=newNode;
            tail=newNode;
            head.prev = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.prev = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
         size++;  
    }  
      public void rotateNodes(int n) {  
          Nodelist current = head;  
          if(n == 0 || n >= size)  
            return;  
        else {  
               for(int i = 1; i < n; i++)  
                current = current.next;  
                tail.next = head;  
           
            head = current.next;  
         
            head.prev = null;  
           
            tail = current;  
          
            tail.next = null;  
        }  
    }  
  
        public void display() {  
         Nodelist current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            System.out.print(current.info + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        DoubleList  r = new DoubleList();  
        r.addNewNode(1);  
        r.addNewNode(2);  
        r.addNewNode(3);  
        r.addNewNode(4);  
        r.addNewNode(5);  
  
        System.out.println(" List without rotation: ");  
        r.display();  
	int  n;
        System.out.println("move the list by how many nodes pleas enter   ");
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();

        r.rotateNodes(n);  
  
        System.out.println("Updated List: ");  
        r.display();  
    }  
}  