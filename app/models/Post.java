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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;

@Entity
@Table(name = "post")
public class Post extends Model {
	@Id
	@GeneratedValue
	public Long id;

	@Column(name = "url", nullable = false, length = 255)
	public String url;

	@Column(name = "title",length = 255)
	public String title;

	@Column(name = "content")
	public String content;

	@Column(name = "createDate")
	@CreatedTimestamp
	public Date createDate = new Date();

	@Column(name = "isDelete")
	public boolean isDelete = false;

	// Relationship
	@ManyToOne(cascade = CascadeType.ALL)
	public User user;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="post")
	public List<Comment> comments;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
	public List<Favorite> favorites;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "posts")
	public List<Category> categories;
	
	private static Finder<Long, Post> find = new Finder<>(Post.class);
	
	public static List<Post> findAll(){
		return find.where().eq("isDelete", false).findList();
	}
	
	public static List<Post> findByUser(User user){
		return find.where().like("isDelete", "0").in("user", user).findList();
	}
	
	public static Post findById(Long id){
		return find.where().eq("id", id).findUnique();
	}
	
	public static List<Post> findTitle(String keyword) {
		return find.where().like("url", "%" + keyword + "%").findList();
	}
	
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
