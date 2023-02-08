let dias= parseInt(prompt("Digita los dias laborados en el mes"));
let antiguedad=prompt("Digita cuanto tiempo tiene el trabajador en la empresa");
let domingos=prompt("Digite los domingos trabajados en el mes");
let horas=prompt("Digite las horas extras trabajadas en el mes");
let sueldo=428
let prima=sueldo*1.29
let extras=80
let bono=.15

let sueldoTotal=dias*sueldo
alert("El sueldo mensual del empleado es f"+sueldoTotal)
if (antiguedad >=1){
    alert ("El empleado tiene derecho a "+antiguedad*7+" dias de vacaciones")
}else{alert("El empleado no tiene derecho a vacaciones")}

if(domingos>=1){(sueldoTotal=+(domingos*prima)).toFixed(1), alert("Al empleado le corresponde una prima dominical de "+((domingos*prima)).toFixed(1))}
else{alert("El empleado no trabajo ningun domingo")}

if(horas>=1){sueldoTotal+(horas*extras), alert("Le corresponde un bono de "+(horas*extras)+" pesos por horas extras")}
else{alert("No trabajo horas extras")}

alert("El sueldo total antes de impuestos " +((sueldoTotal).toFixed(1))+" pesos")
alert("El sueldo total despues de impuestos es "+(sueldoTotal*.88).toFixed(1)+ " pesos")
sueldo=(sueldo*.88).toFixed*(1)
if (dias>=1){alert("Le corresponde un bonop de "+((sueldoTotal*bono).toFixed(1))+" pesos, dando asi un total de "+((sueldoTotal+(sueldoTotal*bono)).toFixed(1))+" pesos")}
else(alert("No le corresponde bono"))

