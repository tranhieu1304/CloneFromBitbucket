package models.entity;

public class PostResponseAPI {

	private Long postId;
	private String title;
	
	
	public PostResponseAPI() {
	}
	public PostResponseAPI(Long postId, String title) {
		this.postId = postId;
		this.title = title;
	}
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
