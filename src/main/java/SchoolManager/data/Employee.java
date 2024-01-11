package SchoolManager.data;

import java.util.UUID;

public record Employee(Position position, UUID id, String name, int experience) {
}
