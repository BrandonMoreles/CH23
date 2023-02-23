class Persona{
    constructor(nombre, apellido){
        this._nombre=nombre;
        this.apellido=apellido;
    }
}
let persona1=new Persona("Joel", "Moreles")
console.log(persona1)

let persona2=new Persona("Maria","Perez")
console.log(persona2)

let persona3=new Persona("Jonhy", "Bravo")
persona3.nombre

class Empleado extends Persona{
    constructor(nombre, apellido, departamento){
        super(nombre, apellido)
        this.departamento=departamento
    }
}

let ewe=new Empleado("hola", "Como", "Estas")
console.log(ewe)