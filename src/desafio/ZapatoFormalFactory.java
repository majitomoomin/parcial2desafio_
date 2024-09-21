package desafio;

public class ZapatoFormalFactory implements ZapatoFactory {
    @Override
    public Zapato crearZapatoHombre() {
        return new ZapatoFormalHombre();
    }

    @Override
    public Zapato crearZapatoMujer() {
        return new ZapatoFormalMujer();
    }

    @Override
    public Zapato crearZapatoNino() {
        // Implementación para un zapato formal de niño, si fuera necesario
        return new ZapatoFormalNino(); // Asumiendo que esta clase existe
    }
}

