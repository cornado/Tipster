<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
var arr = [];
function mark(){
    var x = window.getSelection().getRangeAt(0);
	alert(x);
	arr.push(x.toString());
	$("div:contains('"+x+"')").html(function(html) {
		var newText = $(this).html().replace(x, "<span class='vijay'>"+x+"</span>");
		$(this).html(newText);
	});
	alert(arr);
}

</script>
<!-- <style> 
  #theDivElement { 
    background: white; 
    border: 1px solid #DDD; 
    border-radius: 5px; 
    box-shadow: 0 0 5px #DDD inset; 
    color: #666; 
    outline: none; 
    height:25px; 
    width: 275px; 
   } 
   
 </style>  -->
 <style>
#theDivElement {
    width: 700px;
    height: 300px;
    background: #f5f5f5;
    border: 1px solid #ddd;
    padding: 5px;

</style>
<% String message=(String) request.getAttribute("name"); %>
<link href="HighLite.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tripster</title>
</head>
<body>
<H1>Welcome mr best of the west <%= message %>  </H1>
<br>
<div id="theDivElement" contenteditable="true" placeholder="My Placeholder String" >
</div>


<button onclick="mark()">mark</button>

</body>
</html>