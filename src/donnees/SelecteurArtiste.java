package donnees;

public class SelecteurArtiste implements Selecteur{
    public String nomArtiste;

    public SelecteurArtiste(String nomArtiste) {
        this.nomArtiste = nomArtiste;
    }


    @Override
    public boolean garderCd(CD cd) {
        return (cd.getNomArtiste().equals(nomArtiste));
    }
}
