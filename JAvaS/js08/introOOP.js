let persona={
    nombre:"Juan",
    apellido:"Perez",
    nombreCompleto:function(){
        return this.nombre+ this.apellido
    }
}
console.log(persona.nombre)
console.log(persona.nombreCompleto())

