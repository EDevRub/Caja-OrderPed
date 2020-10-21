package model;

import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import ws.Pedido;
import ws.Persona;
import ws.WSPedidos;
import ws.WSPedidos_Service;

/**
 *
 * @author Edunaldo
 */
public class EditTabla extends DefaultTableCellRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if ("En Espera".equals((String) table.getValueAt(row, 4))) {
            table.setForeground(Color.white);
            setBackground(Config.ROJO);
        }
        if ("Listo".equals((String) table.getValueAt(row, 4))) {
            table.setForeground(Color.WHITE);
            setBackground(Config.VERDE);
        }
        if ("Entregado".equals((String) table.getValueAt(row, 4))) {
            table.setForeground(Color.WHITE);
            setBackground(Config.VERDE);
        }

        setHorizontalAlignment(SwingConstants.CENTER);
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        return this;
    }

}
