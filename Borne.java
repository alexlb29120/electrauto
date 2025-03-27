class Borne {
    private int id;
    private TypeRecharge typeRecharge;
    private Carte carte;

    public Borne(int id, TypeRecharge typeRecharge) {
        this.id = id;
        this.typeRecharge = typeRecharge;
    }

    public void insererCarte(Carte carte) {
        this.carte = carte;
        System.out.println("Carte insérée : " + carte.nom + " " + carte.prenom);
    }

    public void afficher(String texte) {
        System.out.println("[Borne " + id + "] " + texte);
    }

    public void insererPrise() throws Exception {
        if (carte == null) {
            throw new Exception("Aucune carte insérée.");
        }
        afficher("Prise branchée. Début du rechargement...");
    }

    public void charger(int temps) throws Exception {
        if (carte == null) {
            throw new Exception("Aucune carte insérée.");
        }
        afficher("Charge en cours pendant " + temps + " secondes...");
        Thread.sleep(temps * 1000);
        afficher("Charge terminée.");
    }
}
