/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import ws.HistorialPedidos;
import ws.WSPedidos;
import ws.WSPedidos_Service;

/**
 *
 * @author Eduardo Rubio
 */
public class TMHistorial implements TableModel {

    private List<HistorialPedidos> listaHistoriaPedidos;
    private WSPedidos_Service pws;
    private WSPedidos pws_interfaz;

    public TMHistorial(List<HistorialPedidos> listaHistoriaPedidos) {
        this.listaHistoriaPedidos = listaHistoriaPedidos;
        pws = new WSPedidos_Service();
        pws_interfaz = pws.getWSPedidosPort();
    }

    public HistorialPedidos getHistorialDePedidos(int index) {
        return listaHistoriaPedidos.get(index);
    }

    @Override
    public int getRowCount() {
        return listaHistoriaPedidos.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
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
            case 4:
                return "Tiempo De Espera";
            default:
                return "Tiempo Estimado";
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
        HistorialPedidos hp = listaHistoriaPedidos.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return hp.getNumPed();
            case 1:
                return hp.getRutPersona();
            case 2:
                return hp.getNomPersona();
            case 3: {
                SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd h:m:s.S");
                String strFecha = hp.getFecha();
                Date fecha = null;
                try {
                    fecha = formatoDelTexto.parse(strFecha);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                //System.out.println(fecha.toString());
                SimpleDateFormat formatoCrack = new SimpleDateFormat("E. d MMM. y H:m");
                String fechaTextoasa = formatoCrack.format(fecha);

                return fechaTextoasa.toString() + " hrs";
            }
            case 4: {
                int hora = hp.getHoraDeEspera();
                int min = hp.getMinDeEspera();
                int seg = hp.getSegDeEspera();
                String hora2 = (hora <= 9 ? "0" + hora : Integer.toString(hora));
                String min2 = (min <= 9 ? "0" + min : Integer.toString(min));
                String seg2 = (seg <= 9 ? "0" + seg : Integer.toString(seg));
                return hora2 + ":" + min2 + ":" + seg2;
            }
            default:
                return hp.getIdTiempoEstimado()+" Min";
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
