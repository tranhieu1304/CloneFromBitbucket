$(document).ready(function() {

	$('.postList td .star').each(function() {
		var $flag = $(this).attr('id');
		var $status = $(this).attr('value');
		console.log($flag + '-' + $status);
		if (($flag > 0) && ($status == "false")) {
			$(this).toggleClass('star-checked');
		}
	});

	$('.star').on('click', function() {
		var $temp = $(this);
		var $like = $(this).next();
		var likeCount = $like.text();
		var selectedPostId = $(this).parent().parent().attr('id');
		var favoriteId = $(this).attr('id');
		var likeStatus = $like.data('like');

		if (likeStatus == 0) {
			$(this).next().text(++likeCount);
			$like.data('like', '1');
		} else {
			$(this).next().text(--likeCount);
			$like.data('like', '0');
		}
		$(this).toggleClass('star-checked');

		$.ajax({
			type : 'POST',
			dataType : 'json',
			url : "/listPost/like",
			data : {
				'postId' : selectedPostId,
				'favotiteId' : favoriteId
			}
		}).done(function(responseData) {
			// something
			if (responseData.status == "ok") {
				$temp.attr('id', responseData.favoriteId);
			}
		}).fail(function(text) {
			// something
		});
	});

});