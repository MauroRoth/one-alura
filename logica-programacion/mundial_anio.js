var anioLimite = parseInt(prompt("Ingrese el año límite para calcular:"));
var anioMundial = 1930;
while(anioMundial<=anioLimite){
	document.write("<br>  Hubo Mundial de la FIFA en el año: "+ anioMundial);
	anioMundial+=4;
}