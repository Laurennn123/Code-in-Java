import javax.swing.JOptionPane;
public class ArrayJOptionPane {
    public static void main(String[] args) {
        double [] input = new double [10];
        for (int i=0; i<input.length; i++){
            input[i]=Double.parseDouble(JOptionPane.showInputDialog("Enter number no."+(1+i)+":"));
        }
        double greatest = input[0];
        for (int e=1; e<input.length; e++){
            greatest = Math.max(greatest, input[e]);
        }
        String msg= "";
        for (int a=0; a<input.length; a++){
            msg += "Enter number no." + (a+1) + ": " + input[a] + "\n";
        }
        msg += "The greatest value from inputs is: " + greatest;
        JOptionPane.showMessageDialog(null, msg);
    }
}