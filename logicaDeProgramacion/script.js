let resultado1=document.getElementById('resultado1')
const ejercicio1=()=>{
    let num1=Number(document.getElementById('numero1').value)
    let num2=Number(document.getElementById('numero2').value)
    let num3=Number(document.getElementById('numero3').value)
    let arr1=[]
    if(!isNaN(num1)&&!isNaN(num2)&&!isNaN(num3)){
    arr1.push(num1,num2,num3)
    resultado1.innerHTML=(arr1.sort(function(a,b){return a-b}).toString())
}
else{resultado1.innerHTML=("Papito, haz las cosas bien")}
};
let buton1=document.getElementById('buton1')
buton1.addEventListener('click', ejercicio1)



let kelWrite=document.getElementById('kelvin')
let farWrite=document.getElementById("farenheit")
let buton2=document.getElementById("buton2")
const resultado2=()=>{
    let cel=Number(document.getElementById('celsius').value)
    if(!isNaN(cel)){
    let far=(cel*1.8)+32
    let kel=cel+273.5
    kelWrite.innerHTML=("Kelvin: "+kel)
    farWrite.innerHTML=("Farenheit: "+far)
    }
    else{kelWrite.innerHTML=("Haz las cosas bien")
        farWrite.innerHTML=("papito")}            
}
buton2.addEventListener('click', resultado2)


let facWrite=document.getElementById('writeFac')
const ejercicio3=()=>{
    let numFac=Number(document.getElementById('factorial').value)
    if(!isNaN(numFac)){
const factorial=(num)=>{
    return (num==0)?1:num*factorial(num-1)}

  facWrite.innerHTML="Factorial: "+factorial(numFac)
}else{
    facWrite.innerHTML="Makinola, te sientes bien?"
}
}
let buton3=document.getElementById('buton3')
buton3.addEventListener("click", ejercicio3)


let writeFibo=document.getElementById('writeFibo')
const ejercicio4=()=>{
    let fibo=Number(document.getElementById('fibo').value)
    let arrFibo=[]
    let x=1
    let y=0
    if(!isNaN(fibo)){
        for(let i=0;i<fibo;i++){
            arrFibo.push(y,x)
            let a=y+x
            y=a
            x+=a
        }
    writeFibo.innerHTML=(arrFibo.toString())
    }else(writeFibo.innerHTML="Papu, usted necesita un medico")
}
let buton4 =document.getElementById('buton4')
buton4.addEventListener('click',ejercicio4)



let intentos=0
let buton5=document.getElementById('buton5')
let writeSecreto=document.getElementById('txtSecreto')
let writeIntentos=document.getElementById('intentos')
let secreto=Math.floor(Math.random()*100)
const reiniciar=()=>{
    document.getElementById('secreto').value=''
    intentos=0
    secreto=Math.floor(Math.random()*100)
    writeIntentos.innerHTML="Van "+intentos+" intentos"
    writeSecreto.innerHTML="Prueba suerte viajero"
    buton5.innerHTML="Probar"
    buton5.removeEventListener('click',reiniciar)
    buton5.addEventListener('click',ejercicio5)
}
const ejercicio5=()=>{
    let adivino=Number(document.getElementById('secreto').value)
    if(!isNaN(adivino)){
        if(adivino==secreto){
            writeSecreto.innerHTML="Buena punteria viajero"
            buton5.innerHTML="Reiniciar"
            buton5.removeEventListener('click',ejercicio5)
            buton5.addEventListener('click',reiniciar)
        }else if(adivino>secreto){writeSecreto.innerHTML="Un poco menos viajero"
        intentos+=1
        writeIntentos.innerHTML="Van "+intentos+" intentos"
        }else{writeSecreto.innerHTML="Un poco mas viajero"
        intentos+=1
        writeIntentos.innerHTML="Van "+intentos+" intentos"}
    }else{writeSecreto.innerHTML="Date prisa viajero, introduce un numero"
    intentos+=1
    writeIntentos.innerHTML="Van "+intentos+" intentos"}
}
buton5.addEventListener('click',ejercicio5)