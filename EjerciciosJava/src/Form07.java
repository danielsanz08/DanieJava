
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */

/**
 *
 * @author Aprendiz
 */
public class Form07 extends javax.swing.JFrame {

    /**
     * Creates new form Form07
     */
    public Form07() {
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

        LblResultado = new javax.swing.JLabel();
        TxtCatetoDos = new javax.swing.JTextField();
        LblCatetoDos = new javax.swing.JLabel();
        LblTitulo = new javax.swing.JLabel();
        BtnCalcular = new javax.swing.JButton();
        TxtCatetoUno = new javax.swing.JTextField();
        LblCatetoUno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtResultado = new javax.swing.JTextArea();
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

        LblResultado.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        LblResultado.setText("<html><center>Resultado</center>");
        getContentPane().add(LblResultado);
        LblResultado.setBounds(30, 410, 130, 40);

        TxtCatetoDos.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        getContentPane().add(TxtCatetoDos);
        TxtCatetoDos.setBounds(20, 270, 120, 40);

        LblCatetoDos.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        LblCatetoDos.setText("<html><center>Cateto dos</center>");
        getContentPane().add(LblCatetoDos);
        LblCatetoDos.setBounds(10, 220, 210, 40);

        LblTitulo.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        LblTitulo.setText("<html><center>Calcular la hipotenusa<center>");
        getContentPane().add(LblTitulo);
        LblTitulo.setBounds(90, 10, 140, 70);

        BtnCalcular.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        BtnCalcular.setText("<html><center>Calcular</center>");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCalcular);
        BtnCalcular.setBounds(220, 330, 110, 40);

        TxtCatetoUno.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        getContentPane().add(TxtCatetoUno);
        TxtCatetoUno.setBounds(20, 160, 120, 40);

        LblCatetoUno.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        LblCatetoUno.setText("<html><center>Cateto uno:</center>");
        getContentPane().add(LblCatetoUno);
        LblCatetoUno.setBounds(10, 110, 220, 40);

        TxtResultado.setColumns(20);
        TxtResultado.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        TxtResultado.setRows(5);
        jScrollPane1.setViewportView(TxtResultado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 470, 320, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baymax.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 350, 623);

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
      public boolean isNumero (String numero){
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
      
    
    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        // TODO add your handling code here:
        float cUno=0;
         float cDos=0;
         double resultado = 0;
         
          cUno = Float.parseFloat(TxtCatetoUno.getText());
          cDos = Float.parseFloat(TxtCatetoDos.getText());
          if((cUno<=0) ||(cDos<=0)){
              JOptionPane.showMessageDialog(this, "ERROR",
                      "No permitido", JOptionPane.ERROR_MESSAGE);
          }else{
          resultado = (double)Math.sqrt(cUno*cUno+cDos*cDos);
          
          TxtResultado.setText("La hipotenusa es :" +resultado); 
          }
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
            java.util.logging.Logger.getLogger(Form07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form07().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JLabel LblCatetoDos;
    private javax.swing.JLabel LblCatetoUno;
    private javax.swing.JLabel LblResultado;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JTextField TxtCatetoDos;
    private javax.swing.JTextField TxtCatetoUno;
    private javax.swing.JTextArea TxtResultado;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
