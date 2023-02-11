/*Resolucion del primer ejercicio*/

let formDiv=document.getElementById('formDiv')
let resultado
let dividir=()=>{
    let dividendo=document.getElementById('dividendo').value
let divisor=document.getElementById('divisor').value
    if(Number(dividendo)>0&&Number(divisor)>0){
            resultado=Number(dividendo)/Number(divisor)
    }else(resultado="Haz las cosas bien papi")
    localStorage.setItem("resultado", resultado)
}
formDiv.addEventListener("change", dividir)

/*Resolucion del segundo ejercicio*/
let salario=document.getElementById("salario")
let edad=document.getElementById("edad")
let impuestos=document.getElementById('impuestos')
localStorage.setItem('decidir', false)
let sat=()=>{ 
    
    if(salario.value>500&&edad.value>16){
        localStorage.setItem('decidir', true)
    }
}
impuestos.addEventListener('change', sat)


/*Resolucion del tercer ejercicio*/
let capicua=document.getElementById('capicua')
let txtCapicua=document.getElementById('txtCapicua')
let formCapi=document.getElementById('formCapicua')
let capicuaFunc=()=>{
if(capicua.value.length==4){
    if(capicua.value[0]=capicua.value[3]&&capicua.value[1]==capicua.value[2]){
        txtCapicua.innerHTML="Efectivamente, es capicua"
    }
else{ txtCapicua.innerHTML="No es capicua"}}
else{ txtCapicua.innerHTML="No es capicua"}
}
formCapi.addEventListener("change", capicuaFunc)

/*Resolucion del cuarto ejercicio*/
let peso=document.getElementById('peso')
let estatura=document.getElementById('estatura')
let fomImc=document.getElementById('imc')
let calcImc=()=>{
    if(peso.value.length>0&&estatura.value.length>0){
    peso=parseFloat(peso.value)
    estatura=parseFloat(estatura.value)
    var imc=((peso*.453592)/((estatura/100)*(estatura/100)))
    let salud=imc<16?"imc1":imc<16.9?"imc2":imc<18.4?"imc3":imc<24.9?"imc4":imc<29.9?"imc5":imc<34.9?"imc6":imc<45?"imc7":"imc8"
    localStorage.setItem("imc", imc)
    localStorage.setItem('salud', salud)
    peso=document.getElementById('peso')
    estatura=document.getElementById('estatura')}}
fomImc.addEventListener('change', calcImc)


/*Resolucion del quinto ejercicio*/
let mes=document.getElementById('mes')
let txtMes=document.getElementById('txtMes')
let formMes=document.getElementById('forMes')
let getMes=()=>{
    let txtMES=mes.value==1?"Enero":mes.value==2?"Febrero":mes.value==3?"Marzo":mes.value==4?"Abril"
    :mes.value==5?"Mayo":mes.value==5?"Junio":mes.value==7?"Julio":mes.value==8?"Agosto":mes.value==9?"Septiembre"
    :mes.value==10?"Octubre":mes.value==11?"Noviembre":mes.value==12?'Diciembre':"Capo, digita un mes valido"
    txtMes.innerHTML=txtMES
}
mes.addEventListener('change', getMes)

/*Resolucion del sexto ejercicio*/
let formFeliz=document.getElementById('formFeliz')
let feliz=document.getElementById('feliz')
let esFeliz=()=>{
    localStorage.setItem("status", 0)
    if(feliz.value.length===4){
    let d1=feliz.value[0]
    let d2=feliz.value[1]
    let d3=feliz.value[2]
    let d4=feliz.value[3]
    if((d1+d2)>(d3+d4)){
        localStorage.setItem('status', 1)
    }else if(d1<d2&&d2<d3&d3<d4){localStorage.setItem('status', 2)}
    else{localStorage.setItem('status', 3)}
}}
formFeliz.addEventListener("change", esFeliz)

//Resolucion del septimo ejercicio
let formInterval=document.getElementById('formInterval')
let buscado=document.getElementById('interval')
let createInterval=()=>{
    localStorage.setItem('interval', 0)
    let priNum=document.getElementById('priNum')
    let segNum=document.getElementById('segNum')
    let interval=[]
    if(priNum.value>0&&segNum.value>0){
        if(parseInt(priNum.value)>parseInt(segNum.value)){
            priNum=document.getElementById('segNum')
            segNum=document.getElementById('priNum')
        }for(let i=parseInt(priNum.value);i<=parseInt(segNum.value);i++){
            interval.push(i)
        }let index=interval.indexOf(parseInt(buscado.value))
    index==-1?localStorage.setItem('interval', 1):localStorage.setItem('interval', 2)}}
formInterval.addEventListener("change", createInterval)


//Resolucion del tercer ejercicio
let formSeconds=document.getElementById('formSeconds')
let getSeconds=()=>{
    let hour=document.getElementById('hour').value
    let minutes=document.getElementById('minutes').value
    let seconds=document.getElementById('seconds').value
    let am=document.getElementById("meridian").value
    let sTotal=(Number(hour*3600))+(Number(minutes*60))+Number(seconds)
    if(am=="pm"){
        sTotal+=43200
    }
    localStorage.setItem("seconds", sTotal)
}
formSeconds.addEventListener("change", getSeconds)