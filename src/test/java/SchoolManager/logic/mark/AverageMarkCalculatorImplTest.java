package SchoolManager.logic.mark;

import SchoolManager.data.MarkedSubject;
import SchoolManager.data.Subject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.Set;

class AverageMarkCalculatorImplTest {

    AverageMarkCalculator averageMarkCalculator = new AverageMarkCalculatorImpl();

    @Test
    void getAverageMarkFromCertainSubject() {

        var markedSubject1 = new MarkedSubject(Subject.MATH, 1);
        var markedSubject2 = new MarkedSubject(Subject.SPORTS, 2);
        var markedSubject3 = new MarkedSubject(Subject.LANGUAGE, 3);
        var markedSubject4 = new MarkedSubject(Subject.MATH, 4);

        var markedSubjectSet = Set.of(markedSubject1, markedSubject2, markedSubject3, markedSubject4);
        var expected = OptionalDouble.of(2.5);
        var subject = Subject.MATH;

        var actual = averageMarkCalculator.getAverageMarkFromCertainSubject(markedSubjectSet, subject);

        Assertions.assertEquals(expected,actual);
    }
}