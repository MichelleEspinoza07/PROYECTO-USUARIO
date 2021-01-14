package deber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.Toolkit;

/**
 *
 * @author gohea
 */
public class frmusuario extends javax.swing.JFrame {

    private static Scanner sc;
    private static int intentos;
    private static String user, password;
    
  
    
    
    /**
     * Creates new form frmusuario
     * @param dimension 
     */
    public frmusuario( ) {
    	
    	
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Downloads\\pp.jpg"));
        initComponents();
        setLocationRelativeTo (null);
        rootPane.setDefaultButton(btningresar);
        
        
        
    }

    
	

	public static void setIntentos(int intentos) {
        frmusuario.intentos = intentos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbluusuario = new javax.swing.JLabel();
        lblpwd = new javax.swing.JLabel();
        txtusuaio = new javax.swing.JTextField();
        txtclave = new javax.swing.JPasswordField();
        btncancelar = new javax.swing.JButton();
        btncancelar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		
        	}
        });
        btncancelar.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\salir.png"));
        btningresar = new javax.swing.JButton();
        btningresar.setIcon(new ImageIcon("C:\\Users\\Administrator\\Pictures\\ingresar.png"));
        lblimg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbluusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbluusuario.setText("Usuario");
        lbluusuario.setToolTipText("");

        lblpwd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpwd.setText("Clave:");
        lblpwd.setToolTipText("");

        txtusuaio.setToolTipText("Ingrese su nombre de usuario");
        txtusuaio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuaioActionPerformed(evt);
            }
        });

        txtclave.setToolTipText("Ingrese su contrasena");
        txtclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclaveActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.setToolTipText("Cerrar aplicaci");

        btningresar.setText("Ingresar");
        btningresar.setToolTipText("Iniciar Sesion");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        lblimg1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Pictures\\avatar.png")); // NOI18N
        lblimg1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(126)
        							.addComponent(lbluusuario))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(28)
        							.addComponent(lblimg1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        							.addGap(44)
        							.addComponent(lblpwd)))
        					.addGap(62)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtclave, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtusuaio, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        					.addGap(74)
        					.addComponent(btncancelar, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(btningresar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(30)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbluusuario)
        				.addComponent(txtusuaio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(12)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblpwd)
        						.addComponent(lblimg1)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(35)
        					.addComponent(txtclave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGap(46)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btncancelar)
        				.addComponent(btningresar, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(413, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txtclaveActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        FileReader fr=null;
        try {
            int nLineas=0;
            int i=0;
            String [] usuarios = null;  //Arreglo de tipo string 
            String linea;
            sc = new Scanner (new File("C:\\Users\\Administrator\\Documents\\deber\\usuarios.txt"));
            File f = new File("C:/Users/Administrator/Documents/deber/usuarios.txt");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                while ((linea=br.readLine())!=null){
                    nLineas++;
                }} catch (IOException ex) {
                Logger.getLogger(frmusuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            usuarios=new String [nLineas]; // el tamano del arreglo
            
            while (sc.hasNextLine()){
                 usuarios[i++] = sc.nextLine();
            }
            intentos++;
            user = txtusuaio.getText();
            password= txtclave.getText();
          
            
            seguridad s = new seguridad();
            s.validarUsuario(usuarios, user, password, intentos);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmusuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(frmusuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (intentos==0)this.dispose(); // se descargue de memoria
        
        
        
        
    }                                           

    private void txtusuaioActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

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
            java.util.logging.Logger.getLogger(frmusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        	
            public void run() {
            	
            	
           
       
                new frmusuario().setVisible(true);
          
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btningresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimg1;
    private javax.swing.JLabel lblpwd;
    private javax.swing.JLabel lbluusuario;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JTextField txtusuaio;
    // End of variables declaration                   

  //  void setIntentos(int intentos) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}