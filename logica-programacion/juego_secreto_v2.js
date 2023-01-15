function verificar(){
	var secreto = [3,5,7,9];
	var input = document.querySelector("input");
	var encontrado = false;
	for(var posicion=0;posicion<secreto.length;posicion++){
		if(input.value==secreto[posicion]){
			alert("Usted Adivinó!!!");
			encontrado=true;
			break;
		}
		
	}
	if(encontrado==false){
		alert("Usted Erró!");
	}
	
}
var button = document.querySelector("button");
button.onclick=verificar;