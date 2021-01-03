public class Niveau extends Tableau{

  Niveau(int x, int y){
    super(x,y);
  }

  Niveau(){
    super();
  }

  public static Niveau getNiveau(int i){
    switch(i){
      case 1:
        return Niveau.getNiveau1();
      case 2:
        return Niveau.getNiveau2();        
      case 3:
        return Niveau.getNiveau3();
      default:
        System.out.println("Ce niveau n'existe pas. Retour du niveau 1");
        return Niveau.getNiveau1();
    }
  }

  public static Niveau getNiveau1(){
    Niveau niveau = new Niveau(7,7);

    try{
      niveau.remplirTableauBloc(0,1,new BlocAnimal());
      niveau.remplirTableauBloc(0,5,new BlocAnimal());

      niveau.remplirTableauInvisible(0, 0);
      niveau.remplirTableauInvisible(0, 2);
      niveau.remplirTableauInvisible(0, 3);
      niveau.remplirTableauInvisible(0, 4);
      niveau.remplirTableauInvisible(0, 6);

      niveau.remplirTableauBloc(1,0,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(1,1,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(1,2,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(1,3,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(1,4,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(1,5,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(1,6,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(2,0,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(2,1,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(2,2,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(2,3,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(2,4,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(2,5,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(2,6,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(3,0,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(3,1,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(3,2,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(3,3,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(3,4,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(3,5,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(3,6,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(4,0,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(4,1,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(4,2,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(4,3,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(4,4,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(4,5,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(4,6,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(5,0,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(5,1,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(5,2,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(5,3,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(5,4,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(5,5,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(5,6,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(6,0,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(6,1,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(6,2,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(6,3,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(6,4,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(6,5,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(6,6,BlocCouleur.getBlocJaune());
    }catch(CaseInvisibleException e){}

    return niveau;

  }

  public static Niveau getNiveau2(){
    Niveau niveau = new Niveau(8,5);

    try{
      niveau.remplirTableauBloc(0,2,new BlocAnimal());
      niveau.remplirTableauBloc(1,0,new BlocAnimal());
      niveau.remplirTableauBloc(1,2,new BlocAnimal());
      niveau.remplirTableauBloc(1,4,new BlocAnimal());
      niveau.remplirTableauBloc(2,2,new BlocAnimal());

      niveau.remplirTableauInvisible(0, 0);
      niveau.remplirTableauInvisible(0, 4);

      niveau.remplirTableauBloc(0,1,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(0,3,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(1,1,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(1,3,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(2,0,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(2,1,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(2,3,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(2,4,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(3,0,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(3,1,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(3,2,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(3,3,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(3,4,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(4,0,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(4,1,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(4,2,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(4,3,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(4,4,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(5,0,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(5,1,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(5,2,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(5,3,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(5,4,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(6,0,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(6,1,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(6,2,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(6,3,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(6,4,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(7,0,BlocCouleur.getBlocBleu());
      niveau.remplirTableauBloc(7,1,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(7,2,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(7,3,BlocCouleur.getBlocVert());
      niveau.remplirTableauBloc(7,4,BlocCouleur.getBlocBleu());
    }catch(CaseInvisibleException e){}

    return niveau;

  }

  
  public static Niveau getNiveau3(){
    Niveau niveau = new Niveau(9,7);

    try{
      niveau.remplirTableauBloc(0,2,new BlocAnimal());
      niveau.remplirTableauBloc(0,4,new BlocAnimal());
      niveau.remplirTableauBloc(0,6,new BlocAnimal());

      niveau.remplirTableauInvisible(0, 0);
      niveau.remplirTableauInvisible(0, 1);
      niveau.remplirTableauInvisible(0, 3);
      niveau.remplirTableauInvisible(0, 5);
      niveau.remplirTableauInvisible(1, 0);
      niveau.remplirTableauInvisible(1, 1);
      niveau.remplirTableauInvisible(2, 0);
      niveau.remplirTableauInvisible(2, 1);
      niveau.remplirTableauInvisible(3, 0);
      niveau.remplirTableauInvisible(3, 1);

      niveau.remplirTableauInvisible(7, 6);
      niveau.remplirTableauInvisible(8, 6);
      niveau.remplirTableauInvisible(7, 5);
      niveau.remplirTableauInvisible(8, 5);

      niveau.remplirTableauBloc(1,2,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(1,3,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(1,4,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(1,5,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(1,6,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(2,2,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(2,3,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(2,4,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(2,5,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(2,6,BlocCouleur.getBlocViolet()); 
      niveau.remplirTableauBloc(3,2,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(3,3,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(3,4,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(3,5,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(3,6,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(4,0,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(4,1,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(4,2,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(4,3,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(4,4,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(4,5,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(4,6,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(5,0,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(5,1,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(5,2,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(5,3,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(5,4,BlocCouleur.getBlocViolet()); 
      niveau.remplirTableauBloc(5,5,BlocCouleur.getBlocRouge());  
      niveau.remplirTableauBloc(5,6,BlocCouleur.getBlocViolet());  
      niveau.remplirTableauBloc(6,0,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(6,1,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(6,2,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(6,3,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(6,4,BlocCouleur.getBlocViolet()); 
      niveau.remplirTableauBloc(6,5,BlocCouleur.getBlocRouge());  
      niveau.remplirTableauBloc(6,6,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(7,0,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(7,1,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(7,2,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(7,3,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(7,4,BlocCouleur.getBlocJaune()); 
      niveau.remplirTableauBloc(8,0,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(8,1,BlocCouleur.getBlocRouge());
      niveau.remplirTableauBloc(8,2,BlocCouleur.getBlocJaune());
      niveau.remplirTableauBloc(8,3,BlocCouleur.getBlocViolet());
      niveau.remplirTableauBloc(8,4,BlocCouleur.getBlocJaune()); 

        }catch(CaseInvisibleException e){}

    return niveau;
    
    
     

    }
      
}