//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.14 at 01:52:08 PM MESZ 
//

package petko.osm.model.impl.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.DatatypeConfigurationException;

import petko.osm.model.facade.OsmNode;
import petko.osm.model.facade.OsmWay;

/**
 * <p>
 * Java class for way complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="way">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nd" type="{}nd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tag" type="{}tag" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="uid" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="changeset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "way")
@XmlRootElement(name = "way")
public class OsmWayXml extends OsmObjectXml implements OsmWay {
	@XmlElement(name = "nd", type = OsmNodeRefXml.class)
	protected List<OsmNodeRefXml> nodeReferences = new ArrayList<>();

	public OsmWayXml() {
	}

	public OsmWayXml(OsmWay way) throws DatatypeConfigurationException {
		super(way);
		takeNodes(way);
	}

	private void takeNodes(OsmWay way) throws DatatypeConfigurationException {
		for (OsmNode osmNode : way.getNodes()) {
			OsmNodeXml newNode = new OsmNodeXml(osmNode);
			nodeReferences.add(new OsmNodeRefXml(newNode));
		}
	}

	@Override
	public List<OsmNode> getNodes() {
		List<OsmNode> res = new ArrayList<>();
		for (OsmNode osmNode : this.nodeReferences) {
			res.add(new OsmNodeRefXml(osmNode));
		}
		return res;
	}
}