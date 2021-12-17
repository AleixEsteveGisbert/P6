import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Aleix
 */
public class ProducteInsert extends javax.swing.JFrame {

    /**
     * Creates new form ClientInsert
     */
    Connection con;
    public static Statement stmt = null;
    public static ResultSet rs = null;

    public ProducteInsert(Connection c) {
        con = c;
        initComponents();
        this.setLocationRelativeTo(null);
        getCategoria();
        getProveidor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGoBack = new javax.swing.JButton();
        jTextFieldNom = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDesc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPreu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxProveidor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonGoBack.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonGoBack.setText("⬅");
        jButtonGoBack.setToolTipText("Torna enrere");
        jButtonGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoBackActionPerformed(evt);
            }
        });

        jTextFieldNom.setToolTipText("Nom del projecte");
        jTextFieldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancel.setText("Cancela");
        jButtonCancel.setToolTipText("");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonCreate.setBackground(new java.awt.Color(102, 255, 102));
        jButtonCreate.setText("Crear");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom:");

        jLabel3.setText("Descripció:");

        jTextFieldDesc.setToolTipText("Nom del projecte");
        jTextFieldDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescActionPerformed(evt);
            }
        });

        jLabel4.setText("Preu unitari:");

        jTextFieldPreu.setToolTipText("Nom del projecte");
        jTextFieldPreu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPreuActionPerformed(evt);
            }
        });

        jLabel5.setText("Categoria:");

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Categoria" }));
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });

        jLabel11.setText("Proveidor:");

        jComboBoxProveidor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Proveidor" }));
        jComboBoxProveidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProveidorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonGoBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addComponent(jTextFieldDesc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldPreu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonCancel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonCreate))
                                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11))
                            .addComponent(jComboBoxProveidor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPreu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxProveidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate)
                    .addComponent(jButtonCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoBackActionPerformed
        Productes mainWindow = new Productes(con);   // Create a new MainJFrame window
        mainWindow.setVisible(true);    // Make it visible
        dispose();                      // Hide current window
    }//GEN-LAST:event_jButtonGoBackActionPerformed

    private void jTextFieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        Productes mainWindow = new Productes(con);   // Create a new MainJFrame window
        mainWindow.setVisible(true);    // Make it visible
        dispose();                      // Hide current window
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        try {
            int codi=0, codi2=0;
            String query1 = "SELECT * FROM categoria WHERE nom = '" + jComboBoxCategoria.getSelectedItem() + "'";

                    rs = stmt.executeQuery(query1);
                    
                    while (rs.next()) {
                        codi = rs.getInt("codi");
                    }
                    
            String query2 = "SELECT * FROM proveidor WHERE nom = '" + jComboBoxProveidor.getSelectedItem() + "'";

                    rs = stmt.executeQuery(query2);
                    
                    while (rs.next()) {
                        codi2 = rs.getInt("codi");
                    }
            
            stmt = con.createStatement();
            String query = "INSERT INTO producte (nom_comercial, descripcio, preu_unitari, codi_categoria, codi_proveidor) "
                    + "VALUES ('" + jTextFieldNom.getText() + "', "
                    + "'" + jTextFieldDesc.getText() + "', "
                    + "'" + jTextFieldPreu.getText() + "', "
                    + "'" + codi + "', "
                    + "'" + codi2 + "')";
            //System.out.println(query);
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Producte inserit correctament", "Status", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            Productes mainWindow = new Productes(con);   // Create a new MainJFrame window
        mainWindow.setVisible(true); 
        } catch (Exception e) {
            String txt = "Error al inserir producte: " + e;
            JOptionPane.showMessageDialog(this, txt, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jTextFieldDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescActionPerformed

    private void jTextFieldPreuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPreuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPreuActionPerformed

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jComboBoxProveidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProveidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProveidorActionPerformed
    
    private void getCategoria() {

            try {
                String query = "SELECT * FROM categoria";
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                while (rs.next()) {
                    jComboBoxCategoria.addItem(rs.getString("nom"));
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

            
        }
    }
    
     private void getProveidor() {

            try {
                String query = "SELECT * FROM proveidor";
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                while (rs.next()) {
                    jComboBoxProveidor.addItem(rs.getString("nom"));
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonGoBack;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxProveidor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldDesc;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPreu;
    // End of variables declaration//GEN-END:variables
}