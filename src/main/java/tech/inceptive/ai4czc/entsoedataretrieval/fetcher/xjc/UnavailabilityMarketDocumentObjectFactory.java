//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.20 at 03:22:32 PM UTC 
//


package tech.inceptive.ai4czc.entsoedataretrieval.fetcher.xjc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tech.inceptive.ai4czc.entsoedataretrieval.fetcher.xjc package. 
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
public class UnavailabilityMarketDocumentObjectFactory {

    private final static QName _UnavailabilityMarketDocument_QNAME = new QName("urn:iec62325.351:tc57wg16:451-6:outagedocument:3:0", "Unavailability_MarketDocument");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tech.inceptive.ai4czc.entsoedataretrieval.fetcher.xjc
     * 
     */
    public UnavailabilityMarketDocumentObjectFactory() {
    }

    /**
     * Create an instance of {@link UnavailabilityMarketDocument }
     * 
     */
    public UnavailabilityMarketDocument createUnavailabilityMarketDocument() {
        return new UnavailabilityMarketDocument();
    }

    /**
     * Create an instance of {@link ResourceIDString }
     * 
     */
    public ResourceIDString createResourceIDString() {
        return new ResourceIDString();
    }

    /**
     * Create an instance of {@link AssetRegisteredResource }
     * 
     */
    public AssetRegisteredResource createAssetRegisteredResource() {
        return new AssetRegisteredResource();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link Reason }
     * 
     */
    public Reason createReason() {
        return new Reason();
    }

    /**
     * Create an instance of {@link ESMPDateTimeInterval }
     * 
     */
    public ESMPDateTimeInterval createESMPDateTimeInterval() {
        return new ESMPDateTimeInterval();
    }

    /**
     * Create an instance of {@link SeriesPeriod }
     * 
     */
    public SeriesPeriod createSeriesPeriod() {
        return new SeriesPeriod();
    }

    /**
     * Create an instance of {@link AreaIDString }
     * 
     */
    public AreaIDString createAreaIDString() {
        return new AreaIDString();
    }

    /**
     * Create an instance of {@link ESMPActivePower }
     * 
     */
    public ESMPActivePower createESMPActivePower() {
        return new ESMPActivePower();
    }

    /**
     * Create an instance of {@link TimeSeries }
     * 
     */
    public TimeSeries createTimeSeries() {
        return new TimeSeries();
    }

    /**
     * Create an instance of {@link PartyIDString }
     * 
     */
    public PartyIDString createPartyIDString() {
        return new PartyIDString();
    }

    /**
     * Create an instance of {@link ActionStatus }
     * 
     */
    public ActionStatus createActionStatus() {
        return new ActionStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnavailabilityMarketDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnavailabilityMarketDocument }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iec62325.351:tc57wg16:451-6:outagedocument:3:0", name = "Unavailability_MarketDocument")
    public JAXBElement<UnavailabilityMarketDocument> createUnavailabilityMarketDocument(UnavailabilityMarketDocument value) {
        return new JAXBElement<UnavailabilityMarketDocument>(_UnavailabilityMarketDocument_QNAME, UnavailabilityMarketDocument.class, null, value);
    }

}
