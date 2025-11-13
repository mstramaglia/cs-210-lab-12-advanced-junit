import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Student score and grade calculations")
class StudentTest {

    @Test
    @DisplayName("Average of multiple scores is computed correctly")
    void averageOfScoresIsCorrect() {
        // TODO: 1) Create a Student with an empty scores list.
        // TODO: 2) Add a few scores (e.g., 80, 90, 100).
        // TODO: 3) Call calculateAverageScore().
        // TODO: 4) Assert that the result is the expected average (e.g., 90.0).
    }

    @Test
    @DisplayName("calculateAverageScore throws when there are no scores")
    void calculateAverageThrowsWhenNoScores() {
        // TODO: 5) Create a Student with no scores.
        // TODO: 6) Use assertThrows to verify that calculateAverageScore()
        //          throws IllegalStateException.
    }

    @Test
    @DisplayName("addScore throws for invalid scores (negative or > 100)")
    void addScoreThrowsForInvalidScores() {
        // TODO: 7) Create a Student.
        // TODO: 8) Use assertThrows for a score < 0.
        // TODO: 9) Use assertThrows for a score > 100.
    }

    @ParameterizedTest(name = "Average {0} should produce grade {1}")
    @CsvSource({
            "95, A",
            "90, A",
            "89, B",
            "80, B",
            "75, C",
            "65, D",
            "50, F"
    })
    @DisplayName("Final letter grade for various average values")
    void finalLetterGradeForVariousAverages(double average, char expectedGrade) {
        // TODO: 10) Create a Student with an empty scores list.

        // TODO: 11) Add scores that will result in the given average.
        //           Simple approach: add the same score twice, equal to the rounded average.

        // TODO: 12) Call getFinalLetterGrade().
        // TODO: 13) Assert that the returned grade matches expectedGrade.
    }
}
