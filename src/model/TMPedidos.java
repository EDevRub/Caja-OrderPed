package model;

import java.util.Calendar;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import ws.Pedido;
import ws.WSPedidos;
import ws.WSPedidos_Service;

/**
 *
 * @author Edunaldo
 */
public class TMPedidos implements TableModel {

    private List<Pedido> listaPed;
    private WSPedidos_Service pws;
    private WSPedidos pws_interfaz;
    
    Calendar c = Calendar.getInstance();
    int dia = c.get(Calendar.DATE);
    String dia2 = (dia <= 9 ? "0" + dia : Integer.toString(dia));
    int mes = c.get(Calendar.MONTH) + 1;
    String mes2 = (mes <= 9 ? "0" + mes : Integer.toString(mes));
    int anio = c.get(Calendar.YEAR);
    
    String fecha = dia2 + "-" + mes2 + "-" + anio;

    public TMPedidos(List<Pedido> listaPed) {
        this.listaPed = listaPed;
        pws = new WSPedidos_Service();
        pws_interfaz = pws.getWSPedidosPort();
    }

    public Pedido getPedidos(int index) {
        return listaPed.get(index);
    }

    @Override
    public int getRowCount() {
        return listaPed.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "N° Pedido";
            case 1:
                return "Rut";
            case 2:
                return "Nombre";
            case 3:
                return "Fecha";
            default:
                return "Estado";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Pedido pe = listaPed.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return pe.getId();
            case 1:
                return pe.getRutPersona();
            case 2:
                return pe.getNomPersona();
            case 3:
                return fecha;
            default:
                return pe.getEstado();
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

}
