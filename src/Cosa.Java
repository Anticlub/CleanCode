public class Cosa{
    private String cjp;//atributo del nombre del objeto
    private String asdjelw;//atributo de la ubicacion del objeto
    private int nutpae;//atributo del tamaño del objeto
    private double asfdjsa;//atributo precio

    public Cosa(String cjp, String asdjelw, int nutpae, double asfdjsa){//constructor que inicia el objeto con los todos los atributos
        this.cjp = cjp;
        this.asdjelw = asdjelw;
        this.nutpae = nutpae;
        this.asfdjsa = asfdjsa;
    }
    //metodo para sumar numeros, el a1 con el b1 y el a1 con el c1, tambien te dice la longitud de las cadenas insertadas, todo sale por terminal
    public void cosa1 (String cad1, String cad2, String cad3, int a1, int b1, int c1){
        System.out.println(this.cjp);
        System.out.println(this.asdjelw);
        System.out.println(this.nutpae);
        System.out.println(this.asfdjsa);

        System.out.println(a1 + b1 +" es la suma de " + a1 " y " c1);
        System.out.println(a1 + c1 +" es la suma de " + a1 " y " c1);

        System.out.println(cad1 + " tiene " + cad1.lenght + " letras");
        System.out.println(cad2 + " tiene " + cad2.lenght + " letras");
        System.out.println(cad3 + " tiene " + cad3.lenght + " letras");

        
    }
}