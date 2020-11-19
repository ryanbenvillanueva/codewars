public class GradeBook {

    public static char getGrade(int s1, int s2, int s3) {
        char grade = ' ';
        int average = (int) (s1 + s2 + s3) / 3;

        if (average < 60) {
            grade = 'F';
        } else if (average < 70) {
            grade = 'D';
        } else if (average < 80) {
            grade = 'C';
        } else if (average < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        return grade;
    }
}