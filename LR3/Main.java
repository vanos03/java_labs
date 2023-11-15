public class Main {
    public static void main(String[] args) throws Exception{
        /*
        MyVector v = new MyVector(5);
        for(int i = 0; i < 8; i++) {
            v.add_tail(i);
        }

        v.add_ind(2,9);
        v.add_ind(4,9);
        v.remove_tail();

        System.out.println("Count of elements:" + v.get_size());
        System.out.println("Size of array:" + v.get_max_size());
        v.clear_mas();
        System.out.println("\n\nCount of elements:" + v.get_size());
        System.out.println("Size of array:" + v.get_max_size());

        v.clear_mas();*/

        Student s1 = new Student("ivan1", "123");
        Student s2 = new Student("ivan2","145");
        Student s3 = new Student("ivan3","234");
        Student s4 = new Student("ivan4","456");

        MyVector v = new MyVector(1);
        v.add_tail(s1.get_s());
        v.add_tail(s2.get_s());
        v.add_tail(s3.get_s());

        System.out.println(v.toString());
        v.addind(2, s4.get_s());
        System.out.println(v.toString());






    }
}
