
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IngresarResponse_QNAME = new QName("http://webservice/", "ingresarResponse");
    private final static QName _MinutoRegPedResponse_QNAME = new QName("http://webservice/", "minutoRegPedResponse");
    private final static QName _ActualizarPedidoAEntregado_QNAME = new QName("http://webservice/", "actualizarPedidoAEntregado");
    private final static QName _PedidosDeHoyResponse_QNAME = new QName("http://webservice/", "pedidosDeHoyResponse");
    private final static QName _PedidosPorFecha_QNAME = new QName("http://webservice/", "pedidosPorFecha");
    private final static QName _NumTotalDePersonas_QNAME = new QName("http://webservice/", "numTotalDePersonas");
    private final static QName _CambiarEstadoPedido_QNAME = new QName("http://webservice/", "cambiarEstadoPedido");
    private final static QName _CambiarEstadoPedidoAListo_QNAME = new QName("http://webservice/", "cambiarEstadoPedidoAListo");
    private final static QName _HoraRegPedResponse_QNAME = new QName("http://webservice/", "horaRegPedResponse");
    private final static QName _Ingresar_QNAME = new QName("http://webservice/", "ingresar");
    private final static QName _HoraRegistroPedidoResponse_QNAME = new QName("http://webservice/", "horaRegistroPedidoResponse");
    private final static QName _SegundoRegPed_QNAME = new QName("http://webservice/", "segundoRegPed");
    private final static QName _TodasLasPersonasResponse_QNAME = new QName("http://webservice/", "todasLasPersonasResponse");
    private final static QName _AgregarPedido_QNAME = new QName("http://webservice/", "agregarPedido");
    private final static QName _MinutoRegPed_QNAME = new QName("http://webservice/", "minutoRegPed");
    private final static QName _IdCargoPersona_QNAME = new QName("http://webservice/", "id_CargoPersona");
    private final static QName _NumTotalDePersonasResponse_QNAME = new QName("http://webservice/", "numTotalDePersonasResponse");
    private final static QName _PedidosPorFechaResponse_QNAME = new QName("http://webservice/", "pedidosPorFechaResponse");
    private final static QName _NumCantPedidosHoyResponse_QNAME = new QName("http://webservice/", "numCantPedidosHoyResponse");
    private final static QName _HoraRegPed_QNAME = new QName("http://webservice/", "horaRegPed");
    private final static QName _NumCantPedidosHoy_QNAME = new QName("http://webservice/", "numCantPedidosHoy");
    private final static QName _TodasLasPersonas_QNAME = new QName("http://webservice/", "todasLasPersonas");
    private final static QName _IdCargoPersonaResponse_QNAME = new QName("http://webservice/", "id_CargoPersonaResponse");
    private final static QName _PedidosDeHoy_QNAME = new QName("http://webservice/", "pedidosDeHoy");
    private final static QName _TodosLosPedidosResponse_QNAME = new QName("http://webservice/", "todosLosPedidosResponse");
    private final static QName _HoraRegistroPedido_QNAME = new QName("http://webservice/", "horaRegistroPedido");
    private final static QName _TodosLosPedidos_QNAME = new QName("http://webservice/", "todosLosPedidos");
    private final static QName _SegundoRegPedResponse_QNAME = new QName("http://webservice/", "segundoRegPedResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HoraRegPed }
     * 
     */
    public HoraRegPed createHoraRegPed() {
        return new HoraRegPed();
    }

    /**
     * Create an instance of {@link NumCantPedidosHoy }
     * 
     */
    public NumCantPedidosHoy createNumCantPedidosHoy() {
        return new NumCantPedidosHoy();
    }

    /**
     * Create an instance of {@link TodasLasPersonas }
     * 
     */
    public TodasLasPersonas createTodasLasPersonas() {
        return new TodasLasPersonas();
    }

    /**
     * Create an instance of {@link IdCargoPersonaResponse }
     * 
     */
    public IdCargoPersonaResponse createIdCargoPersonaResponse() {
        return new IdCargoPersonaResponse();
    }

    /**
     * Create an instance of {@link PedidosDeHoy }
     * 
     */
    public PedidosDeHoy createPedidosDeHoy() {
        return new PedidosDeHoy();
    }

    /**
     * Create an instance of {@link TodosLosPedidos }
     * 
     */
    public TodosLosPedidos createTodosLosPedidos() {
        return new TodosLosPedidos();
    }

    /**
     * Create an instance of {@link SegundoRegPedResponse }
     * 
     */
    public SegundoRegPedResponse createSegundoRegPedResponse() {
        return new SegundoRegPedResponse();
    }

    /**
     * Create an instance of {@link TodosLosPedidosResponse }
     * 
     */
    public TodosLosPedidosResponse createTodosLosPedidosResponse() {
        return new TodosLosPedidosResponse();
    }

    /**
     * Create an instance of {@link HoraRegistroPedido }
     * 
     */
    public HoraRegistroPedido createHoraRegistroPedido() {
        return new HoraRegistroPedido();
    }

    /**
     * Create an instance of {@link HoraRegistroPedidoResponse }
     * 
     */
    public HoraRegistroPedidoResponse createHoraRegistroPedidoResponse() {
        return new HoraRegistroPedidoResponse();
    }

    /**
     * Create an instance of {@link SegundoRegPed }
     * 
     */
    public SegundoRegPed createSegundoRegPed() {
        return new SegundoRegPed();
    }

    /**
     * Create an instance of {@link TodasLasPersonasResponse }
     * 
     */
    public TodasLasPersonasResponse createTodasLasPersonasResponse() {
        return new TodasLasPersonasResponse();
    }

    /**
     * Create an instance of {@link AgregarPedido }
     * 
     */
    public AgregarPedido createAgregarPedido() {
        return new AgregarPedido();
    }

    /**
     * Create an instance of {@link MinutoRegPed }
     * 
     */
    public MinutoRegPed createMinutoRegPed() {
        return new MinutoRegPed();
    }

    /**
     * Create an instance of {@link PedidosPorFechaResponse }
     * 
     */
    public PedidosPorFechaResponse createPedidosPorFechaResponse() {
        return new PedidosPorFechaResponse();
    }

    /**
     * Create an instance of {@link IdCargoPersona }
     * 
     */
    public IdCargoPersona createIdCargoPersona() {
        return new IdCargoPersona();
    }

    /**
     * Create an instance of {@link NumTotalDePersonasResponse }
     * 
     */
    public NumTotalDePersonasResponse createNumTotalDePersonasResponse() {
        return new NumTotalDePersonasResponse();
    }

    /**
     * Create an instance of {@link NumCantPedidosHoyResponse }
     * 
     */
    public NumCantPedidosHoyResponse createNumCantPedidosHoyResponse() {
        return new NumCantPedidosHoyResponse();
    }

    /**
     * Create an instance of {@link NumTotalDePersonas }
     * 
     */
    public NumTotalDePersonas createNumTotalDePersonas() {
        return new NumTotalDePersonas();
    }

    /**
     * Create an instance of {@link PedidosDeHoyResponse }
     * 
     */
    public PedidosDeHoyResponse createPedidosDeHoyResponse() {
        return new PedidosDeHoyResponse();
    }

    /**
     * Create an instance of {@link PedidosPorFecha }
     * 
     */
    public PedidosPorFecha createPedidosPorFecha() {
        return new PedidosPorFecha();
    }

    /**
     * Create an instance of {@link CambiarEstadoPedidoAListo }
     * 
     */
    public CambiarEstadoPedidoAListo createCambiarEstadoPedidoAListo() {
        return new CambiarEstadoPedidoAListo();
    }

    /**
     * Create an instance of {@link HoraRegPedResponse }
     * 
     */
    public HoraRegPedResponse createHoraRegPedResponse() {
        return new HoraRegPedResponse();
    }

    /**
     * Create an instance of {@link CambiarEstadoPedido }
     * 
     */
    public CambiarEstadoPedido createCambiarEstadoPedido() {
        return new CambiarEstadoPedido();
    }

    /**
     * Create an instance of {@link Ingresar }
     * 
     */
    public Ingresar createIngresar() {
        return new Ingresar();
    }

    /**
     * Create an instance of {@link IngresarResponse }
     * 
     */
    public IngresarResponse createIngresarResponse() {
        return new IngresarResponse();
    }

    /**
     * Create an instance of {@link MinutoRegPedResponse }
     * 
     */
    public MinutoRegPedResponse createMinutoRegPedResponse() {
        return new MinutoRegPedResponse();
    }

    /**
     * Create an instance of {@link ActualizarPedidoAEntregado }
     * 
     */
    public ActualizarPedidoAEntregado createActualizarPedidoAEntregado() {
        return new ActualizarPedidoAEntregado();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ingresarResponse")
    public JAXBElement<IngresarResponse> createIngresarResponse(IngresarResponse value) {
        return new JAXBElement<IngresarResponse>(_IngresarResponse_QNAME, IngresarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinutoRegPedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "minutoRegPedResponse")
    public JAXBElement<MinutoRegPedResponse> createMinutoRegPedResponse(MinutoRegPedResponse value) {
        return new JAXBElement<MinutoRegPedResponse>(_MinutoRegPedResponse_QNAME, MinutoRegPedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPedidoAEntregado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "actualizarPedidoAEntregado")
    public JAXBElement<ActualizarPedidoAEntregado> createActualizarPedidoAEntregado(ActualizarPedidoAEntregado value) {
        return new JAXBElement<ActualizarPedidoAEntregado>(_ActualizarPedidoAEntregado_QNAME, ActualizarPedidoAEntregado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidosDeHoyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pedidosDeHoyResponse")
    public JAXBElement<PedidosDeHoyResponse> createPedidosDeHoyResponse(PedidosDeHoyResponse value) {
        return new JAXBElement<PedidosDeHoyResponse>(_PedidosDeHoyResponse_QNAME, PedidosDeHoyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidosPorFecha }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pedidosPorFecha")
    public JAXBElement<PedidosPorFecha> createPedidosPorFecha(PedidosPorFecha value) {
        return new JAXBElement<PedidosPorFecha>(_PedidosPorFecha_QNAME, PedidosPorFecha.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumTotalDePersonas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "numTotalDePersonas")
    public JAXBElement<NumTotalDePersonas> createNumTotalDePersonas(NumTotalDePersonas value) {
        return new JAXBElement<NumTotalDePersonas>(_NumTotalDePersonas_QNAME, NumTotalDePersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cambiarEstadoPedido")
    public JAXBElement<CambiarEstadoPedido> createCambiarEstadoPedido(CambiarEstadoPedido value) {
        return new JAXBElement<CambiarEstadoPedido>(_CambiarEstadoPedido_QNAME, CambiarEstadoPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoPedidoAListo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cambiarEstadoPedidoAListo")
    public JAXBElement<CambiarEstadoPedidoAListo> createCambiarEstadoPedidoAListo(CambiarEstadoPedidoAListo value) {
        return new JAXBElement<CambiarEstadoPedidoAListo>(_CambiarEstadoPedidoAListo_QNAME, CambiarEstadoPedidoAListo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoraRegPedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "horaRegPedResponse")
    public JAXBElement<HoraRegPedResponse> createHoraRegPedResponse(HoraRegPedResponse value) {
        return new JAXBElement<HoraRegPedResponse>(_HoraRegPedResponse_QNAME, HoraRegPedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ingresar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ingresar")
    public JAXBElement<Ingresar> createIngresar(Ingresar value) {
        return new JAXBElement<Ingresar>(_Ingresar_QNAME, Ingresar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoraRegistroPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "horaRegistroPedidoResponse")
    public JAXBElement<HoraRegistroPedidoResponse> createHoraRegistroPedidoResponse(HoraRegistroPedidoResponse value) {
        return new JAXBElement<HoraRegistroPedidoResponse>(_HoraRegistroPedidoResponse_QNAME, HoraRegistroPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegundoRegPed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "segundoRegPed")
    public JAXBElement<SegundoRegPed> createSegundoRegPed(SegundoRegPed value) {
        return new JAXBElement<SegundoRegPed>(_SegundoRegPed_QNAME, SegundoRegPed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodasLasPersonasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "todasLasPersonasResponse")
    public JAXBElement<TodasLasPersonasResponse> createTodasLasPersonasResponse(TodasLasPersonasResponse value) {
        return new JAXBElement<TodasLasPersonasResponse>(_TodasLasPersonasResponse_QNAME, TodasLasPersonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "agregarPedido")
    public JAXBElement<AgregarPedido> createAgregarPedido(AgregarPedido value) {
        return new JAXBElement<AgregarPedido>(_AgregarPedido_QNAME, AgregarPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinutoRegPed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "minutoRegPed")
    public JAXBElement<MinutoRegPed> createMinutoRegPed(MinutoRegPed value) {
        return new JAXBElement<MinutoRegPed>(_MinutoRegPed_QNAME, MinutoRegPed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdCargoPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "id_CargoPersona")
    public JAXBElement<IdCargoPersona> createIdCargoPersona(IdCargoPersona value) {
        return new JAXBElement<IdCargoPersona>(_IdCargoPersona_QNAME, IdCargoPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumTotalDePersonasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "numTotalDePersonasResponse")
    public JAXBElement<NumTotalDePersonasResponse> createNumTotalDePersonasResponse(NumTotalDePersonasResponse value) {
        return new JAXBElement<NumTotalDePersonasResponse>(_NumTotalDePersonasResponse_QNAME, NumTotalDePersonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidosPorFechaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pedidosPorFechaResponse")
    public JAXBElement<PedidosPorFechaResponse> createPedidosPorFechaResponse(PedidosPorFechaResponse value) {
        return new JAXBElement<PedidosPorFechaResponse>(_PedidosPorFechaResponse_QNAME, PedidosPorFechaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumCantPedidosHoyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "numCantPedidosHoyResponse")
    public JAXBElement<NumCantPedidosHoyResponse> createNumCantPedidosHoyResponse(NumCantPedidosHoyResponse value) {
        return new JAXBElement<NumCantPedidosHoyResponse>(_NumCantPedidosHoyResponse_QNAME, NumCantPedidosHoyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoraRegPed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "horaRegPed")
    public JAXBElement<HoraRegPed> createHoraRegPed(HoraRegPed value) {
        return new JAXBElement<HoraRegPed>(_HoraRegPed_QNAME, HoraRegPed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumCantPedidosHoy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "numCantPedidosHoy")
    public JAXBElement<NumCantPedidosHoy> createNumCantPedidosHoy(NumCantPedidosHoy value) {
        return new JAXBElement<NumCantPedidosHoy>(_NumCantPedidosHoy_QNAME, NumCantPedidosHoy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodasLasPersonas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "todasLasPersonas")
    public JAXBElement<TodasLasPersonas> createTodasLasPersonas(TodasLasPersonas value) {
        return new JAXBElement<TodasLasPersonas>(_TodasLasPersonas_QNAME, TodasLasPersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdCargoPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "id_CargoPersonaResponse")
    public JAXBElement<IdCargoPersonaResponse> createIdCargoPersonaResponse(IdCargoPersonaResponse value) {
        return new JAXBElement<IdCargoPersonaResponse>(_IdCargoPersonaResponse_QNAME, IdCargoPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidosDeHoy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pedidosDeHoy")
    public JAXBElement<PedidosDeHoy> createPedidosDeHoy(PedidosDeHoy value) {
        return new JAXBElement<PedidosDeHoy>(_PedidosDeHoy_QNAME, PedidosDeHoy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosLosPedidosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "todosLosPedidosResponse")
    public JAXBElement<TodosLosPedidosResponse> createTodosLosPedidosResponse(TodosLosPedidosResponse value) {
        return new JAXBElement<TodosLosPedidosResponse>(_TodosLosPedidosResponse_QNAME, TodosLosPedidosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoraRegistroPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "horaRegistroPedido")
    public JAXBElement<HoraRegistroPedido> createHoraRegistroPedido(HoraRegistroPedido value) {
        return new JAXBElement<HoraRegistroPedido>(_HoraRegistroPedido_QNAME, HoraRegistroPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosLosPedidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "todosLosPedidos")
    public JAXBElement<TodosLosPedidos> createTodosLosPedidos(TodosLosPedidos value) {
        return new JAXBElement<TodosLosPedidos>(_TodosLosPedidos_QNAME, TodosLosPedidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegundoRegPedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "segundoRegPedResponse")
    public JAXBElement<SegundoRegPedResponse> createSegundoRegPedResponse(SegundoRegPedResponse value) {
        return new JAXBElement<SegundoRegPedResponse>(_SegundoRegPedResponse_QNAME, SegundoRegPedResponse.class, null, value);
    }

}
