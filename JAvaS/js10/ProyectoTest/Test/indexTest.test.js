//Prueba efectiva
// const indexTest=require("../calculadora")
import {obj} from "../calculadora";
test('test suma', () => { 
    const res=obj.suma(1,2)
    expect (res).toBe(3)
});
test.todo('test resta')
test.todo('test div')
test.todo('test multi')
