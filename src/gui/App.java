package gui;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.util.List;
import javax.swing.JOptionPane;
import model.EditTabla;
import model.TMPedidos;
import ws.Pedido;
import ws.WSPedidos;
import ws.WSPedidos_Service;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Config;
import model.EditTablaHistorial;
import model.EditTablaPersonal;
import model.HiloTabla;
import model.TMHistorial;
import model.TMPersonalDeTrabajo;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.data.general.DefaultPieDataset;
import ws.HistorialPedidos;
import ws.PersonaSelect;

/**
 *
 * @author Edunaldo
 */
public class App extends javax.swing.JFrame {

    WSPedidos_Service pws;
    WSPedidos pws_interfaz;
    Date fechaRegistroPed;
    Date fechaPedListo;

//    private Thread hiloTabla;
    public App() {
        initComponents();

        pws = new WSPedidos_Service();
        pws_interfaz = pws.getWSPedidosPort();
        PlaceHolder holder = new PlaceHolder(txt_RutIngresar, "Rut Ej:12345678-9");
        tmPedidosEnCola.setDefaultRenderer(Object.class, new EditTabla());
        tmHistorialPedidos.setDefaultRenderer(Object.class, new EditTablaHistorial());
        tblPersonal.setDefaultRenderer(Object.class, new EditTablaPersonal());

        Thread h = new Thread(new HiloTabla(pws_interfaz, tmPedidosEnCola));
        h.start();

        init();
    }

