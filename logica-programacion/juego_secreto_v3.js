function repetidos(array,numero){
	var encontrado=false;
	for(j=0;j<array.length;j++){
		if(array[j]==numero){
			encontrado=true;
			break;
		}
	}
	return encontrado;
}

function sortearNumeros(cantidad){
	var secreto = [];
	var i=0;
	while(i<cantidad){
		var encontrado=false;
		var numeroAleatorio=Math.round(Math.random()*10);
		if(numeroAleatorio!=0){
			encontrado=repetidos(secreto,numeroAleatorio);
		}
		if(encontrado==false){
			secreto.push(numeroAleatorio);
			i++;
		}
		console.log(numeroAleatorio);
	}	
	
	return secreto;
}

function verificar(){
	var secreto = sortearNumeros(4);
	console.log(secreto);
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