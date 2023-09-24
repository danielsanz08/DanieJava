
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */

/**
 *
 * @author Daniel
 */
public class Form01 extends javax.swing.JFrame {

    /**
     * Creates new form Form01
     */
    public Form01() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblTitulo = new javax.swing.JLabel();
        LblNumeroUno = new javax.swing.JLabel();
        TxtNumeroUno = new javax.swing.JTextField();
        LblNumeroDos = new javax.swing.JLabel();
        TxtNumeroDos = new javax.swing.JTextField();
        LblResultado = new javax.swing.JLabel();
        TxtResultado = new javax.swing.JTextField();
        BtnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LblTitulo.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        LblTitulo.setText("<html><center>Dividir 2 números<center>");
        LblTitulo.setOpaque(true);
        getContentPane().add(LblTitulo);
        LblTitulo.setBounds(90, 10, 140, 70);

        LblNumeroUno.setBackground(new java.awt.Color(255, 255, 255));
        LblNumeroUno.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        LblNumeroUno.setText("<html><center>Digite el número uno</center>");
        LblNumeroUno.setOpaque(true);
        getContentPane().add(LblNumeroUno);
        LblNumeroUno.setBounds(10, 110, 220, 40);

        TxtNumeroUno.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        getContentPane().add(TxtNumeroUno);
        TxtNumeroUno.setBounds(20, 160, 120, 40);

        LblNumeroDos.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        LblNumeroDos.setText("<html><center>Digite el número dos</center>");
        LblNumeroDos.setOpaque(true);
        getContentPane().add(LblNumeroDos);
        LblNumeroDos.setBounds(10, 220, 210, 40);

        TxtNumeroDos.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        getContentPane().add(TxtNumeroDos);
        TxtNumeroDos.setBounds(20, 270, 120, 40);

        LblResultado.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        LblResultado.setText("<html><center>Resultado</center>");
        LblResultado.setOpaque(true);
        getContentPane().add(LblResultado);
        LblResultado.setBounds(30, 330, 130, 40);

        TxtResultado.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        TxtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtResultado);
        TxtResultado.setBounds(30, 400, 120, 40);

        BtnCalcular.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        BtnCalcular.setText("<html><center>Calcular</center>");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCalcular);
        BtnCalcular.setBounds(220, 280, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giphy.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 350, 480);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
public boolean Numero (String numero){
      try{
          int Number = Integer.parseInt(numero);
          return true;
      } catch(NumberFormatException NFE){
         JOptionPane.showMessageDialog(this, 
                    "El texto "+numero +" no es un número valido", 
                    "Numero Invalido", JOptionPane.ERROR_MESSAGE);
      
        return false;
      }
    }
    
    public void HallarDivision(){
        int Num1 = 0, Num2 = 0;
        float Resultado = 0.0f;
        DecimalFormat df = new DecimalFormat("0.00");
        TxtResultado.setVisible(false);
        if(TxtNumeroDos.getText().equalsIgnoreCase("0")){
            JOptionPane.showMessageDialog(this, "El o no está permitido como segundo numero", "Error", JOptionPane.ERROR_MESSAGE);
            TxtNumeroDos.setText("");
            
        }else{
            if(Numero(TxtNumeroUno.getText())&& Numero(TxtNumeroDos.getText())){
               Num1 = Integer.parseInt(TxtNumeroUno.getText());
               Num2 = Integer.parseInt(TxtNumeroDos.getText());
               Resultado = (float) Num1 / Num2;
               TxtResultado.setText(df.format(Resultado));
               TxtResultado.setVisible(true);
            }
        }
        if(Resultado<=0){
            JOptionPane.showMessageDialog(this, "Error, Número inválido","ERROR ", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    private void TxtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtResultadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TxtResultadoActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        // TODO add your handling code here:
        HallarDivision();
    }//GEN-LAST:event_BtnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JLabel LblNumeroDos;
    private javax.swing.JLabel LblNumeroUno;
    private javax.swing.JLabel LblResultado;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JTextField TxtNumeroDos;
    private javax.swing.JTextField TxtNumeroUno;
    private javax.swing.JTextField TxtResultado;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
