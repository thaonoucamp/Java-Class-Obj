// Tao lop;
public class Person {
    String name;
    String info;
    int age;

    public void run(String name) {
        System.out.println(name + "chay bo");
    }

    public static void main(String[] args) {
        // 3 cach tao Obj;
        new Person(); // Tao 1 doi tuong;

        Person thao = new Person(); // Tao Obj 2;

        Person vinh = new Person(); // Tao Obj 3;

        thao.run("thao: ");

        vinh.run("vinh: ");
    }
}