    //boolean bandera = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fmMenuCaja = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        lblNomInicio = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnRegistrarPedidos = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        lblNomUsu = new javax.swing.JLabel();
        lblImagenMenu = new javax.swing.JLabel();
        mb_Privilegios = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_AgregarPersonal = new javax.swing.JMenuItem();
        jmi_HistorialPedidos = new javax.swing.JMenuItem();
        fmRegistrarPedido = new javax.swing.JFrame();
        btn_RegPedido = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_RutRegPedi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_NomRegPedi = new javax.swing.JTextField();
        btn_Volver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        sp_BarraScroll = new javax.swing.JScrollPane();
        tmPedidosEnCola = new javax.swing.JTable();
        lblImagen = new javax.swing.JLabel();
        fmRegistroPersonal = new javax.swing.JFrame();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtRutRegistroPersonal = new javax.swing.JTextField();
        txtNomRegistroPersonal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rbCajero = new javax.swing.JRadioButton();
        btnRegistrarPersonal = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        miVerPersonal = new javax.swing.JMenuItem();
        bgCargo = new javax.swing.ButtonGroup();
        fmHistorialPedidos = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tmHistorialPedidos = new javax.swing.JTable();
        btnVolverHistorial = new javax.swing.JButton();
        dc_fecha1Filtro = new com.toedter.calendar.JDateChooser();
        dc_fecha2Filtro = new com.toedter.calendar.JDateChooser();
        btnFiltrarHistorial = new javax.swing.JButton();
        btnHistorialDefault = new javax.swing.JButton();
        pnlDatosPëdidos = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lblPromEspera = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblTotalDeVentas = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblcantBUENTIEMPO = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblcantMALTIEMPO = new javax.swing.JLabel();
        lblTiempoEstimadoActual = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblGrafico = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmop2 = new javax.swing.JMenu();
        jmiExportarPDF = new javax.swing.JMenuItem();
        jmiAjusteTiempoEspera = new javax.swing.JMenuItem();
        fmPersonal = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblRutPersonal = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblNombrePersonal = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblCargoPersonal = new javax.swing.JLabel();
        btnEliminarPersonal = new javax.swing.JButton();
        btnVolverPersonal = new javax.swing.JButton();
        lblFondoPersonal = new javax.swing.JLabel();
        txt_RutIngresar = new javax.swing.JTextField();
        btn_IngresarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_Salir = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        fmMenuCaja.setUndecorated(true);
        fmMenuCaja.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("BIENVENIDO: @");
        fmMenuCaja.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 181, 30));

        lblNomInicio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fmMenuCaja.getContentPane().add(lblNomInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 50, 206, 53));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Registro de pedidos");
        fmMenuCaja.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 180, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("Cerrar Sesion");
        fmMenuCaja.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 100, 20));

        btnRegistrarPedidos.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrarPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_computer_add_103449.png"))); // NOI18N
        btnRegistrarPedidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistrarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPedidosActionPerformed(evt);
            }
        });
        fmMenuCaja.getContentPane().add(btnRegistrarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 180, 180));

        btnCerrarSesion.setBackground(new java.awt.Color(102, 51, 0));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_17_330399.png"))); // NOI18N
        btnCerrarSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        fmMenuCaja.getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 70, 70));

        lblNomUsu.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        lblNomUsu.setForeground(new java.awt.Color(255, 204, 0));
        lblNomUsu.setText("Nombre Usu");
        fmMenuCaja.getContentPane().add(lblNomUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 20, 325, 30));

        lblImagenMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoMenu.jpg"))); // NOI18N
        fmMenuCaja.getContentPane().add(lblImagenMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 410));

        mb_Privilegios.setBackground(new java.awt.Color(0, 0, 0));
        mb_Privilegios.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_list-mark-sign-option-menu_3643763 (1).png"))); // NOI18N
        jMenu1.setText("Opciones");

        jmi_AgregarPersonal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmi_AgregarPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_add-user_46775.png"))); // NOI18N
        jmi_AgregarPersonal.setText("Registro de personal");
        jmi_AgregarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AgregarPersonalActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_AgregarPersonal);

        jmi_HistorialPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jmi_HistorialPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_22_5027817 (1).png"))); // NOI18N
        jmi_HistorialPedidos.setText("Historial de Pedidos");
        jmi_HistorialPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_HistorialPedidosActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_HistorialPedidos);

        mb_Privilegios.add(jMenu1);

        fmMenuCaja.setJMenuBar(mb_Privilegios);

        fmRegistrarPedido.setUndecorated(true);
        fmRegistrarPedido.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_RegPedido.setBackground(new java.awt.Color(204, 204, 204));
        btn_RegPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_RegPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_list_296566 (1).png"))); // NOI18N
        btn_RegPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegPedidoActionPerformed(evt);
            }
        });
        fmRegistrarPedido.getContentPane().add(btn_RegPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 80, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro de Pedido");
        fmRegistrarPedido.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 390, -1));

        txt_RutRegPedi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_RutRegPedi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fmRegistrarPedido.getContentPane().add(txt_RutRegPedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 177, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("RUT: ");
        fmRegistrarPedido.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 40, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Nombre: ");
        fmRegistrarPedido.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 70, -1));

        txt_NomRegPedi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_NomRegPedi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NomRegPedi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_NomRegPediMouseReleased(evt);
            }
        });
        fmRegistrarPedido.getContentPane().add(txt_NomRegPedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 177, 40));

        btn_Volver.setBackground(new java.awt.Color(204, 204, 204));
        btn_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_arrow_return_down_left_11214.png"))); // NOI18N
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });
        fmRegistrarPedido.getContentPane().add(btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 60, 60));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pedidos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        tmPedidosEnCola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tmPedidosEnCola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tmPedidosEnCola.setRowHeight(30);
        sp_BarraScroll.setViewportView(tmPedidosEnCola);

        jPanel2.add(sp_BarraScroll, java.awt.BorderLayout.CENTER);

        fmRegistrarPedido.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 700, 230));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SoftwareTituloPedidoMenu.jpg"))); // NOI18N
        fmRegistrarPedido.getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 710));

        fmRegistroPersonal.setUndecorated(true);
        fmRegistroPersonal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Registro de Personal");
        fmRegistroPersonal.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 250, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("RUT: ");
        fmRegistroPersonal.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("Nombre: ");
        fmRegistroPersonal.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        txtRutRegistroPersonal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fmRegistroPersonal.getContentPane().add(txtRutRegistroPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 140, -1));

        txtNomRegistroPersonal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomRegistroPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomRegistroPersonalMouseClicked(evt);
            }
        });
        fmRegistroPersonal.getContentPane().add(txtNomRegistroPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 260, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 0));
        jLabel15.setText("Cargo:");
        fmRegistroPersonal.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        rbCajero.setBackground(new java.awt.Color(204, 153, 0));
        bgCargo.add(rbCajero);
        rbCajero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbCajero.setForeground(new java.awt.Color(255, 255, 255));
        rbCajero.setText("Cajero");
        fmRegistroPersonal.getContentPane().add(rbCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        btnRegistrarPersonal.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrarPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_add_user_309049.png"))); // NOI18N
        btnRegistrarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPersonalActionPerformed(evt);
            }
        });
        fmRegistroPersonal.getContentPane().add(btnRegistrarPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 60, 60));

        btnVolver.setBackground(new java.awt.Color(204, 204, 204));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_arrow_return_down_left_11214.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        fmRegistroPersonal.getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 40, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoMenu.jpg"))); // NOI18N
        fmRegistroPersonal.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 410));

        jMenuBar2.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_list-mark-sign-option-menu_3643763 (1).png"))); // NOI18N
        jMenu2.setText("Opciones");

        miVerPersonal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        miVerPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_28_staff_security_friendzone_gang_4307854.png"))); // NOI18N
        miVerPersonal.setText("Ver Personal");
        miVerPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVerPersonalActionPerformed(evt);
            }
        });
        jMenu2.add(miVerPersonal);

        jMenuBar2.add(jMenu2);

        fmRegistroPersonal.setJMenuBar(jMenuBar2);

        fmHistorialPedidos.setBounds(new java.awt.Rectangle(0, 0, 1437, 797));
        fmHistorialPedidos.setUndecorated(true);
        fmHistorialPedidos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tmHistorialPedidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tmHistorialPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Pedido", "Rut", "Nombre", "Fecha", "Tiempo De Espera", "Tiempo Estimado"
            }
        ));
        tmHistorialPedidos.setRowHeight(30);
        tmHistorialPedidos.setRowMargin(2);
        jScrollPane2.setViewportView(tmHistorialPedidos);

        fmHistorialPedidos.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 900, 310));

        btnVolverHistorial.setBackground(new java.awt.Color(204, 204, 204));
        btnVolverHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_arrow_return_down_left_11214.png"))); // NOI18N
        btnVolverHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverHistorialActionPerformed(evt);
            }
        });
        fmHistorialPedidos.getContentPane().add(btnVolverHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 40, 40));
        fmHistorialPedidos.getContentPane().add(dc_fecha1Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, 30));
        fmHistorialPedidos.getContentPane().add(dc_fecha2Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 170, 30));

        btnFiltrarHistorial.setBackground(new java.awt.Color(204, 204, 204));
        btnFiltrarHistorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFiltrarHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_Searchicons-search-blogs_825449.png"))); // NOI18N
        btnFiltrarHistorial.setBorder(null);
        btnFiltrarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarHistorialActionPerformed(evt);
            }
        });
        fmHistorialPedidos.getContentPane().add(btnFiltrarHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 60, 50));

        btnHistorialDefault.setBackground(new java.awt.Color(204, 204, 204));
        btnHistorialDefault.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_Delete.png"))); // NOI18N
        btnHistorialDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialDefaultActionPerformed(evt);
            }
        });
        fmHistorialPedidos.getContentPane().add(btnHistorialDefault, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 60, 50));

        pnlDatosPëdidos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Pedidos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlDatosPëdidos.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Promedio de espera:");

        lblPromEspera.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPromEspera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPromEspera.setText("00:00:00");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Total de ventas:");

        lblTotalDeVentas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotalDeVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalDeVentas.setText("0");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Pedidos dentro de tiempo: ");

        lblcantBUENTIEMPO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcantBUENTIEMPO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcantBUENTIEMPO.setText("0");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Pedidos fuera de tiempo: ");

        lblcantMALTIEMPO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcantMALTIEMPO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcantMALTIEMPO.setText("0");

        lblTiempoEstimadoActual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTiempoEstimadoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempoEstimadoActual.setText("00:00:00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tiempo estimado actual");

        javax.swing.GroupLayout pnlDatosPëdidosLayout = new javax.swing.GroupLayout(pnlDatosPëdidos);
        pnlDatosPëdidos.setLayout(pnlDatosPëdidosLayout);
        pnlDatosPëdidosLayout.setHorizontalGroup(
            pnlDatosPëdidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPëdidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDatosPëdidosLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(lblTiempoEstimadoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosPëdidosLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(pnlDatosPëdidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosPëdidosLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(5, 5, 5)
                        .addComponent(lblPromEspera))
                    .addGroup(pnlDatosPëdidosLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel17)
                        .addGap(5, 5, 5)
                        .addComponent(lblTotalDeVentas))
                    .addGroup(pnlDatosPëdidosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel18)
                        .addGap(5, 5, 5)
                        .addComponent(lblcantBUENTIEMPO))
                    .addGroup(pnlDatosPëdidosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel20)
                        .addGap(5, 5, 5)
                        .addComponent(lblcantMALTIEMPO)))
                .addGap(92, 92, 92))
        );
        pnlDatosPëdidosLayout.setVerticalGroup(
            pnlDatosPëdidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosPëdidosLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTiempoEstimadoActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(pnlDatosPëdidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(lblPromEspera))
                .addGap(5, 5, 5)
                .addGroup(pnlDatosPëdidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(lblTotalDeVentas))
                .addGap(5, 5, 5)
                .addGroup(pnlDatosPëdidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(lblcantBUENTIEMPO))
                .addGap(5, 5, 5)
                .addGroup(pnlDatosPëdidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(lblcantMALTIEMPO)))
        );

        fmHistorialPedidos.getContentPane().add(pnlDatosPëdidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 470, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Grafico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        lblGrafico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrafico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblGrafico, java.awt.BorderLayout.CENTER);

        fmHistorialPedidos.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 70, 460, 370));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoPedidos.jpg"))); // NOI18N
        fmHistorialPedidos.getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 1920, 1080));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jmop2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_list-mark-sign-option-menu_3643763 (1).png"))); // NOI18N
        jmop2.setText("Opciones");

        jmiExportarPDF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmiExportarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_pdf_272699.png"))); // NOI18N
        jmiExportarPDF.setText("Exportar PDF");
        jmiExportarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExportarPDFActionPerformed(evt);
            }
        });
        jmop2.add(jmiExportarPDF);

        jmiAjusteTiempoEspera.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jmiAjusteTiempoEspera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_SEO_cogwheels_setting_969265.png"))); // NOI18N
        jmiAjusteTiempoEspera.setText("Modificar tiempo estimado");
        jmiAjusteTiempoEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAjusteTiempoEsperaActionPerformed(evt);
            }
        });
        jmop2.add(jmiAjusteTiempoEspera);

        jMenuBar1.add(jmop2);

        fmHistorialPedidos.setJMenuBar(jMenuBar1);

        fmPersonal.setUndecorated(true);
        fmPersonal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Personal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);

        tblPersonal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUT", "Nombre", "Cargo"
            }
        ));
        tblPersonal.setRowHeight(25);
        tblPersonal.setRowMargin(2);
        tblPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPersonalMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersonal);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );

        fmPersonal.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 590, 150));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Personal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RUT:");

        lblRutPersonal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRutPersonal.setForeground(new java.awt.Color(255, 255, 255));
        lblRutPersonal.setText("00000000-0");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nombre:");

        lblNombrePersonal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombrePersonal.setForeground(new java.awt.Color(255, 255, 255));
        lblNombrePersonal.setText("---------------");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cargo:");

        lblCargoPersonal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCargoPersonal.setForeground(new java.awt.Color(255, 255, 255));
        lblCargoPersonal.setText("---------------");

        btnEliminarPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_remove_user_309037.png"))); // NOI18N
        btnEliminarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPersonalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCargoPersonal))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombrePersonal)
                                    .addComponent(lblRutPersonal)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnEliminarPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblRutPersonal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lblNombrePersonal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lblCargoPersonal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnEliminarPersonal)
                .addContainerGap())
        );

        fmPersonal.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 190, 210));

        btnVolverPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_arrow_return_down_left_11214.png"))); // NOI18N
        btnVolverPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverPersonalActionPerformed(evt);
            }
        });
        fmPersonal.getContentPane().add(btnVolverPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 40, 40));

        lblFondoPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoMenu.jpg"))); // NOI18N
        lblFondoPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblFondoPersonalMouseReleased(evt);
            }
        });
        fmPersonal.getContentPane().add(lblFondoPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_RutIngresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_RutIngresar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_RutIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_RutIngresarKeyReleased(evt);
            }
        });
        getContentPane().add(txt_RutIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 200, 39));

        btn_IngresarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_IngresarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_Rounded-31_2024644.png"))); // NOI18N
        btn_IngresarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_IngresarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_IngresarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 80, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Inicio Sesion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 160, -1));

        lbl_Salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Salir.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_17_330399.png"))); // NOI18N
        lbl_Salir.setText("Salir ");
        lbl_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl_SalirMouseReleased(evt);
            }
        });
        getContentPane().add(lbl_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 344, -1, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu-blanco-restaurante-comida-rapida_7939-1187.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IngresarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarSesionActionPerformed
        String rut = txt_RutIngresar.getText();
        //Persona p = new Persona();
        boolean ex = pws_interfaz.ingresar(rut);
        int cargo = pws_interfaz.idCargoPersona(rut);
        String nombre = pws_interfaz.nombreCliente(rut);

        if (ex == true && cargo == 1) {
            fmMenuCaja.setBounds(0, 0, 611, 444);
            fmMenuCaja.setLocationRelativeTo(null);
            this.setVisible(false);
            mb_Privilegios.setVisible(true);
            lblNomUsu.setText(nombre);
            fmMenuCaja.setVisible(true);
        } else if (ex == true && cargo == 2) {
            this.setVisible(false);
            mb_Privilegios.setVisible(false);
            lblNomUsu.setText(nombre);
            fmMenuCaja.setVisible(true);
        } else {
            mensajeError("Usuario no identificado");
        }

        txt_RutIngresar.setText(null);
        txt_RutIngresar.requestFocus();
    }//GEN-LAST:event_btn_IngresarSesionActionPerformed

    private void btn_RegPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegPedidoActionPerformed
        String rut_Pedido, nom_Pedido;
        rut_Pedido = txt_RutRegPedi.getText();
        nom_Pedido = txt_NomRegPedi.getText();
        rut_Pedido = rut_Pedido.replace(".", "").trim();
        rut_Pedido = rut_Pedido.replace(" ", "");

        nom_Pedido = nom_Pedido.trim();
        //rutFinal = rut_Pedido.replaceAll(" ", "").trim();
        //validarRut(rutFinal);

        if (validarRut(rut_Pedido) == true && !"".equals(nom_Pedido)) {
            pws_interfaz.agregarPedido(rut_Pedido, nom_Pedido);
            txt_RutRegPedi.setText(null);
            txt_NomRegPedi.setText(null);
            txt_RutRegPedi.requestFocus();
        } else if (nom_Pedido.equals("") && rut_Pedido.equals("")) {
            mensajeError("Ingrese datos");
        } else if (nom_Pedido.equals("")) {
            mensajeError("Ingrese nombre");
        } else {
            mensajeError("Rut invalido");
        }
        //            pws_interfaz.agregarPedido(rutFinal, nom_Pedido);
        //
        //            cargarTabla();
        //            txt_RutRegPedi.setText(null);
        //            txt_NomRegPedi.setText(null);
        //            txt_RutRegPedi.requestFocus();
    }//GEN-LAST:event_btn_RegPedidoActionPerformed


    private void btnRegistrarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPedidosActionPerformed
        fmMenuCaja.setVisible(false);
        fmRegistrarPedido.setVisible(true);
    }//GEN-LAST:event_btnRegistrarPedidosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        fmMenuCaja.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnRegistrarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonalActionPerformed
        String rut, nombre;
        int cargo = 0;
        rut = txtRutRegistroPersonal.getText();
        nombre = txtNomRegistroPersonal.getText();
        String n = nombre.trim();

        if (validarRut(rut) == true && rbCajero.isSelected() && !"".equals(n)) {
            cargo = 2;
            pws_interfaz.registrarPersonal(rut, n, cargo);
            txtRutRegistroPersonal.setText("");
            txtNomRegistroPersonal.setText("");
            bgCargo.clearSelection();
            mensajeCorrecto("Cajero registrado");
        } else if (rbCajero.isSelected() == false) {
            mensajeError("Seleccione cargo");
        } else if (n.equals("")) {
            mensajeError("Ingrese Nombre");
            txtNomRegistroPersonal.setText("");
            txtNomRegistroPersonal.requestFocus();
        } else if (validarRut(rut) == false) {
            mensajeError("Ingrese rut valido");
            txtRutRegistroPersonal.requestFocus();
        } else {
            mensajeError("Error en Registro");
        }
    }//GEN-LAST:event_btnRegistrarPersonalActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        txtRutRegistroPersonal.setText("");
        txtNomRegistroPersonal.setText("");
        fmRegistroPersonal.setVisible(false);
        fmMenuCaja.setVisible(true);

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        fmRegistrarPedido.setVisible(false);
        fmMenuCaja.setVisible(true);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btnVolverHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverHistorialActionPerformed
        fmHistorialPedidos.setVisible(false);
        fmMenuCaja.setVisible(true);
    }//GEN-LAST:event_btnVolverHistorialActionPerformed

    private void btnFiltrarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarHistorialActionPerformed
        try {
            cargarTablaDeHistorialFiltrada(dataChooser1(), dataChooser2());
            lblPromEspera.setText(String.valueOf(promedioEsperaFiltrado(dataChooser1(), dataChooser2())));
            lblTotalDeVentas.setText(String.valueOf(pws_interfaz.getTotalDePedidosFiltrado(dataChooser1(), dataChooser2())));
            lblcantBUENTIEMPO.setText(String.valueOf(pws_interfaz.cantPedBuenosMINFiltrados(dataChooser1(), dataChooser2())));
            lblcantMALTIEMPO.setText(String.valueOf(pws_interfaz.cantPedMalosMINFiltrados(dataChooser1(), dataChooser2())));
            graficarFiltrado();
            lblGrafico.setVisible(true);
        } catch (Exception e) {
            mensajeError("No registra pedidos");
            dc_fecha1Filtro.setDate(null);
            dc_fecha2Filtro.setDate(null);
        }

    }//GEN-LAST:event_btnFiltrarHistorialActionPerformed

    private void btnHistorialDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialDefaultActionPerformed
        lblGrafico.setVisible(false);
        dc_fecha1Filtro.setDate(null);
        dc_fecha2Filtro.setDate(null);
        lblPromEspera.setText("00:00:00");
        lblTotalDeVentas.setText("00");
        lblcantBUENTIEMPO.setText("0");
        lblcantMALTIEMPO.setText("0");
        tablaLimpia(tmHistorialPedidos);

    }//GEN-LAST:event_btnHistorialDefaultActionPerformed

    private void lbl_SalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SalirMouseReleased
        System.exit(0);
    }//GEN-LAST:event_lbl_SalirMouseReleased

    private void jmi_AgregarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AgregarPersonalActionPerformed
        fmMenuCaja.setVisible(false);
        fmRegistroPersonal.setVisible(true);
    }//GEN-LAST:event_jmi_AgregarPersonalActionPerformed

    private void jmi_HistorialPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_HistorialPedidosActionPerformed
        //graficar();
        fmMenuCaja.setVisible(false);
        fmHistorialPedidos.setVisible(true);
    }//GEN-LAST:event_jmi_HistorialPedidosActionPerformed

    private void jmiExportarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExportarPDFActionPerformed

        String fecha1 = dataChooser1();
        String fecha2 = fechaParaPDF();

        JFileChooser j = new JFileChooser();
        int opcion = j.showSaveDialog(this);

        if (opcion == JFileChooser.APPROVE_OPTION) {
            File f = j.getSelectedFile();
            String ruta = f.toString();
            System.out.println(ruta);
            Document doc = new Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(ruta + ".pdf"));

                Image encabezado = Image.getInstance("src/imagenes/pdfEncabezado.png");
                encabezado.scaleToFit(600, 1000);
                encabezado.setAlignment(Chunk.ALIGN_CENTER);

                Image grafico = Image.getInstance("D:\\Documentos Edu\\PROYECTO  DE TITULO\\Caja_ProyectoWS\\chart.png");
                grafico.scaleToFit(400, 400);
                grafico.setAlignment(Chunk.ALIGN_CENTER);

                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo.setFont(FontFactory.getFont("Tahoma", 35, Font.BOLD, Color.BLACK));
                parrafo.add("Historial de Pedidos");

                Paragraph parrafo4 = new Paragraph();
                parrafo4.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo4.setFont(FontFactory.getFont("Tahoma", 18, Font.NORMAL, Color.BLACK));
                parrafo4.add("Total de ventas: " + lblTotalDeVentas.getText() + "           Promedio de espera: " + lblPromEspera.getText());

                doc.open();
                doc.add(encabezado);
                doc.add(new Paragraph(" "));
                doc.add(parrafo);

                doc.add(new Paragraph(" "));
                Paragraph parrafo2 = new Paragraph("Fecha de historial");
                parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
                doc.add(parrafo2);
                Paragraph parrafo3 = new Paragraph(fecha1 + " y " + fecha2);
                parrafo3.setAlignment(Paragraph.ALIGN_CENTER);
                doc.add(parrafo3);
                doc.add(new Paragraph(" "));
                doc.add(new Paragraph(" "));

                PdfPTable tbl = new PdfPTable(6);
                //Agregar titulos
                tbl.addCell("N° Pedido");
                tbl.addCell("Rut");
                tbl.addCell("Nombre");
                tbl.addCell("Fecha");
                tbl.addCell("Tiempo De Espera");
                tbl.addCell("Tiempo Estimado");
                for (int i = 0; i < tmHistorialPedidos.getRowCount(); i++) {
                    String nPedido = tmHistorialPedidos.getValueAt(i, 0).toString();
                    String rut = tmHistorialPedidos.getValueAt(i, 1).toString();
                    String nombre = tmHistorialPedidos.getValueAt(i, 2).toString();
                    String fecha = tmHistorialPedidos.getValueAt(i, 3).toString();
                    String tiempoEspera = tmHistorialPedidos.getValueAt(i, 4).toString();
                    String tiempoEstimado = tmHistorialPedidos.getValueAt(i, 5).toString();
                    tbl.addCell(nPedido);
                    tbl.addCell(rut);
                    tbl.addCell(nombre);
                    tbl.addCell(fecha);
                    tbl.addCell(tiempoEspera);
                    tbl.addCell(tiempoEstimado);
                }
                tbl.setHorizontalAlignment(Element.ALIGN_CENTER);
                doc.add(tbl);

                doc.add(new Paragraph(" "));
                doc.add(new Paragraph(" "));
                doc.add(parrafo4);
