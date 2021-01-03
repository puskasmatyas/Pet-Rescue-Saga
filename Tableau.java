class Tableau{
  private int x,y;
  Case[][] casetableau;

  Tableau(){
    
  }

  Tableau(int x, int y){
    this.x=x;
    this.y=y;
    casetableau = new Case[x][y];
    for(int i = 0; i < x; i++){
      for(int j = 0; j < y; j++){
        this.remplirTableauVisible(i,j);
      }
    }
  }

  int getX(){
    return this.x;
  }

  int getY(){
    return this.y;
  }

  public Case getCase(int x, int y){
    try{
      return casetableau[x][y];
    }
    catch(IndexOutOfBoundsException e){
      e.printStackTrace();
    }
    return null;
  }

  void remplirTableau(int x, int y, Case casetableau) {
    //replit le tableau au coordonnees x, y avec une case quelconque
    
    this.casetableau[x][y]=casetableau;
    if(casetableau.estVisible()){
      System.out.println("Insertion d'une case visible à " + x + ", " + y);
    }
    else{
      System.out.println("Insertion d'une case invisible à " + x + ", " + y);
    }
  }

  void remplirTableauVisible(int x, int y) {
    //remplit le tableau au coordonnees x, y avec une case visible

    this.casetableau[x][y] = new Case(true);
    System.out.println("Insertion d'une case visible à " + x + ", " + y);
  }

  void remplirTableauInvisible(int x, int y) {
    //remplit le tableau au coordonnees x, y avec une case invisible

    System.out.println("Insertion d'une case invisible à " + x + ", " + y);
    this.casetableau[x][y]=new Case(false);
  }

  void remplirTableauBloc(int x, int y, Bloc bloc) throws CaseInvisibleException {
    //remplit le tableau au coordonnees x, y avec un bloc quelconque passe en parametre
    //cree une case visible si il n'y a pas encore de case au point x, y
    //renvoie une exception si il y a deja une case invisible au point x, y

    System.out.println("Insertion d'une case " + bloc + " à " + x + ", " + y);
    if(this.casetableau[x][y]!=null && !this.casetableau[x][y].estVisible()){
      throw new CaseInvisibleException("Erreur: La case " + x + ", " + y + " est invisible");
    }
    else{
      this.casetableau[x][y]=new Case(bloc);
    }

  }

  void viderTableau(int x, int y){
    if(this.casetableau[x][y].estVisible()){
      System.out.println("Vidage de la case " + x + ", " + y + " ");
      this.casetableau[x][y].viderCase();
    }
  }

  void afficherTableau(){
    System.out.println();
    for(int i = 0; i < this.casetableau.length ; i++){
      for(int j = 0 ; j < this.casetableau[i].length; j++){
        System.out.print(this.casetableau[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public void detruireBloc(int a, int b){
    if(!this.casetableau[a][b].estCouleur() && a < x && b < y ){
      return;
    }
      
    boolean voisins = false;
    //cette variable devient vraie si le bloc a des voisins de la meme couleur
    
    try{
      if(this.casetableau[a][b].estCouleur() && (this.casetableau[a][b].getBloc().toString()).equals(this.casetableau[a][b+1].getBloc().toString())){
        voisins = true;
      }
    }catch(ArrayIndexOutOfBoundsException e){}

    try{
      if(this.casetableau[a][b].estCouleur() && (this.casetableau[a][b].getBloc().toString()).equals(this.casetableau[a+1][b].getBloc().toString())){
        voisins = true;
      }
    }catch(ArrayIndexOutOfBoundsException e){}

    try{
      if(this.casetableau[a][b].estCouleur() && (this.casetableau[a][b].getBloc().toString()).equals(this.casetableau[a][b-1].getBloc().toString())){
        voisins = true;
      }
      }catch(ArrayIndexOutOfBoundsException e){}
      
    try{
      if(this.casetableau[a][b].estCouleur() && (this.casetableau[a][b].getBloc().toString()).equals(this.casetableau[a-1][b].getBloc().toString())){
        voisins = true;
      }
    }catch(ArrayIndexOutOfBoundsException e){}
    
    //System.out.println(a + " " + b);
    //System.out.println(voisins);

    if(voisins){
      Case tmp = casetableau[a][b];
      tmp.clone(casetableau[a][b]);
      
      System.out.println(tmp);
      
      try{
        if(this.casetableau[a][b+1].estCouleur() && (tmp.getBloc()).equals(this.casetableau[a][b+1].getBloc()) ){
          this.detruireBloc(a,b+1);
        }
      }catch(ArrayIndexOutOfBoundsException e){}

      try{
        if(this.casetableau[a+1][b].estCouleur() && (tmp.getBloc()).equals(this.casetableau[a+1][b].getBloc()) ){
          this.detruireBloc(a+1,b);
        }
      }catch(ArrayIndexOutOfBoundsException e){}

      try{
        if(this.casetableau[a][b-1].estCouleur() && (tmp.getBloc()).equals(this.casetableau[a][b-1].getBloc()) ){
          this.detruireBloc(a,b-1);
        }
      }catch(ArrayIndexOutOfBoundsException e){}

      try{
        if(this.casetableau[a-1][b].estCouleur() && (tmp.getBloc()).equals(this.casetableau[a-1][b].getBloc()) ){
          this.detruireBloc(a-1,b);
        }
      }catch(ArrayIndexOutOfBoundsException e){}
      
    }

    viderTableau(a,b);

  }

}