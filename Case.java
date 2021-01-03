class Case{
  private boolean visible;
  private Bloc bloc;
  
  Case(){
    this.visible=true;
    bloc = null;
  }

  Case(boolean visible){
    this.visible=visible;
    bloc=null;
  }

  Case(Bloc bloc){
    this.visible=true;
    this.bloc=bloc;
  }

  public Bloc getBloc(){
    return this.bloc;
  }

  public boolean estCouleur(){
    if(this.estVisible() && this.bloc != null && (this.bloc.getClass() == BlocCouleur.class)){
        return true;
    }
    return false;
  }

  public void clone(Case original){
    this.visible = original.visible;
    this.bloc.clone(original.getBloc());
  }

  public String toString(){
    if(visible){
      if(this.bloc==null){
        return "      ";
      }
      else{
        return bloc.toString();
      }
    }
    else{
      return "XXXXXX";
    }
  }

  boolean estVisible(){
    return visible;
  }

  boolean remplirCase(Bloc bloc) /*throws CaseInvisibleException*/{
    if(visible){
      this.bloc=bloc;
      return true;
    }
    System.out.println("Erreur: cette case est invisible");
    return false;
  }

  void viderCase(){
    this.bloc=null;
  }


  
}