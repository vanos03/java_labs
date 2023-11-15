
public class test {
    public static void main(String[] args)  throws Exception {
        /*
        MyList list = new MyList();

        System.out.println(list.getsize());

        list.insertend(1);
        System.out.println(list.getsize());

        list.insertend(1);
        System.out.println(list.getsize());

        list.insertend(1);
        System.out.println(list.getsize());
        list.print();

        list.insertend(1);
        System.out.println(list.getsize());

        list.insertfirst("adasd");
        System.out.println(list.getsize());

        list.insertend(1);
        list.insertend("adasd");

        System.out.println(list.getsize());
        list.delfirst();


        list.delval("adasd");
                list.clear();
        list.print();

        System.out.println(list.getsize());
        list.insertend(1);

        MyList list2 = new MyList(list);
        list2.print();
*/
        complex c = new complex(2, 2);
        complex c1 = new complex(2, 2);
        MyList cl = new MyList();

        cl.insertfirst(c.getval());
        cl.existval(c1.getval());


    }
}