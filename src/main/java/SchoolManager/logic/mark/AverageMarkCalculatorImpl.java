package SchoolManager.logic.mark;

import SchoolManager.data.MarkedSubject;
import SchoolManager.data.Subject;

import java.util.OptionalDouble;
import java.util.Set;

public class AverageMarkCalculatorImpl implements AverageMarkCalculator {
    @Override
    public OptionalDouble getAverageMarkFromCertainSubject(Set<MarkedSubject> markedSubjectSet, Subject subject) {
        return markedSubjectSet.stream()
                .filter(markedSubject -> markedSubject.subject().equals(subject))
                .mapToDouble(MarkedSubject::mark)
                .average();
    }
}
