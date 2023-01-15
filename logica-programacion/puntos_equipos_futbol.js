var victorias = parseInt(prompt("Cantidad de Victorias:"));
var empates = parseInt(prompt("Cantidad de Empates:"));

var puntosTotal = victorias*3 + empates;
document.write("Puntaje: ", puntosTotal);

var puntosAnioPasado = 28;

if (puntosTotal>puntosAnioPasado){document.write("<br>El equipo está mejor que el año pasado!");};
if (puntosTotal<puntosAnioPasado){document.write("<br>El equipo está peor que el año pasado!");};
if (puntosTotal==puntosAnioPasado){document.write("<br>El equipo está igual que el año pasado!");};