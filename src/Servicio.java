class Empresa {
    Cliente getCliente() { return new Cliente(); }
    String getNombreCliente() { return getCliente().getNombre(); }
}

class Servicio {
    void procesar(Empresa empresa) {
        System.out.println("Procesando cliente: " + empresa.getNombreCliente());
    }
}