package chodek.exc1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Invite {
    static ArrayList<Invite> inviteMap = new ArrayList<>();

    public static void createInvites() throws Exception {
        SingleOrCoupleInvite singleOrCoupleInvite = SingleOrCoupleInvite.SINGLE;
        System.out.println("Welcome to the Weding Invite creator");
        System.out.println("Please advise how many invites you want to create?");
        System.out.println("to confirm hit the enter key");
        Scanner in = new Scanner(System.in);
        int numInvites = in.nextInt();
        System.out.println("Thank You");
        System.out.println("You've choosen " + numInvites + " invitations to be created");
        for (int i = 0; i < numInvites; i++) {
            System.out.println("Please pass the name of the invited person");
            String name = in.next();
            System.out.println("Thank you");
            System.out.println("Please Pass the surname of the invited person");
            String surname = in.next();
                try {
                    System.out.println("Make this invitation for a single person or for a couple");
                    System.out.println("Type in consequentely '1' or '2'");
                    String numPeople = in.next();
                    if (Integer.parseInt(numPeople) == 1) {
                        singleOrCoupleInvite = SingleOrCoupleInvite.SINGLE;
                    } else if (Integer.parseInt(numPeople) == 2) {
                        singleOrCoupleInvite = SingleOrCoupleInvite.COUPLE;
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    boolean wrongInput = true;
                    while (wrongInput = true){
                        wrongInput =false;
                        System.out.println("sorry only 1 or 2 allowed");
                        System.out.println("pass the number of people to be invited again please");
                        String numPeople = in.next();
                        if (Integer.parseInt(numPeople) == 1) {
                            singleOrCoupleInvite = SingleOrCoupleInvite.SINGLE;
                        } else if (Integer.parseInt(numPeople) == 2) {
                            singleOrCoupleInvite = SingleOrCoupleInvite.COUPLE;
                        }else {
                            wrongInput = true;
                        }
                    }
                }


            Invite invit = new Builder()
                    .setName(name)
                    .setSurname(surname)
                    .setType(singleOrCoupleInvite)
                    .build();
            inviteMap.add(invit);
            System.out.println(invit.type + " type invitation for " + invit.name + " "
                    + invit.surname + " has been created and saved");
        }
        int mapSize = inviteMap.size();
        System.out.println("Overall " + mapSize + " invites has been created");
        inviteMap.forEach((a) -> System.out.println(a.name + " : " + a.surname + " : " + a.type+ " type"));
        int totalNumPeople = 0;
        for (Invite invita : inviteMap) {
            totalNumPeople = totalNumPeople + invita.type.getNumberOfGuests();
        }
        System.out.println("In total you'll be inviting "+totalNumPeople+" people");
        System.out.println("thank you for using our App");
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public SingleOrCoupleInvite getType() {
        return type;
    }

    private String name;
    private String surname;
    private SingleOrCoupleInvite type;

    public Invite(final String name, final String surname, final SingleOrCoupleInvite type) {
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    public static class Builder {
        private String name;
        private String surname;
        private SingleOrCoupleInvite type;


        public Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(final String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setType(final SingleOrCoupleInvite type) {
            this.type = type;
            return this;
        }

        public Invite build() {
            System.out.println("An invite for " + name + " " + surname + " is created");
            return new Invite(name, surname, type);
        }
    }
}
