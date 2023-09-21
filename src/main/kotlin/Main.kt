fun main(){

    var tienda = mutableListOf<Producto>()
    var cliente = mutableListOf<Cliente>()

    var disco = Disco("primero",10.21,2020,0,"Rap","Sfdk",20)
    var disco2 = Disco("segundo",13.53,2020,1,"Rap","Sfdk",30)
    var disco3 = Disco("tecero",18.78,2020,2,"Rap","Sfdk",40)
    var disco4 = Disco("cuarto",20.56,2020,0,"Rap","Sfdk",10)

    var pelicula = Pelicula("Harry Potter",20.50,2001,0,"Magia","Albus Dumbledore",10)
    var pelicula2 = Pelicula("Harry Potter 2",22.45,2001,2,"Magia","Albus Dumbledore",22)
    var pelicula3 = Pelicula("Harry Potter 3",25.36,2001,5,"Magia","Albus Dumbledore",3)
    var pelicula4 = Pelicula("Harry Potter 4",23.51,2001,0,"Magia","Albus Dumbledore",5)

    var cliente1= CienteRegistrado("1","1","1","1",0.0,2)
    var cliente2= CienteRegistrado("2","2","2","2",10.0,2)
    var cliente3= CienteRegistrado("3","3","3","3",20.0,2)
    var cliente4= CienteRegistrado("4","4","4","4",30.0,2)










    tienda.add(disco)
    tienda.add(disco2)
    tienda.add(disco3)
    tienda.add(disco4)
    tienda.add(pelicula)
    tienda.add(pelicula2)
    tienda.add(pelicula3)
    tienda.add(pelicula4)
    cliente.add(cliente1)
    cliente.add(cliente2)
    cliente.add(cliente3)
    cliente.add(cliente4)

    pelicula.imprimir()

}