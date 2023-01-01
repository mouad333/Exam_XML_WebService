package QuestionC;

import QuestionB.Releve;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlTransient;
import java.io.File;

@WebService(serviceName = "ReleveWS")
public class ReleveWS {
        @WebMethod
        @XmlTransient
        public Releve getReleve() throws JAXBException {
            JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
            return releve;
        }

}
