public class Principal {

    public static void main(String[] args){

        Carro car = new Carro();
        Carro carAro = new Carro(14);
        Carro carParametros = new 
        Carro(14, "HB 20 2021 sense", 60000, "Branco");
        Carro carQuatroParametros = new Carro(17, "Civc", 100000, "Preto");

        System.out.println(carAro.getAro());
        System.out.println(carQuatroParametros.getCor());
        System.out.println(carParametros.getValor());
        System.out.println(car);


        
    }
    
}
