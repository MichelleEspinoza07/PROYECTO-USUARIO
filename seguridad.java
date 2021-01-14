package deber;
import javax.swing.JOptionPane;
public class seguridad {
	frmusuario login = new frmusuario();
	String res;
	
	public void validarUsuario(String[] usuarios, String user, String password,
			int intentos) {
		boolean encontrado =false;
		
		
		for (int i=0 ;i<usuarios.length; i++){
			if ((usuarios[i].equalsIgnoreCase(user)&&usuarios[i+1].equals(password))){
				
				res="hola"  + user;	
				  
		encontrado= true;

		 JOptionPane.showMessageDialog(null, res, "Inicio de Sesión", JOptionPane.INFORMATION_MESSAGE);
        intentos=0;
   
        login.setIntentos(intentos);
        new entidades().setVisible(true);
       
     
			  
        break;
      }
	 }
          
   //fin del for
      
if (encontrado == false){
          
          res = "clave y/o usuario erroneos van" + intentos + "intentos fallidos";
           JOptionPane.showMessageDialog(null, res, "Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
                                
                  
      }
      if (intentos > 2 ){
          JOptionPane.showMessageDialog(null, "3 intentos erroneos, se bloquea", "Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
          System.exit(0);
      
      }
}
  
}