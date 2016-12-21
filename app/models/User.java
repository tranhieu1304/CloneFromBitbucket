/**
 * 
 */
package models;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;

import constants.Constant;
import models.chat.ChatRoom;
import models.chat.UserMessage;
import play.data.validation.Constraints;
import play.mvc.Http;

/**
 * @author mac_thieu
 *
 */
@Entity
@Table(name = "user", uniqueConstraints = { @UniqueConstraint(columnNames = "email") })
public class User extends Model {
	@Id
	@GeneratedValue
	public Long id;

	@Constraints.Required
	@Column(name = "name", nullable = false, length = 255)
	public String name;

	@Column(name = "password", nullable = false, length = 1024)
	public String password;

	@Column(name = "passwordConf", nullable = false, length = 1024)
	public String passwordConf;

	@Column(name = "email", nullable = false, length = 1024)
	public String email;

	@Constraints.Required
	@Column(name = "sex")
	// 0 = male, 1 = female, 2 = others
	public int sex;

	@Column(name = "birthday")
	public java.util.Date birthday;

	@Column(name = "createDate")
	@CreatedTimestamp
	public java.util.Date createDate;

	@Column(name = "modifiedDate")
	public java.util.Date modifiedDate;

	@Column(name = "isDelete")
	public boolean isDelete = false;
	
	@Lob
	@Column(name = "imageContent")
	public byte[] imageContent;

	// Relationship
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	public List<Post> posts;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	public List<Comment> comments;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	public List<Favorite> favorites;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	public List<UserMessage> usermessage;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "users")
	public List<ChatRoom> chatrooms;

	private static Finder<Long, User> find = new Finder<>(User.class);

	public void save() {
		this.createDate = new Date();
		if (this.birthday == null) {
			this.birthday = new Date();

		}
		try {
			this.password = sha512(this.password);
			this.passwordConf = sha512(this.password);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();

		}
		super.save();
	}

	public void update() {
		if (this.birthday == null)
			this.birthday = new Date();
		this.modifiedDate = new Date();
		super.update();
	}

	public void deleteUser() {
		this.isDelete = true;
		super.update();
	}

	public static String sha512(String message) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		StringBuilder sb = new StringBuilder();
		md.update(message.getBytes());
		byte[] mb = md.digest();
		for (byte m : mb) {
			String hex = String.format("%02x", m);
			sb.append(hex);
		}
		return sb.toString();
	}

	public static Boolean isLogin() {
		return Http.Context.current().session().get(Constant.SESSION_USER_EMAIL) != null;
	}

	public static String userName() {
		String userName = Http.Context.current().session().get(Constant.SESSION_USER_NAME);
		if (isLogin()) {
			return userName;
		} else
			return "";
	}

	public static String email() {
		String email = Http.Context.current().session().get(Constant.SESSION_USER_EMAIL);
		if (isLogin()) {
			return email;
		} else
			return "";
	}

	public static User findById(long id) {
		return find.where().eq("id", id).findUnique();
	}

	public static User findByEmail(String email) {
		return find.where().eq("email", email).findUnique();
	}

	public static User findByEmailAndPassword(String email, String password) {
		return find.where().eq("email", email).eq("password", password).findUnique();
	}

	public static User authenticate(String email, String password) throws NoSuchAlgorithmException {
		String hashedPassword = "";
		if (password != null) {
			hashedPassword = sha512(password);
		}
		return findByEmailAndPassword(email, hashedPassword);
	}

	public static List<User> findAll() {
		return find.findList();
	}
	public String validate()  {
		String temp = "why auto pass here";
		if(temp != "")
			return "musukashi";
		return null;
	}
}
