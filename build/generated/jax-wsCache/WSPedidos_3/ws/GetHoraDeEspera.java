
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getHoraDeEspera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getHoraDeEspera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numPed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHoraDeEspera", propOrder = {
    "numPed"
})
public class GetHoraDeEspera {

    protected int numPed;

    /**
     * Obtiene el valor de la propiedad numPed.
     * 
     */
    public int getNumPed() {
        return numPed;
    }

    /**
     * Define el valor de la propiedad numPed.
     * 
     */
    public void setNumPed(int value) {
        this.numPed = value;
    }

}
