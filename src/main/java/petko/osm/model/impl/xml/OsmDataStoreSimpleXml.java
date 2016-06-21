package petko.osm.model.impl.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import petko.osm.model.facade.OsmDataStore;
import petko.osm.model.facade.OsmNode;
import petko.osm.model.facade.OsmRelation;
import petko.osm.model.facade.OsmWay;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "osmSimple")
@XmlRootElement(name = "osm")
@XmlSeeAlso({ OsmNodeXml.class, OsmWayXml.class, OsmRelationXml.class, OsmTagXml.class })
public class OsmDataStoreSimpleXml implements OsmDataStore {
	@XmlElement(name = "node", type = OsmNodeXml.class)
	private List<OsmNode> nodes = new ArrayList<>();
	@XmlElement(name = "way", type = OsmWayXml.class)
	private List<OsmWay> ways = new ArrayList<>();
	@XmlElement(name = "relation", type = OsmRelationXml.class)
	private List<OsmRelation> relations = new ArrayList<>();
	@XmlElement(name = "changeset")
	private Changeset changeSet;

	@Override
	public List<OsmNode> getNodes() {
		return nodes;
	}

	@Override
	public List<OsmWay> getWays() {
		return ways;
	}

	@Override
	public List<OsmRelation> getRelations() {
		return relations;
	}

	public Changeset getChangeSet() {
		return changeSet;
	}

	public void setChangeSet(Changeset changeSet) {
		this.changeSet = changeSet;
	}
}