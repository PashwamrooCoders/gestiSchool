package pashwamroo.zyt.gestischool.exceptions;


public class EleveNotFoundException  extends ClassNotFoundException {

    private String message;

    public EleveNotFoundException(String message) {
        this.message = message;
    }

}
