class Disco(titulo: String, precio: Double, anioPublicado: Int, descuento: Int,genero: String,grupo:String,stock:Int) :Producto(titulo, precio, anioPublicado,
    descuento) {

    var GeneroMusical: String = ""
    var Grupo: String = ""
    var Strock: Int = 0

    init {
        this.GeneroMusical = genero
        this.Grupo = grupo
        this.Strock = stock
    }

    override fun obtenerDescuento(): Double {
        return  (Precio * Descuento)
    }

    override fun imprimir() {
        println("Disco: $Titulo,Precio:$Precio, Año publicación: $AnioPublicado, descuento: $Descuento, genero: $GeneroMusical, grupo: $Grupo, Stock: $Strock")
    }

}