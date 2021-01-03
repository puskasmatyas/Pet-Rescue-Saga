abstract class Bloc{
  String type;

  Bloc(){
    this.type = getClass().getName();
  }

  public abstract String toString();

  public void clone(Bloc original){
    this.type = original.type;
  }
}