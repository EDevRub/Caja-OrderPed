
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambiarPersonal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambiarPersonal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rutPersonal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiarPersonal", propOrder = {
    "rutPersonal"
})
public class CambiarPersonal {

    protected String rutPersonal;

    /**
     * Obtiene el valor de la propiedad rutPersonal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutPersonal() {
        return rutPersonal;
    }

    /**
     * Define el valor de la propiedad rutPersonal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutPersonal(String value) {
        this.rutPersonal = value;
    }

}
