package model;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import ws.WSPedidos;
import ws.WSPedidos_Service;

/**
 *
 * @author Eduardo Rubio
 */
public class EditTablaHistorial extends DefaultTableCellRenderer implements TableCellRenderer {

    int min;
    int hora;
    int tiempoEstimado;

    WSPedidos_Service pws = new WSPedidos_Service();
    WSPedidos pws_interfaz = pws.getWSPedidosPort();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        min = pws_interfaz.getMinDeEspera(Integer.parseInt(String.valueOf(table.getValueAt(row, 0))));
        hora = pws_interfaz.getHoraDeEspera(Integer.parseInt(String.valueOf(table.getValueAt(row, 0))));
        tiempoEstimado = pws_interfaz.getTiempoEstimado(Integer.parseInt(String.valueOf(table.getValueAt(row, 0))));

//        if (seg <= 30) {
//            table.setForeground(Color.WHITE);
//            setBackground(new Color(82, 228, 26)); //Verde
//        }
//        if (seg > 30) {
//            table.setForeground(Color.white);
//            setBackground(new Color(228, 26, 32)); //Rojo
//        }
        if (min >= tiempoEstimado || hora >= 1) {
            table.setForeground(Color.white);
            setBackground(Config.ROJO);
        } else if (min < tiempoEstimado) {
            table.setForeground(Color.WHITE);
            setBackground(Config.VERDE);
            table.setForeground(Color.WHITE);

        }

        setHorizontalAlignment(SwingConstants.CENTER);
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        return this;
    }

}
