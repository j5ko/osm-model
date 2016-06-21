package petko.osm.model.impl.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import petko.osm.model.facade.OsmNode;
import petko.osm.model.facade.OsmRelation;
import petko.osm.model.facade.OsmRelationMember;
import petko.osm.model.facade.OsmTag;
import petko.osm.model.facade.OsmWay;

public class OsmObjectFactoryXml {

	public static OsmNodeXml createNodeXml(OsmNode node) throws DatatypeConfigurationException {
		return new OsmNodeXml(node);
	}

	public static OsmWayXml createWayXml(OsmWay way) throws DatatypeConfigurationException {
		return new OsmWayXml(way);
	}

	public static OsmDataStoreSimpleXml createDataStoreSimple(List<OsmNode> nodes, List<OsmWay> ways,
			List<OsmRelation> relations) throws DatatypeConfigurationException {
		List<OsmNodeXml> xmlNodes = toXmlNodes(nodes);
		List<OsmWayXml> xmlWays = toXmlWays(ways);
		List<OsmRelationXml> xmlRelations = toXmlRelations(relations);
		OsmDataStoreSimpleXml osmDatastoreXml = new OsmDataStoreSimpleXml();
		osmDatastoreXml.getNodes().addAll(xmlNodes);
		osmDatastoreXml.getWays().addAll(xmlWays);
		osmDatastoreXml.getRelations().addAll(xmlRelations);
		return osmDatastoreXml;
	}

	public static OsmDataStoreXml createDataStore(List<OsmNode> nodes, List<OsmWay> ways, List<OsmRelation> relations)
			throws DatatypeConfigurationException {
		List<OsmNodeXml> xmlNodes = toXmlNodes(nodes);
		List<OsmWayXml> xmlWays = toXmlWays(ways);
		List<OsmRelationXml> xmlRelations = toXmlRelations(relations);
		OsmDataStoreXml osmDatastoreXml = new OsmDataStoreXml();
		osmDatastoreXml.getNodes().addAll(xmlNodes);
		osmDatastoreXml.getWays().addAll(xmlWays);
		osmDatastoreXml.getRelations().addAll(xmlRelations);
		return osmDatastoreXml;
	}

	private static List<OsmRelationXml> toXmlRelations(List<OsmRelation> relations) {
		if (relations != null) {
			ArrayList<OsmRelationXml> res = new ArrayList<>();
			for (OsmRelation osmRel : relations) {
				res.add(createRelXml(osmRel));
			}
			return res;
		}
		return null;
	}

	private static OsmRelationXml createRelXml(OsmRelation osmRel) {
		OsmRelationXml relXml = new OsmRelationXml();
		List<OsmRelationMember> members = osmRel.getMembers();
		if (members != null) {
			for (OsmRelationMember osmRelMember : members) {
				OsmMemberXmlType type = OsmMemberXmlType.valueOf(osmRelMember.getType().toString());
				Long ref = osmRelMember.getReference();
				String role = osmRelMember.getRole();
				OsmRelationMemberXml relMemberXml = new OsmRelationMemberXml(type, ref, role);
				relXml.getMembers().add(relMemberXml);
			}
		}
		return relXml;
	}

	private static List<OsmWayXml> toXmlWays(List<OsmWay> ways) throws DatatypeConfigurationException {
		if (ways != null) {
			ArrayList<OsmWayXml> res = new ArrayList<>();
			for (OsmWay osmWay : ways) {
				res.add(createWayXml(osmWay));
			}
			return res;
		}
		return null;
	}

	private static List<OsmNodeXml> toXmlNodes(List<OsmNode> nodes) throws DatatypeConfigurationException {
		if (nodes != null) {
			ArrayList<OsmNodeXml> res = new ArrayList<>();
			for (OsmNode osmNode : nodes) {
				res.add(new OsmNodeXml(osmNode));
			}
			return res;
		}
		return null;
	}

	public static Changeset createChangeSet(List<OsmTag> changesetTags) {
		Changeset cs = new Changeset();
		if (changesetTags != null) {
			cs.getTags().addAll(changesetTags);
		}
		return cs;
	}

	public static OsmTagXml createTag(String key, String value) {
		return new OsmTagXml(key, value);
	}
}