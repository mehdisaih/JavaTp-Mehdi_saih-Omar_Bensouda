package TP;

public class Test {

	public static void main(String[] args) {
		
		
		//creer des articles
		Article a1 = new Article("AX55","Jeans","Pantalons",150);
		Article a2 = new Article("H456","Lenovo","Pc",5896);
		
		
		//creer des livres
		Livre livre1 = new Livre("H456","Antigonne","Livres",96,"Jean",45,6);
		Livre livre2 = new Livre("H996","Journee","Livres",114,"Sarter",445,20);
		
		
		Article[] articletab = {a1, a2, livre1};
		Tableaudesarticles tableau =new Tableaudesarticles();
		
		tableau.afficherArticles();
		tableau.trier();

		tableau.ajouterArticle(a2);
		tableau.afficherArticles();
	}

}
