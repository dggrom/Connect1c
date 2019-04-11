
package wsdemo.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-hudson-53-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "\u0414\u0430\u043d\u043d\u044b\u0435\u041d\u043e\u043c\u0435\u043d\u043a\u043b\u0430\u0442\u0443\u0440\u044b", targetNamespace = "http://www.1c.ru/demos/products", wsdlLocation = "http://users.v8.1c.ru/ws/products.1cws?wsdl")
public class ������������������
    extends Service
{

    private final static URL ������������������_WSDL_LOCATION;
    //�������� �����������
	private final static Logger logger = Logger.getLogger(wsdemo.client.������������������.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
			//��������� ����� ������� ".class.getResource(", �� ����� ���� ������ �� �����
            baseUrl = wsdemo.client.������������������.class.getResource(".");
			// ������ ���
            url = new URL(baseUrl, "http://users.v8.1c.ru/ws/products.1cws?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: http://users.v8.1c.ru/ws/products.1cws?wsdl");
            logger.warning(e.getMessage());
        }
		//��������� ���������
        ������������������_WSDL_LOCATION = url;
    }

    public ������������������(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ������������������() {
        super(������������������_WSDL_LOCATION, new QName("http://www.1c.ru/demos/products", "������������������"));
    }

    /**
     * 
     * @return
     *     returns ������������������PortType
     */
    @WebEndpoint(name = "\u0414\u0430\u043d\u043d\u044b\u0435\u041d\u043e\u043c\u0435\u043d\u043a\u043b\u0430\u0442\u0443\u0440\u044bSoap")
    public ������������������PortType get������������������Soap() {
        return super.getPort(new QName("http://www.1c.ru/demos/products", "������������������Soap"), ������������������PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ������������������PortType
     */
    @WebEndpoint(name = "\u0414\u0430\u043d\u043d\u044b\u0435\u041d\u043e\u043c\u0435\u043d\u043a\u043b\u0430\u0442\u0443\u0440\u044bSoap")
    public ������������������PortType get������������������Soap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.1c.ru/demos/products", "������������������Soap"), ������������������PortType.class, features);
    }

    /**
     * 
     * @return
     *     returns ������������������PortType
     */
    @WebEndpoint(name = "\u0414\u0430\u043d\u043d\u044b\u0435\u041d\u043e\u043c\u0435\u043d\u043a\u043b\u0430\u0442\u0443\u0440\u044bSoap12")
    public ������������������PortType get������������������Soap12() {
        return super.getPort(new QName("http://www.1c.ru/demos/products", "������������������Soap12"), ������������������PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ������������������PortType
     */
    @WebEndpoint(name = "\u0414\u0430\u043d\u043d\u044b\u0435\u041d\u043e\u043c\u0435\u043d\u043a\u043b\u0430\u0442\u0443\u0440\u044bSoap12")
    public ������������������PortType get������������������Soap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.1c.ru/demos/products", "������������������Soap12"), ������������������PortType.class, features);
    }

}
