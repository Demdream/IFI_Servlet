
package Modele;

import java.util.ArrayList;

public class Produit {
    
    private int ref;
    private String nom;
    private double prix;
    private int quantite;
    private final ArrayList<Produit> stock;
    

    public Produit(int ref, String nom, double prix, int quantite) {
        this.ref = ref;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.stock = new ArrayList<>();
   
    }

    
    
    
    @Override
    public String toString() {
        return "Produit{" + "ref=" + ref + ", nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    } 








}
