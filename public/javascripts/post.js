$(document).ready(function() {

	
	$('.postList').each(function() {
		var $flag = $(this).attr('id');
		console.log($flag+'-');
		if ($flag > 0) {
			$(this).childen().childen().toggleClass('star-checked');
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
			alert("Selected Id :" + $selectedPostId);
		}).fail(function(text) {
			alert("Not found Id");
		});
	});

});