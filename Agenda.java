
public class Agenda {
        private String mail;
        private String nombre;
        private String numero;
        public Agenda(String mail, String nombre, String numero) {
            this.mail = mail;
            this.nombre = nombre;
            this.numero = numero;
        }
        public String getMail() {
            return mail;
        }
        public void setMail(String mail) {
            this.mail = mail;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getNumero() {
            return numero;
        }
        public void setNumero(String numero) {
            this.numero = numero;
        }
        
}