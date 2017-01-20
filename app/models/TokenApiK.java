package models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;

/**
 * @author mac_thieu
 *
 */
@Entity
@Table(name = "favorite")
public class TokenApiK extends Model{

		@Id
		@GeneratedValue
		public Long id;

		@Column(name = "createDate")
		@CreatedTimestamp
		public Date createDate = new Date();

		@Column(name = "token")
		public String token ;

		private static Find<Long, TokenApiK> find = new Finder<Long, TokenApiK>(TokenApiK.class);


		public static TokenApiK findToken(String token) {
			return find.where().in("token", token).findUnique();
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
