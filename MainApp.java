package Application2;

import Application2.BLclass1;

import java.util.Scanner;




public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static BLclass1 bl = new BLclass1();

    public static void main(String[] args) {
        boolean status = true;
        do {
            System.out.println("1.add student");
            System.out.println("2.display");
            System.out.println("3.remove");
            System.out.println("4.update student  subject");
            System.out.println("5.search student by id");
            System.out.println("6.display student by subject");

            System.out.println("7.exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    addStudent();
                case  2:
                     display1();
                    break;
                case 3:
                   removeStudent();
                    break;
                case 4:
                     updateStudent();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    displayStudent();
                case 7:
                default:
                    System.out.println("invalid choice");

            }


        } while (status);

    }




    private static void searchStudent() {
        System.out.println("enter id");
        int id= sc.nextInt();
        bl.search(id);
        System.out.println("search student successfully");
    }

    private static void displayStudent() {
        System.out.println("enter Sname");
        String sname=sc.next();


        bl.searchBySubject(sname);
        System.out.println("Display Student by sub");
    }

    private static void updateStudent() {
        System.out.println("enter sid");
        int id=sc.nextInt();
        System.out.println("enter student name");
        String sname= sc.next();
        System.out.println("enter fee");
        double fee= sc.nextDouble();
//        System.out.println("enter sub");
//        String sub=sc.next();


        bl.update(id,sname,fee);
        System.out.println("updated");
Subject s=updateSub();


    }
    public static Subject updateSub(){
        System.out.println("enter updated sid");
        int sid=sc.nextInt();
        System.out.println("enter updated sname");
        String sname=sc.next();
        System.out.println("enter updated fee");
        double fee=sc.nextDouble();
        Subject s=new Subject(sid,sname,fee);

        return s;

    }


    public static  void addStudent(){
            System.out.println("enter rollno");
            int id= sc.nextInt();
            System.out.println("enter name");
            String name=sc.next();
            System.out.println("mark");
            int mark=sc.nextInt();
        Subject s=addSub();
        Student1 s1= new Student1(id,name,mark,s);
         bl.addStudent(s1);
            System.out.println("add successfully");

        }
        public static Subject addSub(){
            System.out.println("enter sid");
            int sid=sc.nextInt();
            System.out.println("enter sname");
            String sname=sc.next();
            System.out.println("enter fee");
            double fee=sc.nextDouble();
            Subject s=new Subject(sid,sname,fee);

            return s;


        }
    private static void display1() {

        bl.display();
    }

    public static void removeStudent(){
        System.out.println("enter id");
        int id= sc.nextInt();

        bl.remove(id);
        System.out.println("remove successfully");

    }




    }

