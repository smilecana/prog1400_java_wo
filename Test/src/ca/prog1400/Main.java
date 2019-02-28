package ca.prog1400;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    //블랭크 밸리데이션
    public static String getNonBlankInput(String prompt) {
        String input = JOptionPane.showInputDialog(prompt);

        while ("".equals(input.trim())) {
            JOptionPane.showMessageDialog(null, "Cannot accept blank entries!");
            input = JOptionPane.showInputDialog(prompt);
        }

        return input;
    }

    // 학생 년도 밸리데이션
    public static int validateyear(String prompt) {
        String input = JOptionPane.showInputDialog(prompt);
        boolean check;
        int num = 0;

        if("".equals(input.trim())) {
            while ("".equals(input.trim())) {
                JOptionPane.showMessageDialog(null, "Cannot accept blank entries!");
                input = JOptionPane.showInputDialog(prompt);
            }
        } else if(!"".equals(input.trim())) {
            do {
                check = true;

                try {
                    num = Integer.parseInt(input);
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Please enter a number");
                    check = false;
                    input = JOptionPane.showInputDialog(prompt);
                }

                while(num < 0 || num > 4){
                    JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 4");
                    input = JOptionPane.showInputDialog(prompt);

                }


            }while(!check);

        }



        return num;
    }

// 따로 만들려다가 실패함 ..
//    public static int getNumericInput(String StringInputYear) {
//
//        boolean check;
//        int num = 0;
//        do {
//            check = true;
//
//            try {
//                num = Integer.parseInt(StringInputYear);
//            }
//            catch (NumberFormatException e)
//            {
//                JOptionPane.showMessageDialog(null, "Enter num");
//                check = false;
//            }
//        }while(!check);
//
//        return num;
//    }

//    public static int getNumericInput(String stringYearInput) {
//
//        int temp;
//        do{
//            while(!stringYearInput.isEmpty()) {
//                try {
//
//                    temp = Integer.parseInt(stringYearInput);
//                } catch (NumberFormatException e) {
//                    JOptionPane.showMessageDialog(null, "Please enter a number");
//                    temp = -1;
//
//                }
//            }
//        } while (temp < 0);
//
//        return temp;
//    }

//    public static int getStudentYearInRange (int input) {
//
//    }


    public static void main(String[] args) {
        // write your code here

        ArrayList<Student> students = new ArrayList<>();

        int choiceNum = 2;
        String[] options = {"Student", "Staff", "Finish"};


        do {
            choiceNum = JOptionPane.showOptionDialog(null, "Select Student or Staff.", "Accounting App",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            System.out.println(choiceNum);

            if(choiceNum == 0) {

                String inputName = getNonBlankInput("Enter Student Name");

                String inputAddress = getNonBlankInput("Enter Student Address");

//                String inputYear = getNonBlankInput("Enter student year (1-4)");
                int intYear = validateyear("Enter student year (1-4)");

                System.out.println(intYear);





                double fee = 0;
                fee = 3000 + ((intYear - 1) * 100);

                students.add(new Student(inputName, inputAddress, intYear, fee));
            }

        }while (choiceNum < 2);

        String report = "";
        int i = 1;
        report = "Students " + "[Total:" + students.size() + "]" + "\n";
        for(Student student: students) {
            report += i + ". " + student + "\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, report);


    }
}
