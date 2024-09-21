package desafio;

    public class ZapatoDeportivoFactory implements ZapatoFactory {
        @Override
        public Zapato crearZapatoHombre() {
            return new ZapatoDeportivoHombre();
        }

        @Override
        public Zapato crearZapatoMujer() {
            return new ZapatoDeportivoMujer();
        }

    }


