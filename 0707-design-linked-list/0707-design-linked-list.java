class Node{
    int val;
    Node next;

    Node(int val,Node next){
        this.val = val;
        this.next = next;
    }
     Node(int val){
        this.val = val;
        this.next = null;
    }
}
class MyLinkedList {

    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size= 0;
        
    }
    
    public int get(int index) {

        if(index < 0 || index>= size) return -1;

        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.val;
        
    }
    
    public void addAtHead(int val) {

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
        
    }
    
    public void addAtTail(int val) {
        Node current = head;
        if(current == null){
            addAtHead(val);
        }else{
        while(current.next!=null){
            current = current.next;
            
        }
        Node newNode =new Node(val);
        current.next = newNode;
        size++;
        }
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        if(index == 0){
          addAtHead(val);
        }else{
            int count=1;
            Node temp = head;
            while(count<index){
                temp=temp.next;
                count++;
            }
            Node newNode = new Node(val);
            Node next = temp.next;
            temp.next = newNode;
            newNode.next = next;
            size++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
         if(index>=size){
            return;
        }
        if(index == 0){
            head = head.next;
            size--;
        }else{
            int count=1;
            Node temp = head;
            while(count<index){
                temp=temp.next;
                count++;
            }
           
            temp.next = temp.next.next;
           
            size--;
        }
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */