package petko.osm.model.impl.simple;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import petko.osm.model.facade.OSMObjectType;
import petko.osm.model.facade.OsmObject;
import petko.osm.model.facade.OsmTag;

public class OsmObjectImpl implements OsmObject {
	private Long id;
	private OSMObjectType objType;
	private List<OsmTag> tags = new ArrayList<>();
	private Long uid;
	private String user;
	private Long version;
	private Long changeset;
	private Date timestamp;
	private Boolean visible;

	public OsmObjectImpl(Long id, OSMObjectType ot, List<OsmTag> tags, Long uid, String user, Long version,
			Long changeset, Date timestamp, Boolean visible) {
		this.id = id;
		this.objType = ot;
		if (tags != null) {
			this.tags = tags;
		}
		this.uid = uid;
		this.user = user;
		this.version = version;
		this.changeset = changeset;
		this.timestamp = timestamp;
		this.visible = visible;
	}

	public OSMObjectType getObjType() {
		return objType;
	}

	public void setObjType(OSMObjectType objType) {
		this.objType = objType;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTags(List<OsmTag> tags) {
		this.tags = tags;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public void setChangeset(Long changeset) {
		this.changeset = changeset;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public OSMObjectType getType() {
		return this.objType;
	}

	@Override
	public String getTagValue(String tagName) {
		for (OsmTag osmTag : tags) {
			if (tagName.equals(osmTag.getKey())) {
				return osmTag.getValue();
			}
		}
		return null;
	}

	@Override
	public List<OsmTag> getTags() {
		return this.tags;
	}

	@Override
	public Long getUid() {
		return this.uid;
	}

	@Override
	public String getUser() {
		return this.user;
	}

	@Override
	public Boolean isVisible() {
		return this.visible;
	}

	@Override
	public Long getVersion() {
		return this.version;
	}

	@Override
	public Long getChangeset() {
		return this.changeset;
	}

	@Override
	public Date getTimestamp() {
		return this.timestamp;
	}
}