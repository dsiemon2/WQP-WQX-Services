package gov.usgs.wma.wqp.transform.intfc;

public interface ITransformer {

	void write(Object object);

	String encode(String value);

	void end();

}
