public class MyVector<T> {
    private T[] mas;
    private int size;
    private int max_size;

    public MyVector(int n) {
        this.mas = (T[]) new Object[n];
        this.max_size = n;
        this.size = -1;
    }

    public MyVector(MyVector mas_copy) {
        MyVector new_mas = new MyVector(this.size);
        new_mas.size = this.size;
        if (this.size > 0) {
            for (int i = 0; i < size; i++)
                new_mas.mas[i] = this.mas[i];
        }
    }

    public void add_tail(T new_elem) throws Exception {
        T[] tmp = (T[]) new Object[2 * this.max_size + 10];
        System.arraycopy(this.mas, 0, tmp, 0, this.max_size);
        //this.mas = (T[]) new Object[2 * size + 10];
        this.mas = tmp;
        this.max_size++;
        this.mas[++this.size] = new_elem;
    }

    public void remove_tail() throws Exception {
        if (max_size == -1 || size == 0) {
            throw new IllegalStateException("Vector is empty");
        } else {
            this.mas[size] = null;
            this.size--;
        }
    }

    public void addind(int ind, T a) throws Exception {
        try {
            T[] mas_tmp = (T[]) new Object[2 * this.max_size + 10];
            System.arraycopy(this.mas, 0, mas_tmp, 0, ind);
            mas_tmp[ind] = a;
            System.arraycopy(this.mas, ind, mas_tmp, ind + 1, this.size + 1 - ind);
            this.mas = mas_tmp;
            this.max_size++;
            this.size++;
        } catch (Exception e) {
            System.out.println("Incorrect index");
        }

    }

   
    public void remove_ind(int ind) throws Exception {
        if (this.size > -1) {
            if (ind < this.size) {
                for (int i = 0; i < this.size; i++) {
                    if (ind == i) {
                        for (int j = ind; j < this.size - 1; j++)
                            mas[j] = mas[j + 1];
                        mas[this.size] = null;
                        this.size--;
                        this.max_size--;
                        break;
                    }
                }
            } else if (ind == this.size) {
                this.remove_tail();
            } else {
                throw new RuntimeException("Index out of range");
            }
        }
    }

    public void clear_mas(){
        if (this.size > -1) {
            for (int i = 0; i < size; i++)
                mas[i] = null;
            this.size = 0;
        }
        else {
            System.out.println("Mas is empty");
        }
    }

    public int get_size(){
        return this.size+1;
    }
    public int get_max_size(){
        return this.max_size;
    }
    public T get_elem(int i){
        return mas[i];
    }

    public String toString() {
        if (this.size > 0) {
            String tmp = new String();
            tmp += "[";
            for (int i = 0; i < this.size; i++) {

                tmp = tmp + mas[i] + ", ";
            }
            //tmp = tmp + "[";
            tmp = tmp + mas[this.size];
            //tmp = tmp + "]";
            tmp += "]";
            return tmp;
        } else {
            return "";
        }
    }
}
