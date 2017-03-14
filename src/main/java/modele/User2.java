package modele;

import lombok.Builder;
import lombok.Value;

/**
 * Created by Fred on 13/03/2017.
 */
@Value
@Builder
public class User2 {
    private Long id;
    private String nom;
    private String prenom;
}
