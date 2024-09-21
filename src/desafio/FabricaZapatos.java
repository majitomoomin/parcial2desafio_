package desafio;

public class FabricaZapatos {
    public static void main(String[] args) {
        // Crear una fábrica de zapatos formales
        ZapatoFactory factoryFormal = new ZapatoFormalFactory();
        Zapato zapatoFormalHombre = factoryFormal.crearZapatoHombre();
        System.out.println("Zapato Formal Hombre: " + zapatoFormalHombre.getMaterial() +
                ", Suela: " + zapatoFormalHombre.getSuela() +
                ", Diseño: " + zapatoFormalHombre.getDiseno());

        // Crear una fábrica de zapatos deportivos
        ZapatoFactory factoryDeportivo = new ZapatoDeportivoFactory();
        Zapato zapatoDeportivoMujer = factoryDeportivo.crearZapatoMujer();
        System.out.println("Zapato Deportivo Mujer: " + zapatoDeportivoMujer.getMaterial() +
                ", Suela: " + zapatoDeportivoMujer.getSuela() +
                ", Diseño: " + zapatoDeportivoMujer.getDiseno());
    }
}
