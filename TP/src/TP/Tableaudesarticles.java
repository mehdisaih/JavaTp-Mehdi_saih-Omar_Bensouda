package TP;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



public class Tableaudesarticles {
	
	private Article [] articles;
	private int nombre=0;

	public Tableaudesarticles() {
		articles = new Article[4];
		articles[0] = new Article("X566","Jeans","Vetements",225);
		articles[1] = new Article("A786","Jordan","Chaussures",878);
		articles[2] = new Article("L985","Lune","Livres",56);
		articles[3] = new Article("B556","Bracelet","Accessoires",178);
		nombre=4;
		
		
	}
	
	public void trier() {
		Arrays.sort(articles);
	}
	
	 public void ajouterArticle(Article nouvelArticle) {
	        if (nombre == articles.length) {
	            articles = Arrays.copyOf(articles, articles.length * 2);
	        }
	        articles[nombre] = nouvelArticle;
	        nombre++;

	        System.out.println("Article ajouté avec succès !");
	    }
	 
	 public void supprimerArticle(int indice) {
	        // Vérifier si l'indice est valide
	        if (indice >= 0 && indice < nombre) {
	        // Décaler les éléments à gauche pour remplir l'emplacement supprimé
	            for (int i = indice; i < nombre - 1; i++) {
	                articles[i] = articles[i + 1];
	            }

	            // Réduire le nombre d'articles
	            nombre--;

	            System.out.println("Article supprimé avec succès !");
	        } else {
	            System.out.println("Indice invalide. Impossible de supprimer l'article.");
	        }
	    }
	 
	 public int nombreelements() {
		 return articles.length;
	 }

	 public void inverserOrdre() {
	        
	        Arrays.sort(articles, Collections.reverseOrder());
	        System.out.println("Ordre du tableau inversé avec succès !");
	 }
	 
	 public void afficherArticles() {
	        System.out.println("Liste des articles :");
	        for (int i = 0; i < nombre; i++) {
	            System.out.println(articles[i].toString());  
	    } 
	 }
	 public Article getElementPlusGrand() {
	        if (nombre > 0) {
	            Arrays.sort(articles);
	           return articles[nombre - 1];
	        } else {
	            System.out.println("Le tableau est vide.");
	            return null;
	        }
	    }
	 public boolean equals(Tableaudesarticles autreTableau) {
	        return Arrays.equals(this.articles, autreTableau.articles);
	    }
	
	
		
	}
	
	
    
    
     


    
