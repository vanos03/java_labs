
public class MyList<T> {
    Node<T> first_elem;
    Node<T> last_elem;
    int size;

    public MyList() {
        this.first_elem = null;
        this.last_elem = null;
        this.size = 0;
    }

    public MyList(MyList<T> originlist) {

        if (originlist.first_elem != null)
        {
            Node<T> orig_cur = originlist.first_elem;

            this.first_elem = new Node<T>(orig_cur.data);
            Node<T> newlist = this.first_elem;

            while (orig_cur.next != null)
            {
                orig_cur = orig_cur.next;
                newlist.next = new Node<T>(orig_cur.data);
                newlist = newlist.next;
            }

            this.last_elem = newlist;
            this.size = originlist.size;

        }
        else {

            this.first_elem = null;
            this.last_elem = null;
            this.size = 0;
        }

    }

    static class Node<T>
    {
        T data;
        Node<T> next;

        Node(T d)
        {
            data = d;
            next = null;
        }
    }

    public void insertend(T data)  throws Exception {
        Node new_node = new Node(data);
        try {
            if (this.first_elem == null) {
                this.first_elem = new_node;
                this.last_elem = new_node;
            } else {
                Node last = this.first_elem;
                while (last.next != null) {
                    last = last.next;
                    this.last_elem = last.next;
                }
                last.next = new_node;
            }
            this.size++;
        }
        catch(Exception e)
        {
            System.out.println("Ошибка добавления последнего элемента");
        }

    }

    public void insertfirst(T data)  throws Exception{
        try {
            Node new_node = new Node(data);
            if (this.first_elem == null) {
                this.first_elem = new_node;
                this.last_elem = new_node;
            } else {
                new_node.next = this.first_elem;
                this.first_elem = new_node;
            }
            this.size++;
        }
        catch(Exception e)
        {
        System.out.println("Ошибка добавления первого элемента");
        }
    }

    public void delfirst()  throws Exception {
        try
        {
            this.first_elem = this.first_elem.next;
            this.size--;
        }
        catch(Exception e)
        {
            System.out.println("Ошибка удаления первого элемента");
        }
    }

    public void delval(T data)  throws Exception {
        try
        {
            Node curr = this.first_elem, prev = null;

            if (curr != null && curr.data == data) {
                this.first_elem = curr.next;
                this.size--;
                System.out.println(data + " found and deleted");
            }

            while (curr != null && curr.data != data) {
                prev = curr;
                curr = curr.next;
            }

            if (curr != null) {
                prev.next = curr.next;
                this.size--;
                System.out.println(data + " found and deleted");
            }
            if (curr == null) {
                System.out.println(data + " not found");
            }
        }
        catch(Exception e)
        {
            System.out.println("Ошибка удаления элемента");
        }
    }

    public void existval(T data) {
        Node curr = this.first_elem;

        while (curr != null && !(curr.data.equals(data)))
            curr = curr.next;
        if (curr.data.equals(data))
            System.out.println(data + " is exist");
        else {
            System.out.println(data + " not found");
        }

    }

    public void print() {
        Node currNode = first_elem;
        System.out.print("MyList: ");
        while (currNode != null)
        {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public int getsize(){
        return this.size;
    }

    public void clear()  throws Exception {
        try {

            Node curr = this.first_elem;
            while (curr.next != null)
                curr = curr.next;
            this.first_elem = null;
            this.size = 0;
        } catch (Exception e) {
            System.out.println("Ошибка очистки списка");
        }
    }

}
