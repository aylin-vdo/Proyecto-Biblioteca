/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IG;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author perla
 */
public class Proveedor extends javax.swing.JPanel {

    /**
     * Creates new form Proveedor
     */
    public Proveedor() {
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

        cmd_entrar1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmd_entrar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lbl_email = new javax.swing.JLabel();
        lbl_tel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_tel = new javax.swing.JTextField();
        txt_name1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_name1 = new javax.swing.JLabel();
        txt_bus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_prove = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        cmd_entrar2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmd_entrar1.setBackground(new java.awt.Color(153, 102, 0));
        cmd_entrar1.setForeground(new java.awt.Color(166, 110, 0));
        cmd_entrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_entrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_entrar1MouseClicked(evt);
            }
        });
        cmd_entrar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("STIXIntegralsUp", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Guardar");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        cmd_entrar1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        add(cmd_entrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 110, 40));

        cmd_entrar.setBackground(new java.awt.Color(153, 102, 0));
        cmd_entrar.setForeground(new java.awt.Color(166, 110, 0));
        cmd_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmd_entrarMousePressed(evt);
            }
        });
        cmd_entrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("STIXIntegralsUp", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modificar");
        cmd_entrar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        add(cmd_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 110, 40));

        txt_email.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_email.setForeground(new java.awt.Color(102, 102, 102));
        txt_email.setText("Ingrese el correo Electronico");
        txt_email.setBorder(null);
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emailFocusLost(evt);
            }
        });
        txt_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_emailMousePressed(evt);
            }
        });
        add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 210, 30));

        jSeparator5.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator5.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 210, 10));

        lbl_email.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_email.setText("Correo Electronico:   ");
        add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        lbl_tel.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_tel.setText("Numero Telefonico:");
        add(lbl_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator3.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 210, 10));

        txt_tel.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_tel.setForeground(new java.awt.Color(102, 102, 102));
        txt_tel.setText("Ingrese el numero telefonico");
        txt_tel.setBorder(null);
        txt_tel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_telFocusLost(evt);
            }
        });
        txt_tel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_telMousePressed(evt);
            }
        });
        txt_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telActionPerformed(evt);
            }
        });
        add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 210, 30));

        txt_name1.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_name1.setForeground(new java.awt.Color(102, 102, 102));
        txt_name1.setText("Ingrese el nombre del proveedor");
        txt_name1.setBorder(null);
        txt_name1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_name1FocusLost(evt);
            }
        });
        txt_name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_name1MousePressed(evt);
            }
        });
        txt_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_name1ActionPerformed(evt);
            }
        });
        add(txt_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 210, 30));

        jSeparator4.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator4.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 70, 10));

        lbl_name1.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_name1.setText("Nombre dl Proveedor: ");
        add(lbl_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txt_bus.setForeground(new java.awt.Color(204, 204, 204));
        txt_bus.setText("Ingrese el id del proveedor si desea modificar o borrar");
        txt_bus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_busFocusLost(evt);
            }
        });
        txt_bus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_busMousePressed(evt);
            }
        });
        txt_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busActionPerformed(evt);
            }
        });
        add(txt_bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 350, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Insertaaa.png"))); // NOI18N
        jLabel3.setToolTipText("Seleccione para llenar los campos");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        lbl_id.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_id.setText("Id:");
        add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        txt_name.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_name.setBorder(null);
        txt_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nameFocusLost(evt);
            }
        });
        txt_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nameMousePressed(evt);
            }
        });
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 60, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/prove22.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 670, 10));

        lbl_prove.setFont(new java.awt.Font("STIXIntegralsUp", 1, 24)); // NOI18N
        lbl_prove.setText("Proveedor");
        add(lbl_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 30));

        jSeparator6.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator6.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 210, 10));

        cmd_entrar2.setBackground(new java.awt.Color(153, 102, 0));
        cmd_entrar2.setForeground(new java.awt.Color(166, 110, 0));
        cmd_entrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_entrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_entrar2MouseClicked(evt);
            }
        });
        cmd_entrar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("STIXIntegralsUp", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eliminar");
        cmd_entrar2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        add(cmd_entrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 110, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
        if(txt_email.getText().equals("")){
            txt_email.setText("Ingrese el correo Electronico");
            txt_email.setForeground(Color.GRAY);}
    }//GEN-LAST:event_txt_emailFocusLost

    private void txt_emailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_emailMousePressed
        if(txt_email.getText().equals("Ingrese el correo Electronico")){
            txt_email.setText("");
            txt_email.setForeground(Color.black);}
    }//GEN-LAST:event_txt_emailMousePressed

    private void txt_telFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_telFocusLost
        if(txt_tel.getText().equals("")){
            txt_tel.setText("Ingrese el numero telefonico");
            txt_tel.setForeground(Color.GRAY);}
    }//GEN-LAST:event_txt_telFocusLost

    private void txt_telMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_telMousePressed
        if(txt_tel.getText().equals("Ingrese el numero telefonico")){
            txt_tel.setText("");
            txt_tel.setForeground(Color.black);}
    }//GEN-LAST:event_txt_telMousePressed

    private void txt_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telActionPerformed

    private void txt_name1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_name1FocusLost
        if(txt_name1.getText().equals("")){
            txt_name1.setText("Ingrese el nombre del proveedor");
            txt_name1.setForeground(Color.GRAY);}
    }//GEN-LAST:event_txt_name1FocusLost

    private void txt_name1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_name1MousePressed
        if(txt_name1.getText().equals("Ingrese el nombre del proveedor")){
            txt_name1.setText("");
            txt_name1.setForeground(Color.black);}
    }//GEN-LAST:event_txt_name1MousePressed

    private void txt_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_name1ActionPerformed

    private void txt_busFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_busFocusLost
        if(txt_bus.getText().equals("")){
            txt_bus.setText("Ingrese el id del proveedor si desea modificar o borrar");
            txt_bus.setForeground(Color.GRAY);}
    }//GEN-LAST:event_txt_busFocusLost

    private void txt_busMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_busMousePressed
        if(txt_bus.getText().equals("Ingrese el id del proveedor si desea modificar o borrar")){
            txt_bus.setText("");
            txt_bus.setForeground(Color.black);}
    }//GEN-LAST:event_txt_busMousePressed

    private void txt_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busActionPerformed

    private void txt_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nameFocusLost

    }//GEN-LAST:event_txt_nameFocusLost

    private void txt_nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMousePressed

    }//GEN-LAST:event_txt_nameMousePressed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void cmd_entrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_entrar1MouseClicked
      int id = Integer.parseInt(txt_name.getText());
        String nombre = txt_name1.getText();
        String tel = txt_tel.getText();
        String email = txt_email.getText();
        int cantidad_actual = 0;
        try{
                Statement sql = ConnectionSQL.getConnectionSQL().createStatement();
                String insertarsql = "INSERT INTO Proveedores(IDProveedor,Nombre,Email,NumTel)VALUES("+id+",'"+nombre+"','"+email+"','"+tel+"')";
                sql.executeQuery(insertarsql);
                }catch(SQLException | NumberFormatException e){
                    System.out.println(e.toString());
            }
    }//GEN-LAST:event_cmd_entrar1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    int buscar = Integer.parseInt(txt_bus.getText());
    try{
        Statement sql = ConnectionSQL.getConnectionSQL().createStatement();
        String buscarsql = "SELECT * FROM dbo.Proveedores WHERE IDProveedor='"+buscar+"'";
        ResultSet rs = sql.executeQuery(buscarsql);
        rs.next();
            txt_name.setText(rs.getString("IDProveedor"));
            txt_name1.setText(rs.getString("Nombre"));
            txt_email.setText(rs.getString("Email"));
            txt_tel.setText(rs.getString("NumTel"));
    }catch(SQLException e){
        System.out.println(e.toString());
    } 
    }//GEN-LAST:event_jLabel3MouseClicked

    private void cmd_entrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_entrarMousePressed
    int id = Integer.parseInt(txt_bus.getText());
        String nombre = txt_name1.getText();
        String tel = txt_tel.getText();
        String email = txt_email.getText();

        try{
        Statement sql = ConnectionSQL.getConnectionSQL().createStatement();
        String insertarsql = "UPDATE Proveedores SET IDProveedor = "+id+", Nombre = '"+nombre+"', NumTel = '"+tel+"', Email = '"+email+"' WHERE IDProveedor = '"+id+"';";
        sql.executeQuery(insertarsql);
        }catch(SQLException | NumberFormatException e){
        System.out.println(e.toString());}
        JOptionPane.showMessageDialog(null,"Modificado");
    }//GEN-LAST:event_cmd_entrarMousePressed

    private void cmd_entrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_entrar2MouseClicked
    int id = Integer.parseInt(txt_bus.getText());
    try{
        Statement sql = ConnectionSQL.getConnectionSQL().createStatement();
        String buscarsql = "DELETE FROM Proveedores WHERE IDProveedor='"+id+"'";
        ResultSet rs = sql.executeQuery(buscarsql);
    }catch(SQLException e){
        System.out.println(e.toString());
    }
    JOptionPane.showMessageDialog(null,"Eliminado");
    }//GEN-LAST:event_cmd_entrar2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cmd_entrar;
    private javax.swing.JPanel cmd_entrar1;
    private javax.swing.JPanel cmd_entrar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_prove;
    private javax.swing.JLabel lbl_tel;
    private javax.swing.JTextField txt_bus;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_name1;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
