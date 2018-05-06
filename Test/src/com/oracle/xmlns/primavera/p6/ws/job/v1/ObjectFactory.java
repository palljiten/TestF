
package com.oracle.xmlns.primavera.p6.ws.job.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.primavera.p6.ws.job.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SummarizeProject_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "SummarizeProject");
    private final static QName _SummarizeProjectResponse_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "SummarizeProjectResponse");
    private final static QName _SummarizeEPS_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "SummarizeEPS");
    private final static QName _SummarizeEPSResponse_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "SummarizeEPSResponse");
    private final static QName _Schedule_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "Schedule");
    private final static QName _ScheduleResponse_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "ScheduleResponse");
    private final static QName _Level_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "Level");
    private final static QName _LevelResponse_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "LevelResponse");
    private final static QName _ApplyActuals_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "ApplyActuals");
    private final static QName _ApplyActualsResponse_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "ApplyActualsResponse");
    private final static QName _StorePeriodPerformance_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "StorePeriodPerformance");
    private final static QName _StorePeriodPerformanceResponse_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "StorePeriodPerformanceResponse");
    private final static QName _ReadJobStatus_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "ReadJobStatus");
    private final static QName _ReadJobStatusResponse_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "ReadJobStatusResponse");
    private final static QName _RecalculateAssignmentCosts_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "RecalculateAssignmentCosts");
    private final static QName _RecalculateAssignmentCostsResponse_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "RecalculateAssignmentCostsResponse");
    private final static QName _CancelJob_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "CancelJob");
    private final static QName _CancelJobResponse_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "CancelJobResponse");
    private final static QName _GetCurrentJobs_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "GetCurrentJobs");
    private final static QName _GetCurrentJobsResponse_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", "GetCurrentJobsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.primavera.p6.ws.job.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SummarizeProject }
     * 
     */
    public SummarizeProject createSummarizeProject() {
        return new SummarizeProject();
    }

    /**
     * Create an instance of {@link SummarizeProjectResponse }
     * 
     */
    public SummarizeProjectResponse createSummarizeProjectResponse() {
        return new SummarizeProjectResponse();
    }

    /**
     * Create an instance of {@link SummarizeEPS }
     * 
     */
    public SummarizeEPS createSummarizeEPS() {
        return new SummarizeEPS();
    }

    /**
     * Create an instance of {@link SummarizeEPSResponse }
     * 
     */
    public SummarizeEPSResponse createSummarizeEPSResponse() {
        return new SummarizeEPSResponse();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link ScheduleResponse }
     * 
     */
    public ScheduleResponse createScheduleResponse() {
        return new ScheduleResponse();
    }

    /**
     * Create an instance of {@link Level }
     * 
     */
    public Level createLevel() {
        return new Level();
    }

    /**
     * Create an instance of {@link LevelResponse }
     * 
     */
    public LevelResponse createLevelResponse() {
        return new LevelResponse();
    }

    /**
     * Create an instance of {@link ApplyActuals }
     * 
     */
    public ApplyActuals createApplyActuals() {
        return new ApplyActuals();
    }

    /**
     * Create an instance of {@link ApplyActualsResponse }
     * 
     */
    public ApplyActualsResponse createApplyActualsResponse() {
        return new ApplyActualsResponse();
    }

    /**
     * Create an instance of {@link StorePeriodPerformance }
     * 
     */
    public StorePeriodPerformance createStorePeriodPerformance() {
        return new StorePeriodPerformance();
    }

    /**
     * Create an instance of {@link StorePeriodPerformanceResponse }
     * 
     */
    public StorePeriodPerformanceResponse createStorePeriodPerformanceResponse() {
        return new StorePeriodPerformanceResponse();
    }

    /**
     * Create an instance of {@link ReadJobStatus }
     * 
     */
    public ReadJobStatus createReadJobStatus() {
        return new ReadJobStatus();
    }

    /**
     * Create an instance of {@link ReadJobStatusResponse }
     * 
     */
    public ReadJobStatusResponse createReadJobStatusResponse() {
        return new ReadJobStatusResponse();
    }

    /**
     * Create an instance of {@link RecalculateAssignmentCosts }
     * 
     */
    public RecalculateAssignmentCosts createRecalculateAssignmentCosts() {
        return new RecalculateAssignmentCosts();
    }

    /**
     * Create an instance of {@link RecalculateAssignmentCostsResponse }
     * 
     */
    public RecalculateAssignmentCostsResponse createRecalculateAssignmentCostsResponse() {
        return new RecalculateAssignmentCostsResponse();
    }

    /**
     * Create an instance of {@link CancelJob }
     * 
     */
    public CancelJob createCancelJob() {
        return new CancelJob();
    }

    /**
     * Create an instance of {@link CancelJobResponse }
     * 
     */
    public CancelJobResponse createCancelJobResponse() {
        return new CancelJobResponse();
    }

    /**
     * Create an instance of {@link GetCurrentJobsResponse }
     * 
     */
    public GetCurrentJobsResponse createGetCurrentJobsResponse() {
        return new GetCurrentJobsResponse();
    }

    /**
     * Create an instance of {@link JobInfoType }
     * 
     */
    public JobInfoType createJobInfoType() {
        return new JobInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummarizeProject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "SummarizeProject")
    public JAXBElement<SummarizeProject> createSummarizeProject(SummarizeProject value) {
        return new JAXBElement<SummarizeProject>(_SummarizeProject_QNAME, SummarizeProject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummarizeProjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "SummarizeProjectResponse")
    public JAXBElement<SummarizeProjectResponse> createSummarizeProjectResponse(SummarizeProjectResponse value) {
        return new JAXBElement<SummarizeProjectResponse>(_SummarizeProjectResponse_QNAME, SummarizeProjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummarizeEPS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "SummarizeEPS")
    public JAXBElement<SummarizeEPS> createSummarizeEPS(SummarizeEPS value) {
        return new JAXBElement<SummarizeEPS>(_SummarizeEPS_QNAME, SummarizeEPS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummarizeEPSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "SummarizeEPSResponse")
    public JAXBElement<SummarizeEPSResponse> createSummarizeEPSResponse(SummarizeEPSResponse value) {
        return new JAXBElement<SummarizeEPSResponse>(_SummarizeEPSResponse_QNAME, SummarizeEPSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Schedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "Schedule")
    public JAXBElement<Schedule> createSchedule(Schedule value) {
        return new JAXBElement<Schedule>(_Schedule_QNAME, Schedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "ScheduleResponse")
    public JAXBElement<ScheduleResponse> createScheduleResponse(ScheduleResponse value) {
        return new JAXBElement<ScheduleResponse>(_ScheduleResponse_QNAME, ScheduleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Level }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "Level")
    public JAXBElement<Level> createLevel(Level value) {
        return new JAXBElement<Level>(_Level_QNAME, Level.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LevelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "LevelResponse")
    public JAXBElement<LevelResponse> createLevelResponse(LevelResponse value) {
        return new JAXBElement<LevelResponse>(_LevelResponse_QNAME, LevelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "ApplyActuals")
    public JAXBElement<ApplyActuals> createApplyActuals(ApplyActuals value) {
        return new JAXBElement<ApplyActuals>(_ApplyActuals_QNAME, ApplyActuals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyActualsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "ApplyActualsResponse")
    public JAXBElement<ApplyActualsResponse> createApplyActualsResponse(ApplyActualsResponse value) {
        return new JAXBElement<ApplyActualsResponse>(_ApplyActualsResponse_QNAME, ApplyActualsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorePeriodPerformance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "StorePeriodPerformance")
    public JAXBElement<StorePeriodPerformance> createStorePeriodPerformance(StorePeriodPerformance value) {
        return new JAXBElement<StorePeriodPerformance>(_StorePeriodPerformance_QNAME, StorePeriodPerformance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorePeriodPerformanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "StorePeriodPerformanceResponse")
    public JAXBElement<StorePeriodPerformanceResponse> createStorePeriodPerformanceResponse(StorePeriodPerformanceResponse value) {
        return new JAXBElement<StorePeriodPerformanceResponse>(_StorePeriodPerformanceResponse_QNAME, StorePeriodPerformanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadJobStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "ReadJobStatus")
    public JAXBElement<ReadJobStatus> createReadJobStatus(ReadJobStatus value) {
        return new JAXBElement<ReadJobStatus>(_ReadJobStatus_QNAME, ReadJobStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadJobStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "ReadJobStatusResponse")
    public JAXBElement<ReadJobStatusResponse> createReadJobStatusResponse(ReadJobStatusResponse value) {
        return new JAXBElement<ReadJobStatusResponse>(_ReadJobStatusResponse_QNAME, ReadJobStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecalculateAssignmentCosts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "RecalculateAssignmentCosts")
    public JAXBElement<RecalculateAssignmentCosts> createRecalculateAssignmentCosts(RecalculateAssignmentCosts value) {
        return new JAXBElement<RecalculateAssignmentCosts>(_RecalculateAssignmentCosts_QNAME, RecalculateAssignmentCosts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecalculateAssignmentCostsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "RecalculateAssignmentCostsResponse")
    public JAXBElement<RecalculateAssignmentCostsResponse> createRecalculateAssignmentCostsResponse(RecalculateAssignmentCostsResponse value) {
        return new JAXBElement<RecalculateAssignmentCostsResponse>(_RecalculateAssignmentCostsResponse_QNAME, RecalculateAssignmentCostsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelJob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "CancelJob")
    public JAXBElement<CancelJob> createCancelJob(CancelJob value) {
        return new JAXBElement<CancelJob>(_CancelJob_QNAME, CancelJob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelJobResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "CancelJobResponse")
    public JAXBElement<CancelJobResponse> createCancelJobResponse(CancelJobResponse value) {
        return new JAXBElement<CancelJobResponse>(_CancelJobResponse_QNAME, CancelJobResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "GetCurrentJobs")
    public JAXBElement<Object> createGetCurrentJobs(Object value) {
        return new JAXBElement<Object>(_GetCurrentJobs_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentJobsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Job/V1", name = "GetCurrentJobsResponse")
    public JAXBElement<GetCurrentJobsResponse> createGetCurrentJobsResponse(GetCurrentJobsResponse value) {
        return new JAXBElement<GetCurrentJobsResponse>(_GetCurrentJobsResponse_QNAME, GetCurrentJobsResponse.class, null, value);
    }

}
