fun main() {
    val persona = Persona("Julia", 24)
    val empleado = Empleado("Pablo", 30, 30000.0)
    val gerente = Gerente("Ana", 40, 50000.0, 10000.0)

    println(persona)
    println(persona.celebrarCumple())

    println(empleado)
    println(empleado.trabajar())

    println(gerente)
    println(gerente.administrar())
}
