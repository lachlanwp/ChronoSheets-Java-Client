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
 * CsApiOrgReportTimesheetFileAttachment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T17:51:45.139+10:00")
public class CsApiOrgReportTimesheetFileAttachment {
  @SerializedName("Username")
  private String username = null;

  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("TimesheetStart")
  private OffsetDateTime timesheetStart = null;

  @SerializedName("TimesheetEnd")
  private OffsetDateTime timesheetEnd = null;

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

  @SerializedName("FileAttachmentId")
  private Integer fileAttachmentId = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("OrgId")
  private Integer orgId = null;

  /**
   * 0 &#x3D; Unknown, 1 &#x3D; iOS, 2 &#x3D; Android
   */
  @JsonAdapter(MobilePlatformEnum.Adapter.class)
  public enum MobilePlatformEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    MobilePlatformEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
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
        Integer value = jsonReader.nextInt();
        return MobilePlatformEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("MobilePlatform")
  private MobilePlatformEnum mobilePlatform = null;

  /**
   * 1 &#x3D; Image, 30 &#x3D; WordDoc, 31 &#x3D; Pdf, 32 &#x3D; MSSpreadSheet, 33 &#x3D; MSPowerPoint, 34 &#x3D; RichTextFormat, 35 &#x3D; ZipFile, 100 &#x3D; Other
   */
  @JsonAdapter(AttachmentTypeEnum.Adapter.class)
  public enum AttachmentTypeEnum {
    NUMBER_1(1),
    
    NUMBER_30(30),
    
    NUMBER_31(31),
    
    NUMBER_32(32),
    
    NUMBER_33(33),
    
    NUMBER_34(34),
    
    NUMBER_35(35),
    
    NUMBER_100(100);

    private Integer value;

    AttachmentTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
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
        Integer value = jsonReader.nextInt();
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

