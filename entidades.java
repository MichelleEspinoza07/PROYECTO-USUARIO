package deber;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;

import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Master
 */
public class entidades extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Entidades
     */
    public entidades() {
    	getContentPane().setBackground(new Color(102, 51, 255));
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
        jRegreso_Principal = new javax.swing.JButton();
        jRegreso_Principal.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jRegreso_Principal.setForeground(new Color(0, 255, 102));
        jRegreso_Principal.setBackground(new Color(0, 51, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(102, 51, 255));

        jRegreso_Principal.setText("REGRESAR A PRINCIPAL");
        jRegreso_Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegreso_PrincipalActionPerformed(evt);
            }
        });
        
        JButton btnRegresa = new JButton();
        btnRegresa.setIcon(new ImageIcon("C:\\Users\\Administrator\\Pictures\\chuiiii.png"));
        btnRegresa.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		String es=" chuwi :3 " ;	
				  
        		
        		 JOptionPane.showMessageDialog(null, es, "activando a chuwi", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        btnRegresa.setText("REGRESA");
        btnRegresa.setForeground(new Color(0, 255, 102));
        btnRegresa.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnRegresa.setBackground(new Color(0, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(94)
        			.addComponent(jRegreso_Principal, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(149, Short.MAX_VALUE))
        		.addComponent(btnRegresa, GroupLayout.PREFERRED_SIZE, 632, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(jRegreso_Principal)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(btnRegresa, GroupLayout.PREFERRED_SIZE, 714, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 733, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRegreso_PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegreso_PrincipalActionPerformed
        // TODO add your handling code here:
    	frmusuario p = new frmusuario ();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jRegreso_PrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(entidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entidades().setVisible(true);
            }
        });
    }
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRegreso_Principal;
}
