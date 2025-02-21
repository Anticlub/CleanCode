class Empresa {
    Cliente getCliente() { return new Cliente(); }
}

class Cliente {
    String getNombre() { return "Juan"; }
}

class Servicio {
    void procesar(Empresa empresa) {
        String nombreCliente = empresa.getCliente().getNombre(); // No cumple la Ley de Demeter
        System.out.println("Procesando cliente: " + nombreCliente);
    }
}