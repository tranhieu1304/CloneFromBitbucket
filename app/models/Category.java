/**
 * 
 */
package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.avaje.ebean.Model;

/**
 * @author mac_thieu
 *
 */
@Entity
@Table(name = "category")
public class Category extends Model {
	@Id
	@GeneratedValue
	public Long id;

	@Column(name = "name")
	public String name ;

	// Relationship
	@ManyToMany(cascade = CascadeType.ALL)
	public List<Post> posts;
	
	
	public void save() {
		
	}

	public void update() {

	}

	public void deletePost() {

	}
}
