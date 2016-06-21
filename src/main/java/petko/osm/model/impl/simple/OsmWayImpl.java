package petko.osm.model.impl.simple;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import petko.osm.model.facade.OSMObjectType;
import petko.osm.model.facade.OsmNode;
import petko.osm.model.facade.OsmTag;
import petko.osm.model.facade.OsmWay;

public class OsmWayImpl extends OsmObjectImpl implements OsmWay {
	private List<OsmNode> nodes = new ArrayList<>();

	public OsmWayImpl(Long id, List<OsmTag> tags, Long uid, String user, Long version, Long changeset, Date timestamp,
			Boolean visible, List<OsmNode> nodes) {
		super(id, OSMObjectType.WAY, tags, uid, user, version, changeset, timestamp, visible);
		if (nodes != null) {
			this.nodes = nodes;
		}
	}

	@Override
	public List<OsmNode> getNodes() {
		return this.nodes;
	}
}