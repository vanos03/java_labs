public class Student extends Person{
    String id_group;
    public Student(String name, String id){
        this.id_group = id;
        this.name = name;
    }
    public String get_s(){
        return "Student " + this.name + " id: " + this.id_group;
    }
}
