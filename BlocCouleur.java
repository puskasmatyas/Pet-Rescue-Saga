import java.awt.Color;

class BlocCouleur extends Bloc {
  private Color couleur;

  public String toString(){
    if(this.couleur.equals(new Color(220,30,20)))
        return "******";
    else if(this.couleur.equals(new Color(0,133,255)))
        return "//////";
    else if(this.couleur.equals(new Color(240,215,30)))
        return "++++++";
    else if(this.couleur.equals(new Color(241,142,228)))
        return "------";
    else if(this.couleur.equals(new Color(190,63,217)))
        return "::::::";
    else if(this.couleur.equals(new Color(80,216,54)))
        return "%%%%%%";
    else return "RRRRRR";
  }

  BlocCouleur(Color couleur) {
    this.couleur = couleur;
  }

  public Color getCouleur(){
    return this.couleur;
  }

  public void clone(BlocCouleur original){
    super.clone(original);
    this.couleur = new Color(original.couleur.getRed(),original.couleur.getGreen(),original.couleur.getBlue());

  }

  public static Bloc getBlocRouge() {
    return new BlocCouleur(new Color(220,30,20));
  }

  public static Bloc getBlocBleu() {
    return new BlocCouleur(new Color(0,133,255));
  }

  public static Bloc getBlocJaune() {
    return new BlocCouleur(new Color(240,215,30));
  }

  public static Bloc getBlocRose() {
    return new BlocCouleur(new Color(241,142,228));
  }

  public static Bloc getBlocViolet() {
    return new BlocCouleur(new Color(190,63,217));
  }
  
  public static Bloc getBlocVert() {
    return new BlocCouleur(new Color(80,216,54));
  }

}