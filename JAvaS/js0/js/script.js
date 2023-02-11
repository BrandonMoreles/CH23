var h=document.getElementById("horas")
var s=document.getElementById("sueldo")
var b=document.getElementById('boton')
let p=document.getElementById("parrafo")
 let parr=document.getElementById('parr')
let bot2=document.getElementById('but')
let impr=()=>{
   s=s.value
   s=parseInt(s)
   h=h.value
   h=parseInt(h)
   let txt=toString(h*s)
   document.getElementById("parrafo").innerHTML=(h*s)
}
b.addEventListener('click', impr)

let resolver=()=>{
    parr.innerHTML="el resultado de (3+2)/(2*5)es "+(3+2)/(2*5)
}
bot2.addEventListener('click', resolver)

let peso=document.getElementById('inp2')
let cm=document.getElementById('inp3')
let imcc=document.getElementById('imcc')
let butim=document.getElementById('butim')

    
  

let impreso=()=>{
    
    let kg=parseInt(peso.value)*.453592
    let m=parseInt(cm.value)/100
    let imc=kg/(m*m)
    let salud=imc<15?"criterio de ingreso":imc<16.9?"infrapeso":imc<18.4?"bajo peso":imc<24.9?"peso normal":imc<29.9?"sonbrepeso":imc<34.9?"obesidad premorvida":imc<45?"obesidad morbida":"obesidad hipermorbida"
    imcc.innerHTML=imc+" " +salud

    }
    butim.addEventListener('click', impreso)