package Application2;

public class Subject {

    private   int sid;
    private String sname;

    public Subject( int sid, String sname, double sfees) {
        this.sid=sid;
        this.sname =sname;
        this.sfees=sfees;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getSfees() {
        return sfees;
    }

    public void setSfees(double sfees) {
        this.sfees = sfees;
    }

    private   double sfees;
}
