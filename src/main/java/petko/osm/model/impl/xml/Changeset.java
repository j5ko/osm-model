package petko.osm.model.impl.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import petko.osm.model.facade.OsmTag;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeset")
@XmlRootElement(name = "changeset")
@XmlSeeAlso(OsmTagXml.class)
public class Changeset {
	@XmlElement(name = "tag", type = OsmTagXml.class)
	private List<OsmTag> tags = new ArrayList<>();
	@XmlElement(name = "discussion")
	private Discussion discussion;
	@XmlAttribute
	private long id;
	@XmlAttribute
	private String user;
	@XmlAttribute
	private Long uid;
	@XmlAttribute
	private boolean open;
	@XmlAttribute(name = "min_lon")
	private float minLon;
	@XmlAttribute(name = "max_lon")
	private float maxLon;
	@XmlAttribute(name = "min_lat")
	private float minLat;
	@XmlAttribute(name = "max_lat")
	private float maxLat;
	@XmlAttribute(name = "created_at", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar createdAt;
	@XmlAttribute(name = "closed_at")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar closedAt;

	public XMLGregorianCalendar getClosedAt() {
		return closedAt;
	}

	public void setClosedAt(XMLGregorianCalendar closedAt) {
		this.closedAt = closedAt;
	}

	public long getId() {
		return id;
	}

	public String getUser() {
		return user;
	}

	public Long getUid() {
		return uid;
	}

	public boolean isOpen() {
		return open;
	}

	public float getMinLon() {
		return minLon;
	}

	public float getMaxLon() {
		return maxLon;
	}

	public float getMinLat() {
		return minLat;
	}

	public float getMaxLat() {
		return maxLat;
	}

	public XMLGregorianCalendar getCreatedAt() {
		return createdAt;
	}

	public Discussion getDiscussion() {
		return discussion;
	}

	public void setDiscussion(Discussion discussion) {
		this.discussion = discussion;
	}

	public List<OsmTag> getTags() {
		return tags;
	}
}