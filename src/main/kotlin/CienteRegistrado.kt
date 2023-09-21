class CienteRegistrado(Nombre:String, Apellido:String, Dni:String, Tlf:String,Saldo:Double,Descuento:Int):Cliente {

    var nombre: String = ""
    var apellido: String = ""
    var dni: String = ""
    var tlf: String = ""
    var saldo: Double = 0.0
    var descuento: Int = 2

    init {
        this.nombre = Nombre
        this.apellido = Apellido
        this.dni = Dni
        this.tlf = Tlf
        this.saldo = Saldo
        this.descuento = Descuento
    }

    fun validar_dni(){

    }

    fun esVip(){

    }

    var nuevoDescuento:Int = 0

    fun actualizarDescuento(){
        this.descuento = nuevoDescuento
    }

}