/**
 * Created by Lizzi on 01.11.2016.
 */
public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if ((program==student.program)&&(year==student.year)&&(fee==student.fee))
            return true;
        else return false;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (program != null ? program.hashCode() : 0);
        result = 31 * result + year;
        temp = Double.doubleToLongBits(fee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                ", program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                '}';
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Student(String name, String address, String program, int year, double fee) {

        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
}
