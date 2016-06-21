package petko.osm.model.impl.simple;

import petko.osm.model.facade.OsmRelationMember;
import petko.osm.model.facade.OsmRelationMemberType;

public class OsmRelationMemberImpl implements OsmRelationMember {
	private OsmRelationMemberType type;
	private String role;
	private Long reference;

	public OsmRelationMemberImpl(OsmRelationMemberType type, String role, Long reference) {
		this.type = type;
		this.role = role;
		this.reference = reference;
	}

	@Override
	public OsmRelationMemberType getType() {
		return this.type;
	}

	@Override
	public String getRole() {
		return this.role;
	}

	@Override
	public Long getReference() {
		return this.reference;
	}
}