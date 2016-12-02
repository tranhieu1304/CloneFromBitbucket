package models;

import java.util.ArrayList;
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
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;

@Entity
@Table(name = "post", uniqueConstraints = { @UniqueConstraint(columnNames = { "url" }) })
public class Post extends Model {
	@Id
	@GeneratedValue
	public Long id;

	@Column(name = "url", nullable = false, length = 255)
	public String url;

	@Column(name = "title", length = 255)
	public String title;
	
	@Column(name = "imgUrl", length = 255)
	public String imgUrl;

	@Column(name = "content")
	public String content;

	@Column(name = "createDate")
	@CreatedTimestamp
	public Date createDate = new Date();

	@Column(name = "isDelete")
	public boolean isDelete = false;

	@Transient
	public List<String> messageError = new ArrayList<>();
	// Relationship
	@ManyToOne(cascade = CascadeType.ALL)
	public User user;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
	public List<Comment> comments;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
	public List<Favorite> favorites;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "posts")
	public List<Category> categories;

	private static Finder<Long, Post> find = new Finder<>(Post.class);

	public static List<Post> findAll() {
		return find.where().eq("isDelete", false).findList();
	}

	public static List<Post> findByUser(User user) {
		return find.where().like("isDelete", "0").in("user", user).findList();
	}

	public static Post findById(Long id) {
		return find.where().eq("id", id).findUnique();
	}

	public static List<Post> findTitle(String keyword) {
		return find.where().like("title", "%" + keyword + "%").findList();
	}

	public static List<Post> findByUrl(String url) {
		return find.where().like("url", "%" + url.trim() + "%").findList();
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

	public void deletePost() {
		this.isDelete = true;
		super.update();
	}
}
