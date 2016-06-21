package petko.osm.model.impl.simple;

import java.util.Date;
import java.util.List;

import petko.osm.model.facade.OSMObjectType;
import petko.osm.model.facade.OsmNode;
import petko.osm.model.facade.OsmTag;

public class OsmNodeImpl extends OsmObjectImpl implements OsmNode {
	private Double lat;
	private Double lon;

	public OsmNodeImpl(Long id, List<OsmTag> tags, Long uid, String user, Long version, Long changeset, Date timestamp,
			Boolean visible, Double lon, Double lat) {
		super(id, OSMObjectType.NODE, tags, uid, user, version, changeset, timestamp, visible);
		this.lon = lon;
		this.lat = lat;
	}

	@Override
	public Double getLatitude() {
		return this.lat;
	}

	@Override
	public Double getLongitude() {
		return this.lon;
	}
}