package petko.osm.model.impl.simple;

import java.util.Date;
import java.util.List;

import petko.osm.model.facade.OSMObjectType;
import petko.osm.model.facade.OsmRelation;
import petko.osm.model.facade.OsmRelationMember;
import petko.osm.model.facade.OsmTag;

public class OsmRelationImpl extends OsmObjectImpl implements OsmRelation {
	private List<OsmRelationMember> members;

	public OsmRelationImpl(Long id, List<OsmTag> tags, Long uid, String user, Long version, Long changeset,
			Date timestamp, Boolean visible, List<OsmRelationMember> members) {
		super(id, OSMObjectType.RELATION, tags, uid, user, version, changeset, timestamp, visible);
		this.members = members;
	}

	@Override
	public List<OsmRelationMember> getMembers() {
		return this.members;
	}
}