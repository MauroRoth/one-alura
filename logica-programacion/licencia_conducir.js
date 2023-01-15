var edad = parseInt(prompt("¿Cuál es tu edad?"));


if (edad<18){alert("No pudes conducir!");}
else {
    var tieneLicencia = prompt("¿Tienes licencia? Responde S o N");
    if (tieneLicencia=="S"){alert("Puedes Conducir!");}
    else {alert("No puedes conducir!");}
}