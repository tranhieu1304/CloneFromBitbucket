/**
 * 
 */
package services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

import com.avaje.ebean.Model.Finder;

import constants.Constant;
import models.User;
import play.mvc.Http;

/**
 * @author mac_thieu
 *
 */
public class UserService {
	private static Finder<Long, User> find = new Finder<>(User.class);

	public static User findById(long id) {
		return find.where().eq("id", id).findUnique();
	}

	public static User findByNameUnique(String name) {
		return find.where().eq("name", name).findUnique();
	}

	public static List<User> findUserByStatus(String name) {
		return find.where().like("name", "%" + name + "%").like("isDelete", "1").findList();
	}

	public static List<User> findByName(String name) {

		return find.where().like("name", "%" + name + "%").like("isDelete", "1").findList();

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



	public static List<User> findAll() {
		return find.findList();
	}
	

}
