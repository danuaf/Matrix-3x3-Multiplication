import javax.swing.*;

public class MatrikCalculator {
    private JTextField[][] matrikA;
    private JTextField[][] matrikB;
    private JTextField[][] matrikC;

    public MatrikCalculator(JTextField[][] matrikA, JTextField[][] matrikB, JTextField[][] matrikC){
        this.matrikA = matrikA;
        this.matrikB = matrikB;
        this.matrikC = matrikC;
    }

    private boolean isValid(){
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                if ((matrikA[i][j].getText()).equals("") || (matrikB[i][j].getText()).equals("")){
                    return false;
                }
            }
        }
        return true;
    }

    public void calculate(){
        int element = 0;

        if (!isValid()){
            JOptionPane.showMessageDialog(null, "invalid input, make sure all elements are defined");
        }else{
            for(int i = 0; i <= 2; i++){
                for(int j = 0; j <= 2; j++){
                    for(int k = 0; k <= 2; k++){
                        element += (Integer.parseInt(this.matrikA[i][k].getText())) * (Integer.parseInt(this.matrikB[k][j].getText()));
                    }
                    this.matrikC[i][j].setText(String.valueOf(element));
                    element = 0;
                }
            }
        }
    }

    public void clear(){
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                this.matrikA[i][j].setText("");
                this.matrikB[i][j].setText("");
                this.matrikC[i][j].setText("");
            }
        }
    }
}
