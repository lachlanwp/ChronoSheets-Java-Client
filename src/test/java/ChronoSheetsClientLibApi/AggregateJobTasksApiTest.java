/*
 * ChronoSheets API
 * ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.
 *
 * OpenAPI spec version: v1
 * Contact: lachlan@chronosheets.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ChronoSheetsClientLibApi;

import ChronoSheetsClient.ApiException;
import ChronoSheetsClientLibModel.CsApiApiResponseListAggregateJobCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AggregateJobTasksApi
 */
@Ignore
public class AggregateJobTasksApiTest {

    private final AggregateJobTasksApi api = new AggregateJobTasksApi();

    
    /**
     * Get jobs and tasks information, aggregated
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aggregateJobTasksGetAggregateJobTasksTest() throws ApiException {
        String xChronosheetsAuth = null;
        CsApiApiResponseListAggregateJobCode response = api.aggregateJobTasksGetAggregateJobTasks(xChronosheetsAuth);

        // TODO: test validations
    }
    
}
