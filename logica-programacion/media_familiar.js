var cantidad = parseInt(prompt("Cantidad de Personas en la Familia:"));
var suma_edades=0;
for(var i=1;i<=cantidad;i++){
	suma_edades+=parseInt(prompt("Edad del Miembro Familiar "+i));
}
var promedio = suma_edades/cantidad;
document.write(promedio);