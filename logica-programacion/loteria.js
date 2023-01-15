function sorteo(n){
	var numeroPensado = Math.round(Math.random()*n);
	return numeroPensado;
}

var numeroPensado = sorteo(parseInt(prompt("Cantidad de Valores: ")));
var numeroLanzado = parseInt(prompt("Lance un número del 0 al 10."));
document.write("El número sorteado es: "+numeroPensado);
if (numeroLanzado==numeroPensado){document.write("---> Usted Adivinó!!!");}
else {document.write("---> Usted Erró!");}