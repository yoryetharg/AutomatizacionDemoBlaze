#language: es
Característica:  Yo como usuario quiero agregar diferentes productos a mi carrito de compra para poder comprarlos

  @EscenarioExitoso
  Escenario: Agregar productos al carrito de compra
    Dado que el usuario se encuentra en el inicio de la pagina web
    Cuando el usuario agregue el producto "Samsung galaxy s6" y "Nexus 6" al carrito de compra
    Entonces se valida que queden agregados al carrito

  @RegistrarUsuarioExitoso
  Escenario: Crear un usuario exitosamente
    Dado que el usuario se encuentra en el inicio de la pagina web
    Cuando el usuario diligencia los campos del formulario
    Entonces el usuario ve su nombre en la parte superior de la pagina

  @ComprarProductosExitoso
  Escenario: Comprar productos con usuario registrado
    Dado que el usuario se encuentra en el inicio de la pagina web
    Cuando el usuario compra productos
    Entonces el usuario ve el detalle de la compra