package ca.prog1400;

import java.util.ArrayList;

public class Student extends Person {
    int studentYear;
    double studentFee = 3000;

    public Student(String personName, String personAddress, int studentYear) {
        super(personName, personAddress);
        this.studentYear = studentYear;
    }

    public static String getIncoming(ArrayList<Student> students) {
        double studentIncoming = 0;

        for (int i = 0; i < students.size(); i++)
        {
            studentIncoming += students.get(i).studentFee;
        }
        studentIncoming = studentIncoming / 2;

        return String.format("%.2f", studentIncoming);
    }

    @Override
    public String toString() {
        studentFee += 100 * (this.studentYear - 1);

        return String.format("name = %s, address = %s, year = %d, fee = $%.2f", super.getPersonName(), super.getPersonAddress(), this.studentYear, studentFee);
    }
}
