<html>
<body>
<h2><%= "Async Demo" %></h2>

<form >
	Input Text<input id="t1" type="text" name="t1">
	
	<button type="button" onclick="processText(event)">Click</button> 
</form>

<div id="output"></div>
<script type="text/javascript">

async function processText(event){
	
	let str=document.getElementById("t1").value
	
	let resp = await fetch("TextProcessServlet", {  
        method: "POST",
        headers: {"Content-Type": "application/x-www-form-urlencoded"},
        body: "str=" + str
    });

	document.getElementById("output").innerHTML=await resp.text();
}
</script>


</body>
</html>
