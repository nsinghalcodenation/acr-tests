public class LocalVariablesWithConstantBehaviourEffectivelyFinal {
    String position = "left";
    int offset = 5;

    final String position = "left";
    final int offset = 5;

    String sessionId = getSessionId(reportEntity, runType, sourceId);
    Long reportId = reportEntity.getId();

    String tableName = getSavedResultTableName(reportId.toString());

    ReportScheduleEntity schedule = reportScheduleRepository.findById(sourceId).orElse(null);

    String schemaName = reportRunMetadataEntity.getSchemaName();
    String seqName = schemaDDL.createSequenceName(tableName);

    UserEntity userEntity = userDao.getLoggedInUser();
    String postgresUser = userEntity.getPostgresUser();

    boolean tableExists = isTableExists(reportId, schemaName, tableName);
    Semaphore semaphore = runningCreate.remove(reportId);

    Throwable cause = exception.getCause();
    Map<String, Object> errorMessage = new HashMap<>();

    UserVO userVO = reportBean.findUserById(reportVO.getReportOwnerId());

    List<BusinessEntityVO> filteredBusinessEntityList = validateUserReportCompanies(reportVO, userVO);
    Map<PrimaryIdentifier, ProductCustomFieldSetVO> customFields = validateReportConfigCustomFields(
            filteredBusinessEntityList, reportVO);

    Map<PrimaryIdentifier, LinkedList<StandardFields>> standardFields = validateReportConfigStandardFields(
            filteredBusinessEntityList, reportVO);


    Properties adminProperties = PropertiesFileReader.getProperties(CommonConstants.ADMINISTRATION_RESOURCES,
            locale);

    Pagination newPagination;

    // Violation
    int start = ((i) * 1000);

    Pagination newPagination = new Pagination(0, ReportManagerConstants.MAX_RESULT_BLOCK_SIZE, sortOrder,
            sortColumn);
    List<ProductVO> productList = reportBean.advanceProductFind(advancedSearchParameterData);


}