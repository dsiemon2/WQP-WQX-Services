package gov.usgs.wma.wqp.mapping.xml;


public abstract class BaseWqx {

	public static final String ROOT_NODE = "WQX";
	public static final String ROOT_NAMESPACE = "xmlns='http://qwwebservices.usgs.gov/schemas/WQX-Outbound/2_0/' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xsi:schemaLocation='http://qwwebservices.usgs.gov/schemas/WQX-Outbound/2_0/ http://qwwebservices.usgs.gov/schemas/WQX-Outbound/2_0/index.xsd'";

	public static final String WQX_MEASURE_VALUE = "MeasureValue";
	public static final String WQX_MEASURE_UNIT = "MeasureUnitCode";

	public static final String WQX_TIME = "Time";
	public static final String WQX_TIME_ZONE = "TimeZoneCode";

	public static final String WQX_METHOD_ID = "MethodIdentifier";
	public static final String WQX_METHOD_CONTEXT = "MethodIdentifierContext";
	public static final String WQX_METHOD_NAME = "MethodName";
	public static final String WQX_METHOD_QUALIFIER_TYPE = "MethodQualifierTypeName";
	public static final String WQX_METHOD_DESCRIPTION = "MethodDescriptionText";

	public static final String WQX_RESOURCE_TITLE = "ResourceTitleName";
	public static final String WQX_RESOURCE_CREATOR = "ResourceCreatorName";
	public static final String WQX_RESOURCE_SUBJECT = "ResourceSubjectText";
	public static final String WQX_RESOURCE_PUBLISHER = "ResourcePublisherName";
	public static final String WQX_RESOURCE_DATE = "ResourceDate";
	public static final String WQX_RESOURCE_ID = "ResourceIdentifier";

	public static final String WQX_PROVIDER = "Provider";
	public static final String WQX_PROVIDER_NAME = "ProviderName"; 

	public static final String WQX_ORGANIZATION = "Organization";
	public static final String WQX_ORGANIZATION_DESCRIPTION = "OrganizationDescription";
	public static final String WQX_ORGANIZATION_IDENTIFIER = "OrganizationIdentifier";
	public static final String WQX_ORGANIZATION_FORMAL_NAME = "OrganizationFormalName";
	public static final String WQX_ORGANIZATION_DESCRIPTION_TEXT ="OrganizationDescriptionText";
	public static final String WQX_ORGANIZATION_TYPE = "OrganizationType"; /* TODO: verify */
	public static final String WQX_TRIBAL_CODE ="TribalCode";

	public static final String WQX_ELECTRONIC_ADDRESS ="ElectronicAddress";
	public static final String WQX_ELECTRONIC_ADDRESS_TEXT ="ElectronicAddressText";
	public static final String WQX_ELECTRONIC_ADDRESS_TYPE_NAME ="ElectronicAddressTypeName";

	public static final String WQX_TELEPHONIC ="Telephonic";
	public static final String WQX_TELEPHONE_NUMBER_TEXT ="TelephoneNumberText";
	public static final String WQX_TELEPHONE_NUMBER_TYPE_NAME ="TelephoneNumberTypeName";
	public static final String WQX_TELEPHONE_EXTENSION_NUMBER_TEXT ="TelephoneExtensionNumberText";

	public static final String WQX_ORGANIZATION_ADDRESS ="OrganizationAddress";
	public static final String WQX_ADDRESS_TYPE_NAME ="AddressTypeName";
	public static final String WQX_ADDRESS_TEXT ="AddressText";
	public static final String WQX_SUPPLEMENTAL_ADDRESS_TEXT ="SupplementalAddressText";
	public static final String WQX_LOCALITY_NAME ="LocalityName";
	public static final String WQX_STATE_CODE ="StateCode";
	public static final String WQX_POSTAL_CODE ="PostalCode";
	public static final String WQX_COUNTRY_CODE ="CountryCode";
	public static final String WQX_COUNTY_CODE ="CountyCode";