//                Paragraph parrafo4 = new Paragraph("Total de ventas: " + lblTotalDeVentas.getText());
//                parrafo4.setAlignment(Paragraph.ALIGN_CENTER);
//                doc.add(parrafo4);
//                doc.add(new Paragraph(""));
//                Paragraph parrafo5 = new Paragraph("Promedio de espera: " + lblPromEspera.getText());
//                parrafo5.setAlignment(Paragraph.ALIGN_CENTER);
//                doc.add(parrafo5);
                doc.add(new Paragraph(""));
                doc.add(new Paragraph(""));
                Paragraph parrafo6 = new Paragraph();
                parrafo6.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo6.setFont(FontFactory.getFont("Tahoma", 18, Font.NORMAL, Config.VERDE));
                parrafo6.add("Pedidos en buen tiempo: " + lblcantBUENTIEMPO.getText());
                doc.add(parrafo6);
                doc.add(new Paragraph(""));
                doc.add(new Paragraph(""));
                Paragraph parrafo7 = new Paragraph();
                parrafo7.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo7.setFont(FontFactory.getFont("Tahoma", 18, Font.NORMAL, Config.ROJO));
                parrafo7.add("Pedidos con mal tiempo: " + lblcantMALTIEMPO.getText());
                doc.add(parrafo7);
                doc.add(new Paragraph(""));
                doc.add(grafico);
                doc.add(new Paragraph(" "));

            } catch (DocumentException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException e) {
                System.out.println("Error en la imagen " + e);
            }

            doc.close();
        }

