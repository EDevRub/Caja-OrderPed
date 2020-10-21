package model;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import ws.WSPedidos;

/**
 *
 * @author Eduardo Rubio
 */
public class HiloTabla implements Runnable {

    private WSPedidos pedidos;
    private JTable tabla;

    public HiloTabla(WSPedidos pedidos, JTable tabla) {
        this.pedidos = pedidos;
        this.tabla = tabla;
    }

    @Override
    public void run() {
        while (true) {
            TMPedidos tm = new TMPedidos(pedidos.pedidosDeHoy());
            tabla.setModel(tm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloTabla.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