	public static final String WQX_MONITORING_LOCATION = "MonitoringLocation";
	public static final String WQX_MONITORING_LOCATION_IDENTITY = "MonitoringLocationIdentity";
	public static final String WQX_MONITORING_LOCATION_IDENTIFIER = "MonitoringLocationIdentifier";
	public static final String WQX_MONITORING_LOCATION_NAME = "MonitoringLocationName";
	public static final String WQX_MONITORING_LOCATION_TYPE = "MonitoringLocationTypeName";
	public static final String WQX_MONITORING_LOCATION_DESCRIPTION = "MonitoringLocationDescriptionText";
	public static final String WQX_HUC_8 = "HUCEightDigitCode";
	public static final String WQX_HUC_12 = "HUCTwelveDigitCode";

	public static final String WQX_CONTRIB_DRAIN_AREA = "ContributingDrainageAreaMeasure";
	public static final String WQX_DRAIN_AREA = "DrainageAreaMeasure";

	public static final String WQX_RESOLVED_MONITORING_LOCATION = "ResolvedMonitoringLocationTypeName";
	public static final String WQX_MONITORING_LOCATION_GEOSPATIAL = "MonitoringLocationGeospatial";
	public static final String WQX_LATITUDE_MEASURE = "LatitudeMeasure";
	public static final String WQX_LONGITUDE_MEASURE = "LongitudeMeasure";
	public static final String WQX_SOURCE_MAP_SCALE = "SourceMapScaleNumeric";

	public static final String WQX_HORIZONTAL_ACCY = "HorizontalAccuracyMeasure";

	public static final String WQX_HORIZONTAL_COLLECTION_METHOD = "HorizontalCollectionMethodName";
	public static final String WQX_HORIZONTAL_DATUM = "HorizontalCoordinateReferenceSystemDatumName";
	public static final String WQX_VERTICAL_MEASURE = "VerticalMeasure";

	public static final String WQX_VERTICAL_ACCY = "VerticalAccuracyMeasure";

	public static final String WQX_VERTICAL_COLLECTION_METHOD = "VerticalCollectionMethodName";
	public static final String WQX_VERTICAL_DATUM = "VerticalCoordinateReferenceSystemDatumName";

	public static final String WQX_NAT_AQFR_NAME = "AquiferName";
	public static final String WQX_AQFR_NAME = "FormationTypeText";
	public static final String WQX_AQFR_TYPE_NAME = "AquiferTypeName";

	public static final String WQX_WELL_INFO = "WellInformation";
	public static final String WQX_CONSTRUCTION_DATE = "ConstructionDateText";
	public static final String WQX_WELL_DEPTH = "WellDepthMeasure";
	public static final String WQX_HOLE_DEPTH = "WellHoleDepthMeasure";

	public static final String WQX_ACTIVITY = "Activity";

	public static final String WQX_ACT_DESCRIPTION = "ActivityDescription";
	public static final String WQX_ACT_ID = "ActivityIdentifier";
	public static final String WQX_ACT_TYPE = "ActivityTypeCode";
	public static final String WQX_ACT_MEDIA = "ActivityMediaName";
	public static final String WQX_ACT_MEDIA_SUB = "ActivityMediaSubdivisionName";
	public static final String WQX_ACT_START_DATE = "ActivityStartDate";
	public static final String WQX_ACT_START_TIME = "ActivityStartTime";
	public static final String WQX_ACT_END_DATE = "ActivityEndDate";
	public static final String WQX_ACT_END_TIME = "ActivityEndTime";
	public static final String WQX_ACT_RELATIVE_DEPTH = "ActivityRelativeDepthName";
	public static final String WQX_ACT_DEPTH = "ActivityDepthHeightMeasure";
	public static final String WQX_ACT_DEPTH_REFERENCE = "ActivityDepthAltitudeReferencePointText";
	public static final String WQX_ACT_TOP_DEPTH = "ActivityTopDepthHeightMeasure";
	public static final String WQX_ACT_BOTTOM_DEPTH = "ActivityBottomDepthHeightMeasure";
	public static final String WQX_ACT_CONDUCTION_ORG = "ActivityConductingOrganizationText";
	public static final String WQX_ACT_COMMENT = "ActivityCommentText";
	public static final String WQX_SAMPLE_AQUIFER = "SampleAquifer";
	public static final String WQX_HYDROLOGIC_CONDITION = "HydrologicCondition";
	public static final String WQX_HYDROLOGIC_EVENT = "HydrologicEvent";

