public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "AP Computer Science A";
    System.out.println("course name: " + course);
    
    int time = 135;
    System.out.println("average time spent in a week for this course in minutes: " + time);
    
    int hw1 = 75;
    int hw2 = 99;
    int hw3 = 80;
    int hw4 = 100;
    System.out.println("homework grades for this course: " + hw1 + " " + hw2 + " " + hw3 + " " + hw4);

    double quiz1 = 89.2;
    double quiz2 = 98.1;
    System.out.println("quiz grades for this course: " + quiz1 + " " + quiz2);

    double finalExam = 87.58;
    System.out.println("final exam grade for this course: " + finalExam);

    System.out.println("Weekly time spent: " + time/60 +  "hr" + time%60); 
    
    double hwAvg = ((hw1+hw2+hw3+hw4)/4.0);
    System.out.println("Average homework grade: " + hwAvg);

    double quizAvg = ((quiz1+quiz2)/2);
    System.out.println("Average quiz grade: " + quizAvg);

    System.out.println("Final exam grade: " + finalExam);

    double finalGrade = ((hwAvg * 0.35) + (quizAvg * 0.15) + (finalExam * 0.5));
    int roundedfinalGrade = (int)(finalGrade + 0.5);
    System.out.println("Overall grade: " + roundedfinalGrade);
  }
}
