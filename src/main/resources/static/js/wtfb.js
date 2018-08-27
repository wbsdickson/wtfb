$(document).ready(function(){
	//midNarBar active class start
	var links = $('.midnavbar').children();
	$.each(links, function(key, value){
		if(value.href == document.URL){
			$(this).addClass('mnbactive');
		}
	});
	//midNarBar active class end
	
	
});
