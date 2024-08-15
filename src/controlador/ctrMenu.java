package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Menu;
import vista.frmMenu;

public class ctrMenu implements MouseListener, KeyListener{

    //1- Mandar a llamar a las otras dos capas (modelo, vista)
    private Menu ModeloMenu;
    private frmMenu vistaMenu;
    
    //2- Crear el constructor de la clase
    public ctrMenu(Menu ModeloQuePido, frmMenu vistaQuePido){
        this.ModeloMenu = ModeloQuePido;
        this.vistaMenu = vistaQuePido;
        
        //Siempre poner todos los botones que vamos a ocupar
        vistaQuePido.btnGuardar.addMouseListener(this);
        vistaQuePido.jtbMenu.addMouseListener(this);
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        //getSource es evento
        if(e.getSource() == vistaMenu.btnGuardar){
        
            ModeloMenu.setNombre(vistaMenu.txtNombre.getText());
            ModeloMenu.setPrecio(Double.parseDouble(vistaMenu.txtPrecio.getText()));
            ModeloMenu.setIngredientes(vistaMenu.txtIngredientes.getText());
            
            ModeloMenu.Guardar();
            
            ModeloMenu.Mostrar(vistaMenu.jtbMenu);
    }
        
        if(e.getSource() == vistaMenu.jtbMenu)
        {
            ModeloMenu.Eliminar(vistaMenu.jtbMenu);
            ModeloMenu.Mostrar(vistaMenu.jtbMenu);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    
    
}
