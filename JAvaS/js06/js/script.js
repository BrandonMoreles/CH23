


let butSuma=document.querySelector("#botonSuma")
let butResta=document.querySelector("#botonResta")
let butMult=document.querySelector("#botonMult")
let butDiv=document.querySelector("#botonDiv")
let parrafo=document.querySelector('#resultado')

let calcular=(e)=>{
    let num1=Number(document.querySelector("#input1").value)
    let num2=Number(document.querySelector("#input2").value)
    let operar=e.target.value=="mas"?num1+num2:e.target.value=="menos"?num1-num2:e.target.value=="mult"?num1*num2:num1/num2
    parrafo.innerHTML=operar
}
butSuma.addEventListener('click', calcular)
butResta.addEventListener('click', calcular)
butMult.addEventListener('click', calcular)
butDiv.addEventListener('click', calcular)

