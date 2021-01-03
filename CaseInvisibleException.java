public class CaseInvisibleException extends Exception{

  CaseInvisibleException(){
    super("La case est invisible");
  }

  CaseInvisibleException(String message){
    super(message);
  }
}