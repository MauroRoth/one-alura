function verificar(){
	var numeroPensado = Math.round(Math.random()*10);
	var input = document.querySelector("input");
	if(input.value==numeroPensado){alert("Usted Adivinó!!!El numero es: "+numeroPensado);}
	else{alert("Usted Erró. El numero es: "+numeroPensado);}
	input.value="";
	input.focus();
}
var button = document.querySelector("button");
button.onclick=verificar;