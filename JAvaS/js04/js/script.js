let miArray=[[1,6,2],[5,9,2,],[3,8,45]]
for(let i=0; i<=miArray.length;i++){
    for(let j=0;j<miArray[i].length;j++){
        console.log(miArray[i][j])
    }
}


let names=["Sofia","David","Juan"]
console.log(names)
names.shift()
names.push("Sara", "Agustin")
console.log(names)
names.splice(1,0,"Renata")
names.push("Elena")
console.log(names)

let asterisco="*"
for(let i=1;i<=5;i++){
    console.log(asterisco)
    asterisco+="*"
}

let xValue=10
while(xValue>0){
    console.log(xValue)
    xValue-=.5
}
let num=1
while(num<100){
    console.log(num)
    num+=2
}

let n=4
let impr=1
while(impr<=n){
    console.log(`[${impr}]`)
    impr++
}

let inicio=1
let total=0
let enteros=19
while(inicio<=enteros){
    total+=inicio
    inicio++    
}
console.log(total)
