//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.14 at 01:52:08 PM MESZ 
//


package petko.osm.model.impl.xml;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import petko.osm.model.facade.OsmRelationMember;
import petko.osm.model.facade.OsmRelationMemberType;

/**
 * <p>Java class for member complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="member">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" type="{}memberType" />
 *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="role" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "member")
public class OsmRelationMemberXml implements OsmRelationMember {
    @XmlAttribute(name = "type")
	private OsmMemberXmlType type;
    @XmlAttribute(name = "ref", required = true)
	private Long ref;
    @XmlAttribute(name = "role", required = true)
	private String role;

	public OsmRelationMemberXml() {
	}

	public OsmRelationMemberXml(OsmMemberXmlType type, Long ref, String role) {
		this.type = type;
		this.ref = ref;
		this.role = role;
	}

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OsmMemberXmlType }
     *     
     */
	public OsmMemberXmlType getTypeXml() {
        return type;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
	public Long getRef() {
        return ref;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getRole() {
        return role;
    }

	@Override
	public OsmRelationMemberType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getReference() {
		// TODO Auto-generated method stub
		return null;
	}
}