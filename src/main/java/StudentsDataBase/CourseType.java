package StudentsDataBase;

public enum CourseType {
    HISTORY(600),
    MATHEMATICS(600),
    ENGLISH(600),
    CHEMISTRY(600),
    COMPUTER_SCIENCE(600);

    private int cost;

    CourseType(final int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
