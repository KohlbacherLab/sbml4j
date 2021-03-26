/**
 * NOTE: This class is auto generated by OpenAPI Generator
 * (https://openapi-generator.tech) (5.0.1). https://openapi-generator.tech Do
 * not edit the class manually.
 */
package org.tts.api;

import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;
import org.tts.model.api.NetworkInventoryItem;
import org.tts.model.api.OverviewNetworkItem;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
          date = "2021-03-26T12:09:15.257519+01:00[Europe/Berlin]")
@Validated
@Api(value = "Overview", description = "the Overview API")
public interface OverviewApi {

  default Optional<NativeWebRequest> getRequest() { return Optional.empty(); }

  /**
   * POST /overview : upload a set of genes and get a network connecting them
   * This endpoint creates an overview network that contains all available genes
   * from the input gene list. The given genes will be annotated with  the
   * boolean given by the field annotationName. The overview network will
   * contain all available relationships between genes and metabolites that are
   * part of the network. The endpoint returns a networkInventoryItem of the
   * created network.  It can be retrieved using the UUID in the GET /network
   * endpoint. If baseNetworkUUID is omitted, the full model will be used.
   *
   * @param overviewNetworkItem An OverviewNetworkItem containing the options
   *     for creating an overview network (required)
   * @param user The user which requests the creation, the configured public
   *     user will be used if omitted (optional)
   * @return Bad Request (status code 400)
   *         or The current user is forbidden from accessing this data (status
   * code 403) or network created (status code 201)
   */
  @ApiOperation(
      value = "upload a set of genes and get a network connecting them",
      nickname = "createOverviewNetwork",
      notes =
          "This endpoint creates an overview network that contains all available genes from the input gene list. The given genes will be annotated with  the boolean given by the field annotationName. The overview network will contain all available relationships between genes and metabolites that are part of the network. The endpoint returns a networkInventoryItem of the created network.  It can be retrieved using the UUID in the GET /network endpoint. If baseNetworkUUID is omitted, the full model will be used. ",
      response = NetworkInventoryItem.class,
      tags =
          {
              "overview",
          })
  @ApiResponses(
      value =
      {
        @ApiResponse(code = 400, message = "Bad Request")
        ,
            @ApiResponse(
                code = 403,
                message =
                    "The current user is forbidden from accessing this data"),
            @ApiResponse(code = 201, message = "network created",
                         response = NetworkInventoryItem.class)
      })
  @PostMapping(value = "/overview", produces = {"application/json"},
               consumes = {"application/json"})
  default ResponseEntity<NetworkInventoryItem>
  createOverviewNetwork(
      @ApiParam(
          value =
              "An OverviewNetworkItem containing the options for creating an overview network",
          required = true) @Valid
      @RequestBody OverviewNetworkItem overviewNetworkItem,
      @ApiParam(
          value =
              "The user which requests the creation, the configured public user will be used if omitted")
      @RequestHeader(value = "user", required = false) String user) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType :
           MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString =
              "{ \"relationTypes\" : [ \"stimulation\", \"stimulation\" ], \"name\" : \"Example Network\", \"organismCode\" : \"hsa\", \"numberOfNodes\" : 0, \"numberOfRelations\" : 6, \"UUID\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"nodeTypes\" : [ \"polypeptide chain\", \"polypeptide chain\" ], \"networkMappingType\" : \"REGULATORY\" }";
          ApiUtil.setExampleResponse(request, "application/json",
                                     exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /overview : retrieve a previously created overview network for a user
   * by its name Attempts to retrieve an overview network by the network name
   * that was  given during creation using POST /overview. If the network is
   * available (created and active) it gets returned in  graphml format. If the
   * network is still being created (not active yet) the endpoint returns a 404
   * error. If the network could not be created, the endpoint returns a 403
   * error.
   *
   * @param name The network name to get (required)
   * @param user The user which requests the creation, the configured public
   *     user will be used if omitted (optional)
   * @return Network is not ready yet (status code 204)
   *         or successful operation (status code 200)
   *         or The network with the provided name could not be created (status
   * code 403)
   */
  @ApiOperation(
      value =
          "retrieve a previously created overview network for a user by its name",
      nickname = "getOverviewNetwork",
      notes =
          "Attempts to retrieve an overview network by the network name that was  given during creation using POST /overview. If the network is available (created and active) it gets returned in  graphml format. If the network is still being created (not active yet) the endpoint returns a 404 error. If the network could not be created, the endpoint returns a 403 error. ",
      response = org.springframework.core.io.Resource.class,
      tags =
          {
              "overview",
          })
  @ApiResponses(
      value =
      {
        @ApiResponse(code = 204, message = "Network is not ready yet")
        ,
            @ApiResponse(code = 200, message = "successful operation",
                         response = org.springframework.core.io.Resource.class),
            @ApiResponse(
                code = 403,
                message =
                    "The network with the provided name could not be created")
      })
  @GetMapping(value = "/overview", produces = {"application/octet-stream"})
  default ResponseEntity<org.springframework.core.io.Resource>
  getOverviewNetwork(
      @NotNull @ApiParam(value = "The network name to get", required = true)
      @Valid @RequestParam(value = "name", required = true) String name,
      @ApiParam(
          value =
              "The user which requests the creation, the configured public user will be used if omitted")
      @RequestHeader(value = "user", required = false) String user) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
