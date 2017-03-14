package modele;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.List;

/**
 * Created by Fred on 13/03/2017.
 */
@Value
@Builder
public class User3 {
    private Long id;
    private String nom;
    private String prenom;
    @Singular
    private List<String> enfants;
}
