package models.chat;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

import models.User;

@Entity
@Table(name = "usermessage")
public class UserMessage extends Model {

	@Id
	@GeneratedValue
	public Long id;

	@Column(name = "fromId")
	public Long fromId;

	@Column(name = "toId")
	public Long toId;

	@Column(name = "content")
	public String content;

	@Column(name = "modifiedDate")
	public Date modifiedDate;

	@Column(name = "isDelete")
	public boolean isDelete = false;

	@ManyToOne(cascade = CascadeType.ALL)
	public User user;

	@ManyToOne(cascade = CascadeType.ALL)
	public ChatRoom chatRoom;

	@ManyToOne(cascade = CascadeType.ALL)
	public Message message;
	
	private Find<Long, UserMessage> find = new Finder<Long, UserMessage>(UserMessage.class);
}
