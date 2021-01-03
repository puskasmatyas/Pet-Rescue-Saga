import java.awt.Color;

class Main {
  public static void main(String[] args) {

    BlocAnimal animal = new BlocAnimal();
    CaseVisible case2 = new CaseVisible();

    Tableau tableau = new Tableau(2,2);
    tableau.remplirTableauInvisible(0,0);
    try{
      tableau.remplirTableauBloc(0,1,BlocCouleur.getBlocViolet());
    }
    catch(CaseInvisibleException e){}
    tableau.afficherTableau();
    tableau.viderTableau(0,1);
    tableau.afficherTableau();

    try{
      tableau.remplirTableauBloc(0,0, BlocCouleur.getBlocRouge());
    }
    catch(CaseInvisibleException e){
      e.printStackTrace();
    }
    
    Niveau niveau = Niveau.getNiveau(1);
    niveau.afficherTableau();

    niveau.detruireBloc(2,2);
    niveau.afficherTableau();
  }
}