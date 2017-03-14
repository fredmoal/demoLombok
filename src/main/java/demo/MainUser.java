package demo;

import lombok.val;
import modele.User;
import modele.User2;
import modele.User3;
import modele.User4;

/**
 * Created by Fred on 13/03/2017.
 */
public class MainUser {
    public static void main(String... args) {
        User u = new User(2L, "moal", "fred");
        User u1 = new User(2L, "moal", "fred");
        System.out.println("User :"+u);
        System.out.println("u.equals(u1) ? "+u.equals(u1));

        User2 u2 = User2.builder().id(1L).nom("moal").prenom("fred").build();
        System.out.println("User2 :"+u2);

        final User3 u3 = User3.builder().id(3L).nom("dupont").prenom("henri").enfant("hortense").enfant("barnabé").build();
        System.out.println("User3 :"+u3);

        u3.getEnfants().add("toto"); // !! immutable !!
        System.out.println("User3 :"+u3);

        val u3b = User3.builder().id(3L).nom("duponD").prenom("henri").enfant("hortense").enfant("barnabé").build();

        // User4 u4 = new User4(4L, "boichut"); !
        User4 u4 = User4.of(4L, "boichut");
    }
}
