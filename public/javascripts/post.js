$(document).ready(function() {

	
	$('.postList td .star').each(function() {
		var $flag = $(this).attr('id');
		console.log($flag+'-');
		if ($flag > 0) {
			$(this).toggleClass('star-checked');
		}
	});

	$('.star').on('click', function() {
		var $selectedPostId = $(this).parent().parent().attr('id');
		var $favoriteId = $(this).attr('id');
		$(this).toggleClass('star-checked');

		$.ajax({
			type : 'POST',
			dataType : 'json',
			url : "/listPost/like",
			data : {
				'postId' : $selectedPostId,
				'favotiteId' : $favoriteId
			}
		}).done(function(text) {
			// something
		}).fail(function(text) {
			// something
		});
	});

});