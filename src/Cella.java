import java.awt.Canvas;

public class Cella extends Canvas {

    private StatoCella stato;
    private int contenuto;
    private final int Mina = -1;
    private int r, c;

    private Color[] colori;

    public Cella(int r, int c, int dimensione) {

        setSize(dimensione, dimensione);
        this.r = r;
        this.c = c;
        this.contenuto = 0;
        this.stato = StatoCella.COPERTA;

        colori = new Color[] {
                Color.white,
                Color.blue,
                new Color(70, 170, 70),
                Color.red,
                new Color(0, 0, 128),
                new Color(150, 50, 50),
                new Color(50, 255, 200),
                Color.darkGray,
                Color.black
        };
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    public boolean isScoperta() {
        return stato == StatoCella.SCOPERTA;
    }

    public boolean isBandiera() {
        return stato == StatoCella.BANDIERA;
    }

    public void setContenuto(int contenuto) {
        if (contenuto >= -1 && contenuto <= 8) {
            this.contenuto = contenuto;
        }
    }

    public int getContenuto() {
        return contenuto;
    }

    public void setBandiera(){
        if(stato == StatoCella.COPERTA) {
            stato = StatoCella.BANDIERA;
        repaint();
    }

    public void setVisible(Boolean mostra){
        if(mostra && stato == StatoCella.COPERTA){
            stato = StatoCella.BANDIERA;
            repaint();
        }
    }

}
}