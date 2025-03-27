public class ElectrautoSimulation {
    public static void main(String[] args) {
        try {
            TypeRecharge rapide = new TypeRecharge("rapide", 50);
            Carte carte1 = new Carte("Dupont", "Jean", "forfait", 100f);
            Batterie batterie = new Batterie("Ref123", "Tesla", 75, 20, rapide);
            Borne borne = new Borne(1, rapide);
            
            borne.insererCarte(carte1);
            borne.insererPrise();
            borne.charger(5);
        } catch (Exception e) {
            System.err.println("Erreur: " + e.getMessage());
        }
    }
}
