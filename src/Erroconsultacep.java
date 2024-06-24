public class Erroconsultacep extends RuntimeException{
    private String consulta;

    public Erroconsultacep (String consulta){
        super(consulta);

    }
}
