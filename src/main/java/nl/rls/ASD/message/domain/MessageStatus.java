package nl.rls.ASD.message.domain;

public enum MessageStatus {
    creation(1),
    modification(2),
    deletion(3);

    private int value;

    MessageStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
