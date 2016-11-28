/**
 * 
 */
package models;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

import constants.Constant;
import play.data.validation.Constraints;
import play.mvc.Http;

/**
 * @author mac_thieu
 *
 */
@Entity
@Table(name = "user")
public class User extends Model {
	@Id
	@GeneratedValue
	public Long id;

	@Constraints.Required
	@Column(name = "name", nullable = false, length = 255)
	public String name;

	@Column(name = "password", nullable = false, length = 1024)
	public String password;

	@Constraints.Required
	@Column(name = "sex")
	public String sex;

	@Column(name = "birthday")
	// @CreatedTimestamp
	public java.util.Date birthday;

	@Column(name = "height")
	public Long height;

	@Column(name = "bloodType")
	public String bloodType;

	@Column(name = "isDelete")
	public boolean isDelete = false;

	private static Finder<Long, User> find = new Finder<>(User.class);
	
	public void save() {

		if (this.birthday == null) {
			this.birthday = new Date();

		}
		try {
			this.password = sha512(this.password);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();

		}
		super.save();
	}

	public void update() {
		if (this.birthday == null)
			this.birthday = new Date();
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
		return Http.Context.current().session().get(Constant.SESSION_USER_NAME) != null;
	}

	public static User findById(long id) {
		return find.where().eq("id", id).findUnique();
	}

	public static User findByNameAndPassword(String name, String password) {
		return find.where().eq("name", name).eq("password", password).findUnique();
	}

	public static User authenticate(String name, String password) throws NoSuchAlgorithmException {
		String hashedPassword = "";
		if (password != null) {
			hashedPassword = sha512(password);
		}
		return findByNameAndPassword(name, hashedPassword);
	}

	public static List<User> findAll() {
		return find.findList();
	}
}
