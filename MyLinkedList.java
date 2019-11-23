    public class MyLinkedList {
        public static Node buildLinkedListManual() {
            Node n1 = new Node(4);
            Node n2 = new Node(5);
            Node n3 = new Node(6);
            // 1 2 3
            n1.next = n2;
            n2.next = n3;
            n3.next = null;
            return n1;
        }

        //打印链表
        public static void printLinkedList(Node head) {
            Node cur = head;
            //遍历链表
            while (cur != null) {
                System.out.println(cur.val);
                //打印的形式为Node{}   Node{}   Node{}
                //System.out.println(cur);
                cur = cur.next;
            }
        }

        //头插
        public static Node pushFront(Node head, int val) {
            //将要头插的元素装进小火车里面
            Node node = new Node(val);
            node.next = head;
            return node;
        }

        //头删
        public static Node popFront(Node head) {
            if (head == null) {
                //链表运行时异常
                throw new RuntimeException("空链表");
            }
            return head.next;
        }

        //尾插
        public static Node pushBack(Node head, int val){
            Node node = new Node(val);
            if(head == null){
                //链表中没有结点
                head = node;
                return node;
            }else {
                //链表中至少有一个结点
                Node cur = head;
                while (cur.next != null) {
                    cur = cur.next;
                }
                //cur.next一定是null,即cur为当前链表的最后一个节点
                cur.next = node;
                return head;
            }
        }
        //尾删
        public static Node popBack(Node head){
            if(head == null){
                throw new RuntimeException("空链表");
            }else if(head.next == null){
                return null;
            }else{
                Node cur = head;
                while(cur.next.next != null){
                    cur = cur.next;
                }
                cur.next = null;
                return head;
            }
        }

        public static void main(String[] args) {
            Node head = buildLinkedListManual();

            printLinkedList(head);

            //链表的头节点为空
            //Node head = null;

            head = pushFront(head, 3);
            head = pushFront(head, 2);
            head = pushFront(head, 1);
            head = pushFront(head, 0);

            printLinkedList(head);

            head = popFront(head);

            printLinkedList(head);

            head = pushBack(head,7);
            head = pushBack(head,8);
            head = pushBack(head,9);

            printLinkedList(head);

            head = popBack(head);

            printLinkedList(head);
        }
    }

