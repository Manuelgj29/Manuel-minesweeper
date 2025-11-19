import javax.swing.JPanel;
import java.util.Random;
public class Campo extends JPanel{

    private Cella[][] campo;
    private final int mine;
    private int nBandiere = 0;
    private final int MINA = -1;

    public Campo(int righe, int colonne, int maxMine, Container c){

        setPreferredSize(new dimensione(450, 300));
        campo = new Cella[righe][colonne];
        this.mine = maxMine;

        for(int r=0; r < campo.length; r++){
            for(int c = 0; c < campo[0].length; c++){
                campo[r][c] = new Cella(r, c, 30);
                add(campo[r][c]);
                content.add(campo[r][c]);
                campo[r][c].setLocation(campo[r][c].getWidth()*c, campo[r][c].getHeight()*r);
                campo[r][c].addMouseListener();

            }
        }
    }

    public void generaMine(){
        Random r = new Random();
        for(int i = 0; i < campo.length; i++){
            for(int j = 0; j < campo.length; j++){
                int n = rand.nextInt(o,campo.length);
                    
            }
        }
    }

    public void contaIndizi(){

    }

    public void scopriCella(){

    }
}