package Exo4;

public class Radio extends Connectable{

	String nom;
	String contenu;
	
	public Radio() {
		
	}
	




	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	 public void setContenu(String contenu)
	  {
	    this.contenu=contenu;
	  }


	

	@Override
	void demarerr() {
		// TODO Auto-generated method stub
		System.out.println("" +contenu);
		
	}






	
	



	
}
