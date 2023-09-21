abstract class Producto(titulo:String, precio:Double, anioPublicado:Int, descuento:Int) {

    var Titulo:String = ""
    var Precio: Double = 0.0
    var AnioPublicado: Int = 0
    var Descuento: Int = 0

    abstract fun obtenerDescuento(): Double

    init {
        this.Titulo = titulo
        this.Precio = precio
        this.AnioPublicado = anioPublicado
        this.Descuento = descuento
    }

abstract fun imprimir()
}