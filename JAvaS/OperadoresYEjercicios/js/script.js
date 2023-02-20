var names = ["Maria", "Antony", "Joy", "Juan"]
let writeName=(name)=>{
    names.push(name)
}
writeName("Joel")
console.log(names)

let search=(nombre)=>{
    console.log (names.includes(nombre))
}
search("Joel")

let arrVacio=[]
let compare=(newArray)=>{
    newArray.map(
        function(element){
        if(names.includes(element)){
        arrVacio.push(element)
        }console.log(arrVacio)})}
compare(["Maria","Jose","Joel"])


let longitud=(array)=>{
    let lengths= array.map(
        function(element){
        return element.length
        })
    console.log(lengths)
}
longitud(["sdf","werwe",'wehybg'])


false || (true && false); //Este Resultado falso
true || (11 + 12); //Resultado verdadero
(31 + 22) || true; //Resultado verdadero
true && (1 + 7);//Resultado verdadero
false && (3 + 4); //Resultado falso
(1 + 2) && true; //Resultado verdadero
(32 * 4) >= 129;//Resultado falso
false !== !true;//Resultado verdadero
true === 4;//Resultado falso
false === (847 === '847');//Resultado vedadero
false === (887 == '887');//Resultado falso
(!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false;//Resultado verdadero

let range=(number)=>{
 console.log(number>100?"Es mayor a 100":number>=26?"Esta entre 26 y 100":number>=0?"Esta entre 0 y 25":"Es menor que 0")
}
range(0)
range(25)
range(26)
range(100)
range(101)
range(-2)

  