	public static final String WQX_PROJECT = "Project";
	public static final String WQX_PROJECT_IDENTIFIER = "ProjectIdentifier";
	public static final String WQX_PROJECT_NAME = "ProjectName";
	public static final String WQX_PROJECT_DESCRIPTION_TEXT = "ProjectDescriptionText";
	public static final String WQX_SAMPLING_DESIGN_TYPE_CODE = "SamplingDesignTypeCode";
	public static final String WQX_QAPP_APPROVED_INDICATOR = "QAPPApprovedIndicator";
	public static final String WQX_QAPP_APPROVAL_AGENCY_NAME = "QAPPApprovalAgencyName";
	public static final String WQX_PROJECT_FILE_URL = "ProjectFileUrl";
	public static final String WQX_PROJECT_MONITORING_LOCATION_WEIGHT_URL = "ProjectMonitoringLocationWeightingUrl";

	public static final String WQX_ACT_LOCATION = "ActivityLocation";

	public static final String WQX_BIO_ACT_DESCRIPTION = "BiologicalActivityDescription";
	public static final String WQX_ASSEMBLAGE_SAMPLED = "AssemblageSampledName";
	public static final String WQX_BIO_HABITAT_COLLECTION_INFO = "BiologicalHabitatCollectionInformation";
	public static final String WQX_COLLECTION_DURATION = "CollectionDuration";
	public static final String WQX_SAMPLING_COMPONENT = "SamplingComponentName";
	public static final String WQX_SAMPLING_COMPONENT_PLACE = "SamplingComponentPlaceInSeriesNumeric";
	public static final String WQX_REACH_LENGTH = "ReachLengthMeasure";
	public static final String WQX_REACH_WIDTH = "ReachWidthMeasure";
	public static final String WQX_PASS_COUNT = "PassCount";
	public static final String WQX_NET_INFORMATION = "NetInformation";
	public static final String WQX_NET_TYPE = "NetTypeName";
	public static final String WQX_NET_SURFACE_AREA = "NetSurfaceAreaMeasure";
	public static final String WQX_NET_MESH_SIZE = "NetMeshSizeMeasure";
	public static final String WQX_BOAT_SPEAD = "BoatSpeedMeasure";
	public static final String WQX_CURRENT_SPEAD = "CurrentSpeedMeasure";
	public static final String WQX_TOXICITY_TEST_TYPE = "ToxicityTestType";

	public static final String WQX_SAMPLE_DESCRIPTION = "SampleDescription";
	public static final String WQX_COLLECTION_METHOD = "SampleCollectionMethod";
	public static final String WQX_COLLECTION_EQUIPMENT = "SampleCollectionEquipmentName";
	public static final String WQX_COLLECTION_EQUIPMENT_COMMENT = "SampleCollectionEquipmentCommentText";
	public static final String WQX_SAMPLE_PREPARATION = "SamplePreparation";
	public static final String WQX_SAMPLE_PREPARATION_METHOD = "SamplePreparationMethod";
	public static final String WQX_SAMPLE_CONTAINER_TYPE = "SampleContainerTypeName";
	public static final String WQX_SAMPLE_CONTAINER_COLOR = "SampleContainerColorName";
	public static final String WQX_CHEMICAL_PRESERVATIVE = "ChemicalPreservativeUsedName";
	public static final String WQX_THERMAL_PRESERVATIVE = "ThermalPreservativeUsedName";
	public static final String WQX_TRANSPORT_STORAGE = "SampleTransportStorageDescription";

