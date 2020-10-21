
package ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSPedidos", targetNamespace = "http://webservice/", wsdlLocation = "http://localhost:8080/ProyectoT/WSPedidos?WSDL")
public class WSPedidos_Service
    extends Service
{

    private final static URL WSPEDIDOS_WSDL_LOCATION;
    private final static WebServiceException WSPEDIDOS_EXCEPTION;
    private final static QName WSPEDIDOS_QNAME = new QName("http://webservice/", "WSPedidos");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ProyectoT/WSPedidos?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSPEDIDOS_WSDL_LOCATION = url;
        WSPEDIDOS_EXCEPTION = e;
    }

    public WSPedidos_Service() {
        super(__getWsdlLocation(), WSPEDIDOS_QNAME);
    }

    public WSPedidos_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSPEDIDOS_QNAME, features);
    }

    public WSPedidos_Service(URL wsdlLocation) {
        super(wsdlLocation, WSPEDIDOS_QNAME);
    }

    public WSPedidos_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSPEDIDOS_QNAME, features);
    }

    public WSPedidos_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSPedidos_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSPedidos
     */
    @WebEndpoint(name = "WSPedidosPort")
    public WSPedidos getWSPedidosPort() {
        return super.getPort(new QName("http://webservice/", "WSPedidosPort"), WSPedidos.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSPedidos
     */
    @WebEndpoint(name = "WSPedidosPort")
    public WSPedidos getWSPedidosPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "WSPedidosPort"), WSPedidos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSPEDIDOS_EXCEPTION!= null) {
            throw WSPEDIDOS_EXCEPTION;
        }
        return WSPEDIDOS_WSDL_LOCATION;
    }

}
