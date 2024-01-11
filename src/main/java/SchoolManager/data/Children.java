package SchoolManager.data;

import java.time.LocalDate;
import java.util.Set;

public record Children(String name, LocalDate birthdate, Set<MarkedSubject> subjectSet) {
}
