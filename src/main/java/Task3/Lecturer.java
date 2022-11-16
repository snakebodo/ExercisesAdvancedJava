package Task3;

public class Lecturer extends Person{
    private String specialzation;
    private double salary;

    public Lecturer(String specialzation, double salary) {
        this.specialzation = specialzation;
        this.salary = salary;
    }

    public String getSpecialzation() {
        return specialzation;
    }

    public void setSpecialzation(String specialzation) {
        this.specialzation = specialzation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "(" + specialzation + salary + ")";
    }
}