	public static final String WQX_ACTIVITY_METRIC = "ActivityMetric";
	public static final String WQX_ACTIVITY_METRIC_TYPE = "ActivityMetricType";
	public static final String WQX_ACTIVITY_METRIC_URL = "ActivityMetricUrl";
	public static final String WQX_METRIC_TYPE_ID = "MetricTypeIdentifier";
	public static final String WQX_METRIC_TYPE_ID_CONTEXT = "MetricTypeIdentifierContext";
	public static final String WQX_METRIC_TYPE = "MetricTypeName";
	public static final String WQX_METRIC_TYPE_CITATION = "MetricTypeCitation";
	public static final String WQX_METRIC_TYPE_SCALE = "MetricTypeScaleText";
	public static final String WQX_FORMULA_DESCRIPTION = "FormulaDescriptionText";
	public static final String WQX_METRIC_VALUE = "MetricValueMeasure";
	public static final String WQX_METRIC_SCORE = "MetricScoreNumeric";
	public static final String WQX_METRIC_COMMENT = "MetricCommentText";
	public static final String WQX_INDEX_ID = "IndexIdentifier";
	public static final String WQX_ACT_ATTACHMENT = "ActivityAttachedBinaryObject";
	public static final String WQX_FILE_NAME = "BinaryObjectFileName";
	public static final String WQX_FILE_TYPE = "BinaryObjectFileTypeCode";
	public static final String WQX_RESULT_COUNT = "ResultCount";
	public static final String WQX_ACTIVITY_FILE_URL = "ActivityFileUrl";
	public static final String WQX_ACTIVITY_GROUP_URL = "ActivityGroupUrl";

	public static final String WQX_RESULT = "Result";
	public static final String WQX_RESULT_DESRIPTION = "ResultDescription";
	public static final String WQX_DATA_LOGGER_LINE = "DataLoggerLine";
	public static final String WQX_CHAR_NAME = "CharacteristicName";
	public static final String WQX_RESULT_IDENTIFIER = "ResultIdentifier";
	public static final String WQX_DETECTION_CONDITION = "ResultDetectionConditionText";

	//Note that "SPECIATION" is correct and "SPECIFICATION" is a typo.
	public static final String WQX_METHOD_SPECIATION = "MethodSpeciationName";
	public static final String WQX_METHOD_SPECIFICATION = "MethodSpecificationName";

	public static final String WQX_SAMPLE_FRACTION = "ResultSampleFractionText";
	public static final String WQX_RESULT_MEASURE = "ResultMeasure";
	public static final String WQX_RESULT_MEASURE_VALUE = "ResultMeasureValue";
	public static final String WQX_MEASURE_QUALIFIER = "MeasureQualifierCode";
	public static final String WQX_STATUS_ID = "ResultStatusIdentifier";
	public static final String WQX_STATISTICAL_BASE = "StatisticalBaseCode";
	public static final String WQX_VALUE_TYPE = "ResultValueTypeName";
	public static final String WQX_WEIGHT_BASIS = "ResultWeightBasisText";
	public static final String WQX_TIME_BASIS = "ResultTimeBasisText";
	public static final String WQX_TEMP_BASIS = "ResultTemperatureBasisText";
	public static final String WQX_PARTICLE_SIZE = "ResultParticleSizeBasisText";
	public static final String WQX_DATA_QUALITY = "DataQuality";
	public static final String WQX_PRECISION = "PrecisionValue";
	public static final String WQX_BIAS = "BiasValue";
	public static final String WQX_CONFIDENCE_INTERVAL = "ConfidenceIntervalValue";
	public static final String WQX_UPPER_CONFIDENCE_LIMIT = "UpperConfidenceLimitValue";
	public static final String WQX_LOWER_CONFIDENCE_LIMIT = "LowerConfidenceLimitValue";
	public static final String WQX_RESULT_COMMENT = "ResultCommentText";
	public static final String WQX_P_CODE = "USGSPCode";
	public static final String WQX_RESULT_DEPTH = "ResultDepthHeightMeasure";
	public static final String WQX_RESULT_DETH_REFERENCE = "ResultDepthAltitudeReferencePointText";
	public static final String WQX_RESULT_SAMPLING_POINT = "ResultSamplingPointName";

	public static final String WQX_BIOLOGICAL_RESULT = "BiologicalResultDescription";
	public static final String WQX_BIOLOGICAL_INTENT = "BiologicalIntentName";
	public static final String WQX_BIOLOGICAL_INDIVIDUAL_ID = "BiologicalIndividualIdentifier";
	public static final String WQX_TAXON_NAME = "SubjectTaxonomicName";
	public static final String WQX_SUBJECT_TAXONOMIC_NAME = "SubjectTaxonomicName";
	public static final String WQX_UNIDENTIFIED_SPECIES_IDENTIFIER = "UnidentifiedSpeciesIdentifier";
	public static final String WQX_TISSUE_ANATOMY = "SampleTissueAnatomyName";
	public static final String WQX_GROUP_SUMMARY_COUNT_WEIGHT = "GroupSummaryCountWeight";
	public static final String WQX_TAXONOMIC_DETAILS = "TaxonomicDetails";
	public static final String WQX_CELL_FORM = "CellFormName";
	public static final String WQX_CELL_SHAPE = "CellShapeName";
	public static final String WQX_HABIT = "HabitName";

