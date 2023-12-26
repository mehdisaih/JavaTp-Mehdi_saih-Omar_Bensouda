package TP;

import java.util.Objects;



public class Article implements Cloneable, Comparable<Article>{
    
	public String Matricule;
	
	public String Nom;
	
	public String Categorie;
	
	public int Prix;

	public Article( String Matricule, String nom, String categorie, int prix) {
		super();
		this.Matricule = Matricule;
		this.Nom = nom;
		this.Categorie = categorie;
		this.Prix = prix;
	}
	public String getMatricule() {
		return Matricule;
	}

	public void setId(int id) {
		Matricule = Matricule;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getCategorie() {
		return Categorie;
	}

	public void setCategorie(String categorie) {
		Categorie = categorie;
	}

	public int getPrix() {
		return Prix;
	}

	public void setPrix(int prix) {
		Prix = prix;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Categorie, Matricule, Nom, Prix);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		return Objects.equals(Categorie, other.Categorie) && Matricule == other.Matricule && Objects.equals(Nom, other.Nom)
				&& Prix == other.Prix;
	}

	@Override
	public String toString() {
		return "Article [Matricule=" + Matricule + ", Nom=" + Nom + ", Categorie=" + Categorie + ", Prix=" + Prix + "]";
	}
	
	public Article Clone() {
		try {
			return (Article)super.clone();
		}
		catch (CloneNotSupportedException e) {
			System.err.println("Probleme de clonage");
			
			return null;
		}
	}

	@Override
	public int compareTo(Article o) {
		// TODO Auto-generated method stub
		return this.Matricule.compareTo(o.Matricule);
				
	}

	
	
	
	
	
	

}
