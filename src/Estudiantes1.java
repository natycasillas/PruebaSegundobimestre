import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Estudiantes1{

    private JPanel rootPanel;
    private JTextField codigo;
    private JTextField cedula;
    private JTextField nombres;
    private JTextField signo;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JRadioButton moradoRadioButton;
    private JRadioButton verdeRadioButton;
    private JRadioButton ningunoRadioButton;
    private JRadioButton siRadioButton;
    private JRadioButton noRadioButton;
    private JButton cargarDatosDesdeElButton;
    private JButton guardarDatosEnElButton;
    private JButton verSiguienteRegistroButton;
    private JButton verAnteriorRegistroButton;

    String file_dir = "Estudiantes.txt";

    //Definimos el array de objetos
    Estudiantes1[] listEs = new Estudiantes1[10];
/*
    public Estudiantes1() {

        front_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Instanciamos un objeto nuevo por cada guardar
                for(int i = 0; i< Estudiantes1.length; i++){
                    Estudiantes1[i] = new Estudiantes(tfield1.getText(),tfield2.getText(),
                            tfield3.getText(), tfield4.getText());
                }
                try (FileOutputStream fileOut = new FileOutputStream(file_dir);
                     ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
                ) {

                    objectOut.writeObject(Estudiantes1);
                    System.out.println("Archivo escrito correctamente");

                }catch (IOException x){
                    throw new RuntimeException(x);
                }
            }
        });
        verAnteriorRegistroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verAnteriorRegistroButton.setVisible(true);
                rootPanel.setVisible(true);
            }
        });
    }
*/
    public static void main(String[] args) {
        JFrame frame = new JFrame("Estudiantes");
        frame.setContentPane(new Estudiantes1().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
