/**
 * Created by Lizzi on 01.11.2016.
 */
public class Staff extends Person{
    private String school;
    private double pay;

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Staff)) return false;
        if (!super.equals(o)) return false;

        Staff staff = (Staff) o;
        if ((school==staff.school)&&(pay==staff.pay))
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (school != null ? school.hashCode() : 0);
        temp = Double.doubleToLongBits(pay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Staff{" +super.toString()+
                ", school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Staff(String name, String address, String school, double pay) {

        super(name, address);
        this.school = school;
        this.pay = pay;
    }
}
