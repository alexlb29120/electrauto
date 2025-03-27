class Carte {
    private String nom;
    private String prenom;
    private String typeContrat;
    private Float soldeForfait;

    public Carte(String nom, String prenom, String typeContrat, Float soldeForfait) {
        this.nom = nom;
        this.prenom = prenom;
        this.typeContrat = typeContrat;
        this.soldeForfait = soldeForfait;
    }

    public boolean estUnForfait() {
        return "forfait".equalsIgnoreCase(typeContrat);
    }

    public float lireSolde() throws Exception {
        if (!estUnForfait()) {
            throw new Exception("Le contrat n'est pas un forfait.");
        }
        return soldeForfait;
    }

    public void decompterCharge(float montant) throws Exception {
        if (!estUnForfait() || soldeForfait == null || soldeForfait < montant) {
            throw new Exception("Solde insuffisant ou contrat non valide.");
        }
        soldeForfait -= montant;
    }
}