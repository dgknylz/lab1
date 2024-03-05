public class GradeBook {
    private String courseName;
    private final int[] grades;

    public GradeBook(String name, int[] gradesArray){
        courseName = name;
        grades = gradesArray;
    }

    public String getCourseName(){
        return  courseName;
    }

    public void setCourseName(String name){
        courseName = name;
    }

    public void displayMessage(){
        System.out.println("Welcome to the grade book for :" + getCourseName());
    }

    public void processGrades() {
        outputGrades(); //öğrenci notlarını gösteren metod

        System.out.println("Class average is " + getAverage()); // ortalama

        System.out.println("Low grade is " + getMinumum() + "Highest grade " + getMaximum());

        outputBarChart(); //belirli aralıktaki değerlerin yanına * koyuyor
    }

    public  int getMinumum(){
        int lowgrade = grades[0];
        for (int grade : grades) {
            if (grade < lowgrade){
                lowgrade = grade;
            }

        }
        return lowgrade;
    }

    public int getMaximum(){
        int highgrade = grades[0];
        for (int grade : grades){
            if (grade < highgrade)
                highgrade = grade;
        }
        return highgrade;
    }

    public double getAverage(){
        int total = 0;
        for (int grade : grades)
            total+=grade;
        return (double) total/grades.length;
    }

    public void outputBarChart(){
        System.out.println("Grade Distribution :");

        int[] frequency = new int[11];

        for (int grade : grades)
            ++frequency[grade /10];
        for (int count = 0; count< frequency.length; count++){
            if (count == 10)
                System.out.printf("%5d:", 100);
            else
                System.out.printf("%02d--%02d:", count*10, count*10+9);
            for (int stars=0; stars<frequency[count]; stars++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void  outputGrades(){
        System.out.println("The grades are :");
        for (int student = 0; student < grades.length; student++) {
            System.out.println("Student "+ (student + 1) + " : " +grades[student]);

        }
    }
}