  public CsApiOrgReportTimesheetFileAttachment username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CsApiOrgReportTimesheetFileAttachment emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public CsApiOrgReportTimesheetFileAttachment firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CsApiOrgReportTimesheetFileAttachment lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CsApiOrgReportTimesheetFileAttachment timesheetStart(OffsetDateTime timesheetStart) {
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

  public CsApiOrgReportTimesheetFileAttachment timesheetEnd(OffsetDateTime timesheetEnd) {
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

  public CsApiOrgReportTimesheetFileAttachment timesheetId(Integer timesheetId) {
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

  public CsApiOrgReportTimesheetFileAttachment documentS3SignedUrl(String documentS3SignedUrl) {
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

  public CsApiOrgReportTimesheetFileAttachment imageLargeS3SignedUrl(String imageLargeS3SignedUrl) {
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

  public CsApiOrgReportTimesheetFileAttachment imageMediumS3SignedUrl(String imageMediumS3SignedUrl) {
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

  public CsApiOrgReportTimesheetFileAttachment imageSmallS3SignedUrl(String imageSmallS3SignedUrl) {
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

  public CsApiOrgReportTimesheetFileAttachment fileAttachmentId(Integer fileAttachmentId) {
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

  public CsApiOrgReportTimesheetFileAttachment userId(Integer userId) {
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

  public CsApiOrgReportTimesheetFileAttachment orgId(Integer orgId) {
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

  public CsApiOrgReportTimesheetFileAttachment mobilePlatform(MobilePlatformEnum mobilePlatform) {
    this.mobilePlatform = mobilePlatform;
    return this;
  }

   /**
   * 0 &#x3D; Unknown, 1 &#x3D; iOS, 2 &#x3D; Android
   * @return mobilePlatform
  **/
  @ApiModelProperty(value = "0 = Unknown, 1 = iOS, 2 = Android")
  public MobilePlatformEnum getMobilePlatform() {
    return mobilePlatform;
  }

  public void setMobilePlatform(MobilePlatformEnum mobilePlatform) {
    this.mobilePlatform = mobilePlatform;
  }

  public CsApiOrgReportTimesheetFileAttachment attachmentType(AttachmentTypeEnum attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

   /**
   * 1 &#x3D; Image, 30 &#x3D; WordDoc, 31 &#x3D; Pdf, 32 &#x3D; MSSpreadSheet, 33 &#x3D; MSPowerPoint, 34 &#x3D; RichTextFormat, 35 &#x3D; ZipFile, 100 &#x3D; Other
   * @return attachmentType
  **/
  @ApiModelProperty(value = "1 = Image, 30 = WordDoc, 31 = Pdf, 32 = MSSpreadSheet, 33 = MSPowerPoint, 34 = RichTextFormat, 35 = ZipFile, 100 = Other")
  public AttachmentTypeEnum getAttachmentType() {
    return attachmentType;
  }

  public void setAttachmentType(AttachmentTypeEnum attachmentType) {
    this.attachmentType = attachmentType;
  }

  public CsApiOrgReportTimesheetFileAttachment notes(String notes) {
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

  public CsApiOrgReportTimesheetFileAttachment nonImageFilePath(String nonImageFilePath) {
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

  public CsApiOrgReportTimesheetFileAttachment imageLargeFilePath(String imageLargeFilePath) {
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

  public CsApiOrgReportTimesheetFileAttachment imageMediumFilePath(String imageMediumFilePath) {
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

  public CsApiOrgReportTimesheetFileAttachment imageSmallFilePath(String imageSmallFilePath) {
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

  public CsApiOrgReportTimesheetFileAttachment originalFileName(String originalFileName) {
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

  public CsApiOrgReportTimesheetFileAttachment latitude(Double latitude) {
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

  public CsApiOrgReportTimesheetFileAttachment longitude(Double longitude) {
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

  public CsApiOrgReportTimesheetFileAttachment dateUploaded(OffsetDateTime dateUploaded) {
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

  public CsApiOrgReportTimesheetFileAttachment dateImageCaptured(OffsetDateTime dateImageCaptured) {
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

  public CsApiOrgReportTimesheetFileAttachment storageAllocationBytes(Long storageAllocationBytes) {
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
    CsApiOrgReportTimesheetFileAttachment orgReportTimesheetFileAttachment = (CsApiOrgReportTimesheetFileAttachment) o;
    return Objects.equals(this.username, orgReportTimesheetFileAttachment.username) &&
        Objects.equals(this.emailAddress, orgReportTimesheetFileAttachment.emailAddress) &&
        Objects.equals(this.firstName, orgReportTimesheetFileAttachment.firstName) &&
        Objects.equals(this.lastName, orgReportTimesheetFileAttachment.lastName) &&
        Objects.equals(this.timesheetStart, orgReportTimesheetFileAttachment.timesheetStart) &&
        Objects.equals(this.timesheetEnd, orgReportTimesheetFileAttachment.timesheetEnd) &&
        Objects.equals(this.timesheetId, orgReportTimesheetFileAttachment.timesheetId) &&
        Objects.equals(this.documentS3SignedUrl, orgReportTimesheetFileAttachment.documentS3SignedUrl) &&
        Objects.equals(this.imageLargeS3SignedUrl, orgReportTimesheetFileAttachment.imageLargeS3SignedUrl) &&
        Objects.equals(this.imageMediumS3SignedUrl, orgReportTimesheetFileAttachment.imageMediumS3SignedUrl) &&
        Objects.equals(this.imageSmallS3SignedUrl, orgReportTimesheetFileAttachment.imageSmallS3SignedUrl) &&
        Objects.equals(this.fileAttachmentId, orgReportTimesheetFileAttachment.fileAttachmentId) &&
        Objects.equals(this.userId, orgReportTimesheetFileAttachment.userId) &&
        Objects.equals(this.orgId, orgReportTimesheetFileAttachment.orgId) &&
        Objects.equals(this.mobilePlatform, orgReportTimesheetFileAttachment.mobilePlatform) &&
        Objects.equals(this.attachmentType, orgReportTimesheetFileAttachment.attachmentType) &&
        Objects.equals(this.notes, orgReportTimesheetFileAttachment.notes) &&
        Objects.equals(this.nonImageFilePath, orgReportTimesheetFileAttachment.nonImageFilePath) &&
        Objects.equals(this.imageLargeFilePath, orgReportTimesheetFileAttachment.imageLargeFilePath) &&
        Objects.equals(this.imageMediumFilePath, orgReportTimesheetFileAttachment.imageMediumFilePath) &&
        Objects.equals(this.imageSmallFilePath, orgReportTimesheetFileAttachment.imageSmallFilePath) &&
        Objects.equals(this.originalFileName, orgReportTimesheetFileAttachment.originalFileName) &&
        Objects.equals(this.latitude, orgReportTimesheetFileAttachment.latitude) &&
        Objects.equals(this.longitude, orgReportTimesheetFileAttachment.longitude) &&
        Objects.equals(this.dateUploaded, orgReportTimesheetFileAttachment.dateUploaded) &&
        Objects.equals(this.dateImageCaptured, orgReportTimesheetFileAttachment.dateImageCaptured) &&
        Objects.equals(this.storageAllocationBytes, orgReportTimesheetFileAttachment.storageAllocationBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, emailAddress, firstName, lastName, timesheetStart, timesheetEnd, timesheetId, documentS3SignedUrl, imageLargeS3SignedUrl, imageMediumS3SignedUrl, imageSmallS3SignedUrl, fileAttachmentId, userId, orgId, mobilePlatform, attachmentType, notes, nonImageFilePath, imageLargeFilePath, imageMediumFilePath, imageSmallFilePath, originalFileName, latitude, longitude, dateUploaded, dateImageCaptured, storageAllocationBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiOrgReportTimesheetFileAttachment {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    timesheetStart: ").append(toIndentedString(timesheetStart)).append("\n");
    sb.append("    timesheetEnd: ").append(toIndentedString(timesheetEnd)).append("\n");
    sb.append("    timesheetId: ").append(toIndentedString(timesheetId)).append("\n");
    sb.append("    documentS3SignedUrl: ").append(toIndentedString(documentS3SignedUrl)).append("\n");
    sb.append("    imageLargeS3SignedUrl: ").append(toIndentedString(imageLargeS3SignedUrl)).append("\n");
    sb.append("    imageMediumS3SignedUrl: ").append(toIndentedString(imageMediumS3SignedUrl)).append("\n");
    sb.append("    imageSmallS3SignedUrl: ").append(toIndentedString(imageSmallS3SignedUrl)).append("\n");
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

