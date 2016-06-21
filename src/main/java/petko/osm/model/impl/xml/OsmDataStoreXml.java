package petko.osm.model.impl.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "osm")
@XmlRootElement(name = "osm")
public class OsmDataStoreXml extends OsmDataStoreSimpleXml {
	@XmlAttribute(name = "version", required = true)
	private Float version;
	@XmlAttribute(name = "generator", required = true)
	private String generator;
	@XmlAttribute(name = "copyright", required = true)
	private String copyright;
	@XmlAttribute(name = "generator", required = true)
	private String attribution;
	@XmlAttribute(name = "license", required = true)
	private String license;

	public OsmDataStoreXml() {
	}

	public OsmDataStoreXml(Float version, String generator, String copyright, String attribution, String license) {
		init(version, generator, copyright, attribution, license);
	}

	public void init(Float version, String generator, String copyright, String attribution, String license) {
		this.version = version;
		this.generator = generator;
		this.copyright = copyright;
		this.attribution = attribution;
		this.license = license;
	}
}