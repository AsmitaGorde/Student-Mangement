package Application2;



import java.util.ArrayList;
import java.util.List;

public class BLclass1 {
    private static List<Student1> data1 = new ArrayList<>();
    private static List<Subject> data2 = new ArrayList<>();



    {
        data2.add(new Subject(101, "math", 300));
        data2.add(new Subject(102, "j2ee", 400));
        data2.add(new Subject(103, "java", 700));
        data2.add(new Subject(104, "sql", 900));

    }


    public void addStudent(Student1 s) {


        data1.add(s);
    }


    public void display() {
        for (Student1 c : data1) {
            System.out.println(c.getName());
            System.out.println(c.getRollno());
            System.out.println(c.getMark());


        }
//        for (Subject c : data2) {
//            System.out.println(c.getSid());
//            System.out.println(c.getSname());
//            System.out.println(c.getSfees());
//
//
//        }
    }


    //REMOVE
    public void remove(int id) {
        for (int i = 0; i < data1.size(); i++) {

            if (id == data1.get(i).getRollno()) {
                data1.remove(i);

            }
        }
    }


    public void update(int id, String sname, double fee) {
        for (int i = 0; i < data1.size(); i++) {
            if (id == data2.get(i).getSid()) {
                data2.get(i).setSname(sname);
                data2.get(i).setSfees(fee);


            }
        }
    }

    public void search(int id) {
        for (int i = 0; i < data1.size(); i++) {
            boolean status = true;
            if (status) {
                if (id == data1.get(i).getRollno()) {
                    data1.contains(i);
                    for (Student1 c : data1) {
                        System.out.println(c.getName());
                        System.out.println(id == c.getRollno());
                        System.out.println(c.getMark());


                    }

                }
            }
        }


    }

    public void searchBySubject(String name) {
        for (Student1 c : data1) {

            if (c.getSubject().getSname().equals(name)) {

                System.out.println(c.getName());
                System.out.println(c.getRollno());
                System.out.println(c.getMark());
                System.out.println(c.getSubject().getSname());
                System.out.println(c.getSubject().getSid());
                System.out.println(c.getSubject().getSfees());


            }

        }

    }
}
