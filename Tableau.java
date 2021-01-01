class Tableau{
  int x,y;
  Case[][] casetableau;

  Tableau(int x, int y){
    this.x=x;
    this.y=y;
    casetableau = new Case[x][y];
  }

  boolean remplirCase(int x, int y, Bloc bloc) {
    if(casetableau[x][y].remplirBloc(bloc)){
      return true;
    }
    return false;
  }

  
}