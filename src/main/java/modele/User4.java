package modele;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by Fred on 14/03/2017.
 */
@RequiredArgsConstructor(staticName = "of")
public class User4 {
    @NonNull
    private Long id;
    @NonNull
    private String nom;
    private String prenom;
}
