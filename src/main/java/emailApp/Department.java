package emailApp;

public enum Department {
    SALES("sales"),
    DEVELOPMENT ("dev"),
    ACCOUNTING("acccounting"),
    BLANK(null);

    private String name;

    Department(final String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