	//Note that Voltism is a typo, real value is Voltinism
	public static final String WQX_VOLTISM = "VoltismName";
	public static final String WQX_VOLTINISM = "VoltinismName";

	public static final String WQX_POLLUTION_TOLERANCE = "TaxonomicPollutionTolerance";
	public static final String WQX_TOLERANCE_SCALE = "TaxonomicPollutionToleranceScaleText";
	public static final String WQX_TROPHIC_LEVEL = "TrophicLevelName";
	public static final String WQX_FUNCTIONAL_FEEDING_GROUP = "FunctionalFeedingGroupName";
	public static final String WQX_TAXONIMC_DETAIL_CITATION = "TaxonomicDetailsCitation";

	//Repeated with the suffix to correctly group the data in the later xml profiles.
	public static final String WQX_FREQUENCY_CLASS_INFO = "FrequencyClassInformation";
	public static final String WQX_FREQUENCY_CLASS_INFO_1 = "FrequencyClassInformation1";
	public static final String WQX_FREQUENCY_CLASS_INFO_2 = "FrequencyClassInformation2";
	public static final String WQX_FREQUENCY_CLASS_INFO_3 = "FrequencyClassInformation3";
	public static final String WQX_FREQUENCY_CLASS_INFO_URL = "FrequencyClassInformationUrl";
	public static final String WQX_FREQUENCY_CLASS_DESCRIPTOR = "FrequencyClassDescriptorCode";
	public static final String WQX_FREQUENCE_CLASS_DESCRIPTOR_UNIT = "FrequencyClassDescriptorUnitCode";
	public static final String WQX_LOWER_CLASS_BOUND = "LowerClassBoundValue";
	public static final String WQX_UPPER_CLASS_BOUND = "UpperClassBoundValue";
	public static final String WQX_ATTACHED_BINARY_OBJECT = "AttachedBinaryObject";
	public static final String WQX_METHOD_URL = "MethodUrl";
	public static final String WQX_ANALYTICAL_METHOD = "ResultAnalyticalMethod";

	public static final String WQX_LAB_INFO = "ResultLabInformation";
	public static final String WQX_LAB_NAME = "LaboratoryName";
	public static final String WQX_ANALYSIS_START_DATE = "AnalysisStartDate";
	public static final String WQX_ANALYSIS_START_TIME = "AnalysisStartTime";
	public static final String WQX_ANALYSIS_END_DATE = "AnalysisEndDate";
	public static final String WQX_ANALYSIS_END_TIME = "AnalysisEndTime";
	public static final String WQX_LAB_COMMENT_CODE = "ResultLaboratoryCommentCode";
	public static final String WQX_LAB_COMMENT = "ResultLaboratoryCommentText";
	public static final String WQX_DETECTION_LIMIT = "ResultDetectionQuantitationLimit";
	public static final String WQX_DETECTION_LIMIT_URL = "ResultDetectionQuantitationLimitUrl";
	public static final String WQX_DETECTION_LIMIT_VALUE = "DetectionQuantitationLimitMeasure";
	public static final String WQX_DETECTION_LIMIT_TYPE = "DetectionQuantitationLimitTypeName";
	public static final String WQX_LAB_ACCREDITATION_INDICATOR = "LaboratoryAccreditationIndicator";
	public static final String WQX_LAB_ACCREDITATION_AUTHORITY = "LaboratoryAccreditationAuthorityName";
	public static final String WQX_TAXONOMIST_ACCREDITATION_INDICATOR = "TaxonomistAccreditationIndicator";
	public static final String WQX_TAXONOMIST_ACCREDITATION_AUTHORTY = "TaxonomistAccreditationAuthorityName";

