/*
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ChronoSheetsClientLibModel;

import java.util.Objects;
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
 * CSTimesheetFileAttachment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-08T01:15:39.652+10:00")
public class CSTimesheetFileAttachment {
  @SerializedName("TimesheetId")
  private Integer timesheetId = null;

  @SerializedName("DocumentS3SignedUrl")
  private String documentS3SignedUrl = null;

  @SerializedName("ImageLargeS3SignedUrl")
  private String imageLargeS3SignedUrl = null;

  @SerializedName("ImageMediumS3SignedUrl")
  private String imageMediumS3SignedUrl = null;

  @SerializedName("ImageSmallS3SignedUrl")
  private String imageSmallS3SignedUrl = null;

  @SerializedName("TimesheetStart")
  private OffsetDateTime timesheetStart = null;

  @SerializedName("TimesheetEnd")
  private OffsetDateTime timesheetEnd = null;

  @SerializedName("FileAttachmentId")
  private Integer fileAttachmentId = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("OrgId")
  private Integer orgId = null;

  /**
   * Gets or Sets mobilePlatform
   */
  @JsonAdapter(MobilePlatformEnum.Adapter.class)
  public enum MobilePlatformEnum {
    UNKNOWN("Unknown"),
    
    IOS("iOS"),
    
    ANDROID("Android");

    private String value;

    MobilePlatformEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MobilePlatformEnum fromValue(String text) {
      for (MobilePlatformEnum b : MobilePlatformEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MobilePlatformEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MobilePlatformEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MobilePlatformEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MobilePlatformEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("MobilePlatform")
  private MobilePlatformEnum mobilePlatform = null;

  /**
   * Gets or Sets attachmentType
   */
  @JsonAdapter(AttachmentTypeEnum.Adapter.class)
  public enum AttachmentTypeEnum {
    IMAGE("Image"),
    
    WORDDOC("WordDoc"),
    
    PDF("Pdf"),
    
    MSSPREADSHEET("MSSpreadSheet"),
    
    MSPOWERPOINT("MSPowerPoint"),
    
    RICHTEXTFORMAT("RichTextFormat"),
    
    ZIPFILE("ZipFile"),
    
    OTHER("Other"),
    
    AUDIO("Audio");

    private String value;

    AttachmentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AttachmentTypeEnum fromValue(String text) {
      for (AttachmentTypeEnum b : AttachmentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AttachmentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttachmentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AttachmentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AttachmentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AttachmentType")
  private AttachmentTypeEnum attachmentType = null;

  @SerializedName("Notes")
  private String notes = null;

  @SerializedName("NonImageFilePath")
  private String nonImageFilePath = null;

  @SerializedName("ImageLargeFilePath")
  private String imageLargeFilePath = null;

  @SerializedName("ImageMediumFilePath")
  private String imageMediumFilePath = null;

  @SerializedName("ImageSmallFilePath")
  private String imageSmallFilePath = null;

  @SerializedName("OriginalFileName")
  private String originalFileName = null;

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  @SerializedName("DateUploaded")
  private OffsetDateTime dateUploaded = null;

  @SerializedName("DateImageCaptured")
  private OffsetDateTime dateImageCaptured = null;

  @SerializedName("StorageAllocationBytes")
  private Long storageAllocationBytes = null;

  public CSTimesheetFileAttachment timesheetId(Integer timesheetId) {
    this.timesheetId = timesheetId;
    return this;
  }

   /**
   * Get timesheetId
   * @return timesheetId
  **/
  @ApiModelProperty(value = "")
  public Integer getTimesheetId() {
    return timesheetId;
  }

  public void setTimesheetId(Integer timesheetId) {
    this.timesheetId = timesheetId;
  }

  public CSTimesheetFileAttachment documentS3SignedUrl(String documentS3SignedUrl) {
    this.documentS3SignedUrl = documentS3SignedUrl;
    return this;
  }

   /**
   * Get documentS3SignedUrl
   * @return documentS3SignedUrl
  **/
  @ApiModelProperty(value = "")
  public String getDocumentS3SignedUrl() {
    return documentS3SignedUrl;
  }

  public void setDocumentS3SignedUrl(String documentS3SignedUrl) {
    this.documentS3SignedUrl = documentS3SignedUrl;
  }

  public CSTimesheetFileAttachment imageLargeS3SignedUrl(String imageLargeS3SignedUrl) {
    this.imageLargeS3SignedUrl = imageLargeS3SignedUrl;
    return this;
  }

   /**
   * Get imageLargeS3SignedUrl
   * @return imageLargeS3SignedUrl
  **/
  @ApiModelProperty(value = "")
  public String getImageLargeS3SignedUrl() {
    return imageLargeS3SignedUrl;
  }

  public void setImageLargeS3SignedUrl(String imageLargeS3SignedUrl) {
    this.imageLargeS3SignedUrl = imageLargeS3SignedUrl;
  }

  public CSTimesheetFileAttachment imageMediumS3SignedUrl(String imageMediumS3SignedUrl) {
    this.imageMediumS3SignedUrl = imageMediumS3SignedUrl;
    return this;
  }

   /**
   * Get imageMediumS3SignedUrl
   * @return imageMediumS3SignedUrl
  **/
  @ApiModelProperty(value = "")
  public String getImageMediumS3SignedUrl() {
    return imageMediumS3SignedUrl;
  }

  public void setImageMediumS3SignedUrl(String imageMediumS3SignedUrl) {
    this.imageMediumS3SignedUrl = imageMediumS3SignedUrl;
  }

  public CSTimesheetFileAttachment imageSmallS3SignedUrl(String imageSmallS3SignedUrl) {
    this.imageSmallS3SignedUrl = imageSmallS3SignedUrl;
    return this;
  }

   /**
   * Get imageSmallS3SignedUrl
   * @return imageSmallS3SignedUrl
  **/
  @ApiModelProperty(value = "")
  public String getImageSmallS3SignedUrl() {
    return imageSmallS3SignedUrl;
  }

  public void setImageSmallS3SignedUrl(String imageSmallS3SignedUrl) {
    this.imageSmallS3SignedUrl = imageSmallS3SignedUrl;
  }

  public CSTimesheetFileAttachment timesheetStart(OffsetDateTime timesheetStart) {
    this.timesheetStart = timesheetStart;
    return this;
  }

   /**
   * Get timesheetStart
   * @return timesheetStart
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimesheetStart() {
    return timesheetStart;
  }

  public void setTimesheetStart(OffsetDateTime timesheetStart) {
    this.timesheetStart = timesheetStart;
  }

  public CSTimesheetFileAttachment timesheetEnd(OffsetDateTime timesheetEnd) {
    this.timesheetEnd = timesheetEnd;
    return this;
  }

   /**
   * Get timesheetEnd
   * @return timesheetEnd
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimesheetEnd() {
    return timesheetEnd;
  }

  public void setTimesheetEnd(OffsetDateTime timesheetEnd) {
    this.timesheetEnd = timesheetEnd;
  }

  public CSTimesheetFileAttachment fileAttachmentId(Integer fileAttachmentId) {
    this.fileAttachmentId = fileAttachmentId;
    return this;
  }

   /**
   * Get fileAttachmentId
   * @return fileAttachmentId
  **/
  @ApiModelProperty(value = "")
  public Integer getFileAttachmentId() {
    return fileAttachmentId;
  }

  public void setFileAttachmentId(Integer fileAttachmentId) {
    this.fileAttachmentId = fileAttachmentId;
  }

  public CSTimesheetFileAttachment userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public CSTimesheetFileAttachment orgId(Integer orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrgId() {
    return orgId;
  }

  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  public CSTimesheetFileAttachment mobilePlatform(MobilePlatformEnum mobilePlatform) {
    this.mobilePlatform = mobilePlatform;
    return this;
  }

   /**
   * Get mobilePlatform
   * @return mobilePlatform
  **/
  @ApiModelProperty(value = "")
  public MobilePlatformEnum getMobilePlatform() {
    return mobilePlatform;
  }

  public void setMobilePlatform(MobilePlatformEnum mobilePlatform) {
    this.mobilePlatform = mobilePlatform;
  }

  public CSTimesheetFileAttachment attachmentType(AttachmentTypeEnum attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

   /**
   * Get attachmentType
   * @return attachmentType
  **/
  @ApiModelProperty(value = "")
  public AttachmentTypeEnum getAttachmentType() {
    return attachmentType;
  }

  public void setAttachmentType(AttachmentTypeEnum attachmentType) {
    this.attachmentType = attachmentType;
  }

  public CSTimesheetFileAttachment notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CSTimesheetFileAttachment nonImageFilePath(String nonImageFilePath) {
    this.nonImageFilePath = nonImageFilePath;
    return this;
  }

   /**
   * Get nonImageFilePath
   * @return nonImageFilePath
  **/
  @ApiModelProperty(value = "")
  public String getNonImageFilePath() {
    return nonImageFilePath;
  }

  public void setNonImageFilePath(String nonImageFilePath) {
    this.nonImageFilePath = nonImageFilePath;
  }

  public CSTimesheetFileAttachment imageLargeFilePath(String imageLargeFilePath) {
    this.imageLargeFilePath = imageLargeFilePath;
    return this;
  }

   /**
   * Get imageLargeFilePath
   * @return imageLargeFilePath
  **/
  @ApiModelProperty(value = "")
  public String getImageLargeFilePath() {
    return imageLargeFilePath;
  }

  public void setImageLargeFilePath(String imageLargeFilePath) {
    this.imageLargeFilePath = imageLargeFilePath;
  }

  public CSTimesheetFileAttachment imageMediumFilePath(String imageMediumFilePath) {
    this.imageMediumFilePath = imageMediumFilePath;
    return this;
  }

   /**
   * Get imageMediumFilePath
   * @return imageMediumFilePath
  **/
  @ApiModelProperty(value = "")
  public String getImageMediumFilePath() {
    return imageMediumFilePath;
  }

  public void setImageMediumFilePath(String imageMediumFilePath) {
    this.imageMediumFilePath = imageMediumFilePath;
  }

  public CSTimesheetFileAttachment imageSmallFilePath(String imageSmallFilePath) {
    this.imageSmallFilePath = imageSmallFilePath;
    return this;
  }

   /**
   * Get imageSmallFilePath
   * @return imageSmallFilePath
  **/
  @ApiModelProperty(value = "")
  public String getImageSmallFilePath() {
    return imageSmallFilePath;
  }

  public void setImageSmallFilePath(String imageSmallFilePath) {
    this.imageSmallFilePath = imageSmallFilePath;
  }

  public CSTimesheetFileAttachment originalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
    return this;
  }

   /**
   * Get originalFileName
   * @return originalFileName
  **/
  @ApiModelProperty(value = "")
  public String getOriginalFileName() {
    return originalFileName;
  }

  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }

  public CSTimesheetFileAttachment latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public CSTimesheetFileAttachment longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public CSTimesheetFileAttachment dateUploaded(OffsetDateTime dateUploaded) {
    this.dateUploaded = dateUploaded;
    return this;
  }

   /**
   * Get dateUploaded
   * @return dateUploaded
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateUploaded() {
    return dateUploaded;
  }

  public void setDateUploaded(OffsetDateTime dateUploaded) {
    this.dateUploaded = dateUploaded;
  }

  public CSTimesheetFileAttachment dateImageCaptured(OffsetDateTime dateImageCaptured) {
    this.dateImageCaptured = dateImageCaptured;
    return this;
  }

   /**
   * Get dateImageCaptured
   * @return dateImageCaptured
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateImageCaptured() {
    return dateImageCaptured;
  }

  public void setDateImageCaptured(OffsetDateTime dateImageCaptured) {
    this.dateImageCaptured = dateImageCaptured;
  }

  public CSTimesheetFileAttachment storageAllocationBytes(Long storageAllocationBytes) {
    this.storageAllocationBytes = storageAllocationBytes;
    return this;
  }

   /**
   * Get storageAllocationBytes
   * @return storageAllocationBytes
  **/
  @ApiModelProperty(value = "")
  public Long getStorageAllocationBytes() {
    return storageAllocationBytes;
  }

  public void setStorageAllocationBytes(Long storageAllocationBytes) {
    this.storageAllocationBytes = storageAllocationBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSTimesheetFileAttachment timesheetFileAttachment = (CSTimesheetFileAttachment) o;
    return Objects.equals(this.timesheetId, timesheetFileAttachment.timesheetId) &&
        Objects.equals(this.documentS3SignedUrl, timesheetFileAttachment.documentS3SignedUrl) &&
        Objects.equals(this.imageLargeS3SignedUrl, timesheetFileAttachment.imageLargeS3SignedUrl) &&
        Objects.equals(this.imageMediumS3SignedUrl, timesheetFileAttachment.imageMediumS3SignedUrl) &&
        Objects.equals(this.imageSmallS3SignedUrl, timesheetFileAttachment.imageSmallS3SignedUrl) &&
        Objects.equals(this.timesheetStart, timesheetFileAttachment.timesheetStart) &&
        Objects.equals(this.timesheetEnd, timesheetFileAttachment.timesheetEnd) &&
        Objects.equals(this.fileAttachmentId, timesheetFileAttachment.fileAttachmentId) &&
        Objects.equals(this.userId, timesheetFileAttachment.userId) &&
        Objects.equals(this.orgId, timesheetFileAttachment.orgId) &&
        Objects.equals(this.mobilePlatform, timesheetFileAttachment.mobilePlatform) &&
        Objects.equals(this.attachmentType, timesheetFileAttachment.attachmentType) &&
        Objects.equals(this.notes, timesheetFileAttachment.notes) &&
        Objects.equals(this.nonImageFilePath, timesheetFileAttachment.nonImageFilePath) &&
        Objects.equals(this.imageLargeFilePath, timesheetFileAttachment.imageLargeFilePath) &&
        Objects.equals(this.imageMediumFilePath, timesheetFileAttachment.imageMediumFilePath) &&
        Objects.equals(this.imageSmallFilePath, timesheetFileAttachment.imageSmallFilePath) &&
        Objects.equals(this.originalFileName, timesheetFileAttachment.originalFileName) &&
        Objects.equals(this.latitude, timesheetFileAttachment.latitude) &&
        Objects.equals(this.longitude, timesheetFileAttachment.longitude) &&
        Objects.equals(this.dateUploaded, timesheetFileAttachment.dateUploaded) &&
        Objects.equals(this.dateImageCaptured, timesheetFileAttachment.dateImageCaptured) &&
        Objects.equals(this.storageAllocationBytes, timesheetFileAttachment.storageAllocationBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timesheetId, documentS3SignedUrl, imageLargeS3SignedUrl, imageMediumS3SignedUrl, imageSmallS3SignedUrl, timesheetStart, timesheetEnd, fileAttachmentId, userId, orgId, mobilePlatform, attachmentType, notes, nonImageFilePath, imageLargeFilePath, imageMediumFilePath, imageSmallFilePath, originalFileName, latitude, longitude, dateUploaded, dateImageCaptured, storageAllocationBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSTimesheetFileAttachment {\n");
    
    sb.append("    timesheetId: ").append(toIndentedString(timesheetId)).append("\n");
    sb.append("    documentS3SignedUrl: ").append(toIndentedString(documentS3SignedUrl)).append("\n");
    sb.append("    imageLargeS3SignedUrl: ").append(toIndentedString(imageLargeS3SignedUrl)).append("\n");
    sb.append("    imageMediumS3SignedUrl: ").append(toIndentedString(imageMediumS3SignedUrl)).append("\n");
    sb.append("    imageSmallS3SignedUrl: ").append(toIndentedString(imageSmallS3SignedUrl)).append("\n");
    sb.append("    timesheetStart: ").append(toIndentedString(timesheetStart)).append("\n");
    sb.append("    timesheetEnd: ").append(toIndentedString(timesheetEnd)).append("\n");
    sb.append("    fileAttachmentId: ").append(toIndentedString(fileAttachmentId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    mobilePlatform: ").append(toIndentedString(mobilePlatform)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    nonImageFilePath: ").append(toIndentedString(nonImageFilePath)).append("\n");
    sb.append("    imageLargeFilePath: ").append(toIndentedString(imageLargeFilePath)).append("\n");
    sb.append("    imageMediumFilePath: ").append(toIndentedString(imageMediumFilePath)).append("\n");
    sb.append("    imageSmallFilePath: ").append(toIndentedString(imageSmallFilePath)).append("\n");
    sb.append("    originalFileName: ").append(toIndentedString(originalFileName)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    dateUploaded: ").append(toIndentedString(dateUploaded)).append("\n");
    sb.append("    dateImageCaptured: ").append(toIndentedString(dateImageCaptured)).append("\n");
    sb.append("    storageAllocationBytes: ").append(toIndentedString(storageAllocationBytes)).append("\n");
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

