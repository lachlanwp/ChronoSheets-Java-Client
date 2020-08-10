/*
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ChronoSheetsClientLibModel;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Transcription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-10T22:27:55.870+10:00[Australia/Sydney]")
public class Transcription {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ORG_ID = "OrgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private Integer orgId;

  public static final String SERIALIZED_NAME_FILE_ATTACHMENT_ID = "FileAttachmentId";
  @SerializedName(SERIALIZED_NAME_FILE_ATTACHMENT_ID)
  private Integer fileAttachmentId;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SAVED("Saved"),
    
    PROCESSING("Processing"),
    
    COMPLETED("Completed"),
    
    FAILEDWITHERROR("FailedWithError");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * Gets or Sets mediaType
   */
  @JsonAdapter(MediaTypeEnum.Adapter.class)
  public enum MediaTypeEnum {
    OTHER("Other"),
    
    MP3("Mp3"),
    
    MP4("Mp4"),
    
    WAV("Wav"),
    
    FLAC("Flac");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MediaTypeEnum fromValue(String value) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MediaTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MediaTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MediaTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MediaTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "MediaType";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private MediaTypeEnum mediaType;

  public static final String SERIALIZED_NAME_CONTENTS = "Contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private String contents;


  public Transcription id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Transcription orgId(Integer orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrgId() {
    return orgId;
  }


  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }


  public Transcription fileAttachmentId(Integer fileAttachmentId) {
    
    this.fileAttachmentId = fileAttachmentId;
    return this;
  }

   /**
   * Get fileAttachmentId
   * @return fileAttachmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFileAttachmentId() {
    return fileAttachmentId;
  }


  public void setFileAttachmentId(Integer fileAttachmentId) {
    this.fileAttachmentId = fileAttachmentId;
  }


  public Transcription created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Transcription status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Transcription mediaType(MediaTypeEnum mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MediaTypeEnum getMediaType() {
    return mediaType;
  }


  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  public Transcription contents(String contents) {
    
    this.contents = contents;
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContents() {
    return contents;
  }


  public void setContents(String contents) {
    this.contents = contents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transcription transcription = (Transcription) o;
    return Objects.equals(this.id, transcription.id) &&
        Objects.equals(this.orgId, transcription.orgId) &&
        Objects.equals(this.fileAttachmentId, transcription.fileAttachmentId) &&
        Objects.equals(this.created, transcription.created) &&
        Objects.equals(this.status, transcription.status) &&
        Objects.equals(this.mediaType, transcription.mediaType) &&
        Objects.equals(this.contents, transcription.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgId, fileAttachmentId, created, status, mediaType, contents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transcription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    fileAttachmentId: ").append(toIndentedString(fileAttachmentId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

