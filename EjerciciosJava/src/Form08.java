
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */

/**
 *
 * @author Aprendiz
 */
public class Form08 extends javax.swing.JFrame {

    /**
     * Creates new form Form08
     */
    public Form08() {
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

        jPanel1 = new javax.swing.JPanel();
        LblDescripcion = new javax.swing.JLabel();
        LblAnio = new javax.swing.JLabel();
        TxtAnio = new javax.swing.JTextField();
        LblMes = new javax.swing.JLabel();
        TxtMes = new javax.swing.JTextField();
        LblDia = new javax.swing.JLabel();
        TxtDia = new javax.swing.JTextField();
        BtnMostrar = new javax.swing.JButton();
        LblFecha = new javax.swing.JLabel();
        TxtFechaFinal = new javax.swing.JTextField();
        CmbUno = new javax.swing.JComboBox<>();
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

        jPanel1.setLayout(null);

        LblDescripcion.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        LblDescripcion.setText("<html><center>Digitar 8 números<center>");
        jPanel1.add(LblDescripcion);
        LblDescripcion.setBounds(100, 10, 200, 80);

        LblAnio.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        LblAnio.setText("<html><center>Digite el año</center>");
        LblAnio.setOpaque(true);
        jPanel1.add(LblAnio);
        LblAnio.setBounds(20, 100, 150, 30);

        TxtAnio.setFont(new java.awt.Font("Cascadia Code", 3, 18)); // NOI18N
        TxtAnio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxtAnioMouseEntered(evt);
            }
        });
        TxtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAnioActionPerformed(evt);
            }
        });
        TxtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAnioKeyPressed(evt);
            }
        });
        jPanel1.add(TxtAnio);
        TxtAnio.setBounds(20, 150, 120, 30);

        LblMes.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        LblMes.setText("<html><center>Digite el mes</center>");
        LblMes.setOpaque(true);
        jPanel1.add(LblMes);
        LblMes.setBounds(20, 200, 140, 20);

        TxtMes.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        TxtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtMesKeyPressed(evt);
            }
        });
        jPanel1.add(TxtMes);
        TxtMes.setBounds(20, 230, 90, 30);

        LblDia.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        LblDia.setText("<html><center>Digite el día</center>");
        LblDia.setOpaque(true);
        jPanel1.add(LblDia);
        LblDia.setBounds(20, 280, 110, 20);

        TxtDia.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jPanel1.add(TxtDia);
        TxtDia.setBounds(20, 320, 90, 30);

        BtnMostrar.setBackground(new java.awt.Color(255, 0, 0));
        BtnMostrar.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        BtnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnMostrar.setText("<html><center>Mostrar</center>");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMostrar);
        BtnMostrar.setBounds(230, 320, 100, 50);

        LblFecha.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        LblFecha.setText("<html><center>Fecha</center>");
        jPanel1.add(LblFecha);
        LblFecha.setBounds(30, 380, 70, 23);

        TxtFechaFinal.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jPanel1.add(TxtFechaFinal);
        TxtFechaFinal.setBounds(20, 430, 120, 40);

        CmbUno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Año Normal", "Año Biciesto", " " }));
        jPanel1.add(CmbUno);
        CmbUno.setBounds(290, 120, 160, 40);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 490);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

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
    
    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        // TODO add your handling code here:
       
        JComboBox<String> OpAnio = CmbUno;
         String AnioSeleccionado = (String) CmbUno.getSelectedItem();
         
         //Uso de la sentencia if
         if(AnioSeleccionado.equals("Año Normal")){
             String Anio = TxtAnio.getText();
            if(Anio.length()<4){
                JOptionPane.showMessageDialog(this, "El año debe tener 4 dígitos",
                        "Año no válido", JOptionPane.ERROR_MESSAGE);
            }else if(Anio.length()>4){
                JOptionPane.showMessageDialog(this, "El año debe tener 4 dígitos",
                        "Año no válido", JOptionPane.ERROR_MESSAGE);
            }
            
             int Mes = Integer.parseInt(TxtMes.getText());
             int Dia = Integer.parseInt(TxtDia.getText());
             if(Mes<0 || Mes >12){
                 JOptionPane.showMessageDialog(this, "El mes debe ser entre el numero 1 y numero 12",
                        "Mes no válido", JOptionPane.ERROR_MESSAGE);
                if(Dia<=0 || Dia>31){
                 JOptionPane.showMessageDialog(this, "Debes digitar entre 01 y 31",
                        "Dia no válido", JOptionPane.ERROR_MESSAGE);
             }
             }else{
                  TxtFechaFinal.setText(Anio+"/"+Mes+"/"+Dia);
             }
             
             if(Mes==02){
                 if(Dia<=0 || Dia>28){
                     JOptionPane.showMessageDialog(this, "Debes digitar entre 01 y 28",
                        "Dia no válido", JOptionPane.ERROR_MESSAGE);
             
                 }else{
                     TxtFechaFinal.setText(Anio+"/"+Mes+"/"+Dia);
                 }
             }
         }
          if(AnioSeleccionado.equals("Año Biciesto")){
              String Anio = TxtAnio.getText();
              if(Anio.length()<4){
                JOptionPane.showMessageDialog(this, "El año debe tener 4 dígitos",
                        "Año no válido", JOptionPane.ERROR_MESSAGE);
            }else if(Anio.length()>4){
                JOptionPane.showMessageDialog(this, "El año debe tener 4 dígitos",
                        "Año no válido", JOptionPane.ERROR_MESSAGE);
            }
              int Mes = Integer.parseInt(TxtMes.getText());
             int Dia = Integer.parseInt(TxtDia.getText());
             if(Mes<0 || Mes >12){
                 JOptionPane.showMessageDialog(this, "El mes debe ser entre el numero 1 y numero 12",
                        "Mes no válido", JOptionPane.ERROR_MESSAGE);
                if(Dia<=0 ){
                 JOptionPane.showMessageDialog(this, "Debes digitar entre 01 y 31",
                        "Dia no válido", JOptionPane.ERROR_MESSAGE);
             }
                if(Dia>31){
                    JOptionPane.showMessageDialog(this, "Debes digitar entre 01 y 31",
                        "Dia no válido", JOptionPane.ERROR_MESSAGE);
                }
             
             }else{
                  TxtFechaFinal.setText(Anio+"/"+Mes+"/"+Dia);
             }
             if(Mes==02){
                 if(Dia<=0 || Dia>29){
                     JOptionPane.showMessageDialog(this, "Debes digitar entre 01 y 29 teniendo en cuenta que elegiste Año biciesto",
                        "Dia no válido", JOptionPane.ERROR_MESSAGE);
             
                 }else{
                     TxtFechaFinal.setText(Anio+"/"+Mes+"/"+Dia);
                 }
             }
          } 
          if(AnioSeleccionado.equals("Seleccione una opción")){
              int Anio = Integer.parseInt(TxtAnio.getText());
              int Mes = Integer.parseInt(TxtMes.getText());
             int Dia = Integer.parseInt(TxtDia.getText());
              if(Anio>0 ){
                  JOptionPane.showMessageDialog(this, "SELECCIONA PRIMERO EL TIPO DE AÑO",
                          "AÑO NO VÁLIDO", JOptionPane.ERROR_MESSAGE);
              }else{
                  JOptionPane.showMessageDialog(this, "SELECCIONA PRIMERO EL TIPO DE AÑO",
                          "AÑO NO VÁLIDO", JOptionPane.ERROR_MESSAGE);
              }
              if(Mes<0){
                  JOptionPane.showMessageDialog(this, "SELECCIONA PRIMERO EL TIPO DE AÑO",
                          "MES NO VÁLIDO", JOptionPane.ERROR_MESSAGE);
              }else{
                  JOptionPane.showMessageDialog(this, "SELECCIONA PRIMERO EL TIPO DE AÑO",
                          "MES NO VALIDO", JOptionPane.ERROR_MESSAGE);
              }
              if(Dia<0){
                  JOptionPane.showMessageDialog(this, "SELECCIONA PRIMERO EL TIPO DE AÑO",
                          "DIA NO VÁLIDO", JOptionPane.ERROR_MESSAGE);
              }else{
                  JOptionPane.showMessageDialog(this, "SELECCIONA PRIMERO EL TIPO DE AÑO",
                          "DIA NO VÁLIDO", JOptionPane.ERROR_MESSAGE);
              }
          }
         
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void TxtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAnioActionPerformed

    private void TxtAnioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtAnioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAnioMouseEntered
     
    private void TxtMesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMesKeyPressed
        // TODO add your handling code here:
        
        
        
       
    }//GEN-LAST:event_TxtMesKeyPressed

    private void TxtAnioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAnioKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TxtAnioKeyPressed

 

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
            java.util.logging.Logger.getLogger(Form08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form08().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JComboBox<String> CmbUno;
    private javax.swing.JLabel LblAnio;
    private javax.swing.JLabel LblDescripcion;
    private javax.swing.JLabel LblDia;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblMes;
    private javax.swing.JTextField TxtAnio;
    private javax.swing.JTextField TxtDia;
    private javax.swing.JTextField TxtFechaFinal;
    private javax.swing.JTextField TxtMes;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
