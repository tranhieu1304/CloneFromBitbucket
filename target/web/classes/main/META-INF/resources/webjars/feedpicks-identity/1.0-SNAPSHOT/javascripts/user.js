function readURL(input){
	if(input.files && input.files[0]){
		var reader = new FileReader();
		reader.onload = function(e){
			$('#avatarImg').attr('src', e.target.result);
		}
		reader.readAsDataURL(input.files[0]);
	}
}

$('#imageContent').change(function(){
	readURL(this);
});

var temp = $('#avatarImg').val();
readURL(temp);