//            FileOutputStream archivo = new FileOutputStream(nom+".pdf");
//            Document documento = new Document();
//            PdfWriter.getInstance(documento, archivo);
//            documento.open();
//            
//            Paragraph parrafo = new Paragraph("Datos Personales");
//            parrafo.setAlignment(1);
//            documento.add(parrafo);
//            
//            documento.close();
//            JOptionPane.showMessageDialog(null, "Archivo PDF Creado","Informacion",1);
//            
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (DocumentException ex) {
//            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jmiExportarPDFActionPerformed

    private void txt_NomRegPediMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_NomRegPediMouseReleased
        String nomCliente, rut;
        rut = txt_RutRegPedi.getText();
        rut = rut.replace(".", "").trim();
        rut = rut.replace(" ", "");
        nomCliente = pws_interfaz.nombreCliente(rut);
        if (nomCliente.equals("")) {
            txt_NomRegPedi.setText("");
            txt_NomRegPedi.setEditable(true);
        } else {
            txt_NomRegPedi.setText(nomCliente);
            txt_NomRegPedi.setEditable(false);
        }
    }//GEN-LAST:event_txt_NomRegPediMouseReleased

    private void jmiAjusteTiempoEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAjusteTiempoEsperaActionPerformed
        try {
            String nuevoTiempoEstimado = JOptionPane.showInputDialog("Nuevo tiempo estimado(Minutos):");
            int tiempoEstimado = Integer.parseInt(nuevoTiempoEstimado);
            if (tiempoEstimado > 0 && tiempoEstimado < 60) {
                pws_interfaz.tiempoEstimadoEspera(tiempoEstimado);
                tiempoEstimadoActual();
                mensajeCorrecto("Tiempo estimado modificado");
            } else if (tiempoEstimado <= 0 || tiempoEstimado >= 60) {
                mensajeError("Ingrese n° entre 1 y 59");
            }
        } catch (Exception e) {
            mensajeError("Ingrese solo numeros");
        }
    }//GEN-LAST:event_jmiAjusteTiempoEsperaActionPerformed

    private void txt_RutIngresarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RutIngresarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String rut = txt_RutIngresar.getText();
            //Persona p = new Persona();
            boolean ex = pws_interfaz.ingresar(rut);
            int cargo = pws_interfaz.idCargoPersona(rut);
            String nombre = pws_interfaz.nombreCliente(rut);

            if (ex == true && cargo == 1) {
                fmMenuCaja.setBounds(0, 0, 611, 444);
                fmMenuCaja.setLocationRelativeTo(null);
                this.setVisible(false);
                mb_Privilegios.setVisible(true);
                lblNomUsu.setText(nombre);
                fmMenuCaja.setVisible(true);
            } else if (ex == true && cargo == 2) {
                this.setVisible(false);
                mb_Privilegios.setVisible(false);
                lblNomUsu.setText(nombre);
                fmMenuCaja.setVisible(true);
            } else {
                mensajeError("Usuario no identificado");
            }

            txt_RutIngresar.setText(null);
            txt_RutIngresar.requestFocus();
        }
    }//GEN-LAST:event_txt_RutIngresarKeyReleased

    private void miVerPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVerPersonalActionPerformed
        cargarTablaPersonal();
        fmRegistroPersonal.setVisible(false);
        fmPersonal.setVisible(true);
    }//GEN-LAST:event_miVerPersonalActionPerformed

    private void btnVolverPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverPersonalActionPerformed
        fmPersonal.setVisible(false);
        fmRegistroPersonal.setVisible(true);
    }//GEN-LAST:event_btnVolverPersonalActionPerformed

    private void txtNomRegistroPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomRegistroPersonalMouseClicked
        String rut = txtRutRegistroPersonal.getText();
        String prueba = "";
        if (rut.contains("-")) {
            prueba = rut;
        } else if (rut.equals("")) {

        } else {
            prueba = "-" + rut.substring(rut.length() - 1);
            for (int i = rut.length() - 2; i >= 0; i--) {
                prueba = rut.substring(i, i + 1) + prueba;
            }
        }
        txtRutRegistroPersonal.setText(prueba);
    }//GEN-LAST:event_txtNomRegistroPersonalMouseClicked

    private void tblPersonalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonalMouseReleased
        if (evt.getClickCount() == 2) {
            int fila = tblPersonal.getSelectedRow();
            TMPersonalDeTrabajo selec = (TMPersonalDeTrabajo) tblPersonal.getModel();
            PersonaSelect ps = selec.getPersonalTrabajo(fila);
            lblRutPersonal.setText(ps.getRut());
            lblNombrePersonal.setText(ps.getNombre());
            lblCargoPersonal.setText(ps.getCargo());
        }
    }//GEN-LAST:event_tblPersonalMouseReleased

    private void lblFondoPersonalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoPersonalMouseReleased
        if (evt.getClickCount() == 1) {
            lblRutPersonal.setText("00000000-0");
            lblNombrePersonal.setText("---------------");
            lblCargoPersonal.setText("---------------");
        }
    }//GEN-LAST:event_lblFondoPersonalMouseReleased

    private void btnEliminarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPersonalActionPerformed
        String rutPersonal = lblRutPersonal.getText();
        if (!"00000000-0".equals(rutPersonal)) {
            pws_interfaz.cambiarPersonal(rutPersonal);
            cargarTablaPersonal();
            lblRutPersonal.setText("00000000-0");
            lblNombrePersonal.setText("---------------");
            lblCargoPersonal.setText("---------------");
            mensajeCorrecto("Personal Eliminado");
        } else {
            mensajeError("Personal no identificado");
        }
    }//GEN-LAST:event_btnEliminarPersonalActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCargo;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEliminarPersonal;
    private javax.swing.JButton btnFiltrarHistorial;
    private javax.swing.JButton btnHistorialDefault;
    private javax.swing.JButton btnRegistrarPedidos;
    private javax.swing.JButton btnRegistrarPersonal;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolverHistorial;
    private javax.swing.JButton btnVolverPersonal;
    private javax.swing.JButton btn_IngresarSesion;
    private javax.swing.JButton btn_RegPedido;
    private javax.swing.JButton btn_Volver;
    private com.toedter.calendar.JDateChooser dc_fecha1Filtro;
    private com.toedter.calendar.JDateChooser dc_fecha2Filtro;
    private javax.swing.JFrame fmHistorialPedidos;
    private javax.swing.JFrame fmMenuCaja;
    private javax.swing.JFrame fmPersonal;
    private javax.swing.JFrame fmRegistrarPedido;
    private javax.swing.JFrame fmRegistroPersonal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jmiAjusteTiempoEspera;
    private javax.swing.JMenuItem jmiExportarPDF;
    private javax.swing.JMenuItem jmi_AgregarPersonal;
    private javax.swing.JMenuItem jmi_HistorialPedidos;
    private javax.swing.JMenu jmop2;
    private javax.swing.JLabel lblCargoPersonal;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondoPersonal;
    private javax.swing.JLabel lblGrafico;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenMenu;
    private javax.swing.JLabel lblNomInicio;
    private javax.swing.JLabel lblNomUsu;
    private javax.swing.JLabel lblNombrePersonal;
    private javax.swing.JLabel lblPromEspera;
    private javax.swing.JLabel lblRutPersonal;
    private javax.swing.JLabel lblTiempoEstimadoActual;
    private javax.swing.JLabel lblTotalDeVentas;
    private javax.swing.JLabel lbl_Salir;
    private javax.swing.JLabel lblcantBUENTIEMPO;
    private javax.swing.JLabel lblcantMALTIEMPO;
    private javax.swing.JMenuBar mb_Privilegios;
    private javax.swing.JMenuItem miVerPersonal;
    private javax.swing.JPanel pnlDatosPëdidos;
    private javax.swing.JRadioButton rbCajero;
    private javax.swing.JScrollPane sp_BarraScroll;
    private javax.swing.JTable tblPersonal;
    private javax.swing.JTable tmHistorialPedidos;
    private javax.swing.JTable tmPedidosEnCola;
    private javax.swing.JTextField txtNomRegistroPersonal;
    private javax.swing.JTextField txtRutRegistroPersonal;
    private javax.swing.JTextField txt_NomRegPedi;
    private javax.swing.JTextField txt_RutIngresar;
    private javax.swing.JTextField txt_RutRegPedi;
    // End of variables declaration//GEN-END:variables
    public void init() {

        this.setBounds(0, 0, 626, 417);
        this.setLocationRelativeTo(null);

        fmMenuCaja.setBounds(0, 0, 611, 408);
        fmMenuCaja.setLocationRelativeTo(null);

        fmRegistroPersonal.setBounds(0, 0, 611, 444);
        fmRegistroPersonal.setLocationRelativeTo(null);

        fmPersonal.setBounds(0, 0, 611, 408);
        fmPersonal.setLocationRelativeTo(null);

        fmRegistrarPedido.setBounds(0, 0, 720, 705);
        fmRegistrarPedido.setLocationRelativeTo(null);

        fmHistorialPedidos.setBounds(0, 0, 1403, 643);
        fmHistorialPedidos.setLocationRelativeTo(null);

        lblGrafico.setVisible(false);

        botones_transparentes();
        tiempoEstimadoActual();

        sp_BarraScroll.setViewportView(tmPedidosEnCola);

        tablaLimpia(tmHistorialPedidos);
        //btnRegistrarPedidos.setBackground(new java.awt.Color(102,51,0));
        //cargarTabla();

    }

    public void cargarTabla() {
        List<Pedido> listaPedi = pws_interfaz.pedidosDeHoy();
        TMPedidos tm = new TMPedidos(listaPedi);
        tmPedidosEnCola.setModel(tm);
    }

    public void cargarTablaPersonal() {
        List<PersonaSelect> listaPersonal = pws_interfaz.getPersonalDeTrabajo();
        TMPersonalDeTrabajo tm = new TMPersonalDeTrabajo(listaPersonal, pws, pws_interfaz);
        tblPersonal.setModel(tm);
    }

    public void cargarTablaDeHistorialFiltrada(String fecha1, String fecha2) {
        List<HistorialPedidos> listaHistorial = pws_interfaz.getHistorialPedidosFiltrados(fecha1, fecha2);
        TMHistorial tm = new TMHistorial(listaHistorial);
        tmHistorialPedidos.setModel(tm);
        TableColumnModel columnModel = tmHistorialPedidos.getColumnModel();
        columnModel.getColumn(3).setPreferredWidth(186);
    }

    public Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

