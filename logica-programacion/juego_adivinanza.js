var numeroPensado = Math.round(Math.random()*10);
var numeroLanzado = parseInt(prompt("Lance un número del 0 al 10."))
if (numeroLanzado==numeroPensado){document.write("Usted Adivinó!!!");}
else {document.write("Usted Erró. El numero es: "+numeroPensado);}

