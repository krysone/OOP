package chodek.exc1;

public enum SingleOrCoupleInvite {
    JEDEN(3),
    SINGLE(1)
    ,COUPLE(2);

    private int numberOfGuests;

    SingleOrCoupleInvite(final int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }
}
