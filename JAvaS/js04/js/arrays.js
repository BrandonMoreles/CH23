let lista=[2,3,3,4,3,4,3,4,3,2,2,3,2,2,3,2,3,23,23,2,3,23,34,5567,567,456,45,354,345,435,2345]
for(let i=0;i<lista.length;i++){
    console.log(lista[i])
}
let listaNueva=lista.slice(3,6)
console.log(listaNueva)
let listaNuev=lista.join("..")
console.log(listaNuev)


let h=[164444,24336,334,443]
h.sort(
    function(a,b){
        return a-b
    }
)
console.log(h)
h.reverse()
console.log(h)


let arr=[12.,5,57,78,13,65]
let Narr=arr.map(
    function (a){
        return a-10
    }
)
console.log(Narr)
