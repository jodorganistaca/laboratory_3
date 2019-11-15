public class BuilderPattern {

    static class Carro {
        private String marca = "";
        private String velMax = "";
        private String costo = "";

        public void setMarca(String marca){
            this.marca = marca;
        }
        public void setVelMax(String velMax){
            this.velMax = velMax;
        }
        public void setCosto(String costo){
            this.costo = costo;
        }
    }

    static abstract class CarroBuilder {
        protected Carro carro;

        public Carro getCarro() {
            return carro;
        }

        public abstract void buildMarca();
        public abstract void buildVelMax();
        public abstract void buildCosto();
    }

    static class MazdaCarroBuilder extends CarroBuilder {
        public MazdaCarroBuilder(){
            super.carro = new Carro();
        }
        public void buildMarca(){
            carro.setMarca("Mazda");
        }
        public void buildVelMax(){
            carro.setVelMax("300 Km/h");
        }
        public void buildCosto(){
            carro.setCosto("150 M");
        }
    }

    static class RenaultCarroBuilder extends CarroBuilder {
        public RenaultCarroBuilder(){
            super.carro = new Carro();
        }
        public void buildMarca()   {
            carro.setMarca("Renault");
        }
        public void buildVelMax()   {
            carro.setVelMax("250 Km/h");
        }
        public void buildCosto() {
            carro.setCosto("120 M");
        }
    }

    static class Fabricas {
        private CarroBuilder carroBuilder;

        public void setCarroBuilder(CarroBuilder pb) {
            carroBuilder = pb;
        }
        public Carro getCarro() {
            return carroBuilder.getCarro();
        }

        public void construirCarro() {
            carroBuilder.buildMarca();
            carroBuilder.buildVelMax();
            carroBuilder.buildCosto();
        }
    }

    public static void main(String[] args) {
        Fabricas fabricas = new Fabricas();
        CarroBuilder mazdaBuilder = new MazdaCarroBuilder();
        CarroBuilder RenaultBuilder = new RenaultCarroBuilder();

        fabricas.setCarroBuilder( mazdaBuilder );
        fabricas.construirCarro();

        Carro carro = fabricas.getCarro();

        System.out.println("Marca: " + carro.marca);
        System.out.println("Velocidad máxima: " + carro.velMax);
        System.out.println("Costo: " + carro.costo);

        System.out.println("");
        System.out.println("Cambio de constructor...");
        System.out.println("");

        fabricas.setCarroBuilder( RenaultBuilder );
        fabricas.construirCarro();
        Carro carro2 = fabricas.getCarro();
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Velocidad máxima: " + carro2.velMax);
        System.out.println("Costo: " + carro2.costo);
    }
}
