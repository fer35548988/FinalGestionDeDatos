
package vista;

import controlador.Controlador_Cargo;
import controlador.Controlador_Categoria;
import controlador.Controlador_Cliente;
import controlador.Controlador_Concepto;
import controlador.Controlador_Empleado;
import controlador.Controlador_Producto;
import controlador.Controlador_Proveedor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Usuario;
import org.jdesktop.swingx.JXLabel;
import org.jdesktop.swingx.JXTaskPane;

/**
 *
 * @author Fernando
 */
public class Principal extends javax.swing.JFrame {

    private Empleado empleado;
    private Usuario usuario;
    //SOLO SE DECLARA LOS LABELS DEL MENU GESTION DEBIDO A QUE LOS DEBO OCULTAR A ALGUNOS DEPENDIENDO DEL TIPO DE USUARIO
    private JXLabel labelEmpleado;
    private JXLabel labelCliente;
    private JXLabel labelProveedor ;
    private JXLabel labelFamilia ;
    private JXLabel labelProducto;
    private JXLabel labelCategoria;
    private JXLabel labelCargo;
    private JXLabel labelConceptos;
    private JXLabel labelListarVentas;
    private JXLabel labelListarVentasxEmpleado;
    
    
    public Principal() {
        initComponents();
        Menu_Gestion.setTitle("Gestiones");
        Menu_Venta.setTitle("Ventas");
        Menu_Compra.setTitle("Compras");
        Menu_Reporte.setTitle("Reportes");
        Menu_LiquidacionSueldo.setTitle("Liquidaciones de Sueldos");
        Menu_Sistema.setTitle("Sistema");
        empleado = new Empleado();
        usuario = new Usuario();
        Minimizar();
        MenuGestiones();
        MenuVentas();
        MenuCompras();
        MenuSistema();
        MenuReportes();
        MenuLiquidacionSueldo();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    public final void Minimizar(){
        Menu_Gestion.setCollapsed(true);
        Menu_Compra.setCollapsed(true);
        Menu_Venta.setCollapsed(true);
        Menu_LiquidacionSueldo.setCollapsed(true);
        Menu_Reporte.setCollapsed(true);
        Menu_Sistema.setCollapsed(true);
    }
    
    public final void MenuGestiones(){
        Icon Icono = new ImageIcon(ClassLoader.getSystemResource("imagenes/Menu_Gestion.png"));
        Menu_Gestion.setIcon(Icono);
        
        Icon IconoEmpleado = new ImageIcon(ClassLoader.getSystemResource("imagenes/Empleado.png"));
        Icon IconoCliente = new ImageIcon(ClassLoader.getSystemResource("imagenes/Cliente.png"));
        Icon IconoProveedor = new ImageIcon(ClassLoader.getSystemResource("imagenes/Proveedores.png"));
        Icon IconoFamilia = new ImageIcon(ClassLoader.getSystemResource("imagenes/Familia.png"));
        Icon IconoProducto = new ImageIcon(ClassLoader.getSystemResource("imagenes/Producto.png"));
        Icon IconoCategoria = new ImageIcon(ClassLoader.getSystemResource("imagenes/Categorias.png"));
        Icon IconoCargo = new ImageIcon(ClassLoader.getSystemResource("imagenes/Cargos.png"));
        Icon IconoConceptos = new ImageIcon(ClassLoader.getSystemResource("imagenes/Conceptos.png"));
        
        labelEmpleado = new JXLabel("Gestión de Empleados", IconoEmpleado, JXLabel.LEFT);
        labelCliente = new JXLabel("Gestión de Clientes", IconoCliente, JXLabel.LEFT);
        labelProveedor = new JXLabel("Gestión de Proveedores", IconoProveedor, JXLabel.LEFT);
        labelFamilia = new JXLabel("Gestión de Grupo Familiar", IconoFamilia, JXLabel.LEFT);
        labelProducto = new JXLabel("Gestión de Productos", IconoProducto, JXLabel.LEFT);
        labelCategoria = new JXLabel("Gestión de Categorías", IconoCategoria, JXLabel.LEFT);
        labelCargo = new JXLabel("Gestión de Cargos", IconoCargo, JXLabel.LEFT);
        labelConceptos = new JXLabel("Gestión de Conceptos", IconoConceptos, JXLabel.LEFT);
        
        labelEmpleado.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz GestionEmpleado");
                try {
                    GestionEmpleado vista = new GestionEmpleado(null, true);
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }    
            }
        });
        
        labelCliente.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz GestionCliente");
                try {
                    GestionCliente vista = new GestionCliente(null, true);
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }    
            }
        });
    
        labelFamilia.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz GestionFamilia");
                try {
                    GestionFamilia vista = new GestionFamilia(null, true);
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }    
            }
        });
        
        labelProducto.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz GestionProducto");
                try {
                    GestionProducto vista = new GestionProducto(null, true);
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }    
            }
        });
        
        labelCategoria.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz GestionCategorias");
                try {
                    GestionCategoria vista = new GestionCategoria(null, true);
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }    
            }
        });
        
        labelCargo.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz GestionCargo");
                try {
                    GestionCargo vista = new GestionCargo(null, true);
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }    
            }
        });
        
        labelProveedor.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz GestionProveedor");
                try {
                    GestionProveedor vista = new GestionProveedor(null, true);
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }    
            }
        });
        
        labelConceptos.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz GestionConcepto");
                try {
                    GestionConcepto vista = new GestionConcepto(null, true);
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }    
            }
        });
        
        eventosMouse(labelEmpleado);
        eventosMouse(labelCliente);
        eventosMouse(labelProveedor);
        eventosMouse(labelFamilia);
        eventosMouse(labelProducto);
        eventosMouse(labelCategoria);
        eventosMouse(labelCargo);
        eventosMouse(labelConceptos);
        Menu_Gestion.add(labelCargo);
        Menu_Gestion.add(labelCategoria);
        Menu_Gestion.add(labelCliente);
        Menu_Gestion.add(labelConceptos);
        Menu_Gestion.add(labelEmpleado);
        Menu_Gestion.add(labelFamilia);
        Menu_Gestion.add(labelProducto);
        Menu_Gestion.add(labelProveedor);

    }
    
    public final void MenuVentas(){
        Icon Icono = new ImageIcon(ClassLoader.getSystemResource("imagenes/Menu_Venta.png"));
        Menu_Venta.setIcon(Icono);
        
        Icon IconoNuevaVenta = new ImageIcon(ClassLoader.getSystemResource("imagenes/NuevaVenta.png"));
        Icon IconoListarVenta = new ImageIcon(ClassLoader.getSystemResource("imagenes/ListarVenta.png"));
        Icon IconoListarVentaxEmpleado = new ImageIcon(ClassLoader.getSystemResource("imagenes/ListarVentaEmpleado.png"));
        
        final JXLabel labelNuevaVenta = new JXLabel("Punto de Venta", IconoNuevaVenta, JXLabel.LEFT);
        labelListarVentas = new JXLabel("Listar Ventas", IconoListarVenta, JXLabel.LEFT);
        labelListarVentasxEmpleado = new JXLabel("Listar Ventas por Empleado", IconoListarVentaxEmpleado, JXLabel.LEFT);
        
        labelNuevaVenta.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz NUEVA VENTA");
                //En el Controlador_Usuario cuando se loguea ya le setea los valores al objeto empleado
                NuevaVenta vista = new NuevaVenta(null, true, empleado);
                vista.setVisible(true);    
            }
        });
        
        labelListarVentas.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    System.out.println("Creando Interfaz LISTAR VENTA");
                    //En el Controlador_Usuario cuando se loguea ya le setea los valores al objeto empleado
                    ListarVenta vista = new ListarVenta(null, false);    
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        labelListarVentasxEmpleado.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    System.out.println("Creando Interfaz LISTAR VENTA POR EMPLEADO");
                    //En el Controlador_Usuario cuando se loguea ya le setea los valores al objeto empleado
                    ListarVentaEmpleado vista = new ListarVentaEmpleado(null, true);    
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        eventosMouse(labelNuevaVenta);
        eventosMouse(labelListarVentas);
        eventosMouse(labelListarVentasxEmpleado);
        Menu_Venta.add(labelNuevaVenta);
        Menu_Venta.add(labelListarVentas);
        Menu_Venta.add(labelListarVentasxEmpleado);
    }
    
    public final void MenuCompras(){
        
        Icon Icono = new ImageIcon(ClassLoader.getSystemResource("imagenes/Menu_Compra.png"));
        Menu_Compra.setIcon(Icono);
    
        Icon IconoNuevaCompra = new ImageIcon(ClassLoader.getSystemResource("imagenes/NuevaCompra.png"));
        Icon IconoListarCompra = new ImageIcon(ClassLoader.getSystemResource("imagenes/ListarCompra.png"));
        Icon IconoListarCompraXempleado = new ImageIcon(ClassLoader.getSystemResource("imagenes/ListarCompraEmpleado.png"));

        
        final JXLabel labelNuevaCompra = new JXLabel("Punto de Compra", IconoNuevaCompra, JXLabel.LEFT);
        final JXLabel labelListarCompras = new JXLabel("Listar Compras", IconoListarCompra, JXLabel.LEFT);
        final JXLabel labelListarComprasXempleado = new JXLabel("Listar Compras por Empleado", IconoListarCompraXempleado, JXLabel.LEFT);
        
        labelNuevaCompra.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz NUEVA COMPRA");
                //En el Controlador_Usuario cuando se loguea ya le setea los valores al objeto empleado
                NuevaCompra vista = new NuevaCompra(null, true, empleado);
                vista.setVisible(true);
            }
        });
        
        labelListarCompras.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    System.out.println("Creando Interfaz LISTAR COMPRA");
                    //En el Controlador_Usuario cuando se loguea ya le setea los valores al objeto empleado
                    ListarCompra vista = new ListarCompra(null, false);
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        labelListarComprasXempleado.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    System.out.println("Creando Interfaz LISTAR COMPRA POR EMPLEADO");
                    //En el Controlador_Usuario cuando se loguea ya le setea los valores al objeto empleado
                    ListarCompraEmpleado vista = new ListarCompraEmpleado(null, true);
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        eventosMouse(labelNuevaCompra);
        eventosMouse(labelListarCompras);
        eventosMouse(labelListarComprasXempleado);
        Menu_Compra.add(labelNuevaCompra);
        Menu_Compra.add(labelListarCompras);
        Menu_Compra.add(labelListarComprasXempleado);
    }
    
    public final void MenuReportes(){
        Icon Icono = new ImageIcon(ClassLoader.getSystemResource("imagenes/Menu_Reporte.png"));
        Menu_Reporte.setIcon(Icono);
        
        Icon IconoPdf = new ImageIcon(ClassLoader.getSystemResource("imagenes/PDF.png"));
        
        final JXLabel labelCargo = new JXLabel("Reporte de Cargos", IconoPdf, JXLabel.LEFT);
        final JXLabel labelCategoria = new JXLabel("Reporte de Categorías", IconoPdf, JXLabel.LEFT);
        final JXLabel labelCliente = new JXLabel("Reporte de Clientes", IconoPdf, JXLabel.LEFT);
        final JXLabel labelConcepto = new JXLabel("Reporte de Conceptos", IconoPdf, JXLabel.LEFT);
        final JXLabel labelEmpleado = new JXLabel("Reporte de Empleados", IconoPdf, JXLabel.LEFT);
        final JXLabel labelProducto = new JXLabel("Reporte de Productos", IconoPdf, JXLabel.LEFT);
        final JXLabel labelProveedores = new JXLabel("Reporte de Proveedores", IconoPdf, JXLabel.LEFT);
    
        labelCargo.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    System.out.println("Creando Reporte");
                    Controlador_Cargo.imprimirCargos(null);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        labelCategoria.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    System.out.println("Creando Reporte");
                    Controlador_Categoria.imprimirCategorias(null);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        labelCliente.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    System.out.println("Creando Reporte");
                    Controlador_Cliente.imprimirClientes(null);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        labelConcepto.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    System.out.println("Creando Reporte");
                    Controlador_Concepto.imprimirConceptos(null);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        labelEmpleado.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    System.out.println("Creando Reporte");
                    Controlador_Empleado.imprimirEmpleados(null);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        labelProducto.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    System.out.println("Creando Reporte");
                    Controlador_Producto.imprimirProductos(null);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        labelProveedores.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    System.out.println("Creando Reporte");
                    Controlador_Proveedor.imprimirProveedores(null);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        eventosMouse(labelCargo);
        eventosMouse(labelCategoria);
        eventosMouse(labelCliente);
        eventosMouse(labelConcepto);
        eventosMouse(labelEmpleado);
        eventosMouse(labelProducto);
        eventosMouse(labelProveedores);
        Menu_Reporte.add(labelCargo);
        Menu_Reporte.add(labelCategoria);
        Menu_Reporte.add(labelCliente);
        Menu_Reporte.add(labelConcepto);
        Menu_Reporte.add(labelEmpleado);
        Menu_Reporte.add(labelProducto);
        Menu_Reporte.add(labelProveedores);
    }
    
    public final void MenuLiquidacionSueldo(){
        Icon Icono = new ImageIcon(ClassLoader.getSystemResource("imagenes/Menu_Liquidacion.png"));
        Menu_LiquidacionSueldo.setIcon(Icono);
        
        Icon IconoLiquidacion = new ImageIcon(ClassLoader.getSystemResource("imagenes/LiquidacionEmpleado.png"));
        Icon IconoLiquidacionTodos = new ImageIcon(ClassLoader.getSystemResource("imagenes/LiquidacionTodos.png"));
        Icon IconoListarLiquidacionXempleado = new ImageIcon(ClassLoader.getSystemResource("imagenes/ListarLiquidacion.png"));
        
        final JXLabel labelLiquidacion = new JXLabel("Liquidación por Empleado", IconoLiquidacion, JXLabel.LEFT);
        final JXLabel labelLiquidacionTodos = new JXLabel("Liquidación a Todos", IconoLiquidacionTodos, JXLabel.LEFT);
        final JXLabel labelListarLiquidacionXempleado = new JXLabel("Listar Liquidaciones", IconoListarLiquidacionXempleado, JXLabel.LEFT);
     
        labelLiquidacion.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz NUEVA LIQUIDACION");
                //En el Controlador_Usuario cuando se loguea ya le setea los valores al objeto empleado
                LiquidacionEmpleado vista = new LiquidacionEmpleado(null, true);
                vista.setVisible(true);
            }
        });
        
        labelLiquidacionTodos.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz LIQUIDACION TODOS");
                //En el Controlador_Usuario cuando se loguea ya le setea los valores al objeto empleado
                LiquidacionTodos vista = new LiquidacionTodos(null, true);
                vista.setVisible(true);
            }
        });
        
        labelListarLiquidacionXempleado.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    System.out.println("Creando Interfaz LISTAR LIQUIDACIONES");
                    //En el Controlador_Usuario cuando se loguea ya le setea los valores al objeto empleado
                    ListarLiquidaciones vista = new ListarLiquidaciones(null, false);
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        eventosMouse(labelLiquidacion);
        eventosMouse(labelLiquidacionTodos);
        eventosMouse(labelListarLiquidacionXempleado);
        Menu_LiquidacionSueldo.add(labelLiquidacion);
        Menu_LiquidacionSueldo.add(labelLiquidacionTodos);
        Menu_LiquidacionSueldo.add(labelListarLiquidacionXempleado);
        
        
    }
    
    
    public final void MenuSistema(){
        Icon Icono = new ImageIcon(ClassLoader.getSystemResource("imagenes/Menu_Sistema.png"));
        Menu_Sistema.setIcon(Icono);
        
        Icon IconoClave = new ImageIcon(ClassLoader.getSystemResource("imagenes/Clave.png"));
        Icon IconoSalir = new ImageIcon(ClassLoader.getSystemResource("imagenes/Salir.png"));
        Icon IconoAcercaDe = new ImageIcon(ClassLoader.getSystemResource("imagenes/AcercaDe.png"));
        
        final JXLabel labelClave = new JXLabel("Cambiar Contraseña", IconoClave, JXLabel.LEFT);
        final JXLabel labelSalir = new JXLabel("Salir", IconoSalir, JXLabel.LEFT);
        final JXLabel labelAcercaDe = new JXLabel("Acerca De", IconoAcercaDe, JXLabel.LEFT);
        
        labelSalir.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "Nos Vemos " + label_Empleado.getText(), "Mensaje de Información", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                System.out.println("Creando Interfaz LOGIN");
                Login vista = new Login(null, true);
                vista.setVisible(true);    
            }
        });
        
        labelClave.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz CAMBIAR CONTRASEÑA");
                CambiarContraseña vista = new CambiarContraseña(null, true);
                System.out.println("PRINCIPAL DICE : USUARIO-> " + usuario.getIdUsuario() + " CONTRASEÑA-> " + usuario.getClave() );
                vista.getUsuario().setIdUsuario(usuario.getIdUsuario());
                vista.getUsuario().setClave(usuario.getClave());
                vista.setVisible(true);
                
            }
        });
        
        labelAcercaDe.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Creando Interfaz ACERCA DE");
                AcercaDe vista = new AcercaDe(null, true);
                vista.setVisible(true);
                
            }
        });
        
        
        eventosMouse(labelClave);
        eventosMouse(labelSalir);
        eventosMouse(labelAcercaDe);
        Menu_Sistema.add(labelClave);
        Menu_Sistema.add(labelAcercaDe);
        Menu_Sistema.add(labelSalir);
        
    }
    
    public void eventosMouse(final JXLabel label){
        
        label.addMouseListener(new MouseAdapter() { 
            @Override
            public void mouseEntered(MouseEvent e){
                Font font = new Font("Tahoma", Font.BOLD, 13);
                label.setFont(font);
            }   
        });
        
        label.addMouseListener(new MouseAdapter() { 
            @Override
            public void mouseExited(MouseEvent e){
                Font font = new Font("Tahoma", Font.PLAIN, 13);
                label.setFont(font);
            }   
        });
        
    }

    public JXTaskPane getMenu_Compra() {
        return Menu_Compra;
    }

    public void setMenu_Compra(JXTaskPane Menu_Compra) {
        this.Menu_Compra = Menu_Compra;
    }

    public JXTaskPane getMenu_Gestion() {
        return Menu_Gestion;
    }

    public void setMenu_Gestion(JXTaskPane Menu_Gestion) {
        this.Menu_Gestion = Menu_Gestion;
    }

    public JXTaskPane getMenu_LiquidacionSueldo() {
        return Menu_LiquidacionSueldo;
    }

    public void setMenu_LiquidacionSueldo(JXTaskPane Menu_LiquidacionSueldo) {
        this.Menu_LiquidacionSueldo = Menu_LiquidacionSueldo;
    }

    public JXTaskPane getMenu_Reporte() {
        return Menu_Reporte;
    }

    public void setMenu_Reporte(JXTaskPane Menu_Reporte) {
        this.Menu_Reporte = Menu_Reporte;
    }

    public JXTaskPane getMenu_Sistema() {
        return Menu_Sistema;
    }

    public void setMenu_Sistema(JXTaskPane Menu_Sistema) {
        this.Menu_Sistema = Menu_Sistema;
    }

    public JXTaskPane getMenu_Venta() {
        return Menu_Venta;
    }

    public void setMenu_Venta(JXTaskPane Menu_Venta) {
        this.Menu_Venta = Menu_Venta;
    }

    public JLabel getLabel_Empleado() {
        return label_Empleado;
    }

    public void setLabel_Empleado(JLabel label_Empleado) {
        this.label_Empleado = label_Empleado;
    }

    public JXLabel getLabelEmpleado() {
        return labelEmpleado;
    }

    public void setLabelEmpleado(JXLabel labelEmpleado) {
        this.labelEmpleado = labelEmpleado;
    }

    public JXLabel getLabelCliente() {
        return labelCliente;
    }

    public void setLabelCliente(JXLabel labelCliente) {
        this.labelCliente = labelCliente;
    }

    public JXLabel getLabelProveedor() {
        return labelProveedor;
    }

    public void setLabelProveedor(JXLabel labelProveedor) {
        this.labelProveedor = labelProveedor;
    }

    public JXLabel getLabelFamilia() {
        return labelFamilia;
    }

    public void setLabelFamilia(JXLabel labelFamilia) {
        this.labelFamilia = labelFamilia;
    }

    public JXLabel getLabelProducto() {
        return labelProducto;
    }

    public void setLabelProducto(JXLabel labelProducto) {
        this.labelProducto = labelProducto;
    }

    public JXLabel getLabelCategoria() {
        return labelCategoria;
    }

    public void setLabelCategoria(JXLabel labelCategoria) {
        this.labelCategoria = labelCategoria;
    }

    public JXLabel getLabelCargo() {
        return labelCargo;
    }

    public void setLabelCargo(JXLabel labelCargo) {
        this.labelCargo = labelCargo;
    }

    public JXLabel getLabelConceptos() {
        return labelConceptos;
    }

    public void setLabelConceptos(JXLabel labelConceptos) {
        this.labelConceptos = labelConceptos;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public JXLabel getLabelListarVentas() {
        return labelListarVentas;
    }

    public void setLabelListarVentas(JXLabel labelListarVentas) {
        this.labelListarVentas = labelListarVentas;
    }

    public JXLabel getLabelListarVentasxEmpleado() {
        return labelListarVentasxEmpleado;
    }

    public void setLabelListarVentasxEmpleado(JXLabel labelListarVentasxEmpleado) {
        this.labelListarVentasxEmpleado = labelListarVentasxEmpleado;
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel1 = new javax.swing.JPanel();
        Contenedor_Menu = new org.jdesktop.swingx.JXTaskPaneContainer();
        jLabel1 = new javax.swing.JLabel();
        label_Empleado = new javax.swing.JLabel();
        Menu_Gestion = new org.jdesktop.swingx.JXTaskPane();
        Menu_Venta = new org.jdesktop.swingx.JXTaskPane();
        Menu_Compra = new org.jdesktop.swingx.JXTaskPane();
        Menu_Reporte = new org.jdesktop.swingx.JXTaskPane();
        Menu_LiquidacionSueldo = new org.jdesktop.swingx.JXTaskPane();
        Menu_Sistema = new org.jdesktop.swingx.JXTaskPane();
        jcMousePanel3 = new jcMousePanel.jcMousePanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Muebleria Todo Hogar - Principal");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jcMousePanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 538));

        Contenedor_Menu.setBackground(new java.awt.Color(102, 153, 255));
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(14);
        Contenedor_Menu.setLayout(verticalLayout1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido: ");
        Contenedor_Menu.add(jLabel1);

        label_Empleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        label_Empleado.setText("                 ");
        Contenedor_Menu.add(label_Empleado);
        Contenedor_Menu.add(Menu_Gestion);
        Contenedor_Menu.add(Menu_Venta);
        Contenedor_Menu.add(Menu_Compra);
        Contenedor_Menu.add(Menu_Reporte);
        Contenedor_Menu.add(Menu_LiquidacionSueldo);
        Contenedor_Menu.add(Menu_Sistema);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Contenedor_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Contenedor_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );

        jcMousePanel1.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jcMousePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jcMousePanel3.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 90)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Muebleria Todo Hogar");
        jcMousePanel3.add(jLabel2, java.awt.BorderLayout.CENTER);

        jcMousePanel1.add(jcMousePanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jcMousePanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTaskPaneContainer Contenedor_Menu;
    private org.jdesktop.swingx.JXTaskPane Menu_Compra;
    private org.jdesktop.swingx.JXTaskPane Menu_Gestion;
    private org.jdesktop.swingx.JXTaskPane Menu_LiquidacionSueldo;
    private org.jdesktop.swingx.JXTaskPane Menu_Reporte;
    private org.jdesktop.swingx.JXTaskPane Menu_Sistema;
    private org.jdesktop.swingx.JXTaskPane Menu_Venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel3;
    private javax.swing.JLabel label_Empleado;
    // End of variables declaration//GEN-END:variables
}
