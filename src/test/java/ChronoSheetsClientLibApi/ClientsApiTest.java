/*
 * ChronoSheets API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ChronoSheetsClientLibApi;

import ChronoSheetsClient.ApiException;
import ChronoSheetsClientLibModel.CsApiApiResponseBoolean;
import ChronoSheetsClientLibModel.CsApiApiResponseClient;
import ChronoSheetsClientLibModel.CsApiApiResponseInt32;
import ChronoSheetsClientLibModel.CsApiApiResponseListClient;
import ChronoSheetsClientLibModel.CsApiInsertClientRequest;
import ChronoSheetsClientLibModel.CsApiSaveClientRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientsApi
 */
@Ignore
public class ClientsApiTest {

    private final ClientsApi api = new ClientsApi();

    
    /**
     * Create a client
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clientsCreateClientTest() throws ApiException {
        CsApiInsertClientRequest request = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseInt32 response = api.clientsCreateClient(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get a particular client
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clientsGetClientTest() throws ApiException {
        Integer clientId = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseClient response = api.clientsGetClient(clientId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get a collection of clients that are under your organisation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clientsGetClientsTest() throws ApiException {
        String xChronosheetsAuth = null;
        CsApiApiResponseListClient response = api.clientsGetClients(xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Update a client
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clientsUpdateClientTest() throws ApiException {
        CsApiSaveClientRequest request = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseBoolean response = api.clientsUpdateClient(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
}