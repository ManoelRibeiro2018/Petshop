/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.ClienteForms;
import Context.ClienteDado;
import Models.Cliente;
import Validations.ClienteNegocio;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
  import java.util.ArrayList;
  import javax.swing.JOptionPane;
  import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jadil
 */
public class FormAlterarCliente extends javax.swing.JFrame {

    /**
     * Creates new form FormAlterarCliente
     */
    public FormAlterarCliente() {
        initComponents();
        jTextFieldCODIGO.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCLIENTE = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TxtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtTelefone = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter celular= new javax.swing.text.MaskFormatter("(##)#####-####");
            TxtTelefone = new javax.swing.JFormattedTextField(celular);
        }
        catch(Exception e){

        }
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextFieldDATA = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jTextFieldCODIGO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonALTERAR = new javax.swing.JButton();
        jButtonLISTAR = new javax.swing.JButton();
        jButtonEXCLUIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCLIENTE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOME", "TELEFONE", "E-MAIL", "NASCIMENTO", "CPF"
            }
        ));
        jTableCLIENTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCLIENTEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCLIENTE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Editar Dados Do Cliente.");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("E-mail:");

        try {
            TxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("Celular:");

        jLabel3.setText("Data de nascimento");

        jLabel7.setText("Nome:");

        jLabel8.setText("CPF");

        try {
            jFormattedTextFieldDATA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("CODIGO:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldDATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonALTERAR.setText("ALTERAR");
        jButtonALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonALTERARActionPerformed(evt);
            }
        });

        jButtonLISTAR.setText("LISTAR");
        jButtonLISTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLISTARActionPerformed(evt);
            }
        });

        jButtonEXCLUIR.setText("EXCLUIR");
        jButtonEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEXCLUIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonALTERAR)
                .addGap(45, 45, 45)
                .addComponent(jButtonLISTAR)
                .addGap(38, 38, 38)
                .addComponent(jButtonEXCLUIR)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEXCLUIR)
                    .addComponent(jButtonLISTAR)
                    .addComponent(jButtonALTERAR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 240, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLISTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLISTARActionPerformed
        // TODO add your handling code here:
        try {
            Cliente filtro = new Cliente();
           
            
            ClienteDado dados = new ClienteDado();
            ArrayList<Cliente> lista = dados.listar(filtro);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"CODIGO","NOME","TELEFONE","E-MAIL","NASCIMENTO", "CPF"});
            for (Cliente cliente : lista) {
                modelo.addRow(new Object[]{cliente.getID(),cliente.getNome(), cliente.getTelefone(),cliente.getEmail(),cliente.getDataDeNascimento(), cliente.getCpf()});
            }
            jTableCLIENTE.setModel(modelo);
            //JOptionPane.showMessageDialog(this, "Aluno cadastrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonLISTARActionPerformed

    private void jButtonALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonALTERARActionPerformed
        // TODO add your handling code here:
        
         try {
            Cliente c = new Cliente();
          //trantamento do campo data
            String dataString = jFormattedTextFieldDATA.getText();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data = new java.sql.Date(fmt.parse(dataString).getTime());
            
            if (jTextFieldCODIGO.getText().matches("[0-9]+") == false) {
                JOptionPane.showMessageDialog(this, "Informe apenas n??meros para o codigo");
                return;
            }
            
            c.setID(Integer.parseInt(jTextFieldCODIGO.getText()));
            c.setNome(TxtNome.getText());
            c.setTelefone(TxtTelefone.getText());
            c.setCpf(jFormattedTextFieldCPF.getText());
            c.setEmail(TxtEmail.getText());
            c.setDataDeNascimento(data);      

           
            ClienteNegocio negocio = new ClienteNegocio();
            negocio.atualizarCliente(c);
            JOptionPane.showMessageDialog(this, "Cliente alterado");
            
            jTextFieldCODIGO.setText("");
            TxtNome.setText("");
            TxtTelefone.setText("");
            TxtEmail.setText("");
            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldDATA.setText("");
            
            
                    
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonALTERARActionPerformed

    private void jButtonEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEXCLUIRActionPerformed
        // TODO add your handling code here:
        
         try {
            Cliente c = new Cliente();
       
            if (jTextFieldCODIGO.getText().matches("[0-9]+") == false) {
                JOptionPane.showMessageDialog(this, "Informe apenas n??meros para o codigo");
                return;
            }
            c.setID(Integer.parseInt(jTextFieldCODIGO.getText()));        
            
          
            ClienteNegocio negocio = new ClienteNegocio();
            negocio.removerCliente(c);
            JOptionPane.showMessageDialog(this, "Cardapio excluido");
            
            jTextFieldCODIGO.setText("");
             TxtNome.setText("");
            TxtTelefone.setText("");
            TxtEmail.setText("");
            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldDATA.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonEXCLUIRActionPerformed

    private void jTableCLIENTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCLIENTEMouseClicked
        // TODO add your handling code here:
        
        int linha = jTableCLIENTE.getSelectedRow();
        jTextFieldCODIGO.setText(jTableCLIENTE.getValueAt(linha, 0).toString());
        TxtNome.setText(jTableCLIENTE.getValueAt(linha, 1).toString());
        TxtTelefone.setText(jTableCLIENTE.getValueAt(linha, 2).toString());
        TxtEmail.setText(jTableCLIENTE.getValueAt(linha, 3).toString());
        jFormattedTextFieldDATA.setText(jTableCLIENTE.getValueAt(linha, 4).toString());
        jFormattedTextFieldCPF.setText(jTableCLIENTE.getValueAt(linha, 5).toString());
        
    }//GEN-LAST:event_jTableCLIENTEMouseClicked

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
            java.util.logging.Logger.getLogger(FormAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAlterarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JFormattedTextField TxtTelefone;
    private javax.swing.JButton jButtonALTERAR;
    private javax.swing.JButton jButtonEXCLUIR;
    private javax.swing.JButton jButtonLISTAR;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDATA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCLIENTE;
    private javax.swing.JTextField jTextFieldCODIGO;
    // End of variables declaration//GEN-END:variables
}
