package ca.prog1400;

// subClass

public class Student extends Person {

    private int year;
    private double fee;

    public Student(String name, String address, int year, double fee) {
        super(name, address);
        this.year = year;
        this.fee = fee;
    };

//    public double calculateFee() {
//        return ;
//    };


    @Override
    public String toString() {
        String studentDetails = "";
        studentDetails += super.toString() + "year = " + this.year + ", fee = $" + String.format("%.2f",this.fee);
        return studentDetails;
    };
}
