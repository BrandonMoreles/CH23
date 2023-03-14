const verificar=(pepe,string)=>{
    let array=[]
    pepe.map(item=>{
        if(item.length>string.length){
            array.push(item)
        }
    })
    return array
}

let array=['Hola','como','estas',"me","llamo",897, "PedritoZola"]
let arr1=verificar(array,"Hola")

let num1=875

obj={
    'hola':'hola',
    "keys":"sdsd",
    hola:()=>{
        return 0
    }
}
console.log(Object.values(obj))
console.log("------------------------------")
console.log(Object.keys(obj))
console.log(obj)

let ul=document.querySelector('ul')
const imprimir=(arr)=>{
    arr.map(item=>{
        let li=document.createElement('li')
        li.innerHTML=item
        ul.append(li)
    })
}
imprimir(arr1)