//    public String promedioEspera() {
//        int promHora = pws_interfaz.getPromedioDeHoras();
//        int promMin = pws_interfaz.getPromedioDeMinutos();
//        int promSeg = pws_interfaz.getPromedioDeSegundos();
//
//        String promHora2 = (promHora <= 9 ? "0" + promHora : Integer.toString(promHora));
//        String promMinuto2 = (promMin <= 9 ? "0" + promMin : Integer.toString(promMin));
//        String promSegundos2 = (promSeg <= 9 ? "0" + promSeg : Integer.toString(promSeg));
//
//        return promHora2 + ":" + promMinuto2 + ":" + promSegundos2;
//    }
    public String promedioEsperaFiltrado(String fecha1, String fecha2) {
        int promHora = pws_interfaz.getPromHoraFiltrada(fecha1, fecha2);
        int promMin = pws_interfaz.getPromMinFiltrado(fecha1, fecha2);
        int promSeg = pws_interfaz.getPromSegFiltrado(fecha1, fecha2);

        String promHora2 = (promHora <= 9 ? "0" + promHora : Integer.toString(promHora));
        String promMinuto2 = (promMin <= 9 ? "0" + promMin : Integer.toString(promMin));
        String promSegundos2 = (promSeg <= 9 ? "0" + promSeg : Integer.toString(promSeg));

        return promHora2 + ":" + promMinuto2 + ":" + promSegundos2;
    }

    public String dataChooser1() {

        int anio = dc_fecha1Filtro.getCalendar().get(Calendar.YEAR);
        int mes = dc_fecha1Filtro.getCalendar().get(Calendar.MONTH) + 1;
        int dia = dc_fecha1Filtro.getCalendar().get(Calendar.DAY_OF_MONTH);

        String anio2 = (anio <= 9 ? "0" + anio : Integer.toString(anio));
        String mes2 = (mes <= 9 ? "0" + mes : Integer.toString(mes));
        String dia2 = (dia <= 9 ? "0" + dia : Integer.toString(dia));

        String fecha = anio2 + "-" + mes2 + "-" + dia2;

        return fecha;
    }

    public String dataChooser2() {
        int anio = dc_fecha2Filtro.getCalendar().get(Calendar.YEAR);
        int mes = dc_fecha2Filtro.getCalendar().get(Calendar.MONTH) + 1;
        int dia = dc_fecha2Filtro.getCalendar().get(Calendar.DAY_OF_MONTH);

        String anio2 = (anio <= 9 ? "0" + anio : Integer.toString(anio));
        String mes2 = (mes <= 9 ? "0" + mes : Integer.toString(mes));
        String dia2 = (dia <= 9 ? "0" + dia : Integer.toString(dia));

        String fecha = anio2 + "-" + mes2 + "-" + dia2 + " 23:59:59";

        return fecha;
    }

    public String fechaParaPDF() {
        int anio = dc_fecha2Filtro.getCalendar().get(Calendar.YEAR);
        int mes = dc_fecha2Filtro.getCalendar().get(Calendar.MONTH) + 1;
        int dia = dc_fecha2Filtro.getCalendar().get(Calendar.DAY_OF_MONTH);

        String anio2 = (anio <= 9 ? "0" + anio : Integer.toString(anio));
        String mes2 = (mes <= 9 ? "0" + mes : Integer.toString(mes));
        String dia2 = (dia <= 9 ? "0" + dia : Integer.toString(dia));

        String fecha = anio2 + "-" + mes2 + "-" + dia2;

        return fecha;
    }

