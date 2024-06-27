package piatnashki_new.service;

public enum ButtonSize {

    SMALL(8),
    MEDIUM(12),
    LARGE(16);

    private int size;

    ButtonSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
