/*En estas lineas modificare el dom del ejercicio 1*/ 
let resultDiv=document.getElementById('resultDiv')
let butDividir=document.getElementById('butDividir')
let writeResultado=()=>{
    event.preventDefault(EventTarget)
let txtDiv=localStorage.getItem("resultado")
resultDiv.innerHTML=txtDiv
}
butDividir.addEventListener('click', writeResultado)

/*En estas lineas modificare el dom del ejercicio 2*/
let butImpuesto=document.getElementById('butImpuesto')
let txtImpuestos=document.getElementById('impuesto')
let choice=()=>{
    if(localStorage.getItem('decidir')=="true")
    {txtImpuestos.innerHTML="Capo, tu ya pagas impuestos"}
    else{txtImpuestos.innerHTML='Nel, aun no pagas impuestos'}
}
butImpuesto.addEventListener('click',choice)

/*En estas lineas modificare el dom del ejercicio 4*/
let butIMC=document.getElementById('botIMC')
let txtIMC=document.getElementById('txtIMC')
let calcIMC=()=>{
    event.preventDefault(EventTarget)
    txtIMC.innerHTML="Tu imc es de "+ localStorage.getItem('imc')
    let getColor=(color)=>{
        document.getElementById(color).classList.add('colour')
        setTimeout(() => {
            document.getElementById(color).classList.remove('colour')
        }, 3000);
    }
   
    getColor(localStorage.getItem('salud'))
 
}

butIMC.addEventListener('click',calcIMC)

/*En estas lineas modificare el dom del ejercicio 6*/

let butFeliz=document.getElementById('butFeliz')
let txtFeliz=document.getElementById('txtFeliz')
let escribirFeliz=()=>{
    let status=localStorage.getItem('status')
    event.preventDefault(EventTarget)
    let estado=status==1?"Feliz":status==2?"Creciente":status==3?"Infeliz":"NoData"
    txtFeliz.innerHTML=estado}
butFeliz.addEventListener('click', escribirFeliz)

/*En estas lineas modificare el dom del ejercicio 7*/
let interv=localStorage.getItem('interval')
let parrInterval=document.getElementById('txtInterval')
let butInterval=document.getElementById("butInterval")
let writeInterval=()=>{
    event.preventDefault(EventTarget)
    let interv=localStorage.getItem('interval')
    let txtInterval=interv==1?"No esta en el rango":interv==2?"Si esta en el rango":interv==0?"Indefinido":""
    parrInterval.innerHTML=txtInterval
    console.log(interv)
}
butInterval.addEventListener("click", writeInterval)


/*En estas lineas modificare el dom del ejercicio 8*/
let butSeconds=document.getElementById('butSeconds')
let txtSeconds=document.getElementById('txtSeconds')
let writeSeconds=()=>{
    event.preventDefault(EventTarget)
    txtSeconds.innerHTML=localStorage.getItem('seconds')+" segundos"
}
butSeconds.addEventListener("click", writeSeconds)