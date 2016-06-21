package petko.osm.model.facade;

public interface OsmRelationMember {

	public OsmRelationMemberType getType();

	public String getRole();

	public Long getReference();
}