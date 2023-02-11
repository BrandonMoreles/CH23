let hora=Number(prompt("Indica la hora"))

if(hora>=6&&hora<=11){
    alert("Buenos dias")
}else if(hora>=12&&hora<=18){
    alert("Buenas tardes")
}else if(hora>=19&&hora<=23){
    alert("Buenas noches")
}else if(hora>=0&&hora<=5){
    alert("Carnal que haces despierto")
}else{
    alert("Papi, escribe bien")
}