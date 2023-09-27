
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */

/**
 *
 * @author Daniel
 */
public class Form09 extends javax.swing.JFrame {

    /**
     * Creates new form Form09
     */
    public Form09() {
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

        LblDescripcion = new javax.swing.JLabel();
        LblFecha = new javax.swing.JLabel();
        TxtMesNumero = new javax.swing.JTextField();
        BtnMostrar = new javax.swing.JButton();
        TxtMesLetra = new javax.swing.JTextField();
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

        LblDescripcion.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        LblDescripcion.setText("<html><center>Mostrar el mes</center>\n");
        LblDescripcion.setOpaque(true);
        getContentPane().add(LblDescripcion);
        LblDescripcion.setBounds(130, 10, 220, 40);

        LblFecha.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        LblFecha.setText("<html><center>Digite un numero del 01 al 12</center>");
        LblFecha.setOpaque(true);
        getContentPane().add(LblFecha);
        LblFecha.setBounds(30, 110, 380, 50);

        TxtMesNumero.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        getContentPane().add(TxtMesNumero);
        TxtMesNumero.setBounds(140, 180, 140, 50);

        BtnMostrar.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        BtnMostrar.setText("<html><center>Mostrar</center>");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMostrar);
        BtnMostrar.setBounds(160, 270, 120, 70);

        TxtMesLetra.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        TxtMesLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMesLetraActionPerformed(evt);
            }
        });
        getContentPane().add(TxtMesLetra);
        TxtMesLetra.setBounds(130, 380, 170, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 1295);

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
    private void TxtMesLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMesLetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMesLetraActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        // TODO add your handling code here:
        
        String Mes = TxtMesNumero.getText();
        String mes = (String)TxtMesNumero.getText();
        int meses= Integer.parseInt(TxtMesNumero.getText());
        
            if(meses>=01 && meses<=12){
            if(mes.length()==2){
         if(mes.equals("01")){
             TxtMesLetra.setText("Enero");
         }else if(mes.equals("02")){
             TxtMesLetra.setText("Febrero");
         }         
         if(mes.equals("03")){
            TxtMesLetra.setText("Marzo");
        }else if(mes.equals("04")){
            TxtMesLetra.setText("Abril");
        }
        if(mes.equals("05")){
            TxtMesLetra.setText("Mayo");
        }else if(mes.equals("06")){
            TxtMesLetra.setText("Junio");
        }
        if(mes.equals("07")){
            TxtMesLetra.setText("Julio");
        }else if(mes.equals("08")){
            TxtMesLetra.setText("Agosto");
        }
        if(mes.equals("09")){
            TxtMesLetra.setText("Septiembre");
        }else if(mes.equals("10")){
            TxtMesLetra.setText("Octubre");
        }
        if(mes.equals("11")){
            TxtMesLetra.setText("Noviembre");
        }else if(mes.equals("12")){
            TxtMesLetra.setText("Diciembre");
        }
        }else if(mes.length()>2){
            JOptionPane.showMessageDialog(this, "Sólo se aceptan números del 1 al 12",
                        "Error", JOptionPane.ERROR_MESSAGE);
        }
            
            
        
            
        }else{
            JOptionPane.showMessageDialog(this, "¡Números negativos! Digita números entre el 01 y 12",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_BtnMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Form09.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form09.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form09.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form09.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form09().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JLabel LblDescripcion;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JTextField TxtMesLetra;
    private javax.swing.JTextField TxtMesNumero;
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
