function imprimir(frase) {
	document.write(frase);
};
var tanque=40;
var kmGasolina=480;
var kmAlcohol=300;

imprimir("Consumo de Combustible <br>")
document.write("Eficiencia con Gasolina: "+ kmGasolina/tanque + "km/l.<br>");
document.write("Eficiencia con Alcohol: "+ kmAlcohol/tanque + "km/l.<br>");