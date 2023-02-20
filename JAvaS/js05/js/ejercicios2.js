let GPAAcumulativo=0
let UnidadesTotales=0
console.log(GPAAcumulativo>2.0&&UnidadesTotales>=120?"!Puede graduarse!":"")

let cspCalificacion=0
let progCalificacion=0
console.log(cspCalificacion>=75||progCalificacion>=75?"Eres elegible para la graduacion":"")

let txt="Hello world"
function addPeriod(str) {
    let newStr = "";
    for (let  i= 0; i < str.length; i++) {
        if (str[i+1]!== " "&&str[i]!==" ") {
        newStr += str[i] + ".";
        } else {
        newStr += str[i];
        }}return newStr;
    }
console.log(addPeriod(txt))
