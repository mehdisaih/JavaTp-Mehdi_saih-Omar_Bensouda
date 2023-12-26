package TP;

import java.util.Objects;

public class Livre extends Article  {
	
	public String Auteur;
	
	public int Nbpages;
	
	public int Nbstock;

	public Livre(String Matricule, String nom, String categorie, int prix, String auteur, int nbpages, int nbstock) {
	    super(Matricule, nom, categorie, prix);
		Auteur = auteur;
		Nbpages = nbpages;
		Nbstock = nbstock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Auteur, Nbpages, Nbstock);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		return Objects.equals(Auteur, other.Auteur) && Nbpages == other.Nbpages && Nbstock == other.Nbstock;
	}

	@Override
	public String toString() {
		return "Livre [Auteur=" + Auteur + ", Nbpages=" + Nbpages + ", Nbstock=" + Nbstock + super.toString() +",getClass()=" +getClass()+ "]";
	}
	
	
	public Livre Clone() {
		try {
			return (Livre)super.clone();
		}
		catch (CloneNotSupportedException e) {
			System.err.println("Probleme de clonage");
			
			return null;
		}
	}
	
	

}
