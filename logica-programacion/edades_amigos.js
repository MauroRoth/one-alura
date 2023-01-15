var anio=2022;
var personas=["Juan",1983,"Pedro",1993,"Brisa",2000];
for (i=0;i<personas.length;i+=2){ 
   	document.write(personas[i]+" tiene ", anio-personas[i+1]+" años.");
   	saltarLinea();
   	
}


