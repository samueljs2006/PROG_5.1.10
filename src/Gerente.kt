class Gerente(nombre: String, edad: Int, salarioBase: Double, val bonus: Double, val exentoImpuestos: Boolean = false) :
    Empleado(nombre, edad, salarioBase, 33.99) {

    override fun calcularSalario(): Double {
        return if (exentoImpuestos) salarioBase + bonus else (salarioBase * (1 - porcentajeImpuestos / 100)) + bonus
    }

    override fun toString(): String {
        return "${super.toString()}, Bonus: %.2f€, Exento de impuestos: $exentoImpuestos".format(bonus)
    }

    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }
}