//    public int porcentajeBuenTiempo() {
//        int totaldehistorial = pws_interfaz.getNumTotalPedidos();
//        //int cantPedBuenosSEG = pws_interfaz.cantPedBuenosSEG(SEGUNDOS_ESPERA);
//        int cantPedBuenosMIN2 = pws_interfaz.cantPedBuenosMIN(MINUTOS_ESPERA);
//        //int porcentajeBUENOS = (cantPedBuenosSEG * 100) / totaldehistorial;
//        int porcentajeBUENOS2 = (cantPedBuenosMIN2 * 100) / totaldehistorial;
//        //return porcentajeBUENOS;
//        return porcentajeBUENOS2;
//    }
//    public int porcentajeMalTiempo() {
//        int totaldehistorial = pws_interfaz.getNumTotalPedidos();
//        //int cantPedMalosSEG = pws_interfaz.cantPedMalosSeg(SEGUNDOS_ESPERA);
//        int cantPedMalosMIN2 = pws_interfaz.cantPedMalosMIN(MINUTOS_ESPERA);
//        //int porcentajeMALOS = (cantPedMalosSEG * 100) / totaldehistorial;
//        int porcentajeMALOS2 = (cantPedMalosMIN2 * 100) / totaldehistorial;
//        //return porcentajeMALOS;
//        return porcentajeMALOS2;
//    }
    public int porcentajeBuenTiempoFiltrado(String fecha1, String fecha2) {
        int totaldehistorial = pws_interfaz.getTotalDePedidosFiltrado(fecha1, fecha2);
        int cantPedBuenosMINFIL2 = pws_interfaz.cantPedBuenosMINFiltrados(fecha1, fecha2);
        //int porcentajeBUENOSFIL = (cantPedBuenosSEGFIL * 100) / totaldehistorial;
        int porcentajeBUENOSFIL2 = (cantPedBuenosMINFIL2 * 100) / totaldehistorial;
        //return porcentajeBUENOSFIL;
        return porcentajeBUENOSFIL2;
    }

    public int porcentajeMalTiempoFiltrado(String fecha1, String fecha2) {
        int totaldehistorial = pws_interfaz.getTotalDePedidosFiltrado(fecha1, fecha2);
        int cantPedMalosMINFIL2 = pws_interfaz.cantPedMalosMINFiltrados(fecha1, fecha2);
        //int porcentajeMALOSFIL = (cantPedMalosSEGFIL * 100) / totaldehistorial;
        int porcentajeMALOSFIL2 = (cantPedMalosMINFIL2 * 100) / totaldehistorial;
        //return porcentajeMALOSFIL;
        return porcentajeMALOSFIL2;
    }

