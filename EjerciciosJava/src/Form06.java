
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */

/**
 *
 * @author Aprendiz
 */
public class Form06 extends javax.swing.JFrame {

    /**
     * Creates new form Form06
     */
    public Form06() {
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

        jButton1 = new javax.swing.JButton();
        TxtNumeroTres = new javax.swing.JTextField();
        LblNumeroTres = new javax.swing.JLabel();
        LblDescripcion = new javax.swing.JLabel();
        LblNumeroUno = new javax.swing.JLabel();
        TxtNumeroUno = new javax.swing.JTextField();
        LblNumeroDos = new javax.swing.JLabel();
        TxtNumeroDos = new javax.swing.JTextField();
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

        jButton1.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        jButton1.setText("<html><center>Mostrar<center>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 300, 100, 31);

        TxtNumeroTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroTresActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNumeroTres);
        TxtNumeroTres.setBounds(10, 340, 230, 50);

        LblNumeroTres.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        LblNumeroTres.setText("<html><center>Digite el número tres<center>");
        getContentPane().add(LblNumeroTres);
        LblNumeroTres.setBounds(10, 290, 200, 40);

        LblDescripcion.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        LblDescripcion.setText("<html><center>Digitar 3 números<center>");
        getContentPane().add(LblDescripcion);
        LblDescripcion.setBounds(100, 10, 200, 80);

        LblNumeroUno.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        LblNumeroUno.setText("<html><center>Digite el número uno<center>");
        getContentPane().add(LblNumeroUno);
        LblNumeroUno.setBounds(10, 90, 210, 40);

        TxtNumeroUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroUnoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNumeroUno);
        TxtNumeroUno.setBounds(10, 130, 230, 50);

        LblNumeroDos.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        LblNumeroDos.setText("<html><center>Digite el número dos<center>");
        getContentPane().add(LblNumeroDos);
        LblNumeroDos.setBounds(10, 180, 200, 40);

        TxtNumeroDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroDosActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNumeroDos);
        TxtNumeroDos.setBounds(10, 230, 230, 50);

        TxtResultado.setColumns(20);
        TxtResultado.setRows(5);
        jScrollPane1.setViewportView(TxtResultado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 400, 330, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baymax.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 350, 520);

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

     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
            
        
         int num1=Integer.parseInt(TxtNumeroUno.getText());
         int num2=Integer.parseInt(TxtNumeroDos.getText());
         int num3=Integer.parseInt(TxtNumeroTres.getText());
         
       
         if((num1==num2)&&(num1==num3)&&(num3==num2)&&(num3==num1)&&(num1==num2)&&(num1==num3)){
             JOptionPane.showMessageDialog(this, "Números iguales",
                     "IGUALES", JOptionPane.ERROR_MESSAGE);
         }
         if((num1==num2)||(num1==num3)||(num3==num2)||(num3==num1)||(num1==num2)||(num1==num3)){
             JOptionPane.showMessageDialog(this, "Números iguales",
                     "IGUALES", JOptionPane.ERROR_MESSAGE);
         }
         if(num1>num2){
          
         }
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtNumeroTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroTresActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtNumeroTresActionPerformed

    private void TxtNumeroUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumeroUnoActionPerformed

    private void TxtNumeroDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumeroDosActionPerformed

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
            java.util.logging.Logger.getLogger(Form06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form06().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblDescripcion;
    private javax.swing.JLabel LblNumeroDos;
    private javax.swing.JLabel LblNumeroTres;
    private javax.swing.JLabel LblNumeroUno;
    private javax.swing.JTextField TxtNumeroDos;
    private javax.swing.JTextField TxtNumeroTres;
    private javax.swing.JTextField TxtNumeroUno;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

    private boolean isNumero(JTextField TxtNumeroUno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
