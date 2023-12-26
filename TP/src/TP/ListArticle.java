package TP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListArticle {
	private List<Article> articles;
	
	public ListArticle() {
		articles = new ArrayList<>();
	}
	
	 public void alimenterListe(List<Article> articles) {
	        this.articles.addAll(articles);
	    }
	 
	  public void afficherListe() {
	        for (Article article : articles) {
	            System.out.println(article.toString());
	        }
	    }
	  
	  public void parcourirListe() {
	        Iterator<Article> iterator = articles.iterator();
	        while (iterator.hasNext()) {
	            { System.out.println(iterator.next()); }

	        }
	    }  
	  
	
	  public void insererElement(Article art) {
	        this.articles.add(art);
	    }

	  
	  public Article recupererElement(int index) {
	        return this.articles.get(index);
	    }
	  
	  
	  public void supprimerElement(Article art) {
	        this.articles.remove(art);
	    }
	  
	  
	  public boolean rechercherElement(Article art) {
	        return this.articles.contains(art);
	    }

	    public void trierListe() {
	        Collections.sort(articles);
	    }
	  

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
