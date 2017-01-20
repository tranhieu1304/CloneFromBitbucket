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
import com.avaje.ebean.PagedList;
import com.avaje.ebean.annotation.CreatedTimestamp;

import constants.Constant;

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

	private static int pageSize = Constant.PAGINATION_PAGE_SIZE;

	public static PagedList<Post> findAll(int page) {

		int pageIndex = page - 1;
		PagedList<Post> pagedList = find.where().eq("isDelete", false).findPagedList(pageIndex, pageSize);
		return pagedList;
	}
	public static List<Post> findAll() {
		return  find.where().eq("isDelete", false).findList();
	}

	public static PagedList<Post> findByUser(User user, int page) {
		int pageIndex = page - 1;
		PagedList<Post> pagedList = find.where().like("isDelete", "0").in("user", user).findPagedList(pageIndex,
				pageSize);
		return pagedList;
	}

	public static Post findById(Long id) {
		return find.where().eq("id", id).findUnique();
	}

	public static PagedList<Post> findTitle(String keyword, int page) {
		int pageIndex = page - 1;
		PagedList<Post> pagedList = find.where().like("title", "%" + keyword + "%").findPagedList(pageIndex, pageSize);
		return pagedList;
	}

	public static List<Post> findByUrl(String url) {
		List<Post> pagedList = find.where().like("url", "%" + url.trim() + "%").findList();
		return pagedList;
	}

	public static Post findByPostIdCommentStatus(Long postId) {
		Post post = find
						.fetch("comments")
						.where()
						.eq("id", postId)
						.eq("comments.isDelete", false)
						.findUnique();
		return post;
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

	public static PagedList<Post> getPageList(int page) {
		int pageIndex = page - 1;
		PagedList<Post> pagedList = find.where().like("isDelete", "0").findPagedList(pageIndex, pageSize);
		return pagedList;
	}
	public String validate()  {
		String temp = "why auto pass here";
		if(temp != "")
			return "muzukashi";
		return null;
	}
}
