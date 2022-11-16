package Task3;

public class Sudents extends Person{
    private String typeOfStudy;
    private int yearOfStudy;
    private double studyPrice;

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getStudyPrice() {
        return studyPrice;
    }

    public void setStudyPrice(double studyPrice) {
        this.studyPrice = studyPrice;
    }

    @Override
    public String toString() {
        return "(" + typeOfStudy + yearOfStudy + studyPrice + ")";
    }
}
