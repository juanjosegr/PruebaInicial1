class Pelicula(titulo: String, precio: Double, anioPublicado: Int, descuento: Int,genero:String, director:String,stock:Int) :Producto(titulo, precio, anioPublicado,descuento)
    {
    var GeneroPelicuda: String = ""
    var Directo: String = ""
    var Strock: Int= 0

    init {
        this.Directo = director
        this.GeneroPelicuda = genero
        this.Strock = stock
    }

    override fun obtenerDescuento(): Double {
        return  (Precio * Descuento)
    }

    override fun imprimir() {
        println("Pelicula: $Titulo,Precio:$Precio, Año publicación: $AnioPublicado, descuento: $Descuento, genero: $GeneroPelicuda, Director: $Directo, Stock: $Strock")
    }


}