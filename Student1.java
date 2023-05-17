package Application2;

public class Student1 {
    private int rollno;
    private String name;
    private double mark;

    public Student1(int rollno, String name, double mark ,Subject subject) {
        this.rollno = rollno;
        this.name = name;
        this.mark=mark;
        this.subject=subject;

    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    private Subject subject;
}
