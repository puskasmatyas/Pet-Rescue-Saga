import java.awt.Color;

class BlocCouleur extends Bloc {
  Color couleur;

  BlocCouleur(Color couleur) {
    this.couleur = couleur;
  }

  Color getRouge() {
    return new Color(220,30,20);
  }

  Color getBleu() {
    return new Color(0,133,255);
  }

  Color getJaune() {
    return new Color(240,215,30);
  }

  Color getRose() {
    return new Color(241,142,228);
  }

  Color getViolet() {
    return new Color(190,63,217);
  }

}