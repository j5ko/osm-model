package petko.osm.model.impl.simple;

import petko.osm.model.facade.OSMObjectType;
import petko.osm.model.facade.OsmNode;

public class OsmNodeRef extends OsmObjectImpl implements OsmNode {

	public OsmNodeRef(Long id) {
		super(id, OSMObjectType.NODE, null, null, null, null, null, null, null);
	}

	@Override
	public Double getLatitude() {
		return null;
	}

	@Override
	public Double getLongitude() {
		return null;
	}
}