//    public void graficar() {
//        DefaultPieDataset data = new DefaultPieDataset();
//        data.setValue("Mal Tiempo " + 0 + "%", 0);
//        data.setValue("Buen Tiempo " + 0 + "%", 0);
//        JFreeChart oChart = ChartFactory.createPieChart3D("Pedidos", data, true, true, false);
//        ChartPanel oPanel = new ChartPanel(oChart);
//        oPanel.setEnabled(false);
//        lblGrafico.setLayout(new java.awt.BorderLayout());
//        lblGrafico.add(oPanel);
//        lblGrafico.validate();
//    }
    public void graficarFiltrado() {
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Mal Tiempo " + porcentajeMalTiempoFiltrado(dataChooser1(), dataChooser2()) + "%", porcentajeMalTiempoFiltrado(dataChooser1(), dataChooser2()));
        data.setValue("Buen Tiempo " + porcentajeBuenTiempoFiltrado(dataChooser1(), dataChooser2()) + "%", porcentajeBuenTiempoFiltrado(dataChooser1(), dataChooser2()));
        JFreeChart oChart = ChartFactory.createPieChart3D("Pedidos", data, true, true, false);
        ChartPanel oPanel = new ChartPanel(oChart);
        lblGrafico.setLayout(new java.awt.BorderLayout());
        lblGrafico.add(oPanel);
        lblGrafico.validate();

        try {
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file1 = new File("chart.png");
            ChartUtilities.saveChartAsPNG(file1, oChart, 600, 400, info);
        } catch (Exception e) {
        }
    }

    public void tablaLimpia(JTable j) {
        DefaultTableModel limpia = new DefaultTableModel();
        limpia.addColumn("N° Pedido");
        limpia.addColumn("Rut");
        limpia.addColumn("Nombre");
        limpia.addColumn("Fecha");
        limpia.addColumn("Tiempo De Espera");
        limpia.addColumn("Tiempo Estimado");
        j.setModel(limpia);
        TableColumnModel columnModel = j.getColumnModel();
        columnModel.getColumn(3).setPreferredWidth(186);
    }

    public void botones_transparentes() {
        btn_IngresarSesion.setOpaque(false);
        btn_IngresarSesion.setContentAreaFilled(false);

        btnCerrarSesion.setOpaque(false);
        btnCerrarSesion.setContentAreaFilled(false);
    }

    public void tiempoEstimadoActual() {
        int tiempoEsimado = pws_interfaz.tiempoEstimadoActual();
        String tiempoEsimadoActual = (tiempoEsimado <= 9 ? "0" + tiempoEsimado : Long.toString(tiempoEsimado));
        lblTiempoEstimadoActual.setText("00:" + tiempoEsimadoActual + ":00");
    }

    public boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    public void mensajeError(String mensaje) {
        Icon error = new ImageIcon(getClass().getResource("../imagenes/iconoError.png"));
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE, error);
    }

    public void mensajeCorrecto(String mensaje) {
        Icon correcto = new ImageIcon(getClass().getResource("../imagenes/iconoCorrecto.png"));
        JOptionPane.showMessageDialog(this, mensaje, "Exito", JOptionPane.PLAIN_MESSAGE, correcto);
    }

//    public class HiloTabla extends Thread {
//
//        @Override
//        public void run() {
//            cargarTabla();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
    public class Hilo extends Thread {

        @Override
        public void run() {
            cargarTabla();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
