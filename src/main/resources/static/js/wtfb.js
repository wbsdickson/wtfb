$(document).ready(function(){
	//midNarBar active class start
	var links = $('.midnavbar').children();
	$.each(links, function(key, value){
		if(value.href == document.URL){
			$(this).addClass('mnbactive');
		}
	});
	//midNarBar active class end
	
	$("#ajaxBtn").click(function() {
		
		var ajaxUrl = 'https://raw.githubusercontent.com/openfootball/football.json/master/2016-17/at.1.clubs.json';
		$('#dataTable').DataTable().destroy();
		
		$('#dataTable').DataTable( {
	        "processing": true,
	        "serverSide": true,
	        "ajax": {
	            "url": ajaxUrl,
	            "dataSrc": "clubs"
	        },
	        "columns": [
	        	{"data" : "key"},
    		    {"data" : "name"},
    		    {"data" : "code"}
	        ]
	    } );
		
	});
	
	
	
});
