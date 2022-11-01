package papelaria;

    public class Cliente {

        private String nif;
        private String nome;
        private int ano;
        private String escalao;
        private double plafond;
        private double total = 0;

        @Override
        public String toString() {
            return "Nome: " + this.nome + "\nNIF: " + this.nif + "\nAno escolar: "+ this.ano + "\nEscalão: "
                    + this.escalao + "\n";
        }
        public String getNif() {
            return nif;
        }
        public void setNif(String nif) {

            this.nif = nif;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public double getAnoC() {
            return ano;
        }
        public void setAnoC(int ano) {
            this.ano = ano;
        }
        public String getEscalao() {
            return escalao;
        }
        public void setEscalao(String escalao) {
            this.escalao = escalao;
        }
        public double getPlafond() {
            return plafond;
        }
        public void setPlafond(double plafond) {
            this.plafond = plafond;
        }
        public double getTotal() {
            return total;
        }
        public void setTotal(double total) {
            this.total = total;
        }
    }

