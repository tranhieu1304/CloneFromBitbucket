/**
 * 
 */
package models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;

/**
 * @author mac_thieu
 *
 */
@Entity
@Table(name = "favorite")
public class Favorite extends Model {
	@Id
	@GeneratedValue
	public Long id;

	@Column(name = "createDate1")
	@CreatedTimestamp
	public Date createDate = new Date();

	@Column(name = "isDelete")
	public boolean isDelete = false;

	// Relationship
	@ManyToOne(cascade = CascadeType.ALL)
	public User user;

	@ManyToOne(cascade = CascadeType.ALL)
	public Post post;

	private static Find<Long, Favorite> find = new Finder<Long, Favorite>(Favorite.class);

	public static Favorite findbyId(long favoriteId) {
		return find.where().eq("id", favoriteId).findUnique();
	}

	public void save() {
		if (this.createDate == null) {
			this.createDate = new Date();
		}
		super.save();
	}

	public void update() {
		if (this.createDate == null) {
			this.createDate = new Date();
		}
		super.update();
	}

	public void changeStatus() {
		if (this.isDelete == true)
			this.isDelete = false;
		else
			this.isDelete = true;
		super.update();
	}
}