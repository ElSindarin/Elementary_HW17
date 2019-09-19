import java.util.UUID;

public class IncompleteClothingException extends Exception{
    private UUID uuid;

    public IncompleteClothingException(String message) {
        super(message);
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }
}
