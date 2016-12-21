package models.chat;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.avaje.ebean.Model;

import models.Favorite;

@Entity
@Table(name = "message")
public class Message extends Model {

	@Id
	@GeneratedValue
	public Long id;

	@Column(name = "content")
	public String content;

	@Column(name = "modifiedDate")
	public Date modifiedDate;

	@Column(name = "isDelete")
	public boolean isDelete = false;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "message")
	public List<UserMessage> userMessages;
	
	private Find<Long, Message> find = new Finder<Long, Message>(Message.class);
}
