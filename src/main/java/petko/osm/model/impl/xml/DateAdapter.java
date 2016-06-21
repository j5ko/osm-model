package petko.osm.model.impl.xml;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

	@Override
	public String marshal(Date date) throws Exception {
		return date == null ? null : dateFormat.format(date);
	}

	@Override
	public Date unmarshal(String dateStr) throws Exception {
		return dateStr == null ? null : dateFormat.parse(dateStr);
	}

}