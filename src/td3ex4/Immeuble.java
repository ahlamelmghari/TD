package td3ex4;


    class Immeuble extends Batiment {

        private int nbAppart;

        public Immeuble() {
            super();
            nbAppart = 0;
        }

        public Immeuble(String adress, int nbAppart) {
            super(adress);
            this.nbAppart = nbAppart;
        }

        public int getNbAppart() {
            return nbAppart;
        }

        public void setNbAppart(int nbAppart) {
            this.nbAppart = nbAppart;
        }

        @Override
        public String toString() {
            return "Immeuble{" +
                    "adresse='" + getAdress() + '\'' +
                    ", nbAppart=" + nbAppart +
                    '}';
        }
    }

