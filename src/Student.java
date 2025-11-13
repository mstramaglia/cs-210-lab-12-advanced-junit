import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private String name;
    private List<Integer> scores;

    /**
     * Creates a Student with a name and an empty score list.
     */
    public Student(String name) {
        this.name = name;
        this.scores = new ArrayList<>();
    }

    /**
     * Creates a Student with a name and an existing list of scores.
     * (If the list is null, it will be replaced with an empty list.)
     */
    public Student(String name, List<Integer> scores) {
        this.name = name;
        this.scores = (scores != null) ? scores : new ArrayList<>();
    }

    // --------------------
    // Getters and Setters
    // --------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = (scores != null) ? scores : new ArrayList<>();
    }

    // --------------------
    // Core Behaviors
    // --------------------

    /**
     * Adds a score to this student's score list.
     *
     * Valid range: 0–100 inclusive.
     *
     * @param score the score to add
     * @throws IllegalArgumentException if the score is outside [0, 100]
     */
    public void addScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        scores.add(score);
    }

    /**
     * Calculates the average of all scores.
     *
     * @return the average score as a double
     * @throws IllegalStateException if there are no scores
     */
    public double calculateAverageScore() {
        if (scores.isEmpty()) {
            throw new IllegalStateException("No scores available to calculate average");
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return (double) sum / scores.size();
    }

    /**
     * Returns a letter grade based on the average score.
     *
     * Grade scale:
     *  90–100 → A
     *  80–89  → B
     *  70–79  → C
     *  60–69  → D
     *  < 60   → F
     *
     * @return the final letter grade
     */
    public char getFinalLetterGrade() {
        double avg = calculateAverageScore();

        if (avg >= 90) return 'A';
        if (avg >= 80) return 'B';
        if (avg >= 70) return 'C';
        if (avg >= 60) return 'D';
        return 'F';
    }

    // --------------------
    // Object Overrides
    // --------------------

    @Override
    public String toString() {
        return "Student{name='" + name + "', scores=" + scores + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
               Objects.equals(scores, student.scores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, scores);
    }
}
