abstract class Bloc{
  String type;

  Bloc(){
    this.type = getClass().getName();
  }

}