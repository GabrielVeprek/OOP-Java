package SchoolManager.logic.mark;

import SchoolManager.data.MarkedSubject;
import SchoolManager.data.Subject;

import java.util.OptionalDouble;
import java.util.Set;

public interface AverageMarkCalculator {
    OptionalDouble getAverageMarkFromCertainSubject(Set<MarkedSubject> markedSubjectSet, Subject subject);
}
