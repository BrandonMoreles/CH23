let txtYear=document.getElementById('txtYear')
let butDay=document.getElementById('butDay')
let setDay=()=>{
    let firstDayYear=document.getElementById('firstDay').value
    let day=document.getElementById('day').value
    let rest=Number(firstDayYear)+Number(day)
    return rest%7}
let setHours=()=>{
    let hours=document.getElementById('selectHour').value
    let choice=setDay()
    if (choice!=0&&choice!=6){
        if(hours>=9&&hours<18){
            return "Es horario laboral"
        }else{return "No es horario laboral"}
    }else {return "Nel, no se trabaja"}}
let writeHour=()=>{
    let rest=setDay()
    let day=rest==0?"Domingo":rest==1?"Lunes":rest==2?"Martes":rest==3?"Miercoles":rest==4?"Jueves":rest==5?"Viernes":"Sabado"
    let texto=setHours()
    txtYear.innerHTML=day+",  "+texto}
butDay.addEventListener('click', writeHour)