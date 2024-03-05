public class Main {
    public static void main(String[] args) {
        int[] gradesArray = {87, 68, 100, 83, 78, 85, 91, 76, 87};

        GradeBook myGradeBook = new GradeBook("Proglama", gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
}
