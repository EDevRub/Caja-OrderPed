package model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import ws.PersonaSelect;
import ws.WSPedidos;
import ws.WSPedidos_Service;

/**
 *
 * @author Eduardo Rubio
 */
public class TMPersonalDeTrabajo implements TableModel {

    private List<PersonaSelect> listaDePersonal;
    private WSPedidos_Service pws;
    private WSPedidos pws_interfaz;

    public TMPersonalDeTrabajo(List<PersonaSelect> listaDePersonal, WSPedidos_Service pws, WSPedidos pws_interfaz) {
        this.listaDePersonal = listaDePersonal;
        this.pws = pws;
        this.pws_interfaz = pws_interfaz;
    }

    public PersonaSelect getPersonalTrabajo(int index) {
        return listaDePersonal.get(index);
    }

    @Override
    public int getRowCount() {
        return listaDePersonal.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "RUT";
            case 1:
                return "Nombre";
            default:
                return "Cargo";
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
        PersonaSelect ps = listaDePersonal.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return ps.getRut();
            case 1:
                return ps.getNombre();
            default:
                return ps.getCargo();
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
