function imc(peso, altura){
	return (peso/(altura*altura));
};

imc("mauro" , 91, 1.74);
var nombre = prompt("Ingrese su nombre: ");
var peso = prompt(nombre + ", ingrese su peso: ");
var altura = prompt(nombre + ", ingrese su altura: ");
var imc = imc(peso, altura);
document.write ("El imc de " + nombre + " es " + imc);
console.log("nombre: "+ nombre,"peso: "+ peso, "altura: "+ altura, "imc: " + imc);

if (imc<18.5){document.write("<br>BAJO PESO");};
if (imc>=18.5 && imc<25){document.write("<br>PESO NORMAL");};
if (imc>=25 && imc<30){document.write("<br>SOBREPESO");};
if (imc>=30){document.write("<br>OBESIDAD");};
