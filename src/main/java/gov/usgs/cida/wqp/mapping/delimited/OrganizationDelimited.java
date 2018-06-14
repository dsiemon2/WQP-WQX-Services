package gov.usgs.cida.wqp.mapping.delimited;

import static gov.usgs.cida.wqp.mapping.BaseColumn.*;
import static gov.usgs.cida.wqp.mapping.OrganizationColumn.*;
import static gov.usgs.cida.wqp.mapping.xml.BaseWqx.*;

import java.util.LinkedHashMap;
import java.util.Map;

import gov.usgs.cida.wqp.mapping.ColumnProfile;
import gov.usgs.cida.wqp.mapping.Profile;

public class OrganizationDelimited extends BaseDelimited {

	public static final String VAL_1 = "_1";
	public static final String VAL_2 = "_2";
	public static final String VAL_3 = "_3";

	//Column Headings for the Keys
	public static final String VALUE_ORGANIZATION_DESCRIPTION_TEXT = WQX_ORGANIZATION_DESCRIPTION_TEXT;
	public static final String VALUE_TRIBAL_CODE = WQX_TRIBAL_CODE;
	public static final String VALUE_ELECTRONIC_ADDRESS = WQX_ELECTRONIC_ADDRESS;
	public static final String VALUE_TELEPHONIC = WQX_TELEPHONIC;

	public static final String VALUE_ADDRESS_TYPE_NAME_1 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_ADDRESS_TYPE_NAME + VAL_1;
	public static final String VALUE_ADDRESS_TEXT_1 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_ADDRESS_TEXT + VAL_1;
	public static final String VALUE_SUPPLEMENTAL_ADDRESS_TEXT_1 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_SUPPLEMENTAL_ADDRESS_TEXT + VAL_1;
	public static final String VALUE_LOCALITY_NAME_1 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_LOCALITY_NAME + VAL_1;
	public static final String VALUE_STATE_CODE_1 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_STATE_CODE + VAL_1;
	public static final String VALUE_POSTAL_CODE_1 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_POSTAL_CODE + VAL_1;
	public static final String VALUE_COUNTRY_CODE_1 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_COUNTRY_CODE + VAL_1;
	public static final String VALUE_COUNTY_CODE_1 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_COUNTY_CODE + VAL_1;

	public static final String VALUE_ADDRESS_TYPE_NAME_2 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_ADDRESS_TYPE_NAME + VAL_2;
	public static final String VALUE_ADDRESS_TEXT_2 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_ADDRESS_TEXT + VAL_2;
	public static final String VALUE_SUPPLEMENTAL_ADDRESS_TEXT_2 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_SUPPLEMENTAL_ADDRESS_TEXT + VAL_2;
	public static final String VALUE_LOCALITY_NAME_2 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_LOCALITY_NAME + VAL_2;
	public static final String VALUE_STATE_CODE_2 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_STATE_CODE + VAL_2;
	public static final String VALUE_POSTAL_CODE_2 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_POSTAL_CODE + VAL_2;
	public static final String VALUE_COUNTRY_CODE_2 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_COUNTRY_CODE + VAL_2;
	public static final String VALUE_COUNTY_CODE_2 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_COUNTY_CODE + VAL_2;

	public static final String VALUE_ADDRESS_TYPE_NAME_3 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_ADDRESS_TYPE_NAME + VAL_3;
	public static final String VALUE_ADDRESS_TEXT_3 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_ADDRESS_TEXT + VAL_3;
	public static final String VALUE_SUPPLEMENTAL_ADDRESS_TEXT_3 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_SUPPLEMENTAL_ADDRESS_TEXT + VAL_3;
	public static final String VALUE_LOCALITY_NAME_3 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_LOCALITY_NAME + VAL_3;
	public static final String VALUE_STATE_CODE_3 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_STATE_CODE + VAL_3;
	public static final String VALUE_POSTAL_CODE_3 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_POSTAL_CODE + VAL_3;
	public static final String VALUE_COUNTRY_CODE_3 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_COUNTRY_CODE + VAL_3;
	public static final String VALUE_COUNTY_CODE_3 = WQX_ORGANIZATION_ADDRESS + VAL_DEL + WQX_COUNTY_CODE + VAL_3;

