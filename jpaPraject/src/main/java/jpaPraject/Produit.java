package jpaPraject;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the produit database table.
 * 
 */
@Entity
@NamedQuery(name="Produit.findAll", query="SELECT p FROM Produit p")
public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PRODUIT")
	private int idProduit;

	private String name;

	private int prix;

	private String type;
	
	@ManyToOne
	@JoinTable(name = "categorie_produit",
    joinColumns = @JoinColumn(name = "produit_idProduit"),
    inverseJoinColumns = @JoinColumn(name = "categorie_id_Cat"))
	  private Categorie categorie;

	public Produit() {
	}

	public int getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrix() {
		return this.prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}