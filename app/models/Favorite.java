/**
 * 
 */
package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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

	@Column(name = "createDate")
	@CreatedTimestamp
	public Date createDate = new Date();

	@Column(name = "isDelete")
	public boolean isDelete = false;

	// Relationship
	@ManyToMany(cascade = CascadeType.ALL)
	public List<User> users;
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Post post;
	
	
	public void save() {
		if(this.createDate == null){
			this.createDate = new Date();
		}
		super.save();
	}

	public void update() {
		if(this.createDate == null){
			this.createDate = new Date();
		}
		super.update();
	}

	public void deletePost() {
		this.isDelete = true;
		super.update();
	}
}