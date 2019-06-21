package gov.usgs.cida.wqp.webservice;

import static gov.usgs.cida.wqp.swagger.model.OrganizationCountJson.HEADER_BIODATA_ORGANIZATION_COUNT;
import static gov.usgs.cida.wqp.swagger.model.OrganizationCountJson.HEADER_NWIS_ORGANIZATION_COUNT;
import static gov.usgs.cida.wqp.swagger.model.OrganizationCountJson.HEADER_STEWARDS_ORGANIZATION_COUNT;
import static gov.usgs.cida.wqp.swagger.model.OrganizationCountJson.HEADER_STORET_ORGANIZATION_COUNT;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;

import gov.usgs.cida.wqp.Application;
import gov.usgs.cida.wqp.CsvDataSetLoader;
import gov.usgs.cida.wqp.mapping.Profile;
import gov.usgs.cida.wqp.springinit.DBTestConfig;
import gov.usgs.cida.wqp.util.HttpConstants;

@EnableWebMvc
@AutoConfigureMockMvc()
@SpringBootTest(webEnvironment=WebEnvironment.MOCK,
	classes={DBTestConfig.class, Application.class})
@DatabaseSetup("classpath:/testData/csv/")
@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
public class OrganizationControllerIT extends BaseControllerIntegrationTest {

	protected static final Profile PROFILE = Profile.ORGANIZATION;
	protected static final boolean POSTABLE = true;
	protected static final String ENDPOINT = HttpConstants.ORGANIZATION_SEARCH_ENDPOINT + "?sorted=yes&mimeType=";

	@Test
	public void testHarness() throws Exception {
		getAsCsvTest();
		getAsCsvZipTest();
		getAsTsvTest();
		getAsTsvZipTest();
		getAsXlsxTest();
		getAsXlsxZipTest();
		getAsXmlTest();
		getAsXmlZipTest();
		getAllParametersTest();
		postGetCountTest();
	}

	public void getAsCsvTest() throws Exception {
		getAsDelimitedTest(ENDPOINT + CSV, HttpConstants.MIME_TYPE_CSV, CSV, PROFILE, POSTABLE);
	}

	public void getAsCsvZipTest() throws Exception {
		getAsDelimitedZipTest(ENDPOINT + CSV_AND_ZIP, HttpConstants.MIME_TYPE_ZIP, CSV, PROFILE, POSTABLE);
	}

	public void getAsTsvTest() throws Exception {
		getAsDelimitedTest(ENDPOINT + TSV, HttpConstants.MIME_TYPE_TSV, TSV, PROFILE, POSTABLE);
	}

	public void getAsTsvZipTest() throws Exception {
		getAsDelimitedZipTest(ENDPOINT + TSV_AND_ZIP, HttpConstants.MIME_TYPE_ZIP, TSV, PROFILE, POSTABLE);
	}

	public void getAsXlsxTest() throws Exception {
		getAsXlsxTest(ENDPOINT + XLSX, HttpConstants.MIME_TYPE_XLSX, XLSX, PROFILE, POSTABLE);
	}

	public void getAsXlsxZipTest() throws Exception {
		getAsXlsxZipTest(ENDPOINT + XLSX_AND_ZIP, HttpConstants.MIME_TYPE_ZIP, XLSX, PROFILE, POSTABLE);
	}

	public void getAsXmlTest() throws Exception {
		getAsXmlTest(ENDPOINT + XML, HttpConstants.MIME_TYPE_XML, XML, PROFILE, POSTABLE);
	}

	public void getAsXmlZipTest() throws Exception {
		getAsXmlZipTest(ENDPOINT + XML_AND_ZIP, HttpConstants.MIME_TYPE_ZIP, XML, PROFILE, POSTABLE);
	}

	public void getAllParametersTest() throws Exception {
		getAllParametersTest(ENDPOINT + CSV, HttpConstants.MIME_TYPE_CSV, CSV, PROFILE, POSTABLE);
	}

	public void postGetCountTest() throws Exception {
		String urlPrefix = HttpConstants.ORGANIZATION_SEARCH_ENDPOINT + "/count?mimeType=";
		String compareObject = "{\"" + HttpConstants.HEADER_TOTAL_ORGANIZATION_COUNT + "\":\"" + FILTERED_TOTAL_ORGANIZATION_COUNT
				+ "\",\"" + HEADER_STORET_ORGANIZATION_COUNT + "\":\"" + FILTERED_STORET_ORGANIZATION_COUNT
				+ "\"}";
		postGetCountTest(urlPrefix, compareObject, PROFILE);
	}

	public ResultActions unFilteredHeaderCheck(ResultActions resultActions) throws Exception {
		return resultActions				
				.andExpect(header().string(HttpConstants.HEADER_TOTAL_ORGANIZATION_COUNT, TOTAL_ORGANIZATION_COUNT))
				.andExpect(header().string(HEADER_NWIS_ORGANIZATION_COUNT, NWIS_ORGANIZATION_COUNT))
				.andExpect(header().string(HEADER_STEWARDS_ORGANIZATION_COUNT, STEWARDS_ORGANIZATION_COUNT))
				.andExpect(header().string(HEADER_STORET_ORGANIZATION_COUNT, STORET_ORGANIZATION_COUNT))
				.andExpect(header().string(HEADER_BIODATA_ORGANIZATION_COUNT, BIODATA_ORGANIZATION_COUNT));
	}

	public ResultActions filteredHeaderCheck(ResultActions resultActions) throws Exception {
		return resultActions
				.andExpect(header().string(HttpConstants.HEADER_TOTAL_ORGANIZATION_COUNT, FILTERED_TOTAL_ORGANIZATION_COUNT));
	}

	public ResultActions noResultHeaderCheck(ResultActions resultActions) throws Exception {
		return resultActions
				.andExpect(header().string(HttpConstants.HEADER_TOTAL_ORGANIZATION_COUNT, "0"));
	}

}
