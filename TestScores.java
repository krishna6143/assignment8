import java.util.*;

public class TestScores {
    public static void main(String[] args) {
        List<Integer> testScores = new ArrayList<>();
        testScores.add(85);
        testScores.add(92);
        testScores.add(78);
        testScores.add(65);
        testScores.add(88);
        testScores.add(75);
        testScores.add(90);
        testScores.add(83);
        testScores.add(79);
        testScores.add(95);

     
        double totalScore = 0;
        for (int score : testScores) {
            totalScore += score;
        }
        double averageScore = totalScore / testScores.size();

      
        Collections.sort(testScores);
        int medianIndex = testScores.size() / 2;
        double medianScore;
        if (testScores.size() % 2 == 0) {
            medianScore = (testScores.get(medianIndex - 1) + testScores.get(medianIndex)) / 2.0;
        } else {
            medianScore = testScores.get(medianIndex);
        }

        int aboveAverage = 0;
        int atAverage = 0;
        int belowAverage = 0;

        for (int score : testScores) {
            if (score > averageScore) {
                aboveAverage++;
            } else if (score == averageScore) {
                atAverage++;
            } else {
                belowAverage++;
            }
        }

    
        System.out.println("Number of students who scored above the average: " + aboveAverage);
        System.out.println("Median score for students who scored above the average: " + medianScore);
        System.out.println("Number of students who scored at the average: " + atAverage);
        System.out.println("Median score for students who scored at the average: " + medianScore);
        System.out.println("Number of students who scored below the average: " + belowAverage);
        System.out.println("Median score for students who scored below the average: " + medianScore);
    }
}
