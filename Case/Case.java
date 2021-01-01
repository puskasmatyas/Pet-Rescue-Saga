class Case{
  boolean visible;
  Bloc bloc;
  
  Case(){
    this.visible=true;
  }

  Case(boolean visible){
    this.visible=visible;
  }

  Case(Bloc bloc){
    this.visible=true;
    this.bloc=bloc;
  }

  Case(Bloc bloc, boolean visible){
    this.visible=visible;
    this.bloc=bloc;
  }
  
  boolean remplirBloc(Bloc bloc){
    if(visible){
      this.bloc=bloc;
      return true;
    }
    return false;
  }

}