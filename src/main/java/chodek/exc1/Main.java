package chodek.exc1;

public class Main {

    /*
    * Zadanie 1
Stwórz aplikację dla osób które zapraszają ludzi na wesela. Aplikacja na początku pobiera od
użytkownika ilość osób zaproszonych na wesele, a następnie prosi o podanie czy jest to
zaproszenie POJEDYNCZE czy Z_OS_TOWARZYSZACA.
Stwórz enum TypZaproszenia o polach:
POJEDYNCZE
Z_OS_TOWARZYSZACA
Enum powinien posiadać pole prywatne 'ileOsob' które dla
wyboru POJEDYNCZE ma wartosc 1, dla Z_OS_TOWARZYSZACA ma wartosc 2.
Stwórz getter do tego pola.
Stwórz klasę zaproszenie które posiada pola:
Imię,
Nazwisko,
TypZaproszenia
Po zaimplementowaniu poproś użytkownika o podanie ilości zaproszeń a następnie wprowadź dla
każdego zaproszenia jego imie, nazwisko i typ.
Przechowaj zaproszenia w kolekcji.
Po zebraniu informacji zsumuj osoby na zaproszeniach (jeśli jest to zaproszenie z os.
towarzyszaca, to dodajesz 2, jesli nie, to 1).
Przyklad:
Ile zaproszen?
3
Marian
Marianski
Z_OS_TOWARZYSZACA
Arek
Kowalski
POJEDYNCZE
Ola
Bela
Z_OS_TOWARZYSZACA
Lacznie zaproszono: 5 osób.
    * */
    public static void main(String[] args) throws Exception {
        Invite.createInvites();
    }
}
