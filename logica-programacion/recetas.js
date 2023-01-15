var ingredientes = [];
var cantidad = parseInt(prompt("¿Cuántos ingredientes vas a añadir?"));
var contador = 0;
while(contador < cantidad) {
    var ingrediente = prompt("Informe el ingrediente " + (contador+1));
    var encontrado=false;
    for(var i=0;i<ingredientes.length;i++){
        if(ingredientes[i]==ingrediente){
           encontrado=true;
           break;
        }
    }
    if(encontrado==false){
        ingredientes.push(ingrediente);
        contador++; 
    }
    
}

console.log(ingredientes);

