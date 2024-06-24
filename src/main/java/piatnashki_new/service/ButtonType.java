package piatnashki_new.service;

public enum ButtonType {

    SMALL(8),
    MEDIUM(12),
    LARGE(16);

    private int size;

    ButtonType(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