	public static final String WQX_LAB_SAMPLE_PREP = "LabSamplePreparation";
	public static final String WQX_LAB_SAMPLE_PREP_URL = "LabSamplePreparationUrl";
	public static final String WQX_LAB_SAMPLE_PREP_METHOD = "LabSamplePreparationMethod";
	public static final String WQX_PREP_START_DATE = "PreparationStartDate";
	public static final String WQX_PREP_START_TIME = "PreparationStartTime";
	public static final String WQX_PREP_END_DATE = "PreparationEndDate";
	public static final String WQX_PREP_END_TIME = "PreparationEndTime";
	public static final String WQX_SUBSTITUTION_DILUTION_FACTOR = "SubstitutionDilutionFactorNumeric";

	public static final String WQX_STATISTICAL_STRATUM_TEXT = "StatisticalStratumText";

	public static final String WQX_LOCATION_CATEGORY_NAME = "LocationCategoryName";
	public static final String WQX_LOCATION_STATUS_NAME = "LocationStatusName";

	public static final String WQX_REFERENCE_LOCATION_TYPE_CODE = "ReferenceLocationTypeCode";
	public static final String WQX_REFERENCE_LOCATION_START_DATE = "ReferenceLocationStartDate";
	public static final String WQX_REFERENCE_LOCATION_END_DATE = "ReferenceLocationEndDate";
	public static final String WQX_REFERENCE_LOCATION_CITATION = "ReferenceLocationCitation";

	public static final String WQX_PROJECT_MONITORING_LOCATION_WEIGHTING = "ProjectMonitoringLocationWeighting";
	public static final String WQX_PROJECT_MONITORING_LOCATION_WEIGHTING_FACTOR_MEASURE = "LocationWeightingFactorMeasure";
	public static final String WQX_PROJECT_MONITORING_LOCATION_WEIGHTING_COMMENT_TEXT = "CommentText";
	public static final String WQX_RESULT_FILE_URL = "ResultFileUrl";
	
	// next section added for BiologicalMetric data profile	
	public static final String WQX_LAST_UPDATED = "LastUpdated";
	public static final String WQX_INDEX_TYPE =  "IndexType";
	public static final String WQX_INDEX_CITATION = "IndexTypeCitation";
	public static final String WQX_BIOLOGICAL_HABITAT_INDEX = "BiologicalHabitatIndex";
	public static final String WQX_BIOLOGICAL_METRIC = "BiologicalHabitatMetric";
	public static final String WQX_INDEX_TYPE_IDENTIFER = "IndexTypeIdentifier";
	public static final String WQX_INDEX_TYPE_IDENTIFER_CONTEXT = "IndexTypeIdentifierContext";
	public static final String WQX_INDEX_TYPE_NAME = "IndexTypeName";
	public static final String WQX_INDEX_TYPE_SCALE_TEXT = "IndexTypeScaleText";
	public static final String WQX_INDEX_SCORE_NUMERIC = "IndexScoreNumeric";
	public static final String WQX_INDEX_QUALIFIER_CODE = "IndexQualifierCode";
	public static final String WQX_INDEX_COMMENT_TEXT = "IndexCommentText";
	public static final String WQX_INDEX_CALCULATED_DATE = "IndexCalculatedDate";
	public static final String WQX_YEAR_SUMMARIZED = "YearSummarized";
	public static final String WQX_CHARATERISTIC_TYPE = "CharacteristicType";
	public static final String WQX_CHARATERISTIC_NAME = "CharacteristicName";
	public static final String WQX_ACTIVITY_COUNT = "ActivityCount";
	public static final String WQX_LAST_SUBMITTED_DATE= "LastResultSubmittedDate";
	public static final String WQX_MONITORING_LOCATON_TYPE_NAME = "MonitoringLocationTypeName";
	public static final String WQX_MONITORING_LOCATION_URL = "MonitoringLocationUrl";
	public static final String WQX_MONITORING_LOCATION_LATITUDE = "MonitoringLocationLatitude";
	public static final String WQX_MONITORING_LOCATION_LONGITUDE = "MonitoringLocationLongitude";
	public static final String WQX_STATE_NAME = "StateName";
	public static final String WQX_COUNTY_NAME = "CountyName";

	protected BaseWqx() {
	}

	public String getRoot() {
		return ROOT_NODE;
	}

	public String getHeader() {
		return "<" + ROOT_NODE + " " + ROOT_NAMESPACE + ">";
	}

}
