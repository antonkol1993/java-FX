package piatnashki_new.service;

public enum  ButtonColours {
    RED("-fx-border-color:red; -fx-background-color: black;"),
    WHITE("-fx-border-color:black; -fx-background-color: white;"),
    BLACK("-fx-border-color:white; -fx-background-color: black;");
    private String colour;
    ButtonColours(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