	public static final Map<ColumnProfile, String> MAPPINGS;
	static {
		MAPPINGS = new LinkedHashMap<ColumnProfile,String>();
		MAPPINGS.put(ORGANIZATION, VALUE_ORGANIZATION_IDENTIFIER);
		MAPPINGS.put(ORGANIZATION_NAME, VALUE_ORGANIZATION_FORMAL_NAME);
		MAPPINGS.put(ORGANIZATION_DESCRIPTION, VALUE_ORGANIZATION_DESCRIPTION_TEXT);
		MAPPINGS.put(TRIBAL_CODE, VALUE_TRIBAL_CODE);
		MAPPINGS.put(ELECTRONIC_ADDRESS, VALUE_ELECTRONIC_ADDRESS);
		MAPPINGS.put(TELEPHONIC, VALUE_TELEPHONIC);

		MAPPINGS.put(ADDRESS_TYPE_1, VALUE_ADDRESS_TYPE_NAME_1);
		MAPPINGS.put(ADDRESS_TEXT_1, VALUE_ADDRESS_TEXT_1);
		MAPPINGS.put(SUPPLEMENTAL_ADDRESS_TEXT_1, VALUE_SUPPLEMENTAL_ADDRESS_TEXT_1);
		MAPPINGS.put(LOCALITY_NAME_1, VALUE_LOCALITY_NAME_1);
		MAPPINGS.put(STATE_CODE_1, VALUE_STATE_CODE_1);
		MAPPINGS.put(POSTAL_CODE_1, VALUE_POSTAL_CODE_1);
		MAPPINGS.put(COUNTRY_CODE_1, VALUE_COUNTRY_CODE_1);
		MAPPINGS.put(COUNTY_CODE_1, VALUE_COUNTY_CODE_1);

		MAPPINGS.put(ADDRESS_TYPE_2, VALUE_ADDRESS_TYPE_NAME_2);
		MAPPINGS.put(ADDRESS_TEXT_2, VALUE_ADDRESS_TEXT_2);
		MAPPINGS.put(SUPPLEMENTAL_ADDRESS_TEXT_2, VALUE_SUPPLEMENTAL_ADDRESS_TEXT_2);
		MAPPINGS.put(LOCALITY_NAME_2, VALUE_LOCALITY_NAME_2);
		MAPPINGS.put(STATE_CODE_2, VALUE_STATE_CODE_2);
		MAPPINGS.put(POSTAL_CODE_2, VALUE_POSTAL_CODE_2);
		MAPPINGS.put(COUNTRY_CODE_2, VALUE_COUNTRY_CODE_2);
		MAPPINGS.put(COUNTY_CODE_2, VALUE_COUNTY_CODE_2);

		MAPPINGS.put(ADDRESS_TYPE_3, VALUE_ADDRESS_TYPE_NAME_3);
		MAPPINGS.put(ADDRESS_TEXT_3, VALUE_ADDRESS_TEXT_3);
		MAPPINGS.put(SUPPLEMENTAL_ADDRESS_TEXT_3, VALUE_SUPPLEMENTAL_ADDRESS_TEXT_3);
		MAPPINGS.put(LOCALITY_NAME_3, VALUE_LOCALITY_NAME_3);
		MAPPINGS.put(STATE_CODE_3, VALUE_STATE_CODE_3);
		MAPPINGS.put(POSTAL_CODE_3, VALUE_POSTAL_CODE_3);
		MAPPINGS.put(COUNTRY_CODE_3, VALUE_COUNTRY_CODE_3);
		MAPPINGS.put(COUNTY_CODE_3, VALUE_COUNTY_CODE_3);

		MAPPINGS.put(DATA_SOURCE, VALUE_DATA_SOURCE);
	}

	private OrganizationDelimited() {
	}

	public static Map<String, String> getMapping(Profile profile) {
		return getMapping(MAPPINGS, profile);
	}